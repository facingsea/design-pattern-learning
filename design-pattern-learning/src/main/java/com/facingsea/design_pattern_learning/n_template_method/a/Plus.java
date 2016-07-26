package com.facingsea.design_pattern_learning.n_template_method.a;

public class Plus extends AbstractCalculator {

	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}

}
