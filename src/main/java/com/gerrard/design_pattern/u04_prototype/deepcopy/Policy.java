package com.gerrard.design_pattern.u04_prototype.deepcopy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Policy implements Serializable {

    private static final long serialVersionUID = -3378513149295369473L;

    private String code;
    private int applicantAge;
    private LiabilitySerializable liability;
    private List<String> specialDescriptions;
}
