package automationSetupTest.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ebaytest {

	WebDriver driver;
	String baseurl = "http://www.ebay.com.au/";

	@BeforeTest
	public void openBrowserForEbayTesting() {
		driver = new FirefoxDriver();
		driver.get(baseurl);

	}

	@Test(groups = { "two", "beta" })
	public void getEbayPageTitle() {
		String title1 = driver.getTitle();
		System.out.println("The site tested here is the ebay");
		Assert.assertEquals(title1, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
	}

	@Test
	public void compareEbayPageTiletoWongTitle() {
		// String title1 = driver.getTitle();
		// System.out.println("The title of the page is: " + title1);
		// Assert.assertEquals(title1, "ABC News");
	}

	@AfterTest
	public void closebrowsers() {

	}

}
