package com.gerrard.design_pattern.u03_builder;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
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
}
