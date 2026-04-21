package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class LoginTest_TC02 extends BaseClass {

	@Test(groups= {"Regression","Master","Sanity"})
	public void verify_Login() {
		
		//HOmepage btn object 
		HomePage hp = new HomePage(driver);
		hp.clickMyAcc();
		hp.clickLogin();
		
		//Login pge
		LoginPage lp = new LoginPage(driver);
		lp.EmailID(p.getProperty("email"));
		lp.Password(p.getProperty("password"));
		lp.LoginBtn();
		
		//My Account page
		MyAccountPage myAcc = new MyAccountPage(driver);
		boolean outputtext = myAcc.isMyAccountPageExists();
		Assert.assertEquals(outputtext, true, "Login Failed");
	}
}
