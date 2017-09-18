package com.gerrard.design_pattern.u02_factory.factory_method;

public final class OperationMul extends AbsOperation {

	OperationMul() {

	}

	@Override
	public double calc(double... vals) {
		double product = 1;
		for (double num : vals) {
			product *= num;
		}
		return product;
	}

}
