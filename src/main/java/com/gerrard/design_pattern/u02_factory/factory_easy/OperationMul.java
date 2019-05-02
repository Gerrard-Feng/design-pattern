package com.gerrard.design_pattern.u02_factory.factory_easy;

import java.math.BigDecimal;

public final class OperationMul extends AbsOperation {

	OperationMul() {

	}

	@Override
	public BigDecimal calc(double a, double b) {
		return new BigDecimal(a).multiply(new BigDecimal(b));
	}
}
