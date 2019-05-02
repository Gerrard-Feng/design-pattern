package com.gerrard.design_pattern.u02_factory.factory_easy;

import com.gerrard.design_pattern.u02_factory.OperatorEnum;

public final class OperationFactory1 {

    private OperationFactory1() {

    }

    public static AbsOperation createOperation(OperatorEnum operator) {
        switch (operator) {
            case OPERATOR_ADD:
                return new OperationAdd();
            case OPERATOR_SUB:
                return new OperationSub();
            case OPERATOR_MUL:
                return new OperationMul();
            case OPERATOR_DIV:
                return new OperationDiv();
            default:
                throw new ArithmeticException("Undefined operation");
        }
    }
}
