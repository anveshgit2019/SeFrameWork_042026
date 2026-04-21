package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseDriverPage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@name='email']")
	WebElement txt_emailID;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_password;
		
	@FindBy(xpath="//input[@type='submit']")
	WebElement btn_Login;
	
	public void EmailID(String email)
	{
		txt_emailID.sendKeys(email);
	}
	
	public void Password(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void LoginBtn()
	{
		btn_Login.click();
	}
	
}
