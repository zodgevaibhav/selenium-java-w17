package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.WebDriverFactory;

public class AddUserPage {
	
	@FindBy(id="systemUser_userType")
	WebElement userRoleDropDown;
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement employeeName;
	
	@FindBy(id="systemUser_userName")
	WebElement userName;
	
	@FindBy(id="systemUser_status")
	WebElement userStatusDropDown;
	
	@FindBy(id="systemUser_password")
	WebElement password;
	
	@FindBy(id="systemUser_confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(id="btnSave")
	WebElement saveButton;
	
	public AddUserPage()
	{
		PageFactory.initElements(WebDriverFactory.driver.get(), this);
	}

	
	public AdminPage addUser(String strUserRole, String strEmployeeName, 
			String strUserName, String strPassword, String strConfirmPassword)
	{
		employeeName.sendKeys(strEmployeeName);
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		confirmPassword.sendKeys(strConfirmPassword);
		
		Select select = new Select(userRoleDropDown);
		select.selectByVisibleText(strUserRole);
		
		saveButton.click();
		
		return new AdminPage();
	}
}
