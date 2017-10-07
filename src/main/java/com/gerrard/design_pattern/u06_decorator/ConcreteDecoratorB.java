package com.gerrard.design_pattern.u06_decorator;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ConcreteDecoratorB extends Decorator {

	private Object specificatedField;

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public synchronized void methodA() {
		System.out.println("Some operation before");
		super.methodA();
	}

}
