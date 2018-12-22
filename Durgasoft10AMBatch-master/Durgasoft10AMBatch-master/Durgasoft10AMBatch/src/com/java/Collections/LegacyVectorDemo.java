package com.java.Collections;

import java.util.Enumeration;
import java.util.Vector;

public class LegacyVectorDemo 
{

	public static void main(String[] args) 
	{
		Vector<Integer> v =new Vector<>();
		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}
		
		System.out.println(v);
		
		Enumeration<Integer> el = v.elements();
		
		
		while(el.hasMoreElements())
		{
			Integer val = el.nextElement();
			if(val%2==0)
				System.out.println(val);
		}
		
		System.out.println(v);
	
	}

}
