package com.gerrard.design_pattern.u05_adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ManCN {

	private String name;

	public void attackCN() {
		System.out.println(this.name + " 进攻");
	}

	public void defenseCN() {
		System.out.println(this.name + " 防守");
	}

}
