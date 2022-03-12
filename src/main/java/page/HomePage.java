package page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class HomePage {
	
	@FindBy(id="welcome")
	WebElement welcomeText;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminTab;
	
	public HomePage()
	{
		PageFactory.initElements(WebDriverFactory.driver.get(), this);
	}
	
	public HomePage verifyWelcomeText()
	{
		System.out.println(welcomeText.getText());//Assertion
		
		return this;	
	}
	
	public AdminPage navigateToAdminPage()
	{
		adminTab.click();
		
		return new AdminPage();
	}
	

}
