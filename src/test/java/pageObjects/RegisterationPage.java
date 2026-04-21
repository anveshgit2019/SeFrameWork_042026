package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends BaseDriverPage {

	public RegisterationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txt_FirstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txt_LastName;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txt_Email;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txt_Telephone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txt_Pswd;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txt_CnfmPswd;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement checkBox;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement CtnButton;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setFirstName(String fname) {
		txt_FirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		txt_LastName.sendKeys(lname);
	}

	public void setemail(String email) {
		txt_Email.sendKeys(email);
	}

	public void setTelephone(String Telephone) {
		txt_Telephone.sendKeys(Telephone);
	}

	public void setpswd(String pswd) {
		txt_Pswd.sendKeys(pswd);
	}

	public void setconfmPswd(String CnfmPaswd) {
		txt_CnfmPswd.sendKeys(CnfmPaswd);
	}

	public void clickCheckbox() {
		checkBox.click();
	}

	public void ClickContinue() {
		CtnButton.click();
	}

	public String getConfimationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
