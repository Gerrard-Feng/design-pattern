package com.gerrard.design_pattern.u01_singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public final class StaticBlockSingletonTest {

    @Test
    void testSingleton() throws Exception {
        StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();
        Assertions.assertSame(singleton1, singleton2);
    }

    /**
     * Must run after testSingleton
     */
    @Test
    void testReflectFailure() throws Exception {
        Constructor<?> constructor = StaticBlockSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            StaticBlockSingleton singleton = (StaticBlockSingleton) constructor.newInstance();
            Assertions.fail();
        } catch (Exception e) {
            // Do nothing, test pass
        }
    }

}
