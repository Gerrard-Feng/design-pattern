package com.gerrard.design_pattern.u01_singleton;

public class EagerSingleton {

	private static final EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
		if (instance != null) {
			throw new IllegalStateException();
		}
	}

	public static final EagerSingleton getInstance() {
		return instance;
	}

}
