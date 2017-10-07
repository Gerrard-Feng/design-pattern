package com.gerrard.design_pattern.u06_decorator;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	public void methodC() {
		System.out.println(this.getClass().getName() + ": MethodC");
	}

}
