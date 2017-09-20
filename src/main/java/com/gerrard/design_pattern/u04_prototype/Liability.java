package com.gerrard.design_pattern.u04_prototype;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Liability implements Serializable {

	private static final long serialVersionUID = 6509714967739776705L;

	private String code;
	private String name;
	private String category;
	private boolean isMajor;

}
