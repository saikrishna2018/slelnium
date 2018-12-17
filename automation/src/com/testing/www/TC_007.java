package com.testing.www;

import org.openqa.selenium.By;

public class TC_007 extends BasePage
{

	public static void main(String[] args) throws Exception 
	
	{
     
		launch(loadData("Browser"),loadData("URL"));
		
		String Title = driver.getTitle();
		System.out.println("Tilte");
		
		String url = driver.getCurrentUrl();
		System.out.println("url");
		
		/*driver.manage().deleteAllCookies();
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		//driver.getPageSource();*/

       driver.findElement(By.className("")).sendKeys("");	
    		//driver.close();
		
		
	}

}
