package com.facingsea.design_pattern_learning.c_singletion;

/**
 * 懒汉式
 * @author wangzhf
 *
 */
public class Singleton2 {
	
	private static Singleton2 instance = null;
	
	Object lock = new Object();
	
	public static Singleton2 getInstance(){
		if(instance == null){
			synchronized(Singleton2.class){
				if(instance == null){
					instance = new Singleton2();
				}
			}
		}
		return instance;
	}

}
