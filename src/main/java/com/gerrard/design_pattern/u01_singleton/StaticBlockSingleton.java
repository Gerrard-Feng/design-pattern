package com.gerrard.design_pattern.u01_singleton;

public final class StaticBlockSingleton {

    private static final StaticBlockSingleton instance;

    private static String str1;
    private static String str2;

    private StaticBlockSingleton() {
        if (instance != null) {
            throw new IllegalStateException();
        }
    }

    static {
        instance = new StaticBlockSingleton();
        str1 = "Field1";
        str2 = "Field2";
    }

    public static final StaticBlockSingleton getInstance() {
        return instance;
    }

}
