package com.gerrard.design_pattern.u01_singleton;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class LazySingletonTest {

    @Test
    public void testReflectSuccess() throws Exception {
        Constructor<?> constructor = LazySingleton1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySingleton1 singleton1 = (LazySingleton1) constructor.newInstance();
        LazySingleton1 singleton2 = LazySingleton1.getInstance();
        Assert.assertNotSame(singleton1, singleton2);
    }

    @Test
    public void testReflectFailure() throws Exception {
        LazySingleton1 singleton1 = LazySingleton1.getInstance();
        Constructor<?> constructor = LazySingleton1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            LazySingleton1 singleton2 = (LazySingleton1) constructor.newInstance();
            Assert.fail();
        } catch (Exception e) {
            // Do nothing, test pass
        }
    }
}
