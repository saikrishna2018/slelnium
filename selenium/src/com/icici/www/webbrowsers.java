package com.icici.www;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class webbrowsers
{

	

	public static void main(String[] args)
	{  
		
		WebDriver driver;
		
		 System.setProperty("webdriver.chrome.driver","D:\\webdrivers\\chromedriver.exe");	
		 driver=new ChromeDriver();
	     driver.get("https://www.facebook.com");
	

		 System.setProperty("webdriver.gecko.driver", "D:\\webdrivers\\geckodriver.exe");
	     driver=new FirefoxDriver();
		 driver.get("https://www.amazon.com");
			
	      System.setProperty("webdriver.ie.driver", "D:\\webdrivers\\IEDriverServer.exe");
	      driver=new InternetExplorerDriver();
	      driver.get("https://www.flipkart.com");
         
	}

}

