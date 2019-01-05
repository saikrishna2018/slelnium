package com.testing.www;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTables extends BasePage
{

	public static void main(String[] args) throws Exception
	{
		
		
		
		launch(loadData("Browser"),loadData("URL"));

		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.name("field-keywords")).sendKeys("nokia");
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		// for(int i=0;i<links.size();i++) 

		// {
		// if(!links.get(i).getText().isEmpty())
	//		 System.out.println(links.get(i).getText());
	//	 }
		//
		    WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		    List<WebElement> items = loc.findElements(By.tagName("option"));
		    for(int k=0;k<items.size();k++) 
		    {
		    System.out.println(items.get(k).getText());
 	}

}
}
