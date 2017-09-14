package com.gerrard.design_pattern.u02_factory.factory_easy;

public final class OperationMul extends AbsOperation {

	OperationMul() {

	}

	@Override
	double calc(double... vals) {
		double product = 1;
		for (double num : vals) {
			product *= num;
		}
		return product;
	}

}
