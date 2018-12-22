package com.java.BrowserLaunchings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_002 extends BasePage
{

	public static void main(String[] args) throws Exception 
	{
		
		launch(loadData("browser"), loadData("url"));
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ravilellla");
		//driver.findElement(By.id("twotabsearchtextbox")).clear();
		
		//driver.findElement(By.className("nav-input")).sendKeys("ravilella");
		
		//driver.findElement(By.partialLinkText("Service")).click();
		
		/*List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links :" +links.size());
		int counter=0;
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				counter++;
				String val = links.get(i).getText();
				System.out.println(val);
			}
			
		}
		System.out.println("Visible Links counr  :" + counter);*/
		
		
		
		WebElement parent = driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> items = parent.findElements(By.tagName("option"));
		
		for(int i=0;i<items.size();i++)
		{
			System.out.println(items.get(i).getText());
		}
		
		
	}

}
