package com.gerrard.design_pattern.u02_factory.factory_method;

public final class OperationFactoryAdd extends AbsOperationFactory {

	public OperationAdd createOperation() {
		return new OperationAdd();
	}

}
