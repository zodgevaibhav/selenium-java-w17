package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import common.WebDriverFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@name='txtUsername']")WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement loginButton;
	
	@FindBy(id="spanMessage")
	WebElement errorMessage;
	
	public LoginPage()
	{
		PageFactory.initElements(WebDriverFactory.driver.get(), this);
	}

	public HomePage login(String strUserName, String strPassword)
	{
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginButton.click();
		
		HomePage hp = new HomePage();
		return hp;
	}
	
	public LoginPage loginForUnsuccessful(String strUserName, String strPassword)
	{
		login(strUserName,strPassword);
		return this;
	}
	

	
	public LoginPage enterUsreName(String strUserName)
	{
		userName.sendKeys(strUserName);
		loginButton.click();
		
		return this; 
	}
	
	public LoginPage enterPassword(String strPassword)
	{
		password.sendKeys(strPassword);
		loginButton.click();
		
		return this;
	}
	
	public LoginPage verifyErrorMessage(String message)
	{
		/*
		if(errorMessage.getText().contains(message))
				System.out.println("PASS");
		else
				System.out.println("FAIL");
		*/
		
	//	Assert.assertEquals(errorMessage.getText(), message);
		
		Assert.assertEquals(errorMessage.getText(), message,"Welcome text is not displayed as per expectation");
		
	//	Assert.assertNotEquals(errorMessage.getText(), message);
		
	//	Assert.assertTrue(errorMessage.isDisplayed());
		
	//	Assert.assertFalse(errorMessage.isDisplayed());
		
		return this;
	}

}
