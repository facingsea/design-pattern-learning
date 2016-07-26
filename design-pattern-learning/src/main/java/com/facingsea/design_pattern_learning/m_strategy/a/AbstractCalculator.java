package com.facingsea.design_pattern_learning.m_strategy.a;

public abstract class AbstractCalculator {
	
	public int[] split(String exp, String opt){
		String[] arrs = exp.split(opt);
		int[] arrInt = new int[2];
		arrInt[0] = Integer.parseInt(arrs[0]);
		arrInt[1] = Integer.parseInt(arrs[1]);
		return arrInt;
	}

}
