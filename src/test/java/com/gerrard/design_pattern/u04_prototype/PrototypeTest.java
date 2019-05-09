package com.gerrard.design_pattern.u04_prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PrototypeTest {

    @Test
    void testPolicyShallowClone() throws Exception {
        // Build original policy
        Liability liability = new Liability.LiabilityBuilder().code("0001").name("Liability").category("XPXA").build();
        String specialDescription1 = "text1";
        String specialDescription2 = "text2";
        List<String> specialDescriptions = new ArrayList<>(Arrays.asList(specialDescription1, specialDescription2));
        PolicyShallowClone policyA = PolicyShallowClone.builder().specialDescriptions(specialDescriptions).liability(liability).code("code001").applicantAge(18).build();
        // Call clone
        PolicyShallowClone policyB = policyA.clone();
        Assertions.assertSame(policyA.getCode(), policyB.getCode());
        Assertions.assertEquals(policyA.getCode(), policyB.getCode());
        // Assert shallow clone
        policyA.getSpecialDescriptions().add("text3");
        Assertions.assertSame(policyA.getLiability(), policyB.getLiability());
        Assertions.assertTrue(policyA.getSpecialDescriptions().size() == policyB.getSpecialDescriptions().size());
    }

    @Test
    void testPolicyDeepClone() throws Exception {
        // Build original policy
        Liability liability = new Liability.LiabilityBuilder().code("0001").name("Liability").category("XPXA").build();
        String specialDescription1 = "text1";
        String specialDescription2 = "text2";
        List<String> specialDescriptions = new ArrayList<>(Arrays.asList(specialDescription1, specialDescription2));
        PolicyDeepClone policyA = PolicyDeepClone.builder().specialDescriptions(specialDescriptions).liability(liability).code("code001").applicantAge(18).build();
        // Call clone
        PolicyDeepClone policyB = policyA.clone();
        // Assert deep clone
        policyA.getSpecialDescriptions().add("text3");
        Assertions.assertNotSame(policyA.getLiability(), policyB.getLiability());
        Assertions.assertFalse(policyA.getSpecialDescriptions().size() == policyB.getSpecialDescriptions().size());
    }

    @Test
    void testPolicyCopyConstructor() {
        PolicyCopyConstructor policyA = new PolicyCopyConstructor();
        PolicyCopyConstructor policyB = new PolicyCopyConstructor(policyA);
        Assertions.assertNotSame(policyA, policyB);
    }

    @Test
    void testPolicyCopyFactory() {
        PolicyCopyFactory policyA = new PolicyCopyFactory();
        PolicyCopyFactory policyB = PolicyCopyFactory.newInstance(policyA);
        Assertions.assertNotSame(policyA, policyB);
    }
}
