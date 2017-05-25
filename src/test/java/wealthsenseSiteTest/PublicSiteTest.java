package wealthsenseSiteTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class PublicSiteTest {
	private WebDriver driver;

	PublicHomePageFactory publicPageTest;
	private SoftAssert softAssert = new SoftAssert();
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforeTest() {
		report = new ExtentReports("C:\\Users\\PPhilip\\Desktop\\Reg reports\\PublicHomepageTestReport.html");
		test = report.startTest("Home page regression");
		driver = new FirefoxDriver();
		publicPageTest = new PublicHomePageFactory(driver);
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Firefox browser opened...");
		driver.get(publicPageTest.publicUrl);
		test.log(LogStatus.INFO, "Navigate to home page");

	}

	@Test
	public void HeaderpublicPageTest() {

		// Check Home Logo
		try {
			WebElement homeLogo = publicPageTest.checkHomeLogo();
			softAssert.assertTrue(homeLogo.isDisplayed());
			if (homeLogo.isDisplayed()) {
				test.log(LogStatus.PASS, "The fund logo is displayed in the header of public site");
			} else {
				test.log(LogStatus.FAIL, "The fund logo is NOT displayed in the header of public site");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Home Logo could not be found");
		}

		// Check Login Link
		try {
			String expectedLogInLink = "Already a member? Login";
			WebElement alreadyMember = publicPageTest.checkAlreadyMemberText();
			String actualLogInLink = alreadyMember.getText();
			softAssert.assertTrue(alreadyMember.isDisplayed());
			test.log(LogStatus.INFO, "The log in text is: " + actualLogInLink);
			softAssert.assertEquals(actualLogInLink, expectedLogInLink);
			if (actualLogInLink.equals(expectedLogInLink)) {
				test.log(LogStatus.PASS, "The Login links is in the header");
				test.log(LogStatus.PASS, "the sentence Already a member? Login is displayed in the header");
			} else {
				test.log(LogStatus.FAIL, "The login is not displayed in the public page header");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Login Link could not be found");
		}

		// Check Section1 Header
		try {
			String expectedS1Header = "Welcome to Superbank";
			WebElement section1Header = publicPageTest.checkSection1Header();
			String actualS1Header = section1Header.getText();

			softAssert.assertTrue(section1Header.isDisplayed());
			softAssert.assertEquals(actualS1Header, expectedS1Header);
			if (actualS1Header.equals(expectedS1Header)) {
				test.log(LogStatus.INFO, "The section1 header is: " + section1Header.getText());
				test.log(LogStatus.PASS, "The section1 header is as expected");
			} else {
				test.log(LogStatus.FAIL, "The section1 header is NOT as expected");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Section1 Header could not be found");
		}

		// Check Section1 Body
		try {
			String expectedSection1Body = "Your money is important, so be better informed!";
			WebElement section1Body = publicPageTest.checkSection1Body();
			String actualSection1Body = section1Body.getText();
			softAssert.assertTrue(section1Body.isDisplayed());
			softAssert.assertEquals(actualSection1Body, expectedSection1Body);
			if (actualSection1Body.equals(expectedSection1Body)) {
				test.log(LogStatus.INFO, "The section1 body text is: " + actualSection1Body);
				test.log(LogStatus.PASS, "The section1 body text is displayed and as expected");
			} else {
				test.log(LogStatus.FAIL, "The section1 body is NOT as expected");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Section1 Body could not be found");
		}

		// Check Reg Button1
		try {
			WebElement regButton1 = publicPageTest.checkRegButton1();
			softAssert.assertTrue(regButton1.isDisplayed());
			softAssert.assertTrue(regButton1.isEnabled());
			if (regButton1.isDisplayed() && regButton1.isEnabled()) {
				test.log(LogStatus.PASS, "The 'Redister Now' button is displayed and it is enabled");
			} else {
				test.log(LogStatus.FAIL, "The 'Register button is not displayed or it is not enabled");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Reg Button1 could not be found");
		}

		// Check Section2 Video
		try {
			WebElement section2Video = publicPageTest.checkSection2Video();
			softAssert.assertTrue(section2Video.isDisplayed());
			if (section2Video.isDisplayed()) {
				test.log(LogStatus.PASS, "The Viodeo in section2 is displayed");
			} else {
				test.log(LogStatus.FAIL, "The Viodeo in section2 NOT is displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Section2 Video could not be found");
		}

		// Check Section3 Header
		try {
			String expectedSection3Header = "A three step journey...";
			WebElement section3Header = publicPageTest.checkSection3Header();
			String actualSection3Header = section3Header.getText();
			softAssert.assertTrue(section3Header.isDisplayed());
			softAssert.assertEquals(actualSection3Header, expectedSection3Header);
			if (actualSection3Header.equals(expectedSection3Header)) {
				test.log(LogStatus.PASS, "Section 3 header is displayed, and it is: " + actualSection3Header);
			} else {
				test.log(LogStatus.FAIL, "Section 3 header is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Section3 Header could not be found");
		}

		// Check Discover Image
		try {
			WebElement discoverImage = publicPageTest.checkDiscoverImage();
			softAssert.assertTrue(discoverImage.isDisplayed());
			if (discoverImage.isDisplayed()) {
				test.log(LogStatus.PASS, "The image on the Discover tile is displayed");
			} else {
				test.log(LogStatus.FAIL, "The image on the Discover tile is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Discover Image could not be found");
		}

		// Check Discover Text
		try {
			String expectedDiscoverText = "Discover";
			WebElement discoverText = publicPageTest.checkDiscoverText();
			String actualDiscoverText = discoverText.getText();
			softAssert.assertTrue(discoverText.isDisplayed());
			softAssert.assertEquals(actualDiscoverText, expectedDiscoverText);
			if (actualDiscoverText.equals(expectedDiscoverText)) {
				test.log(LogStatus.PASS, "Discover tile header is displayed, and it is: " + actualDiscoverText);
			} else {
				test.log(LogStatus.FAIL, "Discover tile header is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Discover Text could not be found");
		}

		// Check Discover Description
		try {
			String expectedDiscoverDescription = "Build your understanding of important financial and lifestyle planning ideas.";
			String actualDiscoverDescription = publicPageTest.discoverDescription.getText();
			softAssert.assertEquals(actualDiscoverDescription, expectedDiscoverDescription);
			if (expectedDiscoverDescription.equals(actualDiscoverDescription)) {
				test.log(LogStatus.PASS, "The description of Discovery tile on public page is correct");
			} else {
				test.log(LogStatus.FAIL, "The description of Discovery tile on public page is NOT correct");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Discover Description could not be found");
		}

		// Check Measure And Plan Image
		try {
			WebElement measureAndplanImage = publicPageTest.checkMeasureAndplanImage();
			softAssert.assertTrue(measureAndplanImage.isDisplayed());
			if (measureAndplanImage.isDisplayed()) {
				test.log(LogStatus.PASS, "The image on the Measure And Plan tile is displayed");
			} else {
				test.log(LogStatus.FAIL, "The image on the Measure And Plan tile is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Measure And Plan Image could not be found");
		}

		// Check Measure And plan Text
		try {
			String expectedMAPText = "Measure and plan";
			WebElement measureAndplanText = publicPageTest.checkMeasureAndplanText();
			String actualMAPText = measureAndplanText.getText();
			softAssert.assertTrue(measureAndplanText.isDisplayed());
			softAssert.assertEquals(actualMAPText, expectedMAPText);
			if (actualMAPText.equals(expectedMAPText)) {
				test.log(LogStatus.PASS, "Measure and plan tile header is displayed, and it is: " + actualMAPText);
			} else {
				test.log(LogStatus.FAIL, "Measure and plan tile header is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Measure And plan Text could not be found");
		}

		// Check Measure And plan Description
		try {
			String expectedMeasurePlannDescription = "Use our calculators and tools to explore what each option may mean for you.";
			String actualMeasurePlannDescription = publicPageTest.measureAndPlanDescription.getText();
			softAssert.assertEquals(actualMeasurePlannDescription, expectedMeasurePlannDescription);
			if (expectedMeasurePlannDescription.equals(actualMeasurePlannDescription)) {
				test.log(LogStatus.PASS, "The description of Measure and Plann tile on public page is correct");
			} else {
				test.log(LogStatus.FAIL, "The description of Measure and Plann tile on public page is NOT correct");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Measure And plan Description could not be found");
		}

		// Check Make It Happen Image
		try {
			WebElement makeItHappenImage = publicPageTest.checkMakeItHappenImage();
			softAssert.assertTrue(makeItHappenImage.isDisplayed());
			if (makeItHappenImage.isDisplayed()) {
				test.log(LogStatus.PASS, "The image on the Make It Happen tile is displayed");
			} else {
				test.log(LogStatus.FAIL, "The image on the Make It Happen tile is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Make It Happen Image could not be found");
		}

		// Check Make It Happen Text
		try {
			String expectedMakeITHapenText = "Make it happen";
			WebElement makeItHappenText = publicPageTest.checkMakeItHappenText();
			String actualMakeItHapenText = makeItHappenText.getText();
			softAssert.assertTrue(makeItHappenText.isDisplayed());
			softAssert.assertEquals(actualMakeItHapenText, expectedMakeITHapenText);
			if (actualMakeItHapenText.equals(expectedMakeITHapenText)) {
				test.log(LogStatus.PASS,
						"The header to 'Make It Happen' tile is displayed correctly as: " + actualMakeItHapenText);
			} else {
				test.log(LogStatus.FAIL, "The header to 'Make It Happen' tile is NOT displayed or is inccorrect");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Make It Happen Text could not be found");
		}

		// Check Make It Happen Description
		try {
			String expectedMakeItHappenDescription = "Take action to make your plans a reality.";
			String actualMakeItHappenDescription = publicPageTest.makeItHappenDescription.getText();
			softAssert.assertEquals(actualMakeItHappenDescription, expectedMakeItHappenDescription);
			if (expectedMakeItHappenDescription.equals(actualMakeItHappenDescription)) {
				test.log(LogStatus.PASS, "The description of make it happen tile on public page is correct");
			} else {
				test.log(LogStatus.FAIL, "The description of make it happen tile on public page is NOT correct");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Make It Happen Description could not be found");
		}

		// Test The footer banner
		try {
			WebElement footerBannerImage = publicPageTest.FooterBanner();
			softAssert.assertTrue(footerBannerImage.isDisplayed());
			if (footerBannerImage.isDisplayed()) {
				test.log(LogStatus.PASS, "The image in the footer banner is displayed");
			} else {
				test.log(LogStatus.FAIL, "The image in the footer banner is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to The footer banner could not be found");
		}

		// Check Register Now Footer
		try {
			WebElement regNowFooter = publicPageTest.checkRegisterNowFooter();
			softAssert.assertTrue(regNowFooter.isDisplayed());
			softAssert.assertTrue(regNowFooter.isEnabled());
			if (regNowFooter.isDisplayed() && regNowFooter.isEnabled()) {
				test.log(LogStatus.PASS, "The 'Redister Now' button in section 4 is displayed and it is enabled");
			} else {
				test.log(LogStatus.FAIL, "The 'Register button in section 4 is not displayed or it is not enabled");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The elemen to Register Now buton in footer could not be found");
		}

		// Check Let Get You Started

		try {
			WebElement letGetYouStarted = publicPageTest.checkLetGetYouStarted();
			softAssert.assertTrue(letGetYouStarted.isDisplayed());
			softAssert.assertEquals(letGetYouStarted.getText(), "Let's get you started!");
			if (letGetYouStarted.equals("Let's get you started!")) {
				test.log(LogStatus.PASS, "The text Let's get you started! is displayed");
			} else {
				test.log(LogStatus.FAIL, "The text Let's get you started! is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element to let Get You Started could not be found");
		}

		// Check Public Footer Contact Us

		try {
			String expectedContactUs = "Contact Us";
			WebElement publicFooterContactUs = publicPageTest.checkPublicFooterContactUs();
			String actualContactUs = publicFooterContactUs.getText();
			softAssert.assertTrue(publicFooterContactUs.isDisplayed());
			softAssert.assertEquals(actualContactUs, expectedContactUs);
			if (actualContactUs.equals(expectedContactUs)) {
				test.log(LogStatus.PASS, "Contact us is displayed in the footer of the public page");
			} else {
				test.log(LogStatus.FAIL, "Contact us is NOT displayed in the footer of the public page");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element to Public Footer Contact Us could not be found");
		}

		// Check Public Footer Privacy
		try {
			String expectedPrivacyText = "Privacy";
			WebElement publicFooterPrivacy = publicPageTest.checkPublicFooterPrivacy();
			String actualPrivalcyText = publicFooterPrivacy.getText();
			softAssert.assertTrue(publicFooterPrivacy.isDisplayed());
			softAssert.assertEquals(actualPrivalcyText, expectedPrivacyText);
			if (actualPrivalcyText.equals(expectedPrivacyText)) {
				test.log(LogStatus.PASS, "Privacy is displayed in the footer of the public page");
			} else {
				test.log(LogStatus.FAIL, "Privasy is NOT displayed in the footer of the public page");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element to Public Footer Privacy could not be found");
		}

		// Check Public Footer Disclaimer
		try {
			String expectedDisclaimer = "Disclaimer";
			WebElement publicFooterDisclaimer = publicPageTest.checkPublicFooterDisclaimer();
			String actualDisclaimer = publicFooterDisclaimer.getText();
			softAssert.assertTrue(publicFooterDisclaimer.isDisplayed());
			softAssert.assertEquals(actualDisclaimer, expectedDisclaimer);
			if (actualDisclaimer.equals(expectedDisclaimer)) {
				test.log(LogStatus.PASS, "Disclaimer is displayed in the footer of the public page");
			} else {
				test.log(LogStatus.FAIL, "Disclaimer is NOT displayed in the footer of the public page");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element to Public Footer Disclaimer could not be found");
		}

		// Check Public Footer Copy Right
		try {
			String expectedCopyRights = "© Copyright Financial Synergy 2016";
			WebElement publicFooterCopyRight = publicPageTest.checkPublicFooterCopyRight();
			String actualCopyRights = publicFooterCopyRight.getText();
			softAssert.assertTrue(publicFooterCopyRight.isDisplayed());
			softAssert.assertEquals(actualCopyRights, expectedCopyRights);
			if (actualCopyRights.equals(expectedCopyRights)) {
				test.log(LogStatus.PASS, "Copy Rights link is displayed in the footer of the public page");
			} else {
				test.log(LogStatus.FAIL, "Copy Rights link is NOT displayed in the footer of the public page");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element to Public Footer Copy Right could not be found");
		}

	}

	@AfterClass
	public void afterTest() {
		test.log(LogStatus.INFO, "END OF TEST");
		report.endTest(test);
		report.flush();
		softAssert.assertAll();
		driver.quit();
	}

}
