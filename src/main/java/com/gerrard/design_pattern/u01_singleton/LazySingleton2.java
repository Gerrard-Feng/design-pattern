package com.gerrard.design_pattern.u01_singleton;

/**
 * This is lazy singleton with a higher performance version
 */
public final class LazySingleton2 {

    private static volatile LazySingleton2 instance;

    private LazySingleton2() {
        if (instance != null) {
            throw new IllegalStateException();
        }
    }

    public static LazySingleton2 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton2.class) {
                if (instance == null) {
                    instance = new LazySingleton2();
                }
            }
        }
        return instance;
    }
}
