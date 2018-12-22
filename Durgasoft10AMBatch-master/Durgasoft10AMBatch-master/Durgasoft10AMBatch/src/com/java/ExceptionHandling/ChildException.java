package com.java.ExceptionHandling;

import java.io.FileNotFoundException;

public class ChildException extends CheckedExceptionDemo
{

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
