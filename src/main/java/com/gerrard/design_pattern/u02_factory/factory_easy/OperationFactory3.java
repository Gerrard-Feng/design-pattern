package com.gerrard.design_pattern.u02_factory.factory_easy;

import java.util.HashMap;
import java.util.Map;

public final class OperationFactory3 {

	private OperationFactory3() {

	}

	private static final Map<Class<?>, AbsOperation> operMap = new HashMap<>();

	@SuppressWarnings("unchecked")
	public static <T extends AbsOperation> T createOperation3(Class<T> operationClass) {
		try {
			T t;
			if (operMap.containsKey(operationClass)) {
				t = (T) operMap.get(operationClass);
			} else {
				t = operationClass.newInstance();
				operMap.put(operationClass, t);
			}
			return t;
		} catch (InstantiationException | IllegalAccessException e) {
			throw new ArithmeticException("未定义的运算类型");
		}
	}

}
