package com.gerrard.design_pattern.u01_singleton;

import java.lang.reflect.Constructor;

import org.junit.Assert;
import org.junit.Test;

public class EagerSingletonTest {

	@Test
	public void test() throws Exception {
		EagerSingleton singleton1 = EagerSingleton.getInstance();
		EagerSingleton singleton2 = EagerSingleton.getInstance();
		Assert.assertSame(singleton1, singleton2);
		// 反射入侵失败，抛出异常
		Constructor<?> constructor = EagerSingleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		EagerSingleton singleton3 = (EagerSingleton) constructor.newInstance();
		Assert.assertSame(singleton1, singleton3);
	}

}
