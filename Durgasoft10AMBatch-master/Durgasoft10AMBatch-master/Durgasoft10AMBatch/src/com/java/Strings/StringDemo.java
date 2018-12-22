package com.java.Strings;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String str1="ravikanth";
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		
		String str2=new String("lella");
		System.out.println(str2);
		System.out.println(str2.hashCode());
		
		
		str1=str1.concat(str2);
		System.out.println(str1);
		System.out.println(str1.hashCode());

	}

}
