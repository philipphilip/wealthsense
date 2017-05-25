package wealthsenseSiteTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class PublicDisclaimerTest {

	private WebDriver driver;
	PublicHomePageFactory disclaimerTest;
	private SoftAssert softAsser = new SoftAssert();
	ExtentReports report;
	ExtentTest test;

	@BeforeTest
	public void beforeTest() {
		report = new ExtentReports("C:\\Users\\PPhilip\\Desktop\\Reg reports\\DisclaimerPopUpTestReport.html");
		test = report.startTest("Public Home page Disclaimer regression Test");
		driver = new FirefoxDriver();
		disclaimerTest = new PublicHomePageFactory(driver);
		test.log(LogStatus.INFO, "Opened FireFox browser...");
		driver.manage().window().maximize();
		driver.get(disclaimerTest.publicUrl);
		test.log(LogStatus.INFO, "Navigated to Public Site");
	}

	@Test
	public void f() {
		try {
			String expectedDisclaimerHeader = "Disclaimer";
			disclaimerTest.ClickDisclaimerInFooter();
			test.log(LogStatus.INFO, "Clicked on the Disclaimer link in the footer");
			String actualDisclaimerHeader = disclaimerTest.disclaimerPopUpTitle.getText();
			softAsser.assertEquals(actualDisclaimerHeader, expectedDisclaimerHeader);
			if(actualDisclaimerHeader.equals(expectedDisclaimerHeader)){
				test.log(LogStatus.PASS, "The header of the Disclaimer pop up is displayed and it is as expected");
			}else {
				test.log(LogStatus.FAIL, "The header of the Disclaimer pop up is NOT displayed or it is NOT as expected");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The Disclaimer pop up window can not be located on the public site");
		}
		
		
		
		
	}

	@AfterTest
	public void afterTest() {
		report.endTest(test);
		report.flush();
		softAsser.assertAll();
		driver.quit();
	}

}
