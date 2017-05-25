package wealthsenseSiteTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class RegisterNowPageTest {
	private WebDriver driver;
	PublicHomePageFactory publicpage;
	RegisterNowPageFactory regPage;
	// PublicSitePageFactory publicPage;
	private SoftAssert softAssert = new SoftAssert();
	ExtentReports report;
	ExtentTest test;

	@BeforeTest
	public void beforeTest() {

		report = new ExtentReports("C:\\Users\\PPhilip\\Desktop\\Reg reports\\RegisterNowPageTestReport.html");
		test = report.startTest("Register Now Page regression Test");
		driver = new FirefoxDriver();
		publicpage = new PublicHomePageFactory(driver);
		regPage = new RegisterNowPageFactory(driver);
		test.log(LogStatus.INFO, "Started FireFox browser...");
		// System.out.println(publicURL);
		driver.get(publicpage.publicUrl);
		System.out.println("navigating to public page");

	}

	@Test
	public void regNowPageTest() {

		// Test Registration page title
		try {
			String expectedRegPageHeader = "Register";
			publicpage.clickRegisterNowbutton();
			String actualregPageHeader = regPage.column2Header.getText();
			softAssert.assertEquals(actualregPageHeader, expectedRegPageHeader);
			if (actualregPageHeader.equals(expectedRegPageHeader)) {
				test.log(LogStatus.PASS, "The header of Registeration page is: " + actualregPageHeader);

			} else {
				test.log(LogStatus.FAIL, "The header of the Registration page is not as expected");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The web element for Registration page title could not be found");
		}

		// Test The Fund logo on Register page
		try {
			WebElement registerLogo = regPage.pagelogo;
			softAssert.assertTrue(registerLogo.isDisplayed());
			if (registerLogo.isDisplayed()) {
				test.log(LogStatus.PASS, "The fund logo is displayed");
			} else {
				test.log(LogStatus.FAIL, "The fund logo is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The web element to Fund logo could not be found");
		}

		// Test the first statement in the first colomn of reg page
		try {
			String expectedstatment = "Direction super is available free of charge to all members.";
			String actualstatment = regPage.column1Statment().getText();
			softAssert.assertEquals(actualstatment, expectedstatment);
			if (actualstatment.equals(expectedstatment)) {
				test.log(LogStatus.PASS, "The first statement in the first column of register now page is correct");
			} else {
				test.log(LogStatus.PASS, "The first statement in the first column of register now page is NOT correct");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"The web element for first statement in the first colomn of reg page could not be found");
		}

		// Test the Login link in the first column of the reg page
		try {
			String expectedLoginText = "To login, click here.";
			String actualLoginText = regPage.toLoginText().getText();
			softAssert.assertEquals(actualLoginText, expectedLoginText);
			if (expectedLoginText.equals(actualLoginText)) {
				test.log(LogStatus.PASS, "The login text is displayed as expected.");

			} else {
				test.log(LogStatus.FAIL, "The Login text is incorrect");

			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"The web element for the Login link in the first column of the reg page could not be found");
		}

		// Test the "Have a Question or need help" in the first column on
		// reg page
		try {
			String expectedQuestionHelpText = "Questions or need help?";
			String actualQuestionHelpText = regPage.questionOrHelp().getText();
			softAssert.assertEquals(actualQuestionHelpText, expectedQuestionHelpText);
			if (expectedQuestionHelpText.equals(actualQuestionHelpText)) {
				test.log(LogStatus.PASS, "the 'Have a Question or need help' test text is displayed correctly");

			} else {
				test.log(LogStatus.FAIL, "the 'Have a Question or need help' test text is not displayed correctly");

			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The web element for the 'Have a Question or need help' could not be found");
		}

		// Test the fund email in the first column on reg page
		try {
			String expectedTheEmail = "fundsupport@directionsuper.com.au";
			String actualTheEmail = regPage.theEmail().getText();
			softAssert.assertEquals(actualTheEmail, expectedTheEmail);
			if (actualTheEmail.equals(expectedTheEmail)) {
				test.log(LogStatus.PASS, "The email to the fund is displayed correctly");
			} else {
				test.log(LogStatus.FAIL, "The email to the fund is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"The web element for fund email in the first column on reg page could not be found");
		}

		// Test the statement in the second column on reg page
		try {
			String expectedColumn2Statment = "Please fill in the details below and submit.";
			String actualColumn2Statment = regPage.column2Statment().getText();
			softAssert.assertEquals(actualColumn2Statment, expectedColumn2Statment);
			if (expectedColumn2Statment.equals(actualColumn2Statment)) {
				test.log(LogStatus.PASS, "The statement on top of column 2 of reg page is displayed correctly");
			} else {
				test.log(LogStatus.FAIL, "The statement on top of column 2 of reg page is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"The web element for the statement in the second column on reg page could not be found");
		}

		// Test the First name text on the reg page form
		try {
			WebElement firstNameMandatory = regPage.firstNameIsmandatory();
			String expectedFirstNameText = "First name *";
			String actualFirstNameText = regPage.firstNameText().getText();
			softAssert.assertEquals(actualFirstNameText, expectedFirstNameText);
			if (expectedFirstNameText.equals(actualFirstNameText) && firstNameMandatory.isDisplayed()) {
				test.log(LogStatus.PASS,"The First name in the Register Now form is displayed as expected and the field is mandatory");
			} else {
				test.log(LogStatus.FAIL,"The First name in the Register Now form is NOT displayed or it is NOT set as mandatory");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The web element for the First name text on the reg page form could not be found");
		}

		// Test the First name field on the reg page form
		try {
			WebElement firstNameField1 = regPage.firstNameField;
			String firstNameField2 = firstNameField1.getAttribute("Value");
			// Check whether input field is blank
			if (firstNameField2.isEmpty()) {
				test.log(LogStatus.PASS, "The First name field is empty");
			} else {
				test.log(LogStatus.FAIL, "The First name field is NOT empty");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"The web element for the First name field on the reg page form could not be found");
		}

		// Test the Family name text on the reg page form
		try {
			String expectedFamilyNameText = "Family name";
			String actualFamilyNameText = regPage.familyNameText().getText();
			softAssert.assertEquals(actualFamilyNameText, expectedFamilyNameText);
			if (expectedFamilyNameText.equals(actualFamilyNameText)) {
				test.log(LogStatus.PASS, "The family name in the Register Now form is displayed as expected");
			} else {
				test.log(LogStatus.FAIL, "The First name in the Register Now form is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"The web element for the Family name text on the reg page form could not be found");
		}

		// Test the Family name field on the reg page form
		try {
			WebElement familyNameField1 = regPage.familyNameField;
			String familyNameField2 = familyNameField1.getAttribute("Value");
			// Check whether input field is blank
			if (familyNameField2.isEmpty()) {
				test.log(LogStatus.PASS, "The Family name field is empty");
			} else {
				test.log(LogStatus.FAIL, "The Family name field is NOT empty");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"The web element for the Family name field on the reg page form could not be found");
		}

		// Test the User name text on the reg page form
		try {
			WebElement userNameMandatory = regPage.userNameIsMandatory;
			String expectedUserNameText = "Username *";
			String actualUserNameText = regPage.userNameText().getText();
			softAssert.assertEquals(actualUserNameText, expectedUserNameText);
			if (expectedUserNameText.equals(actualUserNameText) && userNameMandatory.isDisplayed()) {
				test.log(LogStatus.PASS,"The User name in the Register Now form is displayed as expected and is mandatory");
			} else {
				test.log(LogStatus.FAIL,"The web element for the User name text on the reg page form could not be found");
			}

		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The web element for the User name text on the reg page form could not be found");
		}

		// Test the Username field on the reg page form
		try {
			WebElement userNameField1 = regPage.userNameField;
			String userNameField2 = userNameField1.getAttribute("Value");
			// Check whether input field is blank
			if (userNameField2.isEmpty()) {
				test.log(LogStatus.PASS, "The Username field is empty");
			} else {
				test.log(LogStatus.FAIL, "The Username field is NOT empty");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The web element for the Username field on the reg page form could not be found");
		}

		// Test the Email address text on the reg page form
		try {
			WebElement emailAddress = regPage.emailAddressText;
			String expectedEmailAddress = "Email address *";
			String actualEmailAddress = regPage.emailAddressText().getText();
			softAssert.assertEquals(actualEmailAddress, expectedEmailAddress);
			if (expectedEmailAddress.equals(actualEmailAddress) && emailAddress.isDisplayed()) {
				test.log(LogStatus.PASS,"The Email address in the Register Now form is displayed as expected and is mandatory");
			} else {
				test.log(LogStatus.FAIL,"The Email address in the Register Now form is NOT displayed or it is NOT mandatory");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"The web element for the Email address text on the reg page form could not be found");
		}

		// Test the Email address field on the reg page form
		try {
			WebElement emailField1 = regPage.emailAddressField;
			String rmailField2 = emailField1.getAttribute("Value");
			// Check whether input field is blank
			if (rmailField2.isEmpty()) {
				test.log(LogStatus.PASS, "The Email address field is empty");
			} else {
				test.log(LogStatus.FAIL, "The Email address field is NOT empty");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"The web element for the Email address field on the reg page form could not be found");
		}

		// Test the Verify Email address text on the reg page form
		try {
			WebElement verifyEmailAddress = regPage.emailAddressText;
			String expectedVerifyEmailAddress = "Verify email address *";
			String actualVerifyEmailAddress = regPage.verifyEmailText().getText();
			softAssert.assertEquals(actualVerifyEmailAddress, expectedVerifyEmailAddress);
			if (expectedVerifyEmailAddress.equals(actualVerifyEmailAddress) && verifyEmailAddress.isDisplayed()) {
				test.log(LogStatus.PASS,"The Verify Email address text on the Register Now form is displayed as expected and is mandatory");
			} else {
				test.log(LogStatus.FAIL,"The Verify Email address text on the Register Now form is NOT displayed or it is NOT mandatory");
			}

		} catch (Exception e) {
			test.log(LogStatus.FAIL,"The web element for the Verify Email address text on the reg page form could not be found");
		}

		// Test the Verify Email address field on the reg page form
		try {
			WebElement verifyEmailField1 = regPage.verifyEmailField;
			String verifyEmailField2 = verifyEmailField1.getAttribute("Value");
			// Check whether input field is blank
			if (verifyEmailField2.isEmpty()) {
				test.log(LogStatus.PASS, "The Verify email address field is empty");
			} else {
				test.log(LogStatus.FAIL, "The Verify email address field is NOT empty");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"The web element for the Verify Email address field on the reg page form could not be found");
		}

		// Test the DOB text on the reg page form
		try {
			String expectedDateOfBirth = "Date of birth";
			String actualDateOfBirth = regPage.dateOfBirthText().getText();
			softAssert.assertEquals(actualDateOfBirth, expectedDateOfBirth);
			if (expectedDateOfBirth.equals(actualDateOfBirth)) {
				test.log(LogStatus.PASS, "The DOB text on the Register Now form is displayed as expected");
			} else {
				test.log(LogStatus.FAIL, "The DOB text on the Register Now form is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The web element for the DOB text on the reg page form could not be found");
		}

		// Test the DOB field on the reg page form
		try {
			String defaultDateOfBirth = "01/01/1970";
			WebElement dateOFBirthField1 = regPage.dateOfBirthField;
			String dateOFBirthField2 = dateOFBirthField1.getAttribute("Value");
			// Check whether input field is blank
			if (dateOFBirthField2.equals(defaultDateOfBirth)) {
				test.log(LogStatus.PASS, "The DOB field is populated with the default value");
			} else {
				test.log(LogStatus.FAIL, "The DOB field is either blank or populated with the wrong default value");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The web element for the DOB field on the reg page form could not be found");
		}

		// Test Captcha text on the reg page form
		try {
			WebElement verifyCaptchaText = regPage.emailAddressText;
			String expectedCaptchaText = "Type the characters to proceed *";
			String actualCaptchaText = regPage.captureText().getText();
			softAssert.assertEquals(actualCaptchaText, expectedCaptchaText);
			if (expectedCaptchaText.equals(actualCaptchaText) && verifyCaptchaText.isDisplayed()) {
				test.log(LogStatus.PASS,"The Captcha text on the Register Now form is displayed as expected and it is mandatory");
			} else {
				test.log(LogStatus.FAIL,"The Captcha text on the Register Now form is NOT displayed or it is NOT mandatory");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The web element for the Captcha text on the reg page form could not be found");
		}

		// Test the Captcha field on the reg page form
		try {
			WebElement captchaField1 = regPage.captureField;
			String captchaField2 = captchaField1.getAttribute("Value");
			// Check whether input field is blank
			if (captchaField2.isEmpty()) {
				test.log(LogStatus.PASS, "The Captcha field is empty");
			} else {
				test.log(LogStatus.FAIL, "The Captcha field is NOT empty");
			}

		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The web element for the Captcha field on the reg page form could not be found");
		}

		// Test the Disclaimer and Privacy text on the reg page form
		try {
			String expectedAgreeTest = "I agree to the Disclaimer and  Privacy policy.";
			String actualAgreeTest = regPage.agreeText().getText();
			softAssert.assertEquals(actualAgreeTest, expectedAgreeTest);
			if (expectedAgreeTest.equals(actualAgreeTest)) {
				test.log(LogStatus.PASS,"The text regarding Privacy and Disclaimer on the Register Now form is displayed as expected");
			} else {
				test.log(LogStatus.FAIL,"The text regarding Privacy and Disclaimer on the Register Now form is NOT displayed as expected");
			}

		} catch (Exception e) {
			test.log(LogStatus.FAIL,"The web element for the Disclaimer and Privacy text on the reg page form could not be found");
		}

		// Test the Disclaimer and Privacy checkbox on the reg page form
		try {
			Boolean n = true;
			Boolean agreeCheckBoxNotSelected = regPage.agreeCheckBox.isSelected();
			softAssert.assertFalse(agreeCheckBoxNotSelected);
			if (n != agreeCheckBoxNotSelected) {
				test.log(LogStatus.PASS,"The Privacy and Disclaimer ckeckbox on the Register Now form is displayed and it is not selected by default");
			} else {
				test.log(LogStatus.FAIL,"The Privacy and Disclaimer ckeckbox on the Register Now form is NOT displayed or it is selected by default");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"The web element for the Disclaimer and Privacy checkbox on the reg page form could not be found");
		}

		// Check send Button1
		try {
			WebElement submitButton = regPage.submitButton;
			softAssert.assertTrue(submitButton.isDisplayed());
			softAssert.assertTrue(submitButton.isEnabled());
			if (submitButton.isDisplayed() && submitButton.isEnabled()) {
				test.log(LogStatus.PASS, "The 'Submit' button is displayed and it is enabled");
			} else {
				test.log(LogStatus.FAIL, "The 'Submit' button is not displayed or it is not enabled");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The web element for the send Button1 could not be found");
		}
	}

	@AfterTest
	public void afterTest() {
		report.endTest(test);
		report.flush();
		driver.quit();
		softAssert.assertAll();
		
	}

}
