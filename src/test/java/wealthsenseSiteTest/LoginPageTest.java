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

public class LoginPageTest {

	private WebDriver driver;
	PublicHomePageFactory publicpage;
	LoginPageFactory loginPageTest;
	private SoftAssert softAssert = new SoftAssert();
	ExtentReports report;
	ExtentTest test;

	@BeforeTest
	public void beforeTest() {
		report = new ExtentReports("C:\\Users\\PPhilip\\Desktop\\Reg reports\\LoginPageTestReport.html");
		test = report.startTest("Login Page regression Test");
		driver = new FirefoxDriver();
		publicpage = new PublicHomePageFactory(driver);
		loginPageTest = new LoginPageFactory(driver);
		test.log(LogStatus.INFO, "Started FireFox browser...");
		driver.get(publicpage.publicUrl);
		test.log(LogStatus.INFO, "Navigated to Public page");

	}

	@Test
	public void loginPageTest() {
		publicpage.loginLink.click();
		test.log(LogStatus.INFO, "Clicked on LoginLink");

		// Test the title on the Login page
		try {
			String expectedPageTitle = "Login";
			String actualPageTitle = loginPageTest.loginPageHeader().getText();
			softAssert.assertEquals(actualPageTitle, expectedPageTitle);
			if (expectedPageTitle.equals(actualPageTitle)) {
				test.log(LogStatus.PASS, "The page tile is 'Login' as expected");
			} else {
				test.log(LogStatus.FAIL, "Expected page title to be 'Login'. But 'Login' was not displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemet for the title on the Login page could not be located");
		}
		
		// Test the fund logo on login page
		try {
			WebElement loginLogo = loginPageTest.LoginPageLogo();
			softAssert.assertTrue(loginLogo.isDisplayed());
			if (loginLogo.isDisplayed()) {
				test.log(LogStatus.PASS, "Home logo is displayed on Login page");
			} else {
				test.log(LogStatus.FAIL, "Home logo is NOT displayed on Login page");
			}

		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemet for the fund logo on login page could not be located");
		}
		
		// Test the first statement in the Login page
		try {
			String expectedLoginPageStatement1 = "Direction super is available free of charge to all members.";
			String actualLoginPageStatement1 = loginPageTest.LoginPageStatement1().getText();
			softAssert.assertEquals(actualLoginPageStatement1, expectedLoginPageStatement1);
			if (expectedLoginPageStatement1.equals(actualLoginPageStatement1)) {
				test.log(LogStatus.PASS, "The first statement on the login page is displayed correctly");
			} else {
				test.log(LogStatus.FAIL, "The first statement on the login page is NOT displayed correctly");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemet for the first statement in the Login page could not be located");
		}
		
		// Test the line 'To register click here'
		try {
			String expectedLineToRegister = "To register, click here.";
			String actualLineToRegister = loginPageTest.loginPageToRegister().getText();
			softAssert.assertEquals(actualLineToRegister, expectedLineToRegister);
			if (expectedLineToRegister.equals(actualLineToRegister)) {
				test.log(LogStatus.PASS, "The line 'To register click here.' on the login page is displayed correctly");
			} else {
				test.log(LogStatus.FAIL, "The line 'To register click here.' on the login page is NOT displayed correctly");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemet for the line 'To register click here' could not be located");
		}
		
		// Test the line 'Question or need help'
		try {
			String expectedQuestionOrHelp = "Questions or need help?";
			String actualQuestionOrHelp = loginPageTest.LoginPageQuestionOrHelp().getText();
			softAssert.assertEquals(actualQuestionOrHelp, expectedQuestionOrHelp);
			if (expectedQuestionOrHelp.equals(actualQuestionOrHelp)) {
				test.log(LogStatus.PASS, "The line 'Questions or need help?' on the login page is displayed correctly");
			} else {
				test.log(LogStatus.FAIL, "The line 'Questions or need help?' on the login page is NOT displayed correctly");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemet for the line 'Question or need help' could not be located");
		}
		
		// Test the information email on the login page
		try {
			String expectedInfoEmail = "fundsupport@directionsuper.com.au";
			String actualInfoEmail = loginPageTest.LoginPageContactEmail().getText();
			softAssert.assertEquals(actualInfoEmail, expectedInfoEmail);
			if (expectedInfoEmail.equals(actualInfoEmail)) {
				test.log(LogStatus.PASS, "The fund email address on the login page is displayed correctly");
			} else {
				test.log(LogStatus.FAIL, "The fund email address on the login page is NOT displayed correctly");
			}

		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemet for the information email on the login page could not be located");
		}
	
		// Test the username text on the login page
		try {
			String expectedUsernameText = "Username *";
			String actualUsernameText = loginPageTest.loginPageUserName().getText();
			softAssert.assertEquals(actualUsernameText, expectedUsernameText);
			if (expectedUsernameText.equals(actualUsernameText)) {
				test.log(LogStatus.PASS, "The username text on the login page is displayed correctly");
			} else {
				test.log(LogStatus.FAIL, "The username text on the login page is NOT displayed correctly");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemet for the username text on the login page could not be located");
		}
	
		// Test the Username field on the Login page form
		try {
			WebElement usernameField = loginPageTest.loginPageUserNameField();
			String expectedUsernameField = usernameField.getAttribute("Value");
			// Check whether input field is blank
			if (expectedUsernameField.isEmpty()) {
				test.log(LogStatus.PASS, "The Username field is empty");
			} else {
				test.log(LogStatus.FAIL, "The USername field is NOT empty");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemet for the Username field on the Login page form could not be located");
		}
		
		// Test the password text on the login page
		try {
			String expectedPasswordText = "Password *";
			String actualPasswordText = loginPageTest.loginPassword().getText();
			softAssert.assertEquals(actualPasswordText, expectedPasswordText);
			if (expectedPasswordText.equals(actualPasswordText)) {
				test.log(LogStatus.PASS, "The password text on the login page is displayed correctly");
			} else {
				test.log(LogStatus.FAIL, "The password text on the login page is NOT displayed correctly");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemet for the password text on the login page could not be located");
		}
		
		// Test the Password field on the Login page form
		try {
			WebElement passwordField = loginPageTest.loginPageUserNameField();
			String expectedPasswordField = passwordField.getAttribute("Value");
			// Check whether input field is blank
			if (expectedPasswordField.isEmpty()) {
				test.log(LogStatus.PASS, "The Password field is empty");
			} else {
				test.log(LogStatus.FAIL, "The Password field is NOT empty");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemet for the Password field on the Login page form could not be located");
		}
		
		// Test the 'Forgot Password' text on the login page
		try {
			String expectedForgotPassword = "Forgot password";
			String actualForgotPassword = loginPageTest.loginPageForgotPasswordLin().getText();
			softAssert.assertEquals(actualForgotPassword, expectedForgotPassword);
			if (expectedForgotPassword.equals(actualForgotPassword)) {
				test.log(LogStatus.PASS, "The 'Forgot password' text on the login page is displayed correctly");
			} else {
				test.log(LogStatus.FAIL, "The 'Forgot password' text on the login page is NOT displayed correctly");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemet for the 'Forgot Password' text on the login page could not be located");
		}
		
		// Check Login Button
		try {
			WebElement loginButton = loginPageTest.loginPageButton();
			softAssert.assertTrue(loginButton.isDisplayed());
			softAssert.assertTrue(loginButton.isEnabled());
			if (loginButton.isDisplayed() && loginButton.isEnabled()) {
				test.log(LogStatus.PASS, "The 'Login' button is displayed and it is enabled");
			} else {
				test.log(LogStatus.FAIL, "The 'Login' butoon is not displayed or it is not enabled");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemet for the Login Button could not be located");
		}
		
		// Check 'Not yet signed up?' text
		try {
			String expectedNotSignedUpQ = "Not yet signed up?";
			String actualNotSignedUpQ = loginPageTest.loginPageNotSignedUp().getText();
			softAssert.assertEquals(actualNotSignedUpQ, expectedNotSignedUpQ);
			if (expectedNotSignedUpQ.equals(actualNotSignedUpQ)) {
				test.log(LogStatus.PASS, "The 'Not yet signed up?' text on the login page is displayed correctly");
			} else {
				test.log(LogStatus.FAIL, "The 'Not yet signed up?' text on the login page is NOT displayed correctly");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemet for 'Not yet signed up?' text could not be located");
		}
		
		// Check Register Button
		try {
			WebElement loginPageRegButton = loginPageTest.loginPageButton();
			softAssert.assertTrue(loginPageRegButton.isDisplayed());
			softAssert.assertTrue(loginPageRegButton.isEnabled());
			if (loginPageRegButton.isDisplayed() && loginPageRegButton.isEnabled()) {
				test.log(LogStatus.PASS, "The 'Register Now' button is displayed and it is enabled");
			} else {
				test.log(LogStatus.FAIL, "The 'Register Now' butoon is not displayed or it is not enabled");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemet for Register Button could not be located");
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
