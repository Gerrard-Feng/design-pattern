package com.gerrard.design_pattern.u01_singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class StaticInnerSingletonTest {

    @Test
    public void test() throws Exception {
        Class<?> clazz = StaticInnerSingleton.class;
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticInnerSingleton singleton3 = (StaticInnerSingleton) constructor.newInstance();
        StaticInnerSingleton singleton1 = StaticInnerSingleton.getInstance();
        StaticInnerSingleton singleton2 = StaticInnerSingleton.getInstance();
        Assertions.assertSame(singleton1, singleton2);
        Assertions.assertNotSame(singleton1, singleton3);
    }

    @Test
    public void test2() throws Exception {
        Class<?> clazz = StaticInnerSingleton.class;
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticInnerSingleton singleton3 = (StaticInnerSingleton) constructor.newInstance();
        StaticInnerSingleton singleton1 = StaticInnerSingleton.getInstance();
        StaticInnerSingleton singleton2 = StaticInnerSingleton.getInstance();
        Assertions.assertSame(singleton1, singleton2);
        Assertions.assertNotSame(singleton1, singleton3);
    }
}
