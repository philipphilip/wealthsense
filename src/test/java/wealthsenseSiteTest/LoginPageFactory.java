package wealthsenseSiteTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;

	@FindBy(xpath = ".//div//img[@class = 'site-logo']")
	WebElement siteLogo;

	@FindBy(xpath = ".//div//p[contains(text(),'Direction super is available free of charge to all members.')]")
	WebElement LoginPageStatement1;

	@FindBy(xpath = ".//div//p[contains(text(),'To register')]")
	WebElement loginPageToRegister;

	@FindBy(xpath = ".//div//p[contains(text(),'Questions or need help?')]")
	WebElement LoginPageQuestionOrHelp;

	@FindBy(xpath = ".//div//p[contains(text(),'fundsupport@directionsuper.com.au')]")
	WebElement LoginPageContactEmail;

	@FindBy(xpath = ".//div//p[contains(text(),'Login')]")
	WebElement loginPageHeader;

	@FindBy(xpath = ".//div//label[contains(text(),'Username')]")
	WebElement loginPageUserName;

	@FindBy(xpath = ".//div//fieldset//label[contains(text(),'Password')]")
	WebElement loginPassword;

	@FindBy(xpath = ".//div//input[@id='_58_login']")
	WebElement loginPageUserNameField;

	@FindBy(xpath = ".//div//input[@id='_58_password']")
	WebElement loginPagePasswordField;

	@FindBy(xpath = ".//div//a[contains(text(),'Forgot password')]")
	WebElement loginPageForgotPasswordLin;

	@FindBy(xpath = ".//div//button[contains(text(),'Login')]")
	WebElement loginPageButton;

	@FindBy(xpath = ".//div//p[contains(text(),'Not yet signed up?')]")
	WebElement loginPageNotSignedUp;

	@FindBy(xpath = ".//div//form//fieldset//a[@id='register-now-button']")
	WebElement loginPageRegisterButton;

	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement LoginPageLogo() {
		return siteLogo;
	}

	public WebElement LoginPageStatement1() {
		return LoginPageStatement1;
	}

	public WebElement loginPageToRegister() {
		return loginPageToRegister;
	}

	public WebElement LoginPageQuestionOrHelp() {
		return LoginPageQuestionOrHelp;
	}

	public WebElement LoginPageContactEmail() {
		return LoginPageContactEmail;
	}

	public WebElement loginPageHeader() {
		return loginPageHeader;
	}

	public WebElement loginPageUserName() {
		return loginPageUserName;
	}

	public WebElement loginPassword() {
		return loginPassword;
	}

	public WebElement loginPageUserNameField() {
		return loginPageUserNameField;
	}

	public void giveUserName(String username) {
		loginPageUserNameField.sendKeys(username);
	}

	public WebElement loginPagePasswordField() {
		return loginPagePasswordField;
	}

	public void GivePassword(String password) {
		loginPagePasswordField.sendKeys(password);
	}

	public WebElement loginPageForgotPasswordLin() {
		return loginPageForgotPasswordLin;
	}

	public WebElement loginPageButton() {
		return loginPageButton;
	}

	public void ClickloginButton() {
		loginPageButton.click();
	}

	public WebElement loginPageNotSignedUp() {
		return loginPageNotSignedUp;
	}

	public WebElement loginPageRegisterButton() {
		return loginPageRegisterButton;
	}

}
