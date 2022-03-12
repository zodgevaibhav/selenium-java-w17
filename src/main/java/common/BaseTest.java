package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseTest {
	
	@DataProvider(name="LoginData")
	public String[][] getLoginData()
	{
		String [][]loginData = {
									{"29","admin123"}, //loginData > 0the index
									{"ess","ess123"}, //loginData > 1st index
									{"vaibhav","vaibhav123"}
								};
		return loginData;
	}
	
	@DataProvider(name="LoginDataFromCSV")
	public String[][] getLoginDataFromCSV() throws IOException
	{
		String [][]loginData = new String[3][2];		
		File file = new File("/home/vzodge/eclipse-workspace/SeleniumTestAutomation/src/test/Test.csv");
		FileReader fr;
		try {
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String st;
			int i = 0;
			while ((st = br.readLine()) != null) {
				loginData[i]=st.split(",");
				i=i+1;	
			}
			return loginData;
		} catch (FileNotFoundException e) {
			System.out.println("Unable to find file Test.csv, please check the path and try again");
			e.printStackTrace();
			return null;
		} 
	}
	
	
	@BeforeMethod
	public void beforeEveryTest()
	{
		
		System.setProperty("webdriver.chrome.driver", "/home/vzodge/Documents/Vaibhav/Training/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/home/vzodge/Documents/Vaibhav/Training/geckodriver");
		WebDriverFactory.driver.set(new ChromeDriver());// "drive = chrome browser"
		
		WebDriverFactory.driver.get().manage().window().maximize(); //maximize the browser
		
		WebDriverFactory.driver.get().get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@AfterMethod
	public void afterEveryTest()
	{
		WebDriverFactory.driver.get().quit();
	}
}
