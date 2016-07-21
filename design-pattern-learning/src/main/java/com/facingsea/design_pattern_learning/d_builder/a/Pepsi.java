package com.facingsea.design_pattern_learning.d_builder.a;

public class Pepsi extends ColdDrink {

	@Override
	public float price() {
		return 35.0f;
	}

	@Override
	public String name() {
		return "Pepsi";
	}
}