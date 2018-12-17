package javapackage;

public class Class 

{
	int a=10,b=20,c=20,d=0;  //properties
	
	public void add()
	{
		d=a+b+c;
		System.out.println("Addtion of a&b&C is my :"+d);
	}
	  public void sub() 
	  {
		  d=a-b-c;
		  System.out.println("Substraction of a&b&c is :"+d);
	  }
	
	public static void main(String[] args)
	
	{
      System.out.println("hello world");
      
      Class sai=new Class();
      sai.add();
      sai.sub();
      
      
      Class sai1=new Class();
      sai1.add();
      sai1.sub();
      
     
      
	
	}

}
