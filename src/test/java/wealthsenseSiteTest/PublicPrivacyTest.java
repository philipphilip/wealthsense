package wealthsenseSiteTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class PublicPrivacyTest {
	private WebDriver driver;
	PublicHomePageFactory privacyTest;
	private SoftAssert softAsser = new SoftAssert();
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforeClass() {
		report = new ExtentReports("C:\\Users\\PPhilip\\Desktop\\Reg reports\\PrivacyPopUpTestReport.html");
		test = report.startTest("Public Home page Privacy regression Test");
		driver = new FirefoxDriver();
		privacyTest = new PublicHomePageFactory(driver);
		test.log(LogStatus.INFO, "Opened FireFox browser...");
		driver.manage().window().maximize();
		driver.get(privacyTest.publicUrl);
		test.log(LogStatus.INFO, "Navigated to Public Site");
	}

	@Test
	public void publicPagePrivacyTest() {
		String expectedPrivacyHeader = "Privacy";
		test.log(LogStatus.INFO, "Clicked on the Privacy link in the footer");
		privacyTest.ClickPrivacyInFooter();
		String actualPrivacyHeader = privacyTest.privacyPopUpHeader().getText();
		softAsser.assertEquals(actualPrivacyHeader, expectedPrivacyHeader);
		if (actualPrivacyHeader.equals(expectedPrivacyHeader)) {
			test.log(LogStatus.PASS, "The header of the Privacy pop up is displayed and it is as expected");

		} else {
			test.log(LogStatus.FAIL, "The header of the Privacy pop up is NOT as expected or it is NOT displayed");
		}
	}

	@AfterClass
	public void afterClass() {
		report.endTest(test);
		report.flush();
		driver.quit();
		softAsser.assertAll();
	}

}
