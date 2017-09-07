package com.gerrard.design_pattern.u01_singleton;

public class StaticSingleton {

	private StaticSingleton() {
		if (SingletonHolder.instance != null) {
			throw new IllegalStateException();
		}
	}

	private static class SingletonHolder {
		private static StaticSingleton instance = new StaticSingleton();
	}

	public static StaticSingleton getInstance() {
		return SingletonHolder.instance;
	}

}
