package newabstract;

public class AbstractExtend extends NewAbstract
{

	public static void main(String[] args)
	{
		AbstractExtend sai=new AbstractExtend();
		sai.m1();
		sai.m2();
		sai.m3();
		sai.m4();
		
	}
		

	@Override
	public void m2() 
	{
		System.out.println("iam m2 in abstract");
	}

	@Override
	public void m3() 
	{
       System.out.println("iam m3 in abstract" );		
	}


	@Override
	public void m4() 
	{
	       System.out.println("iam m4 in abstract" );		

	}

	
}
