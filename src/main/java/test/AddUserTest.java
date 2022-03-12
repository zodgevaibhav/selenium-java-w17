package test;
import org.testng.annotations.Test;

import common.BaseTest;
import page.LoginPage;


public class AddUserTest extends BaseTest{	
	
    @Test
	public void verifyAddUserSuccessful() throws InterruptedException
	{
    	new LoginPage()
    		.login("admin", "admin123")
    			.verifyWelcomeText()
    				.navigateToAdminPage()
    					.navigateToAddUserPage()
    						.addUser("Admin", "ABC", "vzodge", "password", "password");
	}
    
}