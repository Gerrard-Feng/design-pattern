package com.gerrard.design_pattern.u02_factory.factory_method;

public final class OperationAddFactory extends AbsOperationFactory {

	public OperationAdd createOperation() {
		return new OperationAdd();
	}

}
