package com.java.Collections;

import java.util.ArrayList;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add("Ravilella");
		a.add(12.34f);
		a.add(10);
		a.add(30);
		a.add(40);
		
		System.out.println(a);
		
		System.out.println(a.size());
		
		Object var = a.get(1);
		
		if(var instanceof Integer)
		{
			Integer o1 = (Integer)var;
			System.out.println(o1);
		}
		else if(var instanceof String)
		{
			String o1 = (String)var;
			System.out.println(o1);
		}

	}

}
