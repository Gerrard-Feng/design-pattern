package com.gerrard.design_pattern.u01_singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public final class EagerSingletonTest {

    @Test
    void testSingleton() {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        Assertions.assertSame(singleton1, singleton2);
    }

    @Test
    void testReflectFailure() throws Exception {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        Constructor<?> constructor = EagerSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            EagerSingleton singleton2 = (EagerSingleton) constructor.newInstance();
            Assertions.fail();
        } catch (Exception e) {
            // Do nothing, test pass
        }
    }
}
