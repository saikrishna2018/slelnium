package com.testing.www;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage
{

	public static WebDriver driver;
	public static String path="./data.sai";
	
     
	public static String loadData(String key) throws Exception
	{

	File f=new File(path);
	FileInputStream fis=new FileInputStream(f);
	Properties p=new Properties();
	p.load(fis);
	return p.getProperty(key);
	}
	
	
	
	public static void launch(String browser, String url)
	
	{
		
	           if(browser.equalsIgnoreCase("CHROME"))
	          {

		         System.setProperty("webdriver.chrome.driver","D:\\webdrivers\\chromedriver.exe");	
		         driver=new ChromeDriver();
	          }
	           
			  else if(browser.equalsIgnoreCase("FIREFOX"))
			  {

			      System.setProperty("webdriver.gecko.driver","D:\\webdrivers\\geckodriver.exe");
		          driver=new FirefoxDriver();
			  }
			  else if(browser.equalsIgnoreCase("ie"))
	 		  {
				   System.setProperty("webdriver.ie.driver","D:\\webdrivers\\IEDriverServer.exe");
				   driver=new InternetExplorerDriver();  
				  }
	           driver.get(url);
	           driver.manage().window().maximize();
		
	}
	
	
	
	
		
		
		
		
		
	
	
	
}
