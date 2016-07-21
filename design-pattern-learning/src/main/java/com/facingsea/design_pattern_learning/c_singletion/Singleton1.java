package com.facingsea.design_pattern_learning.c_singletion;

/**
 * 饿汉式
 * @author wangzhf
 *
 */
public class Singleton1 {

	private static Singleton1 instance = new Singleton1();
	
	public static Singleton1 getInstance(){
		if(instance == null){
			synchronized (instance) {
				if(instance == null){
					instance = new Singleton1();
				}
			}
		}
		return instance;
	}
}
