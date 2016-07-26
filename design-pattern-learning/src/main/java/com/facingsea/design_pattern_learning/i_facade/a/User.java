package com.facingsea.design_pattern_learning.i_facade.a;

/**
 * 测试外观模式：Computer
 * @author wangzhf
 *
 */
public class User {
	
	public static void main(String[] args) {
		Computer c = new Computer();
		c.startup();
		
		System.out.println("user do something ... ");
		
		c.shutdown();
	}

}
