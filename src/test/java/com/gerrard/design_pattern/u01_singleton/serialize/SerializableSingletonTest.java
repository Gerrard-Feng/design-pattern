package com.gerrard.design_pattern.u01_singleton.serialize;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;

public final class SerializableSingletonTest {

    private static final String uri1 = "./src/test/resources/serialable1.txt";
    private static final String uri2 = "./src/test/resources/serialable2.txt";

    @BeforeAll
    public static void createSerializedFile() {
        SerializableSingletonFail singleton1 = SerializableSingletonFail.getInstance();
        SerializableSingleton singleton2 = SerializableSingleton.getInstance();
        try (FileOutputStream fos1 = new FileOutputStream(uri1);
             ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
             FileOutputStream fos2 = new FileOutputStream(uri2);
             ObjectOutputStream oos2 = new ObjectOutputStream(fos2)) {
            oos1.writeObject(singleton1);
            oos2.writeObject(singleton2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterAll
    public static void destroySerializedFile() {
        File file1 = new File(uri1);
        File file2 = new File(uri2);
        file1.delete();
        file2.delete();
    }

    @Test
    void testDeserializeSingletonFailure() {
        SerializableSingletonFail singleton1 = SerializableSingletonFail.getInstance();
        SerializableSingletonFail singleton2 = null;
        try (FileInputStream fio = new FileInputStream(uri1);
             ObjectInputStream ois = new ObjectInputStream(fio)) {
            singleton2 = (SerializableSingletonFail) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertNotSame(singleton1, singleton2);
    }

    @Test
    void testDeserializeSingletonSuccess() {
        SerializableSingleton singleton1 = SerializableSingleton.getInstance();
        SerializableSingleton singleton2 = null;
        try (FileInputStream fio = new FileInputStream(uri2);
             ObjectInputStream ois = new ObjectInputStream(fio)) {
            singleton2 = (SerializableSingleton) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertSame(singleton1, singleton2);
    }

}
