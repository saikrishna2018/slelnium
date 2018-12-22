package com.java.Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class NonLegacyWithListIterators 
{

	public static void main(String[] args) 
	{
		LinkedList<String> l=new LinkedList<>();
		l.add("ravikanth");
		l.add("kosmik");
		l.add("OakTech");
		
		System.out.println(l);
		
		ListIterator<String> el = l.listIterator();
		
		while(el.hasNext())
		{
			String val = el.next();
			if(val.contains("kosmik")) 
				el.set("durgasoft");
			
			else
				el.remove();
		}
		
		System.out.println(l);

	}

}
