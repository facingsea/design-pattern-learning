package com.facingsea.design_pattern_learning.p_iterator.a;

public interface Collection {
	
	public Iterator iterator();
	
	public Object get(int i);
	
	public int size();

}
