package com.gerrard.design_pattern.u01_singleton.serialize;

import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		System.out.println(calc(Long.MAX_VALUE, Long.MAX_VALUE));
	}

	// 只算正数
	public static BigDecimal calc(long a, long b) {
		if (a <= 10 && b <= 10) {
			return BigDecimal.valueOf(a * b);
		}
		if (a > 10) {
			long c = a / 10;
			long d = a % 10;
			return calc(c, b).multiply(new BigDecimal("10")).add(calc(d, b));
		} else if (b > 10) {
			long e = b / 10;
			long f = b % 10;
			return calc(a, e).multiply(new BigDecimal("10")).add(calc(a, f));
		}
		throw new RuntimeException();
	}

}
