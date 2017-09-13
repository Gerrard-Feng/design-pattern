package com.gerrard.design_pattern.u02_factory.factory_easy;

public final class OperationSub extends AbsOperation {

	OperationSub() {

	}

	@Override
	public double calc(double... vals) {
		if (vals.length != 2) {
			throw new ArithmeticException("只支持两个数的减法运算");
		}
		return vals[0] - vals[1];
	}

}
