package com.gerrard.design_pattern.u04_prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public final class PolicyCopyConstructor {

    private String code;
    private int applicantAge;
    private Liability liability;
    private List<String> specialDescriptions;

    public PolicyCopyConstructor(PolicyCopyConstructor policy) {
        this.code = policy.code;
        this.applicantAge = policy.applicantAge;
        this.liability = policy.liability;
        this.specialDescriptions = policy.specialDescriptions;
    }
}
