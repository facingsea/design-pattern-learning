package com.facingsea.design_pattern_learning.h_proxy.a;

public class Proxy implements Sourceable {

	private Source source;
	
	public Proxy() {
		this.source = new Source();
	}
	
	@Override
	public void method() {
		before();
		source.method();
		after();
	}

	private void after() {
		System.out.println("after ");
	}

	private void before() {
		System.out.println("before ");
	}

}
