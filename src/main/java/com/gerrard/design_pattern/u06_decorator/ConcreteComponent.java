package com.gerrard.design_pattern.u06_decorator;

public class ConcreteComponent implements Component {

	@Override
	public void methodA() {
		System.out.println(this.getClass().getName() + ": MethodA");
	}

	@Override
	public void methodB() {
		System.out.println(this.getClass().getName() + ": MethodB");
	}

}
