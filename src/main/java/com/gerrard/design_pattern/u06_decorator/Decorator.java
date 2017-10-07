package com.gerrard.design_pattern.u06_decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Decorator implements Component {

	private Component component;

	@Override
	public void methodA() {
		component.methodA();
	}

	@Override
	public void methodB() {
		component.methodB();
	}

}
