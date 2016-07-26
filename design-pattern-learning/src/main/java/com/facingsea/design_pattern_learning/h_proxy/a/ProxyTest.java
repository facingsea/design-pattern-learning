package com.facingsea.design_pattern_learning.h_proxy.a;

public class ProxyTest {

	public static void main(String[] args) {
		Sourceable p = new Proxy();
		p.method();
	}
}
