package com.gerrard.design_pattern.u02_factory.factory_easy;

import java.math.BigDecimal;

public class OperationDiv extends AbsOperation {

    OperationDiv() {

    }

    @Override
    public BigDecimal calc(double a, double b) {
        return new BigDecimal(a).divide(new BigDecimal(b));
    }
}
