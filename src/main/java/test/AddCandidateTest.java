package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import common.BaseTest;
import common.WebDriverFactory;


public class AddCandidateTest extends BaseTest{	

    @Test
	public void verifyAddCandidateSuccessful() throws InterruptedException
	{
    	WebDriverFactory.driver.get().get("https://opensource-demo.orangehrmlive.com/");

		WebElement userName = WebDriverFactory.driver.get().findElement(By.xpath("//input[@name='txtUsername']"));
		userName.sendKeys("admin");
		
		WebElement password = WebDriverFactory.driver.get().findElement(By.id("txtPassword"));
		password.sendKeys("admin123");

		WebElement loginButton = WebDriverFactory.driver.get().findElement(By.name("Submit"));
		loginButton.click();
	}
}