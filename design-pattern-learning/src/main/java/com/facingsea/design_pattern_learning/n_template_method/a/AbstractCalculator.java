package com.facingsea.design_pattern_learning.n_template_method.a;

public abstract class AbstractCalculator {

	public final int calculate(String exp, String opt){
		int[] arr = split(exp, opt);
		return calculate(arr[0], arr[1]);
	}
	
	// 子类实现
	abstract public int calculate(int num1, int num2);
	
	public int[] split(String exp, String opt){
		String[] arrs = exp.split(opt);
		int[] arrInt = new int[2];
		arrInt[0] = Integer.parseInt(arrs[0]);
		arrInt[1] = Integer.parseInt(arrs[1]);
		return arrInt;
	}
	
}
