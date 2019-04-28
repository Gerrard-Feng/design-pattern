package com.gerrard.design_pattern.u01_singleton.serialize;

import java.io.Serializable;

public final class SerializableSingletonFail implements Serializable {

	private static final long serialVersionUID = 3355486892283807446L;

	private static final SerializableSingletonFail instance = new SerializableSingletonFail();

	private SerializableSingletonFail() {
		if (instance != null) {
			throw new IllegalStateException();
		}
	}

	public static final SerializableSingletonFail getInstance() {
		return instance;
	}

}
