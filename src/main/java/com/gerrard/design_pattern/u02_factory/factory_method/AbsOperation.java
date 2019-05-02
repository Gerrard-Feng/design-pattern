package com.gerrard.design_pattern.u02_factory.factory_method;

import java.math.BigDecimal;

public abstract class AbsOperation {

    protected abstract BigDecimal calc(double a, double b);
}
