package wealthsenseSiteTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivateHomePageFactory {

	WebDriver driver;

	////////////// Private Page Header //////////////
	@FindBy(xpath = ".//div//h1//a//div//img[@class = 'site-logo']")
	WebElement privateSiteLogo;

	@FindBy(xpath = ".//div//form//input[@id='searchInput']")
	WebElement watsonSearch;

	@FindBy(xpath = ".//div[@id='searchButton']/input")
	WebElement watsonSubmitButton;

	@FindBy(xpath = ".//div//img[@id='userIcon']")
	WebElement privateSiteUserIcon;

	@FindBy(xpath = ".//div//span[@id='userName']")
	WebElement privateSiteUsername;

	////////////// Private Page body content //////////////
	@FindBy(xpath = ".//div[@id='main-banner-homepage']")
	WebElement privateSiteSection1Image;

	@FindBy(xpath = ".//div//p[@id='banner-heading-h1-homepage']")
	WebElement privateSiteSectio1Header;

	@FindBy(xpath = ".//div[@id='video-home-page-container']//p//iframe")
	WebElement privateSiteSection2Video;

	@FindBy(xpath = ".//div/a/div[contains(text(),'Saving')]")
	WebElement savingTileHeader;

	@FindBy(xpath = ".//div[@id='large_tile-hyci_']//a/div[2]//img")
	WebElement savingTileImage;

	@FindBy(xpath = ".//div//a/div[contains(text(),'When planning our lives or planning our wealth')]")
	WebElement savingTileDescription;

	@FindBy(xpath = ".//div[@id = 'layout-column_column-3']//div/a//div[contains(text(),'Learn')]")
	WebElement savingTileLearnMore;

	@FindBy(xpath = ".//div[@id = 'layout-column_column-3']//a//div[@class = 'rounded_rectangle_large_tile_cell_image']//img")
	WebElement savingTileArrow;

	@FindBy(xpath = ".//div//a//div[contains(text(),'Investments')]")
	WebElement investmentsTileHeader;

	@FindBy(xpath = ".//div[@id='large_tile-ldsw_']//a/div[2]/img")
	WebElement investmentTileImage;

	@FindBy(xpath = ".//div//a/div[contains(text(),'only so much money you can earn')]")
	WebElement investmentTileDescription;

	@FindBy(xpath = ".//div[@id = 'layout-column_column-4']//div/a//div[contains(text(),'Learn')]")
	WebElement investmentTileLearnMore;

	@FindBy(xpath = ".//div[@id = 'layout-column_column-4']//a//div[@class = 'rounded_rectangle_large_tile_cell_image']//img")
	WebElement investmentTileArrow;

	@FindBy(xpath = ".//div//a/div[contains(text(),'Retirement')]")
	WebElement retirementTileHeader;

	@FindBy(xpath = ".//div[@id='large_tile-bemp_']//a/div[2]/img")
	WebElement retirementTileImage;

	@FindBy(xpath = ".//div//a/div[contains(text(),'save now then it')]")
	WebElement retirementTileDescription;

	@FindBy(xpath = ".//div[@id = 'layout-column_column-5']//div/a//div[contains(text(),'Learn')]")
	WebElement retirementTileLearnMore;

	@FindBy(xpath = ".//div[@id = 'layout-column_column-5']//a//div[@class = 'rounded_rectangle_large_tile_cell_image']//img")
	WebElement retirementTileArrow;

	@FindBy(xpath = ".//div//a//div[contains(text(),'Life')]")
	WebElement lifeEventsTileHeader;

	@FindBy(xpath = ".//div[@id='large_tile-objk_']//a/div[2]/img")
	WebElement lifeEventsTileImage;

	@FindBy(xpath = ".//div//a/div[contains(text(),'Whether we are consciously aware of it or not we all have our lives')]")
	WebElement lifeEventsTileDescription;

	@FindBy(xpath = ".//div[@id = 'layout-column_column-6']//div/a//div[contains(text(),'Learn')]")
	WebElement lifeEventsTileLearnMore;

	@FindBy(xpath = ".//div[@id = 'layout-column_column-6']//a//div[@class = 'rounded_rectangle_large_tile_cell_image']//img")
	WebElement lifeEventsTileArrow;

	@FindBy(xpath = ".//div//p[contains(text(),'A three step journey')]")
	WebElement privatePageSection4Header;

	@FindBy(xpath = ".//div[@id='column-8']//span/img")
	WebElement privatePageDiscoverImage;

	@FindBy(xpath = ".//div//p//span[contains(text(),'Discover')]")
	WebElement privateDiscoverTileHeader;

	@FindBy(xpath = ".//div//p[contains(text(),'Build your')]")
	WebElement privateDiscoverBody;

	@FindBy(xpath = ".//div[@id='column-9']//span/img")
	WebElement privatePageMeasureAndPlanImage;

	@FindBy(xpath = ".//div//p//span[contains(text(),'Measure')]")
	WebElement privateMeasureAndPlanTileHeader;

	@FindBy(xpath = ".//div//p[contains(text(),'Use our')]")
	WebElement privateMeasureAndPlanBody;

	@FindBy(xpath = ".//div[@id='column-10']//span/img")
	WebElement privatePageMakeItHappenImage;

	@FindBy(xpath = ".//div//p//span[contains(text(),'Make it')]")
	WebElement privateMakeItHappenTileHeader;

	@FindBy(xpath = ".//div//p[contains(text(),'Take action')]")
	WebElement privateMakeItHappenBody;

	////////////// Private Page footer //////////////
	@FindBy(xpath = ".//div/footer//div//nav//li[1]//a")
	WebElement privateFooterGlossary;

	@FindBy(xpath = ".//div/footer//div//nav//li[2]//a")
	WebElement privateFooterResources;

	@FindBy(xpath = ".//div/footer//div//nav//li[3]//a")
	WebElement privateFooterAboutIBM;

	@FindBy(xpath = ".//div/footer//div//nav//li[4]//a")
	WebElement privateFooterAboutUs;

	@FindBy(xpath = ".//div/footer//div//nav//li[5]//a")
	WebElement privateFooterSiteMap;

	@FindBy(xpath = ".//div/footer//div//nav//li[6]//a")
	WebElement privateFooterContactUs;

	@FindBy(xpath = ".//div/footer//div//nav//li[7]//a")
	WebElement privateFooterPweredBy;

	@FindBy(xpath = ".//div//footer//div//span[contains(text(),'Copyright Financial Synergy')]")
	WebElement privateFooterCopyRight;

	@FindBy(xpath = ".//div//footer//a[@id='privacy']")
	WebElement privateFooterPrivacy;

	@FindBy(xpath = ".//div//footer//a[@id='disclaimer']")
	WebElement privateFooterDisclaimer;

	public PrivateHomePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement PrivateSiteLogo() {
		return privateSiteLogo;
	}

	public void ClickPrivateSiteLogo() {
		privateSiteLogo.click();
	}

	public WebElement WatsonSearch() {
		return watsonSearch;
	}

	public WebElement WatsonSubmitButton() {
		return watsonSubmitButton;
	}

	public WebElement PrivateSiteUserIcon() {
		return privateSiteUserIcon;
	}

	public void ClickUserIcon() {
		privateSiteUserIcon.click();
	}

	public WebElement PrivateSiteUsername() {
		return privateSiteUsername;
	}

	public void ClcikUsername() {
		privateSiteUsername.click();
	}

	public WebElement PrivateSiteSection1Image() {
		return privateSiteSection1Image;
	}

	public WebElement PrivateSiteSectio1Header() {
		return privateSiteSectio1Header;
	}

	public WebElement PrivateSiteSection2Video() {
		return privateSiteSection2Video;
	}

	public WebElement SavingTileHeader() {
		return savingTileHeader;
	}

	public void ClickSavingTile() {
		savingTileHeader.click();
	}

	public WebElement SavingTileImage() {
		return savingTileImage;
	}

	public WebElement SavingTileDescription() {
		return savingTileDescription;
	}

	public WebElement SavingTileLearnMore() {
		return savingTileLearnMore;
	}

	public WebElement SavingTileArrow() {
		return savingTileArrow;
	}

	public WebElement InvestmentsTileHeader() {
		return investmentsTileHeader;
	}

	public void ClickInvestmentsTile() {
		investmentsTileHeader.click();
		;
	}

	public WebElement investmentTileImage() {
		return investmentTileImage;
	}

	public WebElement InvestmentTileDescription() {
		return investmentTileDescription;
	}

	public WebElement InvestmentTileLearnMore() {
		return investmentTileLearnMore;
	}

	public WebElement InvestmentTileArrow() {
		return investmentTileArrow;
	}

	public WebElement RetirementTileHeader() {
		return retirementTileHeader;
	}

	public void ClickRetirementTile() {
		retirementTileHeader.click();
	}

	public WebElement RretirementTileImage() {
		return retirementTileImage;
	}

	public WebElement RretirementTileDescription() {
		return retirementTileDescription;
	}

	public WebElement RretirementTileLearnMore() {
		return retirementTileLearnMore;
	}

	public WebElement RretirementTileArrow() {
		return retirementTileArrow;
	}

	public WebElement LifeEventsTileHeader() {
		return lifeEventsTileHeader;
	}

	public void clickLifeEventsTile() {
		lifeEventsTileHeader.click();
	}

	public WebElement LifeEventsTileImage() {
		return lifeEventsTileImage;
	}

	public WebElement LifeEventsTileDescription() {
		return lifeEventsTileDescription;
	}

	public WebElement LifeEventsTileLearnMore() {
		return lifeEventsTileLearnMore;
	}

	public WebElement LifeEventsTileArrow() {
		return lifeEventsTileArrow;
	}

	public WebElement PrivatePageSection4Header() {
		return privatePageSection4Header;
	}

	public WebElement PrivatePageDiscoverImage() {
		return privatePageDiscoverImage;
	}

	public WebElement PrivateDiscoverTileHeader() {
		return privateDiscoverTileHeader;
	}

	public WebElement PrivateDiscoverBody() {
		return privateDiscoverBody;
	}

	public WebElement PrivatePageMeasureAndPlanImage() {
		return privatePageMeasureAndPlanImage;
	}

	public WebElement PrivateMeasureAndPlanTileHeader() {
		return privateMeasureAndPlanTileHeader;
	}

	public WebElement PrivateMeasureAndPlanBody() {
		return privateMeasureAndPlanBody;
	}

	public WebElement PrivatePageMakeItHappenImage() {
		return privatePageMakeItHappenImage;
	}

	public WebElement PrivateMakeItHappenTileHeader() {
		return privateMakeItHappenTileHeader;
	}

	public WebElement PrivateMakeItHappenBody() {
		return privateMakeItHappenBody;
	}

	public WebElement PrivateFooterGlossary() {
		return privateFooterGlossary;
	}

	public void ClickGlossary() {
		privateFooterGlossary.click();
	}

	public WebElement PrivateFooterResources() {
		return privateFooterResources;
	}

	public void ClickResources() {
		privateFooterResources.click();
	}

	public WebElement privateFooterAboutIBM() {
		return privateFooterAboutIBM;
	}

	public void ClickAboutIBM() {
		privateFooterAboutIBM.click();
	}

	public WebElement privateFooterAboutUs() {
		return privateFooterAboutUs;
	}

	public void ClickAboutUs() {
		privateFooterAboutUs.click();
	}

	public WebElement privateFooterSiteMap() {
		return privateFooterSiteMap;
	}

	public void ClickSiteMap() {
		privateFooterSiteMap.click();
	}

	public WebElement privateFooterContactUs() {
		return privateFooterContactUs;
	}

	public void ClickContactUs() {
		privateFooterContactUs.click();
	}

	public WebElement PrivateFooterPweredBy() {
		return privateFooterPweredBy;
	}

	public WebElement PrivateFooterCopyRight() {
		return privateFooterCopyRight;
	}

	public WebElement PrivateFooterPrivacy() {
		return privateFooterPrivacy;
	}

	public void ClickPrivacy() {
		privateFooterPrivacy.click();
	}

	public WebElement PrivateFooterDisclaimer() {
		return privateFooterDisclaimer;
	}

	public void ClickDisclaimer() {
		privateFooterDisclaimer.click();
	}

}
