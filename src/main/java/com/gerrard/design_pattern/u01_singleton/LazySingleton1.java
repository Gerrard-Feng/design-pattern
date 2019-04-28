package com.gerrard.design_pattern.u01_singleton;

public final class LazySingleton1 {

    private static LazySingleton1 instance;

    private LazySingleton1() {
        if (instance != null) {
            throw new IllegalStateException();
        }
    }

    public static synchronized LazySingleton1 getInstance() {
        if (instance == null) {
            instance = new LazySingleton1();
        }
        return instance;
    }
}
