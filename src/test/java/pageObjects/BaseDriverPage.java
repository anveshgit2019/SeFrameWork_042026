package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

public class BaseDriverPage {
	
	WebDriver driver ;
	
	public BaseDriverPage(WebDriver driver)
	{
		 this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	

}
