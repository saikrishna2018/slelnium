package com.java.BrowserLaunchings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Browser Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.quit();
		
		
		//System.setProperty("webdriver.gecko.driver", "D:\\Browser Drivers\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.quit();
		
		
		//System.setProperty("webdriver.ie.driver", "D:\\Browser Drivers\\IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("https://www.snapdeal.com");
		driver.quit();
		
		
		//System.setProperty("webdriver.edge.driver", "D:\\Browser Drivers\\MicrosoftWebDriver.exe");
		//System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe");
		//System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.quit();

	}

}
