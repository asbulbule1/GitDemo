package web.pages.orgadmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import util.Selenium;

@SuppressWarnings("unused")
public class OrgAdminDashboardPage {
	private WebDriver driver;
	private Selenium selUtil;

	// header[@class='row headerblue']//h1[contains(text(),'Welcome')]
//	@FindBy(how = How.CLASS_NAME, using = "welcome-title")
	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Welcome')]")
	private WebElement welcomeTitle;

	@FindBy(how = How.XPATH, using = "//div[@id='needChildPhotosPopup']//button[@class='close']")
	private WebElement ChildPhotosPopupCloseButton;

	@FindBy(how = How.XPATH, using = "//span[@class='logout']/a")
	private WebElement logoutButton;

	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'navbar-brand insight_logo')]/img[@alt='Hatch Insight']")
	private WebElement hatch_Insight_Logo;

	@FindBy(how = How.ID, using = "navbarreportsdropdown")
	private WebElement report_Menu_Present;

	@FindBy(how = How.ID, using = "navbarchildrendropdown")
	private WebElement org_Management_Menu_Present;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'CLASS MANAGEMENT')]")
	private WebElement class_Management_Menu_Present;

	@FindBy(how = How.XPATH, using = "(//*[@id='navbaraccountdropdown'])[2]")
	private WebElement account_Menu_Present;

	@FindBy(how = How.XPATH, using = "//*[@class='nav-link']")
	private WebElement hatch_Hub_Present;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Ignite by Hatch')]")
	private WebElement select_Ignite_By_Hatch_Utilization;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Average Demonstrated')]")
	private WebElement select_Average_Demonstrated_Panel;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Professional Development')]")
	private WebElement select_Professional_Development;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Support Needed')]")
	private WebElement select_Support_Needed;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Average Play Time')]")
	private WebElement select_Average_Play_Time;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Are You')]")
	private WebElement select_Are_You_Gold_User;

	@FindBy(how = How.ID, using = "current_yr")
	private WebElement select_Current_Year;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'HatchEarlyLearning.com')]")
	private WebElement select_Hatch_Learning_link;

	@FindBy(how = How.XPATH, using = "//p[@class='footerleft']/span[@class='contact_span']")
	private WebElement select_Hatch_Learning_contact_no;

	@FindBy(how = How.XPATH, using = "//span/a[contains(text(),'Terms Of')]")
	private WebElement select_Tearms_Of_Use;

	@FindBy(how = How.XPATH, using = "//span/a[contains(text(),'Privacy Policy')]")
	private WebElement select_Privacy_Policy;

	public OrgAdminDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

		selUtil = new Selenium(driver);
	}

	public boolean isHomePageOpen() {
		try {
			selUtil.waitUntilElementIsPresentOnPage(10, ChildPhotosPopupCloseButton);
			// close if any popup window opens
			if (ChildPhotosPopupCloseButton.isDisplayed()) {
				ChildPhotosPopupCloseButton.click();
			} else {
				System.out.println("popclosebutton not found!");
			}
		} catch (Exception e) {
			System.out.println("popup not found");
		}

		return selUtil.isElementExists(welcomeTitle);
	}

	public void clickLogout() {
		logoutButton.click();
	}

	public void hatchInsightlogoPresent() {
		Assert.assertTrue(hatch_Insight_Logo.isDisplayed());
	}

	public void verifyReportMenuPressent(String expectedHeader1) {
		Assert.assertEquals(report_Menu_Present.getText(), expectedHeader1);
	}

	public void orgManagementMenuPresent(String expectedHeader2) {
		Assert.assertEquals(org_Management_Menu_Present.getText(), expectedHeader2);
	}

	public void accountMenuPresent(String expectedAccount) {
		Assert.assertEquals(account_Menu_Present.getText(), expectedAccount);
	}

	public void hatchHubTextPresent(String expectedHatchHub) {
		Assert.assertEquals(hatch_Hub_Present.getText(), expectedHatchHub);
	}

	public void igniteByHatchUtilizationTilePresent(String expectedIgniteByHatchUtilization) {
		Assert.assertEquals(select_Ignite_By_Hatch_Utilization.getText(), expectedIgniteByHatchUtilization);
	}

	public void averageDemonstratedPanelPresent(String expectedAverageDemonstarted) {
		Assert.assertTrue(select_Average_Demonstrated_Panel.getText().contains(expectedAverageDemonstarted));
	}

	public void professionalDevelopmentPanelPresent(String expectedProfessionalDevelopment) {
		Assert.assertEquals(select_Professional_Development.getText(), expectedProfessionalDevelopment);
	}

	public void supportNeededPanelPresent(String expectedSupportNeeded) {
		Assert.assertTrue(select_Support_Needed.getText().contains(expectedSupportNeeded));
	}

	public void averagePlayTimePanelPresent(String expectedAveragePlaytime) {
		Assert.assertTrue(select_Average_Play_Time.getText().contains(expectedAveragePlaytime));
	}

	public void areYouGoldUserTilePresent(String expectedTSG) {
		Assert.assertTrue(select_Are_You_Gold_User.getText().contains(expectedTSG));
	}

	public void currentYearTextPrsent(String year) {
		Assert.assertEquals(select_Current_Year.getText(), year);
	}

	public void hatchLearningLinkTextPresent(String expectedHatchEarlyLearningLink) {
		Assert.assertEquals(select_Hatch_Learning_link.getText(), expectedHatchEarlyLearningLink);
	}

	public void hatchLearningContactNoPresent() {
		Assert.assertTrue(select_Hatch_Learning_contact_no.isDisplayed());
	}

	public void termsOfUseLinkPresent(String expectedTermsOfUseLink) {
		Assert.assertEquals(select_Tearms_Of_Use.getText(), expectedTermsOfUseLink);
	}

	public void privacyPolicyLinkPresent(String expectedPrivacyPolicyLink) {
		Assert.assertEquals(select_Privacy_Policy.getText(), expectedPrivacyPolicyLink);
	}
}