package javapackage;

public class JavaPractice2 implements JavaInterface
{

	public static void main(String[] args)
	{
		
		JavaPractice2 saikrishna=new JavaPractice2();
		saikrishna.deposit();
		saikrishna.withdrawl();
		
	}

	@Override
	public void withdrawl() 
	{
     System.out.println("my name is saikrishna");
	}

	@Override
	public void deposit()
	{
   System.out.println("iam hindhu");	
   }
	
	
}

