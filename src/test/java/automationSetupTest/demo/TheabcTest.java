package automationSetupTest.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TheabcTest {

	WebDriver driver;
	String baseurl = "http://www.abc.net.au/news/";

	@BeforeTest
	public void openBowersForABCTest() {
		driver = new FirefoxDriver();
		driver.get(baseurl);

	}

	@Test(groups = { "one", "alpha" })
	public void getABCNewPageTitle() {
		String title1 = driver.getTitle();
		System.out.println("This test case is the 'Using TestNG' suit");
		System.out.println("The site tested here is the ABC news");
		Assert.assertEquals(title1, "ABC News (Australian Broadcasting Corporation)");
	}

	// @Test
	// public void compareABCPageTiletoWongTitle() {
	// String title1 = driver.getTitle();
	// // System.out.println("The title of the page is: " + title1);
	// Assert.assertEquals(title1, "ABC News");
	// }

	@AfterTest
	public void closebrowsers() {

	}

}
