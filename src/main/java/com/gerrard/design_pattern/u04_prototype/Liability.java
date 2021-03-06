package com.gerrard.design_pattern.u04_prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Liability implements Cloneable {

    private String code;
    private String name;
    private String category;
    private boolean isMajor;

    @Override
    protected Liability clone() throws CloneNotSupportedException {
        return (Liability) super.clone();
    }
}
