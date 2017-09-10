package com.gerrard.design_pattern.u01_singleton;

import java.lang.reflect.Constructor;

import org.junit.Assert;
import org.junit.Test;

public class StaticBlockSingletonTest {

	@Test
	public void test() throws Exception {
		Class<?> clazz = StaticBlockSingleton.class;
		Constructor<?> constructor = clazz.getDeclaredConstructor();
		constructor.setAccessible(true);
		StaticBlockSingleton singleton3 = (StaticBlockSingleton) constructor.newInstance();
		StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();
		Assert.assertSame(singleton1, singleton2);
		Assert.assertNotSame(singleton1, singleton3);
	}

}
