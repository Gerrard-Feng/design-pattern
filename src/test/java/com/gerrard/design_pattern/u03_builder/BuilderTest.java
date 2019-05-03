package com.gerrard.design_pattern.u03_builder;

import org.junit.jupiter.api.Test;

public final class BuilderTest {

    @Test
    void testPolicyCommon1() {
        PolicyCommon policy = new PolicyCommon();
        policy.setName("Gerrard");
        policy.setCode("11123768");
        policy.setCategory("Engineer");
        System.out.println(policy);
    }

    @Test
    void testPolicyCommon2() {
        PolicyCommon policy = new PolicyCommon("11123768", "Engineer", "Gerrard");
        System.out.println(policy);
    }

    @Test
    void testPolicyBuilder() {
        PolicyBuilder policy = new PolicyBuilder.Builder().setName("Gerrard").setCode("11123768").build();
        System.out.println(policy);
    }

    @Test
    void testPolicyBuilderLombok() {
        PolicyBuilderLombok policy = new PolicyBuilderLombok.PolicyBuilderLombokBuilder()
                .name("Gerrard").code("11123768").build();
        System.out.println(policy);
    }
}
