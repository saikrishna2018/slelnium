package com.java.Collections;

import java.util.HashSet;

public class HashSetDemo 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> h=new HashSet<>();
		
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);
		h.add(40);
		
		System.out.println(h);

	}

}
