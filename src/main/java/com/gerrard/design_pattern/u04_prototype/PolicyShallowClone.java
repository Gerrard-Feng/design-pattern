package com.gerrard.design_pattern.u04_prototype;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public final class PolicyShallowClone implements Cloneable {

	private String code;
	private int applicantAge;
	private Liability liability;
	private List<String> specialDescriptions;

	@Override
	public PolicyShallowClone clone() throws CloneNotSupportedException {
		return (PolicyShallowClone) super.clone();
	}
}
