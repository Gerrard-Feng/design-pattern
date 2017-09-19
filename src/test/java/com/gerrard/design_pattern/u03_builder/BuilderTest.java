package com.gerrard.design_pattern.u03_builder;

import org.junit.Assert;
import org.junit.Test;

public final class BuilderTest {

	@Test
	public void test() {
		PolicyCommon policy1 = new PolicyCommon();
		policy1.setName("");
		policy1.setCode("");
		PolicyCommon policy2 = new PolicyCommon("", null, "");
		Assert.assertEquals(policy1, policy2);
		PolicyBuilder policy3 = new PolicyBuilder.Builder().setName("").setCode("").build();
		PolicyBuilderLombok policy4 = new PolicyBuilderLombok.PolicyBuilderLombokBuilder().name("").code("").build();
		Assert.assertEquals(policy3.getName(), policy4.getName());
		Assert.assertEquals(policy3.getCode(), policy4.getCode());
		Assert.assertEquals(policy3.getCategory(), policy4.getCategory());
		Assert.assertEquals(policy3.getInceptionDate(), policy4.getInceptionDate());
	}

}
