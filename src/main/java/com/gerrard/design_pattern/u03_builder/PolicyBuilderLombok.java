package com.gerrard.design_pattern.u03_builder;

import lombok.Builder;
import lombok.Data;

@Data
public class PolicyBuilderLombok {

	private String code;
	private String category;
	private String name;
	private String inceptionDate;

	@Builder
	public PolicyBuilderLombok(String code, String category, String name) {
		super();
		this.code = code;
		this.category = category;
		this.name = name;
	}

}
