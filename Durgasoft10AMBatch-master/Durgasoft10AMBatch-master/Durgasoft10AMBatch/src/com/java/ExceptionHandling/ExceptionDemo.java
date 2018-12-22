package com.java.ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
			
		int nr,dr,result=0;
		
		Scanner sc=new Scanner(System.in);
		
		
		while (true) 
		{
			System.out.println("Enter Numarator value :");
			nr=sc.nextInt();
			System.out.println("Enter Denominator value : ");
			dr=sc.nextInt();
			
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			catch (ArithmeticException e) 
			{
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println("Numarator value should be greater than zero...");
			} 
			
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
