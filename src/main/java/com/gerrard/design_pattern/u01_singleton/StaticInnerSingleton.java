package com.gerrard.design_pattern.u01_singleton;

public class StaticInnerSingleton {

	private StaticInnerSingleton() {
		if (SingletonHolder.instance != null) {
			throw new IllegalStateException();
		}
	}

	private static class SingletonHolder {
		private static StaticInnerSingleton instance = new StaticInnerSingleton();
	}

	public static StaticInnerSingleton getInstance() {
		return SingletonHolder.instance;
	}

}
