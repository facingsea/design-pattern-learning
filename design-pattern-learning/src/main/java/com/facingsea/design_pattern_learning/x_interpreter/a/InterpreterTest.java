package com.facingsea.design_pattern_learning.x_interpreter.a;

public class InterpreterTest {

	public static void main(String[] args) {
		int sum = new Plus().interpret(new Context(3, 5));
		System.out.println(sum);
	}
}
