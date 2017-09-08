package com.gerrard.design_pattern.u01_singleton.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Assert;
import org.junit.Test;

public class SerializableSingletonTest {

	private final String uri1 = "./src/test/resources/serialable1.txt";
	private final String uri2 = "./src/test/resources/serialable2.txt";

	public void createSerialFile() {
		SerializableSingletonFail singleton1 = SerializableSingletonFail.getInstance();
		SerializableSingleton singleton2 = SerializableSingleton.getInstance();
		try (FileOutputStream fos1 = new FileOutputStream(uri1); ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
				FileOutputStream fos2 = new FileOutputStream(uri2); ObjectOutputStream oos2 = new ObjectOutputStream(fos2);) {
			oos1.writeObject(singleton1);
			oos2.writeObject(singleton2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testFailure() {
		SerializableSingletonFail singleton1 = SerializableSingletonFail.getInstance();
		SerializableSingletonFail singleton2 = null;
		// 反序列化
		try (FileInputStream fio = new FileInputStream(uri1); ObjectInputStream ois = new ObjectInputStream(fio);) {
			singleton2 = (SerializableSingletonFail) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertNotSame(singleton1, singleton2);
	}

	@Test
	public void testSuccess() {
		SerializableSingleton singleton1 = SerializableSingleton.getInstance();
		SerializableSingleton singleton2 = null;
		// 反序列化
		try (FileInputStream fio = new FileInputStream(uri2); ObjectInputStream ois = new ObjectInputStream(fio);) {
			singleton2 = (SerializableSingleton) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertSame(singleton1, singleton2);
	}

}
