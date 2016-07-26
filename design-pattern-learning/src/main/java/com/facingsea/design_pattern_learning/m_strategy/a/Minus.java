package com.facingsea.design_pattern_learning.m_strategy.a;

public class Minus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int[] arrInt = split(exp, "-");
		return arrInt[0] - arrInt[1];
	}

}
