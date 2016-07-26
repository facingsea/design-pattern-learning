package com.facingsea.design_pattern_learning.j_bridge.a;

public class MyBridge extends Bridge {

	@Override
	public void method() {
		getSource().method();
	}
}
