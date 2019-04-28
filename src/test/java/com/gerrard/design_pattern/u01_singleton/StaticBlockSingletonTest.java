package com.gerrard.design_pattern.u01_singleton;

import java.lang.reflect.Constructor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StaticBlockSingletonTest {

	@Test
	public void testSingleton() throws Exception {
		Class<?> clazz = StaticBlockSingleton.class;
		Constructor<?> constructor = clazz.getDeclaredConstructor();
		constructor.setAccessible(true);
		StaticBlockSingleton singleton3 = (StaticBlockSingleton) constructor.newInstance();
		StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();
		Assertions.assertSame(singleton1, singleton2);
		Assertions.assertNotSame(singleton1, singleton3);
	}

}
