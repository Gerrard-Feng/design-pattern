package com.gerrard.design_pattern.u02_factory.factory_method;

import java.math.BigDecimal;

public final class OperationSub extends AbsOperation {

	OperationSub() {

	}

	@Override
	public BigDecimal calc(double a, double b) {
		return new BigDecimal(a).subtract(new BigDecimal(b));
	}
}
