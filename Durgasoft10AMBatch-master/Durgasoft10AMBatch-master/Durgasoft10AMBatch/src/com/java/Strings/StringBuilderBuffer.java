package com.java.Strings;

public class StringBuilderBuffer
{

	public static void main(String[] args) 
	{
		/*StringBuffer str1=new StringBuffer("ravikanth");
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		StringBuffer str2=new StringBuffer("lella");
		System.out.println(str2);
		System.out.println(str2.hashCode());
		
		str1=str1.append(str2);
		System.out.println(str1);
		System.out.println(str1.hashCode());*/
		
		
		StringBuilder str1=new StringBuilder("ravikanth");
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		StringBuilder str2=new StringBuilder("lella");
		System.out.println(str2);
		System.out.println(str2.hashCode());
		
		str1=str1.append(str2);
		System.out.println(str1);
		System.out.println(str1.hashCode());
		

	}

}
