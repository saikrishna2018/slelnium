package com.hdfc.www;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Testing {

	public static void main(String[] args) throws InterruptedException
	{
       

		
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");	
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");

        System.setProperty("webdriver.gecko.driver","D:\\webdrivers\\geckodriver.exe");   
	    FirefoxDriver driver1=new FirefoxDriver();
	    driver1.get("https://www.amazon.com");
	    
	   System.setProperty("webdriver.ie.driver", "D:\\webdrivers\\IEDriverServer.exe"); 
	    InternetExplorerDriver driver2=new InternetExplorerDriver();
	    driver2.get("https://www.flipkart.com");
	    
         
	}

}
