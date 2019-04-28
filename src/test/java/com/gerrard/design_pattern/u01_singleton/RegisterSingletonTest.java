package com.gerrard.design_pattern.u01_singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class RegisterSingletonTest {

    @Test
    public void testSingleton() throws Exception {
        RegisterSingletonChild singleton1 = RegisterSingletonChild.getInstance();
        RegisterSingletonChild singleton2 = RegisterSingletonChild.getInstance();
        Assertions.assertSame(singleton1, singleton2);
    }

    @Test
    public void testReflectSuccess() throws Exception {
        Constructor<?> constructor = RegisterSingletonChild.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        RegisterSingletonChild singleton1 = (RegisterSingletonChild) constructor.newInstance();
        RegisterSingletonChild singleton2 = RegisterSingletonChild.getInstance();
        Assertions.assertNotSame(singleton1, singleton2);
    }

    @Test
    public void testReflectFailure() throws Exception {
        RegisterSingletonChild singleton1 = RegisterSingletonChild.getInstance();
        Constructor<?> constructor = LazySingleton1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            RegisterSingletonChild singleton2 = (RegisterSingletonChild) constructor.newInstance();
            Assertions.fail();
        } catch (Exception e) {
            // Do nothing, test pass
        }
    }

}
