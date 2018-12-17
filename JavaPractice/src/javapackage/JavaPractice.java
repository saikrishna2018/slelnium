package javapackage;

public class JavaPractice implements JavaInterface
{

	public static void main(String[] args)
	{
       JavaPractice krishna=new JavaPractice();
       krishna.deposit();
       krishna.withdrawl();
		
	}

	@Override
	public void withdrawl()
	{
		// TODO Auto-generated method stub
		System.out.println("iam dancing in bank");
	}

	@Override
	public void deposit()
	{
		// TODO Auto-generated method stub
		System.out.println("iam also dancing in bank");
		
	}

}
