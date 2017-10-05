package com.gerrard.design_pattern.u05_adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ManEN implements IntroductionEN {

	private String name;

	@Override
	public void attackEN() {
		System.out.println(this.name + " Attack");
	}

	@Override
	public void defenseEN() {
		System.out.println(this.name + " Defense");
	}

}
