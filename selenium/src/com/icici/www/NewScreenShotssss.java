package com.icici.www;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewScreenShotssss
{

	public static void main(String[] args) throws IOException 
	{
       
       System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		 
		
		File srcnshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcnshot, new File("C:\\Users\\Administator\\Desktop\\facebook.jpeg"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
