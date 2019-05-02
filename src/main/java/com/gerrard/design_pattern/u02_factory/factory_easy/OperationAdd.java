package com.gerrard.design_pattern.u02_factory.factory_easy;

import java.math.BigDecimal;

public final class OperationAdd extends AbsOperation {

    OperationAdd() {

    }

    @Override
    public BigDecimal calc(double a, double b) {
        return new BigDecimal(a).add(new BigDecimal(b));
    }
}
