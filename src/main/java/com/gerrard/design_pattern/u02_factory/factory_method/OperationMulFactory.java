package com.gerrard.design_pattern.u02_factory.factory_method;

public final class OperationMulFactory extends AbsOperationFactory {

	@Override
	public OperationMul createOperation() {
		return new OperationMul();
	}

}
