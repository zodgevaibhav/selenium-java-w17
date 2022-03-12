package test;

import org.testng.annotations.Test;

import common.BaseTest;
import page.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(dataProvider="LoginDataFromCSV")
	public void verifyAdminLoginSuccessful(String strUserName, String strPassword){
		LoginPage lp = new LoginPage();
		lp.login(strUserName,strPassword)
			.verifyWelcomeText();
	}
	
	@Test
	public void verifyESSLoginSuccessful() {
		LoginPage lp = new LoginPage();
		lp.login("ess","ess123")
			.verifyWelcomeText();
	}
	
	@Test
	public void verifyAdminLoginUn_Successful() {
		
		LoginPage lp = new LoginPage();
		lp.loginForUnsuccessful("admin","admin12345")
			.verifyErrorMessage("Invalid credentials");
	}
	
	@Test(groups = { "Login", "Critical", "Regression" })
	public void verifyESSLoginSUn_uccessful() throws InterruptedException {
		
		LoginPage lp = new LoginPage();
		lp.loginForUnsuccessful("ess","ess12345")
			.verifyErrorMessage("Invalid credentials");
	
	}
	
	@Test(groups = { "Login", "Critical", "Regression" })
	public void verifyLoginUnsucessWithEmptyUserName() throws InterruptedException {
		
		LoginPage lp = new LoginPage();
		lp.enterPassword("admin")
			.verifyErrorMessage("Username cannot be empty");
	
	}

}