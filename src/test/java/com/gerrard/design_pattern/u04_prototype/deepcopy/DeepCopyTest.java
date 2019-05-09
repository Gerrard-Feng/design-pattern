package com.gerrard.design_pattern.u04_prototype.deepcopy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class DeepCopyTest {

    private Policy buildPolicy() {
        LiabilitySerializable liability = new LiabilitySerializable.LiabilitySerializableBuilder().code("0001").name("Liability").category("XPXA").build();
        String specialDescription1 = "text1";
        String specialDescription2 = "text2";
        List<String> specialDescriptions = new ArrayList<>(Arrays.asList(specialDescription1, specialDescription2));
        return new Policy.PolicyBuilder().specialDescriptions(specialDescriptions).liability(liability).code("code001").applicantAge(18).build();
    }

    private void assertDeepCopyPolicy(Policy policy1, Policy policy2) {
        Assertions.assertNotSame(policy1.getCode(), policy2.getCode());
        Assertions.assertNotSame(policy1.getLiability(), policy2.getLiability());
        Assertions.assertNotSame(policy1.getSpecialDescriptions(), policy2.getSpecialDescriptions());
        Assertions.assertNotSame(policy1.getSpecialDescriptions().get(0), policy2.getSpecialDescriptions().get(0));
        Assertions.assertNotSame(policy1.getSpecialDescriptions().get(1), policy2.getSpecialDescriptions().get(1));
    }

    @Test
    void testDeepCopy1() throws Exception {
        Policy policy1 = buildPolicy();
        Policy policy2 = DeepCopyUtils.deepCopy1(policy1);
        assertDeepCopyPolicy(policy1, policy2);
    }

    @Test
    void testDeepCopy2() throws Exception {
        Policy policy1 = buildPolicy();
        Policy policy2 = DeepCopyUtils.deepCopy2(policy1, Policy.class);
        assertDeepCopyPolicy(policy1, policy2);
    }
}
