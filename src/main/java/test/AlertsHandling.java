package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import common.WebDriverFactory;

public class AlertsHandling {
	
	@Test
	public void allertsHandling()
	{
		WebDriver driver = WebDriverFactory.driver.get();
	
		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
		driver.switchTo().alert().sendKeys("Yes");
		driver.switchTo().alert().getText();
	}

}
