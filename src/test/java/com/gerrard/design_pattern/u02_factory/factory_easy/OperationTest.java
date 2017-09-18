package com.gerrard.design_pattern.u02_factory.factory_easy;

import org.junit.Assert;
import org.junit.Test;

import com.gerrard.design_pattern.u02_factory.enums.OperatorEnum;

public class OperationTest {

	@Test
	public void test() {
		double[] vals1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		double[] vals2 = { 20, 2 };
		AbsOperation operator1 = OperationFactory1.createOperation(OperatorEnum.OPERATOR_ADD);
		OperationSub operator2 = OperationFactory2.createOperation(OperationSub.class);
		Assert.assertTrue(operator1.calc(vals1) - 45 == 0);
		Assert.assertTrue(operator2.calc(vals2) - 18 == 0);
	}

}
