package com.java.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> h=new LinkedHashSet<>();
		
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);
		h.add(40);
		
		System.out.println(h);

	}

}
