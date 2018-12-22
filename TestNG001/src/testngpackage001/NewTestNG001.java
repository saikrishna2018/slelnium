package testngpackage001;

import org.testng.annotations.Test;

public class NewTestNG001 
{
  @Test(priority=3,description="this is 1st method")
  public void v()
  {
	  System.out.println("this is v method");
  }
  @Test(priority=2,description="this is 2nd method")
  public void a()
  {
	  System.out.println("this is a method");
  }
  @Test(priority=1,description="this is 3rd method")
  public void b()
  {
	  System.out.println("this is b method");
  }
}
