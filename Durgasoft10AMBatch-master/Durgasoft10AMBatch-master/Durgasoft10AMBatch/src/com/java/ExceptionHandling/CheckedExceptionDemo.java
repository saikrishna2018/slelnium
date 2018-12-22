package com.java.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo 
{
	
	public static void m1() throws FileNotFoundException 
	{
		
		BufferedReader b=new BufferedReader(new FileReader("D:\\abd.txt"));
		
	}

	public static void main(String[] args) 
	{
		
		try {
			m1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
