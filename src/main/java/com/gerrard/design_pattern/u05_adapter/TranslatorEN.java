package com.gerrard.design_pattern.u05_adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TranslatorEN implements IntroductionEN {

	private ManCN manCN;

	@Override
	public void attackEN() {
		manCN.attackCN();
	}

	@Override
	public void defenseEN() {
		manCN.defenseCN();
	}

}
