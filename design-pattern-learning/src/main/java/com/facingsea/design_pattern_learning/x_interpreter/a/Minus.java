package com.facingsea.design_pattern_learning.x_interpreter.a;

public class Minus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1() - context.getNum2();
	}

}
