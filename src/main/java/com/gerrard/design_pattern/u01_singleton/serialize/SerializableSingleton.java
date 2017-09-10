package com.gerrard.design_pattern.u01_singleton.serialize;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

	private static final long serialVersionUID = -6451544700567522443L;

	private static final SerializableSingleton instance = new SerializableSingleton();

	private SerializableSingleton() {
		if (instance != null) {
			throw new IllegalStateException();
		}
	}

	public static final SerializableSingleton getInstance() {
		return instance;
	}

	private Object readResolve() {
		return instance;
	}

}
