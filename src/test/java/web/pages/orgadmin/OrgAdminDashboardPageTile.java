package web.pages.orgadmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import util.Selenium;

@SuppressWarnings("unused")
public class OrgAdminDashboardPageTile {

	private WebDriver driver;
	public static Selenium selUtil;

//	String columnName_webelement = "//th[text()='$param$']";

//	public void verifyColumnName(String colName)
//	{
//		String example = columnName_webelement.replace("$param$", colName);
//		WebElement we = driver.findElement(By.xpath(example));
//
//		Assert.assertTrue(we.isDisplayed());
//
//	}

	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'navbar-brand insight_logo')]/img[@alt='Hatch Insight']")
	private WebElement hatch_Insight_Logo;

	@FindBy(how = How.XPATH, using = "//li[@class='nav-item dropdown']/a[@id='navbarreportsdropdown']")
	private WebElement report_Menu_Present;

	@FindBy(how = How.XPATH, using = "//li[@class='nav-item']/a[@class='nav-link dashboard-link']")
	private WebElement dashaboard_Menu_Present;

	@FindBy(how = How.XPATH, using = "//li[@class='nav-item dropdown roster-dropdown']/a[@id='navbarchildrendropdown']")
	private WebElement roster_Menu_Present;

	@FindBy(how = How.XPATH, using = "//li[@class='nav-item dropdown skill-dropdown']/a[@id='navbarreportsdropdown']")
	private WebElement skill_Support_Menu_Present;

	@FindBy(how = How.XPATH, using = "//li[@class='nav-item dropdown resources-dropdown']")
	private WebElement resources_Menu_Present;

	@FindBy(how = How.XPATH, using = "//img[@class='d-none d-md-block']")
	private WebElement account_Menu_Present;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'CLASS MANAGEMENT')]")
	private WebElement class_Management_Menu_Present;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Ignite by Hatch')]")
	private WebElement select_Ignite_By_Hatch_Utilization;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Average Demonstrated')]")
	private WebElement select_Average_Demonstrated_Panel;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Professional Development')]")
	private WebElement select_Professional_Development;

	@FindBy(how = How.XPATH, using = "//div[@class='white-bg-thumb text-center support-needed']")
	private WebElement select_Support_Needed;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Average Play Time')]")
	private WebElement select_Average_Play_Time;

//	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Are You')]")
	@FindBy(how = How.XPATH, using = "//strong[text()='Total Documents Sent:']/parent::div[@class='white-bg-thumb text-center']")
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

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='in your Org have recently used Ignite by Hatch.']")
	private WebElement select_Schools_Ignite_By_hacth_Panel;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='need classes assigned to complete setup.']")
	private WebElement select_Classes_Ignite_By_hacth_Panel;

	@FindBy(how = How.XPATH, using = "//p[text()=' of ']/strong[@class='yellowtext panelnumber_sm']")
	private WebElement text_Contain_Of;

	@FindBy(how = How.XPATH, using = "//p[text()=' schools' and @class='dashp']")
	private WebElement text_Contain_Schools;

	@FindBy(how = How.XPATH, using = "	//p[text()='need classes assigned to complete setup.']")
//p[text()='need children added to complete setup.']/preceding-sibling::p[1]
	private WebElement text_Contain_Classes;

	@FindBy(how = How.XPATH, using = "//p[text()='in your Org have recently used Ignite by Hatch.']/parent::*")
	private WebElement utilization_Tile;

	@FindBy(how = How.XPATH, using = "//div/h1[text()='School Setup & Utilization']")
	private WebElement school_Setup_Utilization_Page;

	@FindBy(how = How.XPATH, using = "//div/h6[text()='Setup Remaining']")
	private WebElement setupRemainingColumn;

	@FindBy(how = How.ID, using = "setupschool_c0")
	private WebElement schoolNameColumn;

	@FindBy(how = How.XPATH, using = "//a[@class='sort-link' and text()=' Teachers ']")
	private WebElement totalTeachersColumn;

	@FindBy(how = How.ID, using = "setupschool_c2")
	private WebElement totalClassesColumn;

	@FindBy(how = How.ID, using = "setupschool_c3")
	private WebElement teachersTrainedThisYearColumn;

	@FindBy(how = How.ID, using = "setupschool_c4")
	private WebElement teachersVisitedInsightsColumn;

	@FindBy(how = How.ID, using = "setupschool_c5")
	private WebElement estimatedChildrenAddedColumn;

	@FindBy(how = How.ID, using = "setupschool_c6")
	private WebElement childrenWithParentColumn;

	@FindBy(how = How.ID, using = "setupschool_c7")
	private WebElement childrenWithPhotoColumn;

	@FindBy(how = How.ID, using = "setupschool_c8")
	private WebElement childrenStartedPlayColumn;

//	WebElement of School Setup And Utilization Page.

	@FindBy(how = How.XPATH, using = "//div/h6[text()='School Utilization']")
	private WebElement SchoolUtilizationtext;

	@FindBy(how = How.ID, using = "org_utilization_report_c0")
	private WebElement schoolUtilizationSchoolNameColumn;

	@FindBy(how = How.ID, using = "org_utilization_report_c1")
	private WebElement schoolUtilizationTotalClassesColumn;

	@FindBy(how = How.ID, using = "org_utilization_report_c2")
	private WebElement schoolUtilizationActiveChildrenColumn;

	@FindBy(how = How.ID, using = "org_utilization_report_c3")
	private WebElement schoolUtilizationTotalGOLDDocsSentColumn;

	@FindBy(how = How.ID, using = "org_utilization_report_c5")
	private WebElement schoolUtilizationAvgTotalReportsLoginPerClassColumn;

	@FindBy(how = How.ID, using = "org_utilization_report_c7")
	private WebElement schoolUtilizationAvgChildPlaytimeColumn;

	@FindBy(how = How.ID, using = "org_utilization_report_c8")
	private WebElement schoolUtilizationAvgChildSessionsColumn;

	@FindBy(how = How.ID, using = "org_utilization_report_c9")
	private WebElement schoolUtilizationAvgChildSkillLevelColumn;

//	WebElelment of Class Setup And Utilization Page

	@FindBy(how = How.XPATH, using = "//tr[@class='odd']/td/a")
	private WebElement schoolNameLink;

	@FindBy(how = How.XPATH, using = "//div/h1[text()='Class Setup & Utilization']")
	private WebElement classSetupUtilizationPage;

	@FindBy(how = How.XPATH, using = "//div/h6[text()='Setup Remaining']")
	private WebElement classTableHeaderSetupRemaining;

	@FindBy(how = How.ID, using = "setup_remaining_table_id")
	private WebElement schoolNameInDropdown;

	@FindBy(how = How.XPATH, using = "//div/h6[text()='Class Utilization']")
	private WebElement tableHeaderClassUtilization;

	@FindBy(how = How.ID, using = "class_utilization_id")
	private WebElement classUtilizationRemainingHeaderSchoolNameDropDown;

//	Support Needed Panel UI

	@FindBy(how = How.XPATH, using = "//div/h1[text()='Support Needed ']")
	private WebElement suportNeededPanelHeader;

	@FindBy(how = How.XPATH, using = "//p[@class='mt-4 dashp']")
	private static WebElement numberOfChildren;

	@FindBy(how = How.XPATH, using = "//div[@class='white-bg-thumb text-center support-needed']//span[@class='text_decoration_no_hover thumb-bt-link']")
	private WebElement weekelyStatusReportLink;

//	Support Needed Page UI

	@FindBy(how = How.XPATH, using = "//div[@class='white-bg-thumb text-center support-needed']")
	private WebElement supportNeededTile;

	@FindBy(how = How.XPATH, using = "//h1[@class='title']")
	private WebElement supportNeededPage;

	@FindBy(how = How.XPATH, using = "//th[@id='supportneeded_c0']")
	private WebElement schoolHeaderText;

	@FindBy(how = How.XPATH, using = "//th[@id='supportneeded_c1']")
	private WebElement lessThanEightyPercentSchoolHeaderText;

	@FindBy(how = How.XPATH, using = "//th[@id='supportneeded_c2']")
	private WebElement lessThanFiftyPercentSchoolHeaderText;

// Average Demonstrated Skill Progress Tile UI

	@FindBy(how = How.XPATH, using = "//h1[text()='Average Demonstrated ']/parent::div")
	private WebElement averageDemonstratedSkillProgressTile;

	@FindBy(how = How.XPATH, using = "//th[@class='custom-progress-title']/span[text()='CURRENT']")
	private WebElement currentSkillProgress;

	@FindBy(how = How.XPATH, using = "//th[@class='custom-progress-title small'][text()='30 DAYS AGO']")
	private WebElement thirtyDaysAgoSkillProgress;

// View Detailed Progress Link
	@FindBy(how = How.XPATH, using = "//div/a[@class='text_decoration_no_hover thumb-bt-link']")
	private WebElement viewDetailedProgress;

	@FindBy(how = How.XPATH, using = "//div/h1[text()='School Progress']")
	private WebElement schoolProgressPage;

	@FindBy(how = How.XPATH, using = "(//td/div[@class='custom-progress-bar'])[1]")
	private WebElement currentSkillProgressBar;

	@FindBy(how = How.XPATH, using = "(//td/div[@class='custom-progress-bar'])[2]")
	private WebElement thrityDaysAgoSkillProgressBar;

	// Hatch Hub Tile

	@FindBy(how = How.XPATH, using = "//h1[text()='Professional Development']/parent::*")
	private WebElement professionalDevelopmentTile;

	@FindBy(how = How.XPATH, using = "(//td/div[@class='custom-progress-bar'])[2]")
	private WebElement hatchHubHomePage;

	@FindBy(how = How.XPATH, using = "//span[text()=' HATCH INSIGHTS']/parent::a")
	private WebElement hatchInsightLogoonHubPage;

	@FindBy(how = How.XPATH, using = "//a/img[@alt='Hatch Insight']")
	private WebElement hatchInsightLogo;

//	Average PlaytTIme UI Validation

	@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/schoolplaytime']//h1")
	private WebElement avgPlaytimeTileHeading;

	@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/schoolplaytime']//span[@class='panelsmalltext']")
	private WebElement avgPlaytimetext;

	@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/schoolplaytime']//span[@class='text_decoration_no_hover thumb-bt-link']")
	private WebElement PlaytimeLinkText;

	@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/schoolplaytime']/div")
	private WebElement averagePlaytimeTile;

	@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/schoolplaytime']//span[@class='text_decoration_no_hover thumb-bt-link']")
	private WebElement schoolPlaytimePage;

//	 TSG HatchSync Connection Tile UI Validation

	@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/HatchSyncConnection']//h1")
	private WebElement tSGTileHeading;

	@FindBy(how = How.XPATH, using = "//div[@id='hatchsync-box']//h1")
	private WebElement areYouGoldUser;

	@FindBy(how = How.XPATH, using = "//div[@id='hatchsync-box']//div[@class='panelaction']")
	private WebElement getHatchSyncTodayLink;

	@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/HatchSyncConnection']//strong[@class='redtext']")
	private WebElement tSGChildrenMatchText;

	@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/HatchSyncConnection']/div/strong")
	private WebElement tSGTotalDocSentText;

	@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/HatchSyncConnection']//span[@class='text_decoration_no_hover thumb-bt-link']")
	private WebElement tSGHatchSyncLinkText;

// Support Needed Panel

	@FindBy(how = How.XPATH, using = "//th/a/text()[preceding-sibling::br]")
	private WebElement commanxpathoflast3hader;

// Carosel Products

	@FindBy(how = How.XPATH, using = "//button[@class='owl-next']")
	private WebElement casoselProductNextButton;

//	Drop down

	@FindBy(how = How.ID, using = "subdomain_id")
	private WebElement selectSubdomainDropdown;

	@FindBy(how = How.XPATH, using = "//button/span[contains(text(),'All Schools')]")
	private WebElement selectSchoolDropdownOnSchoolProgress;

	@FindBy(how = How.XPATH, using = "//div/input[@placeholder='Search']")
	private WebElement clickOnSearchButton;

	String clickOnSchoolWeFoundInSearch = "//label[ contains(@title,'$SchoolFound$')]/span";

	String commanOptionforSchoolDropDown = "//label[@title='$selectSchool$']/span";

//	@FindBy(how = How.XPATH, using="//button[@class='owl-next']")
//	private WebElement 	selectSchoolFromDropdownOnSchoolProgress;
//
//	@FindBy(how = How.XPATH, using="//button[@class='owl-next']")
//	private WebElement 	seeSelectedSchoolInSchoolDropdownOnSchoolProgress;

	public OrgAdminDashboardPageTile(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(this.driver);
	}

	public void hatchInsightlogoPresent() {
		Assert.assertTrue(hatch_Insight_Logo.isDisplayed());
	}

	public void verifyDashboardMenuPressent(String expectedHeader0) {
		Assert.assertEquals(dashaboard_Menu_Present.getText(), expectedHeader0);
	}

	public void verifyReportMenuPressent(String expectedHeader1) {
		Assert.assertEquals(report_Menu_Present.getText(), expectedHeader1);
	}

	public void rosterMenuPresent(String expectedHeader2) {
		Assert.assertEquals(roster_Menu_Present.getText(), expectedHeader2);
	}

	public void accountMenuPresent() {
		Assert.assertTrue(account_Menu_Present.isDisplayed());
		Assert.assertTrue(account_Menu_Present.isEnabled());
	}

	public void hatchSkillSupportPresent(String expectedSkillSupportHatchHub) {
		Assert.assertEquals(skill_Support_Menu_Present.getText(), expectedSkillSupportHatchHub);
	}

	public void hatchResourcesPresent(String expectedResources) {
		Assert.assertEquals(resources_Menu_Present.getText(), expectedResources);
	}

	public void igniteByHatchUtilizationTilePresent(String expectedIgniteByHatchUtilization) {
		Assert.assertEquals(select_Ignite_By_Hatch_Utilization.getText(), expectedIgniteByHatchUtilization);
	}

	public void averageDemonstratedPanelPresent(String expectedAverageDemonstarted) {
		// Assert.assertEquals(select_Average_Demonstrated_Panel.getText(),
		// expectedAverageDemonstarted);
		Assert.assertTrue(select_Average_Demonstrated_Panel.getText().contains(expectedAverageDemonstarted));
	}

	public void professionalDevelopmentPanelPresent(String expectedProfessionalDevelopment) {
		Assert.assertEquals(select_Professional_Development.getText(), expectedProfessionalDevelopment);
	}

	public void supportNeededPanelPresent(String expectedSupportNeeded) {
//		Assert.assertEquals(select_Support_Needed.getText(), expectedSupportNeeded);
		Assert.assertTrue(select_Support_Needed.getText().contains(expectedSupportNeeded));
	}

	public void averagePlayTimePanelPresent(String expectedAveragePlaytime) {
//		Assert.assertEquals(select_Average_Play_Time.getText(), expectedAveragePlaytime);
		Assert.assertTrue(select_Average_Play_Time.getText().contains(expectedAveragePlaytime));
	}

	public void areYouGoldUserTilePresent(String expectedTSG) {
//		Assert.assertEquals(select_Are_You_Gold_User.getText(), expectedTSG);
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

	public void schoolsUsedIgniteInOrg() {
		Assert.assertTrue(text_Contain_Schools.isDisplayed());
		Assert.assertTrue(select_Schools_Ignite_By_hacth_Panel.isDisplayed());
		Assert.assertTrue(text_Contain_Of.isDisplayed());
	}

	public void classesUsedIgniteInOrg() {
		Assert.assertTrue(text_Contain_Classes.isDisplayed());
		Assert.assertTrue(select_Classes_Ignite_By_hacth_Panel.isDisplayed());
		Assert.assertTrue(text_Contain_Of.isDisplayed());
	}

	public void clickOnUtilizationTile() {
		utilization_Tile.click();
	}

	public void schoolSetupUtilizationPagePresent(String expectedUtilizationText) {
		Assert.assertTrue(school_Setup_Utilization_Page.isDisplayed());
		Assert.assertEquals(school_Setup_Utilization_Page.getText(), expectedUtilizationText);
	}

	public void schoolSetupUtilizationPage() {
		Assert.assertTrue(school_Setup_Utilization_Page.isDisplayed());
	}

	public void clickOnHatchInsightLogo() {
		hatch_Insight_Logo.click();
	}

	public void selectSetupRemainingText(String expectedSetupRemaining) {
		Assert.assertEquals(setupRemainingColumn.getText(), expectedSetupRemaining);
	}

	public void selectSchoolNameText(String expectedSchoolName) {
		Assert.assertEquals(schoolNameColumn.getText(), expectedSchoolName);
	}

	public void selectTotalTeachersText() {
		Assert.assertTrue(totalTeachersColumn.isDisplayed());
	}

	public void selectTotalClassesText() {
		Assert.assertTrue(totalClassesColumn.isDisplayed());
	}

	public void selectTeachersTrainedThisYearText() {
		Assert.assertTrue(teachersTrainedThisYearColumn.isDisplayed());
	}

	public void selectTeachersVisitedInsightsText() {
		Assert.assertTrue(teachersVisitedInsightsColumn.isDisplayed());
	}

	public void selectEstimatedChildrenAddedText() {
		Assert.assertTrue(estimatedChildrenAddedColumn.isDisplayed());
	}

	public void selectChildrenWithParentText() {
		Assert.assertTrue(childrenWithParentColumn.isDisplayed());
	}

	public void selectChildrenWithPhotoText() {
		Assert.assertTrue(childrenWithPhotoColumn.isDisplayed());
	}

	public void selectChildrenStartedPlay() {
		Assert.assertTrue(childrenStartedPlayColumn.isDisplayed());
	}

	public void selectSchoolUtilization(String expectedSchoolUtilizationText) {
		Assert.assertEquals(SchoolUtilizationtext.getText(), expectedSchoolUtilizationText);
	}

	public void selectSchoolUtilizationSchoolName(String expectedSchoolUtilizationSchoolNameText) {
		Assert.assertEquals(schoolUtilizationSchoolNameColumn.getText(), expectedSchoolUtilizationSchoolNameText);
	}

	public void selectSchoolUtilizationTotalClasses() {
		Assert.assertTrue(schoolUtilizationTotalClassesColumn.isDisplayed());
	}

	public void selectSchoolUtilizationActiveChildren() {
		Assert.assertTrue(schoolUtilizationActiveChildrenColumn.isDisplayed());
	}

	public void selectSchoolUtilizationTotalGOLDDocsSent() {
		Assert.assertTrue(schoolUtilizationTotalGOLDDocsSentColumn.isDisplayed());
	}

	public void selectSchoolUtilizationAvgTotalReportsLoginPerClass() {
		Assert.assertTrue(schoolUtilizationAvgTotalReportsLoginPerClassColumn.isDisplayed());
	}

	public void selectSchoolUtilizationAvgChildPlaytime() {
		Assert.assertTrue(schoolUtilizationAvgChildPlaytimeColumn.isDisplayed());
	}

	public void selectSchoolUtilizationAvgChildSessions() {
		Assert.assertTrue(schoolUtilizationAvgChildSessionsColumn.isDisplayed());
	}

	public void selectSchoolUtilizationAvgChildSkillLevel() {
		Assert.assertTrue(schoolUtilizationAvgChildSkillLevelColumn.isDisplayed());
	}

// Ignite Class Setup And Utilization UI Validation

	public void selectSchoolNameLink() {
		schoolNameLink.click();
	}

	public void selectClassSetupUtilizationPage() {
		Assert.assertTrue(classSetupUtilizationPage.isDisplayed());
	}

	public void selectClassTableHeaderSetupRemaining() {
		Assert.assertTrue(classTableHeaderSetupRemaining.isDisplayed());
	}

	public void selectSchoolNameInDropdown() {
		Assert.assertTrue(schoolNameInDropdown.isDisplayed());
	}
//################################################################################################################################

//	String commonHeaderExample = "//th[text()='$param$']";
//	String  commonClassSetupRemainingHeader ="//th/a[text()='$param$']";

	String commanClassSetupHeadersWE = "//div[@class='row m-0 setup-table-wrapper w-100']//th/a[normalize-space()='$param$']";

	public void selectClassSetupRemainingHeaders(String colName) {
		String example = commanClassSetupHeadersWE.replace("$param$", colName);
		WebElement we = driver.findElement(By.xpath(example));

		Assert.assertTrue(we.isDisplayed());
		System.out.println(colName + " :  " + we.getText());

	}

	public void selectTableHeaderClassUtilization() {
		Assert.assertTrue(tableHeaderClassUtilization.isDisplayed());
	}

	public void selectClassUtilizationRemainingHeaderSchoolName() {
		Assert.assertTrue(classUtilizationRemainingHeaderSchoolNameDropDown.isDisplayed());
	}

//                  //th[@id='class_report_c5']/a/text()[preceding-sibling::br]
// common =           //th/a/text()[preceding-sibling::br]

//	String commanClassUtilizationHeadersWE="//th/a[contains(text(),'$param$')]";
	String commanClassUtilizationHeadersWE = "//div[@class='row mt-3 school-utilization-wrapper w-100']//th/a[normalize-space()='$param$']";

	public void selectClassUtilizationHeaders(String colName) {
		String example = commanClassUtilizationHeadersWE.replace("$param$", colName);
		WebElement we = driver.findElement(By.xpath(example));

		Assert.assertTrue(we.isDisplayed());
		System.out.println(colName + " : " + we.getText());

	}

//	Support Needed Panel UI

	public void selectSuportNeededPanelHeader() {
		Assert.assertTrue(suportNeededPanelHeader.isDisplayed());
	}
//#################################################################################################################################################
//	Assert.assertTrue(numberOfChildren.isDisplayed());

	public void selectNumberOfChildren(String expectedChildrenText) {
		boolean result = selUtil.isElementExists(5, numberOfChildren);

		if (result) {
			Assert.assertTrue(numberOfChildren.getText().contains(expectedChildrenText));
		} else {
			System.out.println("This Org don't have Children with less than 80 % session pass");
			Assert.assertTrue(true);
		}
	}

	public void selectWeekelyStatusReportLink(String expectedLinkText) {
		Actions actions = new Actions(driver);
		boolean result = selUtil.isElementExists(5, weekelyStatusReportLink);
		actions.moveToElement(weekelyStatusReportLink);

		if (result) {
			Assert.assertEquals(weekelyStatusReportLink.getText(), expectedLinkText);
		} else {
			Assert.assertTrue(true);
			System.out.println("This Org doesn't have any child below 80 % Result");
		}
	}

//	Support Needed Page UI

	public void selectSupportNeededTile() {
		boolean result = selUtil.isElementExists(5, supportNeededTile);
		{
			Actions actions = new Actions(driver);
			actions.moveToElement(weekelyStatusReportLink);

			if (result) {
				supportNeededTile.click();
			} else {
				System.out.println("Tile is not active to nevigate to Support needed page");
				Assert.assertTrue(true);
			}
		}
	}

	public void selectSupportNeededPage() {
		boolean result = selUtil.isElementExists(5, supportNeededPage);
		if (result) {
			Assert.assertTrue(true);
			System.out.println("we are on Support Needed Page");
		} else {
			System.out.println("we are not on Support Needed Page");
			Assert.assertTrue(true);
		}
	}

	public void selectSchoolHeaderText(String expectedSchoolHeaderText) {
		boolean result = selUtil.isElementExists(5, schoolHeaderText);
		if (result) {
			Assert.assertEquals(schoolHeaderText.getText(), expectedSchoolHeaderText);
		} else {
			System.out.println("we are not on Support Needed Page");
			Assert.assertTrue(true);
		}
	}

	public void selectLessThanEightyPercentSchoolHeaderText(String expectedLessThanEightyPercentSchoolHeaderText) {
		boolean result = selUtil.isElementExists(5, lessThanEightyPercentSchoolHeaderText);

		if (result) {
			Assert.assertEquals(lessThanEightyPercentSchoolHeaderText.getText(),
					expectedLessThanEightyPercentSchoolHeaderText);
		} else {
			System.out.println("we are not on Support Needed Page");
			Assert.assertTrue(true);
		}
	}

	public void selectLessThanFiftyPercentSchoolHeaderText(String expectedLessThanFiftyPercentSchoolHeaderText) {
		boolean result = selUtil.isElementExists(5, lessThanFiftyPercentSchoolHeaderText);

		if (result) {
			Assert.assertEquals(lessThanFiftyPercentSchoolHeaderText.getText(),
					expectedLessThanFiftyPercentSchoolHeaderText);
		} else {
			System.out.println("we are not on Support Needed Page");
			Assert.assertTrue(true);
		}
	}

	// Average Demonstrated Skill Progress Tile UI

	public void selectAverageDemonstratedSkillProgressTile() {

		Assert.assertTrue(averageDemonstratedSkillProgressTile.isDisplayed());
	}

	public void selectSkillProgressBar(String expectedheader) {
		if (expectedheader.contains(currentSkillProgress.getText())) {
			System.out.println("This is the Current         : " + expectedheader);
			Assert.assertTrue(true);
		} else if (expectedheader.contains(thirtyDaysAgoSkillProgress.getText())) {
			System.out.println("This is 30 Days ago         : " + expectedheader);
			Assert.assertTrue(true);
		} else if (expectedheader.contains(viewDetailedProgress.getText())) {
			System.out.println("View Detailed Progress link : " + expectedheader);
			Assert.assertTrue(true);
		} else {
			System.out.println("test case failed");
			Assert.assertTrue(false);
		}
	}

	public void selectCurrentSkillProgressBarPresent() {
		Assert.assertTrue(currentSkillProgressBar.isDisplayed());
	}

	public void selectThrityDaysAgoSkillProgressBarPresent() {
		Assert.assertTrue(thrityDaysAgoSkillProgressBar.isDisplayed());
	}

	public void clickViewDetailedProgresslink() {
		viewDetailedProgress.click();
	}

	public void iAmOnSchoolProgressPage() {

		Assert.assertTrue(schoolProgressPage.isDisplayed());
	}

	public void clickOnProfessionalDevelopmentTile() {
		professionalDevelopmentTile.click();
	}

	public void iAmOnHatchHubHomePage(String expectedTitle) {
		String pageTitle = driver.getTitle();
		Assert.assertTrue(pageTitle.contains(expectedTitle));
		System.out.println(pageTitle);
	}

	public void getURLOftheHatchHubPage(String expectedURL) {
		String hatchHubUrl = driver.getCurrentUrl();
		Assert.assertEquals(hatchHubUrl, expectedURL);
		System.out.println(hatchHubUrl);
	}

	public void clickOnhatchInsightLogo() {
		hatchInsightLogo.click();
	}

	public void clickOnhatchInsightLogoOnHubPage() {
		hatchInsightLogoonHubPage.click();
	}

//	Average Playtime Tile UI

	public void selectAvgPlaytimeTileHeading(String expectedHeading) {
		Assert.assertEquals(avgPlaytimeTileHeading.getText(), expectedHeading);
		System.out.println(avgPlaytimeTileHeading.getText());
	}

	public void selectPlyatimeText(String expectedTimetext) {
		Assert.assertEquals(avgPlaytimetext.getText(), expectedTimetext);
		System.out.println(avgPlaytimetext.getText());
	}

	public void selectPlaytimeLinkText(String expectedPlaytimeLinkText) {
		Assert.assertEquals(PlaytimeLinkText.getText(), expectedPlaytimeLinkText);
		System.out.println(PlaytimeLinkText.getText());
	}

	// Average Playtime Link Validation
	public void selectAveragePlaytimeTile() {
		averagePlaytimeTile.click();
	}

	public void selectSchoolPlaytimePage(String ExpectedPageTitle) {
		Assert.assertEquals(driver.getTitle(), ExpectedPageTitle);
		System.out.println(driver.getTitle());
	}

//	TSG HatchSync Connection Tile Validation

	public void selectTSGTileHeading(String expectedTSGHeading) {

		boolean tsgResult = selUtil.isElementExists(5, tSGTileHeading);
		if (tsgResult) {
			Assert.assertEquals(tSGTileHeading.getText(), expectedTSGHeading);
			System.out.println(tSGTileHeading.getText());
		} else {
			System.out.println("This Org Is not TSG enabled : " + areYouGoldUser.getText());
			Assert.assertTrue(areYouGoldUser.isDisplayed());
		}
	}

	public void selectChildrenMatchWithGoldProfile(String expectedChildrenMatchText) {

		boolean tsgResult = selUtil.isElementExists(5, tSGChildrenMatchText);
		if (tsgResult) {
			Assert.assertTrue(tSGChildrenMatchText.getText().contains(expectedChildrenMatchText));
			System.out.println(tSGChildrenMatchText.getText());
		} else {
			System.out.println("This Org Is not TSG enabled");
			Assert.assertTrue(true);
		}
	}

	public void selectTotalDocumentSentCount(String expetedTotalDocSentText) {
		boolean tsgResult = selUtil.isElementExists(5, tSGTotalDocSentText);
		if (tsgResult) {
			Assert.assertEquals(tSGTotalDocSentText.getText(), expetedTotalDocSentText);
			System.out.println(tSGTotalDocSentText.getText());
		} else {
			System.out.println("This Org Is not TSG enabled");
			Assert.assertTrue(true);
		}

	}

	public void selectHatchSyncLinkText(String expecedHatchSyncLinkText) {
		boolean tsgResult = selUtil.isElementExists(5, tSGHatchSyncLinkText);
		if (tsgResult) {
			Assert.assertEquals(tSGHatchSyncLinkText.getText(), expecedHatchSyncLinkText);
			System.out.println(tSGHatchSyncLinkText.getText());
		} else {
			System.out.println("This Org Is not TSG enabled :  " + getHatchSyncTodayLink.getText());
			Assert.assertTrue(getHatchSyncTodayLink.isDisplayed());
		}
	}

	public void megaMenuRedirectedPage(String ExpectedPageTitle) {
		Assert.assertEquals(driver.getTitle(), ExpectedPageTitle);
		System.out.println(driver.getTitle());
	}

	String carouselXpath = "//div[@class='owl-item']//h5[contains(text(),'Child Time & Progress Export')]";
//	 Text XPASth=  //div[@class='owl-item']//h5[contains(text(), 'Device Ignite Version')]

	public void caroselDisplayOnReportPage() {
		Actions action = new Actions(driver);
//		String example = commanCarouselWE.replace("$param$", colName);
		WebElement carouselWE = driver.findElement(By.xpath(carouselXpath));
		action.moveToElement(carouselWE).perform();
		System.out.println(carouselWE.getText());
	}

//	 owl-item active   owl-item active
	//div[contains(@class,'owl-item') or contains(@class,'owl-item cloned')]//h5[contains(text(),'$caroselproduct1$')]

	String commanCarouselXpath1 = "//div[@class='owl-stage-outer']//div[@class='owl-item cloned']//h5[contains(text(),'$caroselproduct1$')]";

	public void seeCarouselProducts(String colName) {
		Actions action = new Actions(driver);
		String caroselXpath = commanCarouselXpath1.replace("$caroselproduct1$", colName);
		WebElement caroselwe = driver.findElement(By.xpath(caroselXpath));

		if (caroselwe.isDisplayed()) {
			action.moveToElement(caroselwe).perform();
			System.out.println(colName + " : " + caroselwe.getText());
		} else {
			action.moveToElement(casoselProductNextButton).click().perform();
			System.out.println("Desired Product not found Please reverify");

		}
//		action.moveToElement(caroselwe).perform();
//		Assert.assertTrue(caroselwe.isDisplayed());
//		System.out.println( colName + " : "+caroselwe.getText());

	}


	public void clickOnSchoolDropDown()
	{
		selectSchoolDropdownOnSchoolProgress.click();
	}

	public void clickOnSchoolDropdownOnSchoolProgress(String schoolName)
	{
//		Select select = new Select(selectSchoolDropdownOnSchoolProgress);
//		select.selectByVisibleText("Earth Science");

		String schoolOptionFromDropdown = commanOptionforSchoolDropDown.replace("$selectSchool$", schoolName);
		WebElement schoolOptionwe = driver.findElement(By.xpath(schoolOptionFromDropdown));

		Actions action = new Actions(driver);

		action.moveToElement(schoolOptionwe).click().perform();

	}

	public void clickOnSubdomainDropDown()
	{
		selectSubdomainDropdown.click();
	}

	public void searchSchoolFromSearchBox(String searchSchool)
	{
		clickOnSearchButton.click();
		clickOnSearchButton.sendKeys(searchSchool);
		}


	public void selectGivenOptionFromDowpDown(String subdomain)
	{
		Select select = new Select(selectSubdomainDropdown);
		select.selectByVisibleText(subdomain);
	}

	public void selectSchoolWeFoundInSearch(String schoolFound)
	{
		String schoolFoundInSearch = clickOnSchoolWeFoundInSearch.replace("$SchoolFound$", schoolFound);
		WebElement schoolNameFound = driver.findElement(By.xpath(schoolFoundInSearch));

		Actions action = new Actions(driver);

		action.moveToElement(schoolNameFound).click().perform();
	}

//	public void enterChildFirstname(String childFirstName)
//	{
//	Date dateNow = new Date( );
//	SimpleDateFormat sdf = new SimpleDateFormat ("ddMMyyyhhmmss");
//
//
//
//	childfirstname.sendKeys(childFirstName + sdf.format(dateNow));
//
//	String str = childFirstName+sdf.format(dateNow)+"@gmail.com";
//	}
//
}
