package com.gerrard.design_pattern.u01_singleton;

public class LazySingleton {

	private static volatile LazySingleton instance;

	private LazySingleton() {
		if (instance != null) {
			throw new IllegalStateException();
		}
	}

	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

}
