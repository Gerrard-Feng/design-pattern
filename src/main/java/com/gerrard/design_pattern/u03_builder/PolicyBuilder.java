package com.gerrard.design_pattern.u03_builder;

public class PolicyBuilder {

	private String code;
	private String category;
	private String name;
	private String inceptionDate;

	private PolicyBuilder(Builder builder) {
		code = builder.code;
		category = builder.category;
		name = builder.name;
	}

	public static class Builder {

		private String code;
		private String category;
		private String name;

		public Builder setCode(String code) {
			this.code = code;
			return this;
		}

		public Builder setCategory(String category) {
			this.category = category;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public PolicyBuilder build() {
			return new PolicyBuilder(this);
		}
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInceptionDate() {
		return inceptionDate;
	}

	public void setInceptionDate(String inceptionDate) {
		this.inceptionDate = inceptionDate;
	}

}
