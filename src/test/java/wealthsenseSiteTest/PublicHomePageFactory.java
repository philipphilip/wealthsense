package wealthsenseSiteTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PublicHomePageFactory {

	WebDriver driver;

	// 1
	@FindBy(xpath = ".//div[@id='header_row']//h1//img")
	WebElement homeLogo;
	// 2
	@FindBy(xpath = ".//div/span[@id='alreadyMember']")
	WebElement alreadyMember;
	// 3
	@FindBy(xpath = ".//div[@class='span4 offset5 pull-right']//a")
	WebElement loginLink;
	
	@FindBy(xpath = ".//div[@id='main-banner-homepage']")
	WebElement section1Banner;
	// 4
	@FindBy(xpath = ".//div/h2[@id='banner-heading-h1-homepage']")
	WebElement section1Header;
	// 5
	@FindBy(xpath = ".//div//p[@id='banner-paragraph-p-homepage'][contains(text(),'Your money is important, so be better informed!')]")
	WebElement section1Body;
	// 6
	@FindBy(xpath = ".//div//button[@id='register-now-button']")
	WebElement regButton1;
	//			.//div//button[@id='register-now-button'][contains(text(),'Register Now')]")
	// 7
	@FindBy(xpath = ".//div[@id='video-home-page-container']//div[@class='video-wrapper']")
	WebElement section2Video;
	// 8
	@FindBy(xpath = ".//div[@id='a-three-step-journey-container']//div[@class='row']")
	WebElement section3Header;
	// 9
	@FindBy(xpath = ".//div[@class='container-fluid hidden-desktop']//p[@id='three-step-journey-heading-p']")
	WebElement journeyHeading;
	// 10
	@FindBy(xpath = ".//div[@class='container-fluid hidden-desktop']//p[@id='three-step-journey-description-p']")
	WebElement section3Description;
	// 11
	@FindBy(xpath = ".//div[@id='p_p_id_56_INSTANCE_WdXMEdR8vWY0_']//div//span//img")
	WebElement discoverImage;
	// 12
	@FindBy(xpath = ".//div//p//span[contains(text(),'Discover')]")
	WebElement discoverText;
	// ??
	@FindBy(xpath = ".//div[@id='p_p_id_56_INSTANCE_WdXMEdR8vWY0_']//div[@class='how_it_works_text']//p")
	WebElement discoverDescription;
	// 13
	@FindBy(xpath = ".//div[@id='p_p_id_56_INSTANCE_ry4nmu1MfDGn_']//div//span//img")
	WebElement measureAndplanImage;
	// 14
	@FindBy(xpath = ".//div//p//span[contains(text(),'Measure and plan')]")
	WebElement measureAndplanText;
	
	@FindBy(xpath = ".//div[@class='how_it_works_text']//p[contains(text(),'Use our calculators')]")
	WebElement measureAndPlanDescription;
	
	// 15
	@FindBy(xpath = ".//div[@id='p_p_id_56_INSTANCE_q3d0DfD5zpEs_']//div//span//img")
	WebElement makeItHappenImage;
	
	@FindBy(xpath= ".//div[@class='how_it_works_text']//p[contains(text(),'Take action to make')]")
	WebElement makeItHappenDescription;
	
	// 16
	@FindBy(xpath = ".//div//p//span[contains(text(),'Make it happen')]")
	WebElement makeItHappenText;
	
	@FindBy(xpath = ".//div[@id='footer-banner-homepage']")
	WebElement footerBanner;
		
	// 17
	@FindBy(xpath = ".//div/a/p[@id='register-now-footer']")
	WebElement registerNowFooter;
	// 18
	@FindBy(xpath = ".//div/p[@id='content-footer-h1-homepage-public'][contains(text(),'get you started')]")
	WebElement letGetYouStarted;
	// 19
	@FindBy(xpath = ".//div/footer//div//nav//ul/li//a[@id='contactUs']")
	WebElement publicFooterContactUs;
	// 20
	@FindBy(xpath = ".//div/footer//div/ul/li/a[@id='privacy']")
	WebElement publicFooterPrivacy;
	// 21
	@FindBy(xpath = ".//div/footer//div/ul/li/a[@id='disclaimer']")
	WebElement publicFooterDisclaimer;
	// 22
	@FindBy(xpath = ".//div/footer//div/span[contains(text(),'Copyright Financial Synergy 2016')]")
	WebElement publicFooterCopyRight;
	// 23
	@FindBy(xpath = ".//div//p[@id='paragraph-heading']")
	WebElement privacyPopUpTitle;
	// 24
	String publicUrl = "http://directionsuper.objectconsulting.com.au:8081/home";
	// 25
	@FindBy(xpath = ".//div//p[@id='paragraph-heading']")
	WebElement disclaimerPopUpTitle;
	

	public PublicHomePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// 1
	public WebElement checkHomeLogo() {
		return homeLogo;
	}

	// 2
	public WebElement checkAlreadyMemberText() {
		return alreadyMember;

	}

	// 3
	public WebElement checkLogginLink() {
		return loginLink;

	}
	
	
	public WebElement Section1Banner() {
		return section1Banner;

	}
	
	

	// 4
	public WebElement checkSection1Header() {
		return section1Header;

	}

	// 5
	public WebElement checkSection1Body() {
		return section1Body;

	}

	// 6
	public WebElement checkRegButton1() {
		return regButton1;
	}

	// 7
	public WebElement checkSection2Video() {
		return section2Video;
	}

	// 8
	public WebElement checkSection3Header() {

		return section3Header;
	}

	// 9
	public WebElement checkJourneyHeading() {
		return journeyHeading;
	}

	// 10
	public WebElement checkSection3Description() {

		return section3Description;
	}

	// 11
	public WebElement checkDiscoverImage() {

		return discoverImage;
	}

	// 12
	public WebElement checkDiscoverText() {

		return discoverText;
	}

	// 13
	public WebElement checkMeasureAndplanImage() {

		return measureAndplanImage;
	}

	// 14
	public WebElement checkMeasureAndplanText() {

		return measureAndplanText;
	}

	public WebElement measureAndPlanDescription(){
		return 	measureAndPlanDescription;
	}
	
	// 15
	public WebElement checkMakeItHappenImage() {

		return makeItHappenImage;
	}
	
	public WebElement makeItHappenDescription(){
		return makeItHappenDescription;
	}

	// 16
	public WebElement checkMakeItHappenText() {

		return makeItHappenText;
	}

	
	public WebElement FooterBanner() {

		return footerBanner;
	}
	
	
	// 17
	public WebElement checkRegisterNowFooter() {

		return registerNowFooter;
	}

	// 18
	public WebElement checkLetGetYouStarted() {

		return letGetYouStarted;
	}

	// 19
	public WebElement checkPublicFooterContactUs() {

		return publicFooterContactUs;
	}

	// 20
	public WebElement checkPublicFooterPrivacy() {

		return publicFooterPrivacy;
	}

	// 21
	public WebElement checkPublicFooterDisclaimer() {

		return publicFooterDisclaimer;
	}

	// 22
	public WebElement checkPublicFooterCopyRight() {

		return publicFooterCopyRight;
	}

	// 23
		public WebElement privacyPopUpHeader() {

			return privacyPopUpTitle;
		}
	
	
	// 20a
	public void ClickPrivacyInFooter() {
		publicFooterPrivacy.click();
	}

	// 24
	public String PublicSite() {

		return publicUrl;
	}

	// 21a
	public void ClickDisclaimerInFooter() {
		publicFooterDisclaimer.click();
		
	}
	
	// 25
	public WebElement Disclaimertitle(){
		return privacyPopUpTitle;
	}
	
	public void clickRegisterNowbutton(){
		regButton1.click();
	}
	
	
	
}