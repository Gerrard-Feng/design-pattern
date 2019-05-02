package com.gerrard.design_pattern.u02_factory.factory_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * A further analysis for the object created by factory.
 * Should it be a singleton object?
 * If yes, you can use a "registry" to keep the singleton characteristics
 */
public final class OperationFactory3 {

    private OperationFactory3() {

    }

    private static final Map<Class<?>, AbsOperation> operMap = new HashMap<>();

    @SuppressWarnings("unchecked")
    public static <T extends AbsOperation> T createOperation(Class<T> operationClass) {
        try {
            T t;
            if (operMap.containsKey(operationClass)) {
                t = (T) operMap.get(operationClass);
            } else {
                t = operationClass.newInstance();
                operMap.put(operationClass, t);
            }
            return t;
        } catch (Exception e) {
            throw new RuntimeException("Something wrong when create " + operationClass.getName() + " instance");
        }
    }
}
