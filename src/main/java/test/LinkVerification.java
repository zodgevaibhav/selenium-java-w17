package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import common.BaseTest;
import common.WebDriverFactory;

public class LinkVerification extends BaseTest{
	
	@Test
	public void printAllLinks()
	{

		WebDriver driver = WebDriverFactory.driver.get();
		
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		List<WebElement> links = driver.findElements(By.xpath("//*[@href]"));
		
		for(WebElement link:links) //Enhanced for or For Each
		{
			System.out.println(link.getAttribute("href"));
		}
		
	/*	for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
		}
	*/

	}

}
