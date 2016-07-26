package com.facingsea.design_pattern_learning.p_iterator.a;

public class IteratorTest {
	
	public static void main(String[] args) {
		Collection coll = new MyCollection();
		Iterator it = coll.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
