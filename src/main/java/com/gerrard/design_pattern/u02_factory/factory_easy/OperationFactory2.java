package com.gerrard.design_pattern.u02_factory.factory_easy;

public final class OperationFactory2 {

	private OperationFactory2() {

	}

	public static <T extends AbsOperation> T createOperation(Class<T> operationClass) {
		try {
			return operationClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new ArithmeticException("未定义的运算类型");
		}
	}

}
