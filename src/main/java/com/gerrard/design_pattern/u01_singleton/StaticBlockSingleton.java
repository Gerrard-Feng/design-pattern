package com.gerrard.design_pattern.u01_singleton;

public class StaticBlockSingleton {

	private static final StaticBlockSingleton instance;

	private StaticBlockSingleton() {
		if (instance != null) {
			throw new IllegalStateException();
		}
	}

	static {
		instance = new StaticBlockSingleton();
	}

	public static final StaticBlockSingleton getInstance() {
		return instance;
	}

}
