package com.gerrard.design_pattern.u01_singleton;

public class RegisterSingletonChild extends RegisterSingleton {

	private RegisterSingletonChild() {

	}

	public static RegisterSingletonChild getInstance() {
		return (RegisterSingletonChild) RegisterSingleton.getInstance(RegisterSingletonChild.class.getName());
	}

}
