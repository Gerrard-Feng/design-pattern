package com.gerrard.design_pattern.u01_singleton;

import java.lang.reflect.Constructor;

import org.junit.Test;

import com.gerrard.design_pattern.u01_singleton.EagerSingleton;

import junit.framework.Assert;

public class EagerSingletonTest {

	@Test
	public void test() throws Exception {
		Constructor<?> constructor = EagerSingleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		// 反射入侵失败
		EagerSingleton singleton3 = (EagerSingleton) constructor.newInstance();
		EagerSingleton singleton1 = EagerSingleton.getInstance();
		EagerSingleton singleton2 = EagerSingleton.getInstance();
		Assert.assertSame(singleton1, singleton2);
		Assert.assertSame(singleton1, singleton3);
	
	}

}
