package com.facingsea.design_pattern_learning.d_builder.a;

public class Coke extends ColdDrink {

	@Override
	public float price() {
		return 30.0f;
	}

	@Override
	public String name() {
		return "Coke";
	}
}