package com.gerrard.design_pattern.u02_factory.factory_method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public final class FactoryMethodTest {

    @Test
    void testOperationAdd() {
        OperationAddFactory factory = new OperationAddFactory();
        OperationAdd operation = factory.createOperation();
        BigDecimal result = operation.calc(1, 2);
        Assertions.assertTrue(result.compareTo(new BigDecimal(3)) == 0);
    }

    @Test
    void testOperationSub() {
        OperationSubFactory factory = new OperationSubFactory();
        OperationSub operation = factory.createOperation();
        BigDecimal result = operation.calc(1, 2);
        Assertions.assertTrue(result.compareTo(new BigDecimal(-1)) == 0);
    }

    @Test
    void testOperationMul() {
        OperationMulFactory factory = new OperationMulFactory();
        OperationMul operation = factory.createOperation();
        BigDecimal result = operation.calc(1, 2);
        Assertions.assertTrue(result.compareTo(new BigDecimal(2)) == 0);
    }

    @Test
    void testOperationDiv() {
        OperationDivFactory factory = new OperationDivFactory();
        OperationDiv operation = factory.createOperation();
        BigDecimal result = operation.calc(1, 2);
        Assertions.assertTrue(result.compareTo(new BigDecimal(0.5)) == 0);
    }
}
