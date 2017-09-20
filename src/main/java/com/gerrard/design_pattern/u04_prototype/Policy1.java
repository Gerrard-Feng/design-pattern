package com.gerrard.design_pattern.u04_prototype;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Policy1 implements Cloneable {

	private String code;
	private int applicantAge;
	private Liability liability;
	private List<String> specialDescriptions;

	@Override
	protected Policy1 clone() throws CloneNotSupportedException {
		return (Policy1) super.clone();
	}

}
