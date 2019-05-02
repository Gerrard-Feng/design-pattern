package com.gerrard.design_pattern.u02_factory.factory_easy;

import com.gerrard.design_pattern.u02_factory.OperatorEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public final class EasyFactoryTest {

    @Test
    void testOperationAdd() {
        AbsOperation operation1 = OperationFactory1.createOperation(OperatorEnum.OPERATOR_ADD);
        OperationAdd operation2 = OperationFactory2.createOperation(OperationAdd.class);

        BigDecimal result1 = operation1.calc(1, 2);
        BigDecimal result2 = operation2.calc(1, 2);

        Assertions.assertTrue(result1.compareTo(new BigDecimal(3)) == 0);
        Assertions.assertTrue(result2.compareTo(new BigDecimal(3)) == 0);
    }

    @Test
    void testOperationSub() {
        AbsOperation operation1 = OperationFactory1.createOperation(OperatorEnum.OPERATOR_SUB);
        OperationSub operation2 = OperationFactory2.createOperation(OperationSub.class);

        BigDecimal result1 = operation1.calc(1, 2);
        BigDecimal result2 = operation2.calc(1, 2);

        Assertions.assertTrue(result1.compareTo(new BigDecimal(-1)) == 0);
        Assertions.assertTrue(result2.compareTo(new BigDecimal(-1)) == 0);
    }

    @Test
    void testOperationMul() {
        AbsOperation operation1 = OperationFactory1.createOperation(OperatorEnum.OPERATOR_MUL);
        OperationMul operation2 = OperationFactory2.createOperation(OperationMul.class);

        BigDecimal result1 = operation1.calc(1, 2);
        BigDecimal result2 = operation2.calc(1, 2);

        Assertions.assertTrue(result1.compareTo(new BigDecimal(2)) == 0);
        Assertions.assertTrue(result2.compareTo(new BigDecimal(2)) == 0);
    }

    @Test
    void testOperationDiv() {
        AbsOperation operation1 = OperationFactory1.createOperation(OperatorEnum.OPERATOR_DIV);
        OperationDiv operation2 = OperationFactory2.createOperation(OperationDiv.class);

        BigDecimal result1 = operation1.calc(1, 2);
        BigDecimal result2 = operation2.calc(1, 2);

        Assertions.assertTrue(result1.compareTo(new BigDecimal(0.5)) == 0);
        Assertions.assertTrue(result2.compareTo(new BigDecimal(0.5)) == 0);
    }

    @Test
    void testOperationSingleton() {
        OperationAdd operation1 = OperationFactory3.createOperation(OperationAdd.class);
        OperationAdd operation2 = OperationFactory3.createOperation(OperationAdd.class);
        Assertions.assertSame(operation1, operation2);
    }
}
