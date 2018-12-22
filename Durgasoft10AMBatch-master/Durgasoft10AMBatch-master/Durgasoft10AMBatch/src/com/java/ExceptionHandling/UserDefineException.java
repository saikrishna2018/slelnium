package com.java.ExceptionHandling;

import java.util.Scanner;

public class UserDefineException extends Exception
{
	
	
	public UserDefineException(String msg) 
	{
		super(msg);
	}

	public static void main(String[] args) 
	{
		String number=null;
		Scanner sc=new Scanner(System.in);
		
		while (true) 
		{
			try 
			{
				System.out.println("Enter the Number : ");
				number = sc.nextLine();

				if (number.length() != 10) 
				{
					throw new UserDefineException("Number should be 10 digit number");
				} 
				else 
				{
					System.out.println(number);
					return;
				}
			} 
			catch (UserDefineException msg) 
			{
				System.out.println(msg);
			} 
			finally 
			{
				System.out.println("I am finally.....");
				
			}
		}

	}

}
