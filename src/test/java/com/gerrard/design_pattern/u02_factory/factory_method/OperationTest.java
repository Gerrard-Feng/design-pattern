package com.gerrard.design_pattern.u02_factory.factory_method;

import org.junit.Assert;
import org.junit.Test;

public class OperationTest {

	@Test
	public void test() {
		double[] vals1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		AbsOperationFactory factory = new OperationFactoryAdd();
		AbsOperation operator = factory.createOperation();
		Assert.assertTrue(operator.calc(vals1) - 45 == 0);
	}

}
