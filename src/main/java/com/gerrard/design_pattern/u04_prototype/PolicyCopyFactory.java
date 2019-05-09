package com.gerrard.design_pattern.u04_prototype;

import lombok.Data;

import java.util.List;

@Data
public final class PolicyCopyFactory {

    private String code;
    private int applicantAge;
    private Liability liability;
    private List<String> specialDescriptions;

    public static PolicyCopyFactory newInstance(PolicyCopyFactory policy) {
        PolicyCopyFactory copyPolicy = new PolicyCopyFactory();
        copyPolicy.setCode(policy.getCode());
        copyPolicy.setApplicantAge(policy.getApplicantAge());
        copyPolicy.setLiability(policy.getLiability());
        copyPolicy.setSpecialDescriptions(policy.getSpecialDescriptions());
        return copyPolicy;
    }
}
