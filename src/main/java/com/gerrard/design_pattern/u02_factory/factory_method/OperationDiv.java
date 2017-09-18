package com.gerrard.design_pattern.u02_factory.factory_method;

public final class OperationDiv extends AbsOperation {

	OperationDiv() {

	}

	@Override
	public double calc(double... vals) {
		if (vals.length != 2) {
			throw new ArithmeticException("只支持两个数的除法运算");
		}
		if (vals[1] == 0) {
			throw new ArithmeticException("除数不可为0");
		}
		return vals[0] / vals[1];
	}

}
