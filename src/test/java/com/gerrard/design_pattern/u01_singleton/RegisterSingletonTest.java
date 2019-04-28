package com.gerrard.design_pattern.u01_singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public final class RegisterSingletonTest {

    @BeforeEach
    public void clearRegistry() throws Exception {
        RegisterSingleton instance = RegisterSingleton.getInstance(RegisterSingleton.class.getName());
        Field registryField = RegisterSingleton.class.getDeclaredField("registry");
        registryField.setAccessible(true);
        // To set final field
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(registryField, registryField.getModifiers() & ~Modifier.FINAL);
        registryField.set(instance, new HashMap<String, RegisterSingleton>());
    }

    @Test
    void testSingleton() throws Exception {
        RegisterSingletonChild singleton1 = RegisterSingletonChild.getInstance();
        RegisterSingletonChild singleton2 = RegisterSingletonChild.getInstance();
        Assertions.assertSame(singleton1, singleton2);
    }

    @Test
    void testReflectSuccess() throws Exception {
        Constructor<?> constructor = RegisterSingletonChild.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        RegisterSingletonChild singleton1 = (RegisterSingletonChild) constructor.newInstance();
        RegisterSingletonChild singleton2 = RegisterSingletonChild.getInstance();
        Assertions.assertNotSame(singleton1, singleton2);
    }

    @Test
    void testReflectFailure() throws Exception {
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
