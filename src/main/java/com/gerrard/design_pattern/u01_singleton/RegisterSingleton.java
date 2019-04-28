package com.gerrard.design_pattern.u01_singleton;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class RegisterSingleton {

    protected RegisterSingleton() {

    }

    protected static final Map<String, RegisterSingleton> registry = new HashMap<>();
    private static final String name;

    private static volatile Object lock = new Object();

    static {
        RegisterSingleton registerSingleton = new RegisterSingleton();
        name = registerSingleton.getClass().getName();
        registry.put(name, registerSingleton);
    }

    public static RegisterSingleton getInstance(String keyName) {
        if (keyName == null) {
            keyName = RegisterSingleton.name;
        } else if (registry.get(keyName) == null) {
            try {
                synchronized (lock) {
                    Class<?> clazz = Class.forName(keyName);
                    Constructor<?> constructor = clazz.getDeclaredConstructor();
                    constructor.setAccessible(true);
                    RegisterSingleton singleton = (RegisterSingleton) constructor.newInstance();
                    registry.put(keyName, singleton);
                }
            } catch (Exception e) {
                throw new IllegalArgumentException();
            }
        }
        return registry.get(keyName);
    }

}
