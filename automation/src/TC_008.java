import org.openqa.selenium.By;

import com.testing.www.BasePage;

public class TC_008 extends BasePage
{

	public static void main(String[] args) throws Exception 
	{
	
		launch(loadData("brower"), loadData("URL"));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("field-keywords")).clear();
		
		
		Thread.sleep(4000);
		
		driver.findElement(By.className("nav-input")).sendKeys("nokia");
		
	}
	
	
		
}
