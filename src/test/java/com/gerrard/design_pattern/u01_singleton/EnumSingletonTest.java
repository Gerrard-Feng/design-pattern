package com.gerrard.design_pattern.u01_singleton;

import org.junit.Assert;
import org.junit.Test;

public class EnumSingletonTest {

    @Test
    public void testSingleton() {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        Assert.assertSame(singleton1, singleton2);
    }

}
