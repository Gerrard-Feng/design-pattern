package com.gerrard.design_pattern.u02_factory.factory_method;

public final class OperationAdd extends AbsOperation {

	OperationAdd() {

	}

	@Override
	public double calc(double... vals) {
		double sum = 0;
		for (double num : vals) {
			sum += num;
		}
		return sum;
	}

}
