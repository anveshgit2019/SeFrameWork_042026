package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BaseDriverPage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h2[text()='My Account']") // MyAccount Page heading
	WebElement msgHeading;
	
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Newsletter']")
	WebElement lnkLogout;
	
	@FindBy(xpath="//div[@id='content']/h1")
	WebElement msg_Orderhx;
	

	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	
	public boolean isMyOrderPageExists() {
		try {
			return(msg_Orderhx.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}

	public void clickLogout() {
		lnkLogout.click();

	}
	
}
