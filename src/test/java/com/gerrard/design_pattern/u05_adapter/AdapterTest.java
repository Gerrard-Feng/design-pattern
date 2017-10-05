package com.gerrard.design_pattern.u05_adapter;

import org.junit.Test;

public class AdapterTest {

	@Test
	public void test() {
		ManCN manCN = new ManCN("中国球员");
		ManEN manEN = new ManEN("Foreign Player");
		TranslatorEN translatorEN = new TranslatorEN(manCN);
		manEN.attackEN();
		translatorEN.attackEN();
	}

}
