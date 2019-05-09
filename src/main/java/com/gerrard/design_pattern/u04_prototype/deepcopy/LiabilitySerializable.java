package com.gerrard.design_pattern.u04_prototype.deepcopy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LiabilitySerializable implements Serializable {

    private static final long serialVersionUID = 3628603499527360136L;

    private String code;
    private String name;
    private String category;
    private boolean isMajor;
}
