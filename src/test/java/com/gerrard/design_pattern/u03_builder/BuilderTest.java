package com.gerrard.design_pattern.u03_builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BuilderTest {

    @Test
    public void test() {
        PolicyCommon policy1 = new PolicyCommon();
        policy1.setName("");
        policy1.setCode("");
        PolicyCommon policy2 = new PolicyCommon("", null, "");
        Assertions.assertEquals(policy1, policy2);
        PolicyBuilder policy3 = new PolicyBuilder.Builder().setName("").setCode("").build();
        PolicyBuilderLombok policy4 = new PolicyBuilderLombok.PolicyBuilderLombokBuilder().name("").code("").build();
        Assertions.assertEquals(policy3.getName(), policy4.getName());
        Assertions.assertEquals(policy3.getCode(), policy4.getCode());
        Assertions.assertEquals(policy3.getCategory(), policy4.getCategory());
        Assertions.assertEquals(policy3.getInceptionDate(), policy4.getInceptionDate());
    }

}
