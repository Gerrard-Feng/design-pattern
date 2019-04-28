package com.gerrard.design_pattern.u02_factory.factory_method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationTest {

	@Test
	public void test() {
		double[] vals1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		OperationAddFactory factory = new OperationAddFactory();
		OperationAdd operator = factory.createOperation();
		Assertions.assertTrue(operator.calc(vals1) - 45 == 0);
	}

}
