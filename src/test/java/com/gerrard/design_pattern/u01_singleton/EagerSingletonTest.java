package com.gerrard.design_pattern.u01_singleton;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class EagerSingletonTest {

    @Test
    public void testSingleton() {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        Assert.assertSame(singleton1, singleton2);
    }

    @Test
    public void testReflectFailure() throws Exception {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        Constructor<?> constructor = EagerSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            EagerSingleton singleton2 = (EagerSingleton) constructor.newInstance();
            Assert.fail();
        } catch (Exception e) {
            // Do nothing, test pass
        }
    }
}
