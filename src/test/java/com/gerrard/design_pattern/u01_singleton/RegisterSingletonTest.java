package com.gerrard.design_pattern.u01_singleton;

import java.lang.reflect.Constructor;

import org.junit.Test;

import com.gerrard.design_pattern.u01_singleton.RegisterSingletonChild;

import junit.framework.Assert;

public class RegisterSingletonTest {

	@Test
	public void test() throws Exception {
		RegisterSingletonChild child1 = RegisterSingletonChild.getInstance();
		RegisterSingletonChild child2 = RegisterSingletonChild.getInstance();
		Assert.assertSame(child1, child2);
		// 反射入侵成功
		Constructor<?> constructor = RegisterSingletonChild.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		RegisterSingletonChild child3 = (RegisterSingletonChild) constructor.newInstance();
		Assert.assertNotSame(child1, child3);
	}

}
