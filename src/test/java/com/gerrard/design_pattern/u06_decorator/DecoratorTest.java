package com.gerrard.design_pattern.u06_decorator;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void test() {
		Component component = new ConcreteComponent();
		ConcreteDecoratorA d1 = new ConcreteDecoratorA(component);
		ConcreteDecoratorB d2 = new ConcreteDecoratorB(component);
		d1.methodA();
		d1.methodB();
		d1.methodC();
		d2.methodA();
		d2.methodB();
	}

}
