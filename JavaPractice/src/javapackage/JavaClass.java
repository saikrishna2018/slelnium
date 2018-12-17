package javapackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class JavaClass {


	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome","C:\\Users\\Guest\\Desktop\\durga driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");

		
		FirefoxDriver driver1=new FirefoxDriver();
		driver1.get("https://www.facebook");
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Guest\\Desktop\\durga driver\\IEDriverServer.exe");
		InternetExplorerDriver driver2=new InternetExplorerDriver();
		driver2.get("https://www.flipkart.com");
	}

}
