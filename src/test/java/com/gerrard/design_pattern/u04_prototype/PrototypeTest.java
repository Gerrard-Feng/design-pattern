package com.gerrard.design_pattern.u04_prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PrototypeTest {

    @Test
    public void test1() throws Exception {
        Liability liability = new Liability.LiabilityBuilder().code("0001").name("责任").category("XPXA").build();
        String specialDescription1 = "特别约定1";
        String specialDescription2 = "特别约定2";
        List<String> specialDescriptions = new ArrayList<>(Arrays.asList(specialDescription1, specialDescription2));
        Policy1 policyA =
				new Policy1.Policy1Builder().specialDescriptions(specialDescriptions).liability(liability).code(
						"险种代码001").applicantAge(18).build();
        Policy1 policyB = policyA.clone();
        Assertions.assertTrue(policyA.getApplicantAge() - policyB.getApplicantAge() == 0);
        Assertions.assertSame(policyA.getCode(), policyB.getCode());
        Assertions.assertSame(policyA.getLiability(), policyB.getLiability());
        Assertions.assertSame(policyA.getLiability().getCategory(), policyB.getLiability().getCategory());
        Assertions.assertSame(policyA.getSpecialDescriptions(), policyB.getSpecialDescriptions());
        Assertions.assertSame(policyA.getSpecialDescriptions().get(0), policyB.getSpecialDescriptions().get(0));
        Assertions.assertSame(policyA.getSpecialDescriptions().get(1), policyB.getSpecialDescriptions().get(1));
    }

    @Test
    public void test2() throws Exception {
        Liability liability = new Liability.LiabilityBuilder().code("0001").name("责任").category("XPXA").build();
        String specialDescription1 = "特别约定1";
        String specialDescription2 = "特别约定2";
        List<String> specialDescriptions = new ArrayList<>(Arrays.asList(specialDescription1, specialDescription2));
        Policy2 policyA =
				new Policy2.Policy2Builder().specialDescriptions(specialDescriptions).liability(liability).code(
						"险种代码001").applicantAge(18).build();
        Policy2 policyB = policyA.deepClone();
        Assertions.assertTrue(policyA.getApplicantAge() - policyB.getApplicantAge() == 0);
        Assertions.assertNotSame(policyA.getCode(), policyB.getCode());
        Assertions.assertNotSame(policyA.getLiability(), policyB.getLiability());
        Assertions.assertNotSame(policyA.getLiability().getCategory(), policyB.getLiability().getCategory());
        Assertions.assertNotSame(policyA.getSpecialDescriptions(), policyB.getSpecialDescriptions());
        Assertions.assertNotSame(policyA.getSpecialDescriptions().get(0), policyB.getSpecialDescriptions().get(0));
        Assertions.assertNotSame(policyA.getSpecialDescriptions().get(1), policyB.getSpecialDescriptions().get(1));
    }

    @Test
    public void test3() throws Exception {
        Liability liability = new Liability.LiabilityBuilder().code("0001").name("责任").category("XPXA").build();
        String specialDescription1 = "特别约定1";
        String specialDescription2 = "特别约定2";
        List<String> specialDescriptions = new ArrayList<>(Arrays.asList(specialDescription1, specialDescription2));
        Policy3 policyA =
				new Policy3.Policy3Builder().specialDescriptions(specialDescriptions).liability(liability).code(
						"险种代码001").applicantAge(18).build();
        Policy3 policyB = policyA.deepClone();
        Assertions.assertTrue(policyA.getApplicantAge() - policyB.getApplicantAge() == 0);
        Assertions.assertNotSame(policyA.getCode(), policyB.getCode());
        Assertions.assertNotSame(policyA.getLiability(), policyB.getLiability());
        Assertions.assertNotSame(policyA.getLiability().getCategory(), policyB.getLiability().getCategory());
        Assertions.assertNotSame(policyA.getSpecialDescriptions(), policyB.getSpecialDescriptions());
        Assertions.assertNotSame(policyA.getSpecialDescriptions().get(0), policyB.getSpecialDescriptions().get(0));
        Assertions.assertNotSame(policyA.getSpecialDescriptions().get(1), policyB.getSpecialDescriptions().get(1));
    }

}
