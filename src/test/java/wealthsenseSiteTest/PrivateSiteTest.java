package wealthsenseSiteTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class PrivateSiteTest {

	private WebDriver driver;
	PublicHomePageFactory publicSite;
	PrivateHomePageFactory privatePage;
	LoginPageFactory loginPage;
	private SoftAssert softAssert = new SoftAssert();
	ExtentReports report;
	ExtentTest test;

	@BeforeTest
	public void beforeTest() {
		report = new ExtentReports("C:\\Users\\PPhilip\\Desktop\\Reg reports\\ParivateHomePageTestReport.html");
		test = report.startTest("Private home page regression test");
		driver = new FirefoxDriver();
		publicSite = new PublicHomePageFactory(driver);
		privatePage = new PrivateHomePageFactory(driver);
		loginPage = new LoginPageFactory(driver);
		driver.get(publicSite.publicUrl);
		publicSite.loginLink.click();
		loginPage.giveUserName("t4");
		loginPage.GivePassword("W3lcome!");
		loginPage.ClickloginButton();

	}

	@Test
	public void privateSiteTest() {

		// Confirm login is successful
		String expectedPagetitle = "Home - directionsuper.com";
		String actualPageTitle = driver.getTitle();
		test.log(LogStatus.INFO, "The page title is: " + actualPageTitle);
		softAssert.assertEquals(actualPageTitle, expectedPagetitle);
		if (expectedPagetitle.equals(actualPageTitle)) {
			test.log(LogStatus.PASS, "test");
		} else {
			test.log(LogStatus.FAIL, "The page title is not as expected");
		}

		// Check the Home page logo
		try {
			WebElement PrivateHomePageLogo = privatePage.PrivateSiteLogo();
			softAssert.assertTrue(PrivateHomePageLogo.isDisplayed());
			if(PrivateHomePageLogo.isDisplayed()){
				test.log(LogStatus.PASS, "The fund logo is displayed on Private Home page");
			}else{
				test.log(LogStatus.FAIL, "The fund logo is NOT displayed on Private Home page");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for the Home page logo could not be located");
		}
		
		// Check Watson search field and submit button
		try {
			String askAQuestion = privatePage.WatsonSearch().getAttribute("Value");
			if (askAQuestion.isEmpty()) {
				test.log(LogStatus.PASS, "The Watson search field is displayed in the header and it is empty");
			} else {
				test.log(LogStatus.FAIL,"The Watson search field is NOT displayed in the header or it is NOT empty by defaut");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Watson search field could not be located");
		}
		
		try {
			WebElement submitButton = privatePage.WatsonSubmitButton();
			softAssert.assertTrue(submitButton.isDisplayed());
			softAssert.assertTrue(submitButton.isEnabled());
			if (submitButton.isDisplayed() && submitButton.isEnabled()) {
				test.log(LogStatus.PASS, "The Submit button to Watson search is displayed and enabeled");

			} else {
				test.log(LogStatus.FAIL, "The Submit button to Watson search is NOT displayed and/or is NOT enabeled");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Watson submit button could not be located");
		}
		
		// check the user icon and user name
		try {
			WebElement userIcon = privatePage.PrivateSiteUserIcon();
			softAssert.assertTrue(userIcon.isDisplayed());
			softAssert.assertTrue(userIcon.isEnabled());

			String userName = privatePage.PrivateSiteUsername().getText();
			softAssert.assertTrue(userName != null);
			if (userName != null) {
				test.log(LogStatus.PASS, "User Name is not null");
			} else {
				test.log(LogStatus.FAIL, "User Name is not null");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for user icon or user name could not be located");
		}
		

		// Check Section 1 banner and heading
		try {
			WebElement bannaer1Image = privatePage.PrivateSiteSection1Image();
			softAssert.assertTrue(bannaer1Image.isDisplayed());
			if (bannaer1Image.isDisplayed()) {
				test.log(LogStatus.PASS, "The Section 1 banner image is displayed as expected");
			} else {
				test.log(LogStatus.FAIL, "The Section 1 banner image is NOT displayed as expected");
			}

			String expectedSection1Header = "Welcome to Pathwayze";
			String actualSection1Header = privatePage.PrivateSiteSectio1Header().getText();
			softAssert.assertEquals(actualSection1Header, expectedSection1Header);
			if (expectedSection1Header.equals(actualSection1Header)) {
				test.log(LogStatus.PASS, "The header in section one on public page is displayed correctly and as expected");
			} else {
				test.log(LogStatus.FAIL, "The header in section one on public page is displayed correctly and as expected");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Section 1 banner or heading could not be located");
		}
		
		// Check section 2 video
		try {
			WebElement section2Video = privatePage.PrivateSiteSection2Video();
			softAssert.assertTrue(section2Video.isDisplayed());
			if (section2Video.isDisplayed()) {
				test.log(LogStatus.PASS, "The section 2 vedio is displayed on the private page");
			} else {
				test.log(LogStatus.FAIL, "The section 2 vedio is NOT displayed on the private page");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for section 2 video could not be located");
		}

		// Check Saving Tile
		try {
			String expectedSavingTileHeader = "Saving";
		String actualSavingTileHeader = privatePage.SavingTileHeader().getText();
		softAssert.assertEquals(actualSavingTileHeader, expectedSavingTileHeader);
		if (expectedSavingTileHeader.equals(actualSavingTileHeader)) {
			test.log(LogStatus.PASS, "The Saving tile header is " + actualSavingTileHeader + " as expected");
		} else {
			test.log(LogStatus.FAIL,
					"The Saving tile header is NOT as expected. The display actualy is " + actualSavingTileHeader);
		}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Saving Tile Header could not be located");
		}
		
		try {
			WebElement savingTileImage = privatePage.SavingTileImage();
			softAssert.assertTrue(savingTileImage.isDisplayed());
			if (savingTileImage.isDisplayed()) {
				test.log(LogStatus.PASS, "The image on saving tile is displayed");
			} else {
				test.log(LogStatus.FAIL, "The image on saving tile is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for saving Tile Image could not be located");
		}
		
		try {
			String expectedSavingTileBody = "When planning our lives or planning our wealth, we first need to know what we want and then some knowledge to get there.";
			String actualSavingTileBody = privatePage.SavingTileDescription().getText();
			softAssert.assertEquals(actualSavingTileBody, expectedSavingTileBody);
			if (expectedSavingTileBody.equals(actualSavingTileBody)) {
				test.log(LogStatus.PASS, "The body text in the saving tile is displayed and it is as expecteed");
			} else {
				test.log(LogStatus.FAIL, "The body text in the saving tile is NOT displayed or it is NOT as expecteed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Saving Tile Body could not be located");
		}
		
		try {
			String actualSavingLearnMore = privatePage.savingTileLearnMore.getText();
			softAssert.assertEquals(actualSavingLearnMore, "Learn more");
			if (actualSavingLearnMore.equals("Learn more")) {
				test.log(LogStatus.PASS, "The text 'Learn more' is displayed on the Saving tile");
			} else {
				test.log(LogStatus.FAIL, "The text 'Learn more' is NOT displayed on the Saving tile");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Saving Learn more could not be located");
		}
		
		try {
			WebElement savingArrow = privatePage.savingTileArrow;
			softAssert.assertTrue(savingArrow.isDisplayed());
			if (savingArrow.isDisplayed()) {
				test.log(LogStatus.PASS, "The arrow image is displayed on the Saving tile");
			} else {
				test.log(LogStatus.FAIL, "The arrow image is NOT displayed on the Saving tile");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for saving Arrow could not be located");
		}
		
		// Check Investments Tile
		try {
			String expectedInvestmentsTileHeader = "Investments";
			String actualInvestmentsTileHeader = privatePage.InvestmentsTileHeader().getText();
			softAssert.assertEquals(actualInvestmentsTileHeader, expectedInvestmentsTileHeader);
			if (expectedInvestmentsTileHeader.equals(actualInvestmentsTileHeader)) {
				test.log(LogStatus.PASS, "The Investments tile header is " + actualInvestmentsTileHeader + " as expected");
			} else {
				test.log(LogStatus.FAIL, "The Investments tile header is NOT as expected. The display actualy is "
						+ actualInvestmentsTileHeader);
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Investments Tile Header could not be located");
		}
		
		try {
			
			WebElement investmentTileImage = privatePage.investmentTileImage();
			softAssert.assertTrue(investmentTileImage.isDisplayed());
			if(investmentTileImage.isDisplayed()){
				test.log(LogStatus.PASS, "The Investments tile image is displayed as expected");
			}else{
				test.log(LogStatus.PASS, "The Investments tile image is NOT displayed as expected");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Investments Tile image could not be located");
		}
		
		try {
			String expectedInvestmentsTileBody = "There's only so much money you can earn just by going to work. You also need to get the money you have saved working for you while you are doing your job, and that's why you invest.";
			String actualInvestmentsTileBody = privatePage.InvestmentTileDescription().getText();
			softAssert.assertEquals(actualInvestmentsTileBody, expectedInvestmentsTileBody);
			if (expectedInvestmentsTileBody.equals(actualInvestmentsTileBody)) {
				test.log(LogStatus.PASS, "The body text in the Investments tile is displayed and it is as expecteed");
			} else {
				test.log(LogStatus.FAIL,
						"The body text in the Investments tile is NOT displayed or it is NOT as expecteed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Investments Tile Body could not be located");
		}
				
		try {
			String actualInvestmentsLearnMore = privatePage.InvestmentTileLearnMore().getText();
			softAssert.assertEquals(actualInvestmentsLearnMore, "Learn more");
			if (actualInvestmentsLearnMore.equals("Learn more")) {
				test.log(LogStatus.PASS, "The text 'Learn more' is displayed on the Investments tile");
			} else {
				test.log(LogStatus.FAIL, "The text 'Learn more' is NOT displayed on the Investments tile");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Investments Learn more could not be located");
		}
		
		try {
			WebElement investmentsArrow = privatePage.InvestmentTileArrow();
			softAssert.assertTrue(investmentsArrow.isDisplayed());
			if (investmentsArrow.isDisplayed()) {
				test.log(LogStatus.PASS, "The arrow image is displayed on the Investments tile");
			} else {
				test.log(LogStatus.FAIL, "The arrow image is NOT displayed on the Investments tile");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for investments Arrow could not be located");
		}
		
		// Check Retirement Tile
		try {
			String expectedRetirementTileHeader = "Retirement";
			String actualRetirementTileHeader = privatePage.RetirementTileHeader().getText();
			softAssert.assertEquals(actualRetirementTileHeader, expectedRetirementTileHeader);
			if (expectedRetirementTileHeader.equals(actualRetirementTileHeader)) {
				test.log(LogStatus.PASS, "The Retirement tile header is " + actualRetirementTileHeader + " as expected");
			} else {
				test.log(LogStatus.FAIL, "The Retirement tile header is NOT as expected. The display actualy is "
						+ actualRetirementTileHeader);
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Retirement Tile Header could not be located");
		}
		
		try {
			
			WebElement retirementTileImage = privatePage.RretirementTileImage();
			softAssert.assertTrue(retirementTileImage.isDisplayed());
			if(retirementTileImage.isDisplayed()){
				test.log(LogStatus.PASS, "The Retirement Tile Image is displaied as expected");
			}else{
				test.log(LogStatus.PASS, "The Retirement Tile Image is NOT displaied");				
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Retirement Tile image could not be located");
		}
		
		try {
			WebElement retirementTileImage = privatePage.RretirementTileImage();
			softAssert.assertTrue(retirementTileImage.isDisplayed());
			if (retirementTileImage.isDisplayed()) {
				test.log(LogStatus.PASS, "The image on Retirement tile is displayed");
			} else {
				test.log(LogStatus.FAIL, "The image on Retirement tile is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for retirement Tile Image could not be located");
		}
		
		try {
			String expectedRetirementTileBody = "If we don't save now then it won't be there waiting at retirement. If plans start earlier then things are much easier.";
			String actualRetirementTileBody = privatePage.RretirementTileDescription().getText();
			softAssert.assertEquals(actualRetirementTileBody, expectedRetirementTileBody);
			if (expectedRetirementTileBody.equals(actualRetirementTileBody)) {
				test.log(LogStatus.PASS, "The body text in the Retirement tile is displayed and it is as expecteed");
			} else {
				test.log(LogStatus.FAIL, "The body text in the Retirement tile is NOT displayed or it is NOT as expecteed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Retirement Tile Body could not be located");
		}
		
		try {
			String actualRetirementLearnMore = privatePage.retirementTileLearnMore.getText();
			softAssert.assertEquals(actualRetirementLearnMore, "Learn more");
			if (actualRetirementLearnMore.equals("Learn more")) {
				test.log(LogStatus.PASS, "The text 'Learn more' is displayed on the Retirement tile");
			} else {
				test.log(LogStatus.FAIL, "The text 'Learn more' is NOT displayed on the Retirement tile");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Retirement Learn more could not be located");
		}
		
		try {
			WebElement retirementArrow = privatePage.RretirementTileArrow();
			softAssert.assertTrue(retirementArrow.isDisplayed());
			if (retirementArrow.isDisplayed()) {
				test.log(LogStatus.PASS, "The arrow image is displayed on the Retirement tile");
			} else {
				test.log(LogStatus.FAIL, "The arrow image is NOT displayed on the Retirement tile");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for retirement Arrow could not be located");
		}
		
		// Check Life's events Tile
		try {
			String expectedLifeEventsTileHeader = "Life's events";
			String actualLifeEventsTileHeader = privatePage.lifeEventsTileHeader.getText();
			softAssert.assertEquals(actualLifeEventsTileHeader, expectedLifeEventsTileHeader);
			if (expectedLifeEventsTileHeader.equals(actualLifeEventsTileHeader)) {
				test.log(LogStatus.PASS, "The Life's Events tile header is " + actualLifeEventsTileHeader + " as expected");
			} else {
				test.log(LogStatus.FAIL, "The Life's Events tile header is NOT as expected. The display actualy is "
						+ actualLifeEventsTileHeader);
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Life Events Tile Header could not be located");
		}
		
		try {
			WebElement lifeEventsTileImage = privatePage.LifeEventsTileImage();
			softAssert.assertTrue(lifeEventsTileImage.isDisplayed());
			if (lifeEventsTileImage.isDisplayed()) {
				test.log(LogStatus.PASS, "The image on Life's Events tile is displayed");
			} else {
				test.log(LogStatus.FAIL, "The image on Life's Events tile is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for life Events Tile Image could not be located");
		}
		
		try {
			String expectedLifeEventsTileBody = "Whether we are consciously aware of it or not we all have our lives planned well into the future, with our dreams, hopes and expectations mapped out to an extent until the end of our lives.";
			String actualLifeEventsTileBody = privatePage.LifeEventsTileDescription().getText();
			softAssert.assertEquals(actualLifeEventsTileBody, expectedLifeEventsTileBody);
			if (expectedLifeEventsTileBody.equals(actualLifeEventsTileBody)) {
				test.log(LogStatus.PASS, "The body text in the Life's Events tile is displayed and it is as expecteed");
			} else {
				test.log(LogStatus.FAIL,
						"The body text in the Life's Events tile is NOT displayed or it is NOT as expecteed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Life Events Tile Body could not be located");
		}
		
		try {
			String actualLifeEventsLearnMore = privatePage.LifeEventsTileLearnMore().getText();
			softAssert.assertEquals(actualLifeEventsLearnMore, "Learn more");
			if (actualLifeEventsLearnMore.equals("Learn more")) {
				test.log(LogStatus.PASS, "The text 'Learn more' is displayed on the Life Events tile");
			} else {
				test.log(LogStatus.FAIL, "The text 'Learn more' is NOT displayed on the Life Events tile");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Life Events Learn more could not be located");
		}
		
		try {
			WebElement lifeEventsArrow = privatePage.LifeEventsTileArrow();
			softAssert.assertTrue(lifeEventsArrow.isDisplayed());
			if (lifeEventsArrow.isDisplayed()) {
				test.log(LogStatus.PASS, "The arrow image is displayed on the Life Events tile");
			} else {
				test.log(LogStatus.FAIL, "The arrow image is NOT displayed on the Life Events tile");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for life Events Arrow could not be located");
		}
		
		// Check section 4 Heading
		try {
			String expectedtSection4Header = "A three step journey...";
			String actualSection4Header = privatePage.PrivatePageSection4Header().getText();
			softAssert.assertEquals(actualSection4Header, expectedtSection4Header);
			if (expectedtSection4Header.equals(actualSection4Header)) {
				test.log(LogStatus.PASS, "The header in section 4 on the private home page is as expected");
			} else {
				test.log(LogStatus.FAIL, "The header in section 4 on the private home page is NOT as expected");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Section4 Header could not be located");
		}
		

		// Check 'Discover' tile in section 4

		//Image
		try {
			WebElement discoverImage = privatePage.PrivatePageDiscoverImage();
			softAssert.assertTrue(discoverImage.isDisplayed());
			if (discoverImage.isDisplayed()) {
				test.log(LogStatus.PASS, "The image on the Discover tile is displayed");
			} else {
				test.log(LogStatus.FAIL, "The image on the Discover tile is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for discover Image could not be located");
		}
		

		//Header
		try {
			String expectedDiscoverText = "Discover";
			String actualDiscoverText = privatePage.PrivateDiscoverTileHeader().getText();
			softAssert.assertEquals(actualDiscoverText, expectedDiscoverText);
			if (actualDiscoverText.equals(expectedDiscoverText)) {
				test.log(LogStatus.PASS, "Discover tile header is displayed, and it is: '" + actualDiscoverText + "'");
			} else {
				test.log(LogStatus.FAIL, "Discover tile header is NOT displayed");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Discover Text could not be located");
		}
		
		//Description
		try {
			String expectedDiscoverDescription = "Build your understanding of important financial and lifestyle planning ideas.";
			String actualDiscoverDescription = privatePage.privateDiscoverBody.getText();
			softAssert.assertEquals(actualDiscoverDescription, expectedDiscoverDescription);
			if (expectedDiscoverDescription.equals(actualDiscoverDescription)) {
				test.log(LogStatus.PASS, "The description of Discovery tile on Private page is correct");
			} else {
				test.log(LogStatus.FAIL, "The description of Discovery tile on Private page is NOT correct");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "The element for Discover Description could not be located");
		}
		

		// Check 'Measure and plan' tile in section 4

		// Check 'Make it happen' tile in section 4

		// Check footer links

	}

	@AfterTest
	public void afterTest() {
		report.endTest(test);
		report.flush();
		driver.quit();
		softAssert.assertAll();

	}

}
