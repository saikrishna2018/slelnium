package com.java.Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetDemo 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> t=new TreeSet<>(new MyComparator());
		t.add(200);
		t.add(40);
		t.add(10);
		t.add(100);
		t.add(1);
		t.add(40);
		
		System.out.println(t);

	}

}

class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		Integer v1 = (Integer)o1;
		Integer v2 = (Integer)o2;
		
		return v1.compareTo(v2);
	}
	
}
