package com.gerrard.design_pattern.u02_factory.factory_method;

public final class OperationSubFactory extends AbsOperationFactory {

	@Override
	public OperationSub createOperation() {
		return new OperationSub();
	}
}
