package com.gerrard.design_pattern.u04_prototype;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public final class PolicyDeepClone implements Cloneable {

	private String code;
	private int applicantAge;
	private Liability liability;
	private List<String> specialDescriptions;

	@Override
	public PolicyDeepClone clone() throws CloneNotSupportedException {
        PolicyDeepClone clone = (PolicyDeepClone) super.clone();
        clone.specialDescriptions = new ArrayList<>(this.specialDescriptions);
        clone.liability = this.liability.clone();
		return clone;
	}
}
