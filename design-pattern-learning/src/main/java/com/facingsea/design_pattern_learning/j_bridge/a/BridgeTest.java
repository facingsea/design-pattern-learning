package com.facingsea.design_pattern_learning.j_bridge.a;

public class BridgeTest {
	
	public static void main(String[] args) {
		Bridge b = new MyBridge();
		
		Sourceable sub1 = new SourceSub1();
		b.setSource(sub1);
		b.method();
		
		Sourceable sub2 = new SourceSub2();
		b.setSource(sub2);
		b.method();
	}

}
