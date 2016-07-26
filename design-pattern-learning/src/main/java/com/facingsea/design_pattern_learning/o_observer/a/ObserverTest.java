package com.facingsea.design_pattern_learning.o_observer.a;

public class ObserverTest {
	
	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		
		sub.operation();
	}

}
