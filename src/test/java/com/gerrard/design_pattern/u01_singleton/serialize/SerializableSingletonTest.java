package com.gerrard.design_pattern.u01_singleton.serialize;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;

public final class SerializableSingletonTest {

    private static final String ROOT_DIRECTORY = "./src/test/resources/";
    private static final String URI1 = ROOT_DIRECTORY + "serial1.txt";
    private static final String URI2 = ROOT_DIRECTORY + "serial2.txt";

    private static boolean hasRootDirectory = false;

    @BeforeAll
    public static void createSerializedFile() {
        File root = new File(ROOT_DIRECTORY);
        if (root.exists()) {
            hasRootDirectory = true;
        } else {
            root.mkdir();
        }
        SerializableSingletonFail singleton1 = SerializableSingletonFail.getInstance();
        SerializableSingleton singleton2 = SerializableSingleton.getInstance();
        try (FileOutputStream fos1 = new FileOutputStream(URI1);
             ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
             FileOutputStream fos2 = new FileOutputStream(URI2);
             ObjectOutputStream oos2 = new ObjectOutputStream(fos2)) {
            oos1.writeObject(singleton1);
            oos2.writeObject(singleton2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterAll
    public static void destroySerializedFile() {
        File file1 = new File(URI1);
        File file2 = new File(URI2);
        file1.delete();
        file2.delete();
        if (!hasRootDirectory) {
            new File(ROOT_DIRECTORY).delete();
        }
    }

    @Test
    void testDeserializeSingletonFailure() {
        SerializableSingletonFail singleton1 = SerializableSingletonFail.getInstance();
        SerializableSingletonFail singleton2 = null;
        try (FileInputStream fio = new FileInputStream(URI1);
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
        try (FileInputStream fio = new FileInputStream(URI2);
             ObjectInputStream ois = new ObjectInputStream(fio)) {
            singleton2 = (SerializableSingleton) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertSame(singleton1, singleton2);
    }
}
