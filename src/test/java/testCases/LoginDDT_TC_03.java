package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class LoginDDT_TC_03 extends BaseClass{

	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verify_logindata(String email, String password, String exp)
	{
		logger.info("*** Starting Data Drivern Testing ***");
		
		try {
			//HOmePage
			HomePage hp = new HomePage(driver);
			hp.clickMyAcc();
			hp.clickLogin(); //Login link under MyAccount
			
			//Loginpage
			LoginPage lp = new LoginPage(driver);
			lp.EmailID(email);
			lp.Password(password);
			lp.LoginBtn();
			
			//MyAccount Page 
			MyAccountPage myacc = new MyAccountPage(driver);
			boolean targetPage = myacc.isMyAccountPageExists();
			
			//order page
			boolean targetorderhx = myacc.isMyOrderPageExists();
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true || targetorderhx==true)
				{
					myacc.clickLogout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
				if(exp.equalsIgnoreCase("Invalid"))
				{
					if(targetPage==true || targetorderhx==true)
					{
						myacc.clickLogout();
						Assert.assertTrue(false);
					}
					else
					{
						Assert.assertTrue(true);
					}
				}
			}
		}
			catch(Exception e)
			{
				Assert.fail("An exception occurred: " + e.getMessage());
			}
		logger.info("**** Finished TC_003_LoginDDT *****");
	}
}

			
		
		
	


