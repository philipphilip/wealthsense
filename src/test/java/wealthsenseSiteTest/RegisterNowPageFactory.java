package wealthsenseSiteTest;

import org.jboss.netty.handler.codec.http.HttpHeaders.Values;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterNowPageFactory {

	WebDriver driver;

	@FindBy(xpath = ".//div//img[@class='site-logo']")
	WebElement pagelogo;

	@FindBy(xpath = ".//div//p[contains(text(),'Direction super is available free of charge to all members.')]")
	WebElement column1Statment;

	@FindBy(xpath = ".//div//p[contains(text(),'To login')]")
	WebElement toLoginText;

	@FindBy(xpath = ".//div//p[contains(text(),'Questions or need help?')]")
	WebElement questionOrHelp;

	@FindBy(xpath = "")
	WebElement ContactDirectionSuper;

	@FindBy(xpath = ".//div//p[contains(text(),'fundsupport@directionsuper.com.au')]")
	WebElement theEmail;

	@FindBy(xpath = ".//div//form[@id='_58_fm']/p[1]")
	WebElement column2Header;

	@FindBy(xpath = ".//div//form//p[2]")
	WebElement column2Statment;

	@FindBy(xpath = ".//div//label[contains(text(),'First name')]")
	WebElement firstNameText;

	@FindBy(xpath = ".//div//label[contains(text(),'First name')]//span[contains(text(),'*')]")
	WebElement firstNameIsMandadoty;

	@FindBy(xpath = ".//*[@name='_58_firstName']")
	WebElement firstNameField;

	@FindBy(xpath = ".//div//label[contains(text(),'Family name')]")
	WebElement familyNameText;

	@FindBy(xpath = ".//input[@name='_58_lastName']")
	WebElement familyNameField;

	@FindBy(xpath = ".//div//label[contains(text(),'Username')]")
	WebElement userNameText;

	@FindBy(xpath = ".//div//label[contains(text(),'Username')]//span[contains(text(),'*')]")
	WebElement userNameIsMandatory;

	@FindBy(xpath = ".//input[@name='_58_screenName']")
	WebElement userNameField;

	@FindBy(xpath = ".//div//label[contains(text(),'Email address ')]")
	WebElement emailAddressText;

	@FindBy(xpath = ".//div//label[contains(text(),'Email address ')]//span[contains(text(),'*')]")
	WebElement emailAddressIsMandatory;

	@FindBy(xpath = ".//input[@id='_58_verifyEmail']")
	WebElement emailAddressField;

	@FindBy(xpath = ".//label[contains(text(),'Verify email address')]")
	WebElement verifyEmailText;

	@FindBy(xpath = ".//div//label[contains(text(),'Verify email address')]//span[contains(text(),'*')]")
	WebElement verifyEmailIsMandatory;

	@FindBy(xpath = ".//input[@name='_58_']")
	WebElement verifyEmailField;

	@FindBy(xpath = ".//label[contains(text(),'Date of birth')]")
	WebElement dateOfBirthText;

	@FindBy(xpath = ".//input[@name='_58_birthday']")
	WebElement dateOfBirthField;

	@FindBy(xpath = ".//p[contains(text(),'Type the characters to proceed')]")
	WebElement captureText;

	@FindBy(xpath = ".//p[contains(text(),'Type the characters to proceed')]//span[contains(text(),'*')]")
	WebElement captureIsMandatory;

	@FindBy(xpath = ".//input[@id='_58_captchaText']")
	WebElement captureField;

	@FindBy(xpath = ".//input[@id='terms'][@type='checkbox']")
	WebElement agreeCheckBox;

	@FindBy(xpath = ".//div[@id='terms-row-div']//p[contains(text(),'I agree to the')]")
	WebElement agreeText;

	@FindBy(xpath = ".//div//button[contains(text(),'Submit')]")
	WebElement submitButton;

	public RegisterNowPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement pageLogo() {
		return pagelogo;
	}

	public WebElement column1Statment() {
		return column1Statment;
	}

	public WebElement toLoginText() {
		return toLoginText;
	}

	public WebElement questionOrHelp() {
		return questionOrHelp;
	}

	public WebElement ContactDirectionSuper() {
		return ContactDirectionSuper;
	}

	public WebElement theEmail() {
		return theEmail;
	}

	public WebElement column2Header() {
		return column2Header;
	}

	public WebElement column2Statment() {
		return column2Statment;
	}

	public WebElement firstNameText() {
		return firstNameText;
	}

	public WebElement firstNameIsmandatory() {
		return firstNameIsMandadoty;
	}

	public WebElement firstNameField() {
		return firstNameField;
	}

	public WebElement familyNameText() {
		return familyNameText;
	}

	public WebElement familyNameField() {
		return familyNameField;
	}

	public WebElement userNameText() {
		return userNameText;
	}

	public WebElement userNameIsMandatory() {
		return userNameIsMandatory;
	}

	public WebElement userNameField() {
		return userNameField;
	}

	public WebElement emailAddressText() {
		return emailAddressText;
	}

	public WebElement emailAddressIsMandatory() {
		return emailAddressIsMandatory;
	}

	public WebElement emailAddressField() {
		return emailAddressField;
	}

	public WebElement verifyEmailText() {
		return verifyEmailText;
	}

	public WebElement verifyEmailIsMandatory() {
		return verifyEmailIsMandatory;
	}

	public WebElement verifyEmailField() {
		return verifyEmailField;
	}

	public WebElement dateOfBirthText() {
		return dateOfBirthText;
	}

	public WebElement dateOfBirthField() {
		return dateOfBirthField;
	}

	public WebElement captureText() {
		return captureText;
	}

	public WebElement captureIsMandatory() {
		return captureIsMandatory;
	}

	public WebElement captureField() {
		return captureField;
	}

	public WebElement agreeCheckBox() {
		return agreeCheckBox;
	}

	public WebElement agreeText() {
		return agreeText;
	}

	public WebElement submitButton() {
		return submitButton;
	}

}
