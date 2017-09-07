package com.gerrard.design_pattern.u01_singleton;

import java.lang.reflect.Constructor;

import org.junit.Test;

import com.gerrard.design_pattern.u01_singleton.StaticSingleton;

import junit.framework.Assert;

public class StaticSingletonTest {

	@Test
	public void test() throws Exception {
		StaticSingleton singleton1 = StaticSingleton.getInstance();
		StaticSingleton singleton2 = StaticSingleton.getInstance();
		Assert.assertSame(singleton1, singleton2);
		// 反射入侵失败
		Class<?> clazz = singleton1.getClass();
		Constructor<?> constructor = clazz.getDeclaredConstructor();
		constructor.setAccessible(true);
		StaticSingleton singleton3 = (StaticSingleton) constructor.newInstance();
		Assert.assertNotSame(singleton1, singleton3);
		
	}

}
