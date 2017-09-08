package com.gerrard.design_pattern.u01_singleton;

import org.junit.Test;

import org.junit.Assert;

public class EnumSingletonTest {

	@Test
	public void test() throws Exception {
		EnumSingleton singleton1 = EnumSingleton.INSTANCE;
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;
		@SuppressWarnings("static-access")
		EnumSingleton singleton3 = EnumSingleton.INSTANCE.INSTANCE;
		Assert.assertSame(singleton1, singleton2);
		Assert.assertSame(singleton1, singleton3);
	}

}
