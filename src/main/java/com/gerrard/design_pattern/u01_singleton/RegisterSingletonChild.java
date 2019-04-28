package com.gerrard.design_pattern.u01_singleton;

public final class RegisterSingletonChild extends RegisterSingleton {

    private static final String keyName = RegisterSingletonChild.class.getName();

    private RegisterSingletonChild() {
        if (registry.get(keyName) != null) {
            throw new IllegalStateException();
        }
    }

    public static RegisterSingletonChild getInstance() {
        return (RegisterSingletonChild) RegisterSingleton.getInstance(keyName);
    }

    public static void destroyInstance() {
        registry.remove(keyName);
    }
}
