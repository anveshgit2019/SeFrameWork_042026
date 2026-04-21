package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterationPage;
import testBase.BaseClass;

public class AccountRegisteration_TC_1 extends BaseClass {

	/**
	 * @throws InterruptedException 
	 * 
	 */
	@Test(groups={"Sanity","Master"})
	public void Verify_account_registration() throws InterruptedException {
		
		
		logger.info("*** Staring The TC ***");
		
		logger.debug("This is debug log message");
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickMyAcc();
		logger.info("Clicked on My Account");
		
		hp.clickRegister();
		logger.info("Clicked on Register Link");
		
		RegisterationPage regpage = new RegisterationPage(driver);
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setemail(randomeString() + "@gamil.com"); // Randomly Generates Email
		regpage.setTelephone(randomeNumber());
		String password = randomAlphaNumeric();
		regpage.setpswd(password);
		regpage.setconfmPswd(password);

		regpage.clickCheckbox();
		regpage.ClickContinue();
		
		logger.info("Validating the Confimration Message");
		Thread.sleep(5000);
		String confmMesg = regpage.getConfimationMsg();
		Assert.assertEquals(confmMesg, "Your Account Has Been Created!");
		logger.info("Test Passed");
		}
		catch(Exception e)
		{
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
		
		}
		
	}

}
