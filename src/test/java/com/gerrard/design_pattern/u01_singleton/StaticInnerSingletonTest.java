package com.gerrard.design_pattern.u01_singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public final class StaticInnerSingletonTest {

    @Test
    void testSingleton() throws Exception {
        StaticInnerSingleton singleton1 = StaticInnerSingleton.getInstance();
        StaticInnerSingleton singleton2 = StaticInnerSingleton.getInstance();
        Assertions.assertSame(singleton1, singleton2);
    }

    @Test
    void testReflectFailure() throws Exception {
        StaticInnerSingleton singleton1 = StaticInnerSingleton.getInstance();
        Constructor<?> constructor = StaticInnerSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            StaticInnerSingleton singleton2 = (StaticInnerSingleton) constructor.newInstance();
            Assertions.fail();
        } catch (Exception e) {
            // Do nothing, test pass
        }
    }
}
