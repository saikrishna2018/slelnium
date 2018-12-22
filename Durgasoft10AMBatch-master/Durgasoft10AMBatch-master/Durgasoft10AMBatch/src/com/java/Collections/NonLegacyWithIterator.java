package com.java.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class NonLegacyWithIterator 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			a.add(i);
		}
		
		System.out.println(a);
		Iterator<Integer> el = a.iterator();
		
		while(el.hasNext())
		{
			Integer val = el.next();
			if(val%2==0)
			 System.out.println(val);
			else
			 el.remove();
		}
		System.out.println(a);

	}

}
