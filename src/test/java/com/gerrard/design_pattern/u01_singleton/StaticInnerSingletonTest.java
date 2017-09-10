package com.gerrard.design_pattern.u01_singleton;

import java.lang.reflect.Constructor;

import org.junit.Test;

import com.gerrard.design_pattern.u01_singleton.StaticInnerSingleton;

import org.junit.Assert;

public class StaticInnerSingletonTest {

	@Test
	public void test() throws Exception {
		// 反射入侵失败
		Class<?> clazz = StaticInnerSingleton.class;
		Constructor<?> constructor = clazz.getDeclaredConstructor();
		constructor.setAccessible(true);
		StaticInnerSingleton singleton3 = (StaticInnerSingleton) constructor.newInstance();
		StaticInnerSingleton singleton1 = StaticInnerSingleton.getInstance();
		StaticInnerSingleton singleton2 = StaticInnerSingleton.getInstance();
		Assert.assertSame(singleton1, singleton2);
		Assert.assertNotSame(singleton1, singleton3);
	}

}
