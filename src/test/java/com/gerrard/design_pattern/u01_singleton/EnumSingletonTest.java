package com.gerrard.design_pattern.u01_singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class EnumSingletonTest {

    @Test
    void testSingleton() {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        Assertions.assertSame(singleton1, singleton2);
    }

}
