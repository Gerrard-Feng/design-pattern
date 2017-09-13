package com.gerrard.design_pattern.u02_factory.factory_easy;

import com.gerrard.design_pattern.u02_factory.enums.OperatorEnum;

public final class OperationFactory {

	public static AbsOperation createOperation1(OperatorEnum operator) {
		switch (operator) {
		case OPERATOR_ADD:
			return new OperationAdd();
		default:
			throw new ArithmeticException("未定义的运算类型");
		}
	}

	public static <T extends AbsOperation> T createOperation2(Class<T> operationClass) {
		try {
			return operationClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new ArithmeticException("未定义的运算类型");
		}
	}

}
