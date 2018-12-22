package com.java.BrowserLaunchings;

import org.openqa.selenium.By;
import org.testng.Assert;

public class TC_003 extends BasePage
{

	public static void main(String[] args) throws Exception 
	{
		
		launch(loadData("browser"), loadData("url"));
	
		String acttext = driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[5]")).getAttribute("innerHTML");
		String exptext="Customer Service";
		
		System.out.println("Actual Text : " + acttext);
		System.out.println("Expected Text : " + exptext);
		
		//equals, equalIgnoreCase, contains, contectEqual
		
		Assert.assertEquals(acttext, exptext);
		
		
		/*if(acttext.contentEquals(exptext))
		{
			System.out.println("Both text are equal.....");
		}
		else 
		{
			System.out.println("Both text are not equal.....");
		}*/
		
		
		
		/*WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		
		loc.sendKeys("sony");
		
		String val = loc.getAttribute("value");
		
		System.out.println("Entered Text is : " + val);*/
		
		
		
		
		
	}

}
