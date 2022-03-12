package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import common.BaseTest;
import common.WebDriverFactory;

public class WindoVerification extends BaseTest {

	@Test
	public void printWindowTitle() {

		WebDriver driver = WebDriverFactory.driver.get();

		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		for (String window : windowHandles) // Enhanced for or For Each
		{
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}

	}

}
