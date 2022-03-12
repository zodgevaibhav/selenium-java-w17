package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class AdminPage {
	@FindBy(id = "btnAdd")
	WebElement addUserButton;
	
	
	public AdminPage()
	{
		PageFactory.initElements(WebDriverFactory.driver.get(), this);
	}

	public AddUserPage navigateToAddUserPage() {
		addUserButton.click();
		return new AddUserPage();
	}
}
