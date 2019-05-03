package com.gerrard.design_pattern.u02_factory.factory_easy;

public final class OperationFactory2 {

	private OperationFactory2() {

	}

	public static <T extends AbsOperation> T getInstance(Class<T> operationClass) {
		try {
			return operationClass.newInstance();
		} catch (Exception e) {
			throw new RuntimeException("Something wrong when create " + operationClass.getName() + " instance");
		}
	}
}
