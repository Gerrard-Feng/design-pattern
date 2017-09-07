package com.gerrard.design_pattern.u01_singleton;

import java.lang.reflect.Constructor;

import org.junit.Test;

import junit.framework.Assert;

public class LazySingletonTest {

	@Test
	public void test() throws Exception {
		Constructor<?> constructor = LazySingleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		// 反射入侵成功，必须优先反射
		LazySingleton singleton3 = (LazySingleton) constructor.newInstance();
		LazySingleton singleton1 = LazySingleton.getInstance();
		LazySingleton singleton2 = LazySingleton.getInstance();
		Assert.assertSame(singleton1, singleton2);
		Assert.assertNotSame(singleton1, singleton3);
	}

}
