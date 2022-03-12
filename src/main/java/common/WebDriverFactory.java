package common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	//public static ChromeDriver driver = new ChromeDriver();
}
