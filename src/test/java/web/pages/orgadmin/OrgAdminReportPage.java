package web.pages.orgadmin;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import util.Selenium;
import web.pages.CommonPage;

@SuppressWarnings("unused")
public class OrgAdminReportPage {

	private WebDriver driver;
	public static Selenium selUtil;
	public static CommonPage common;

	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'navbar-brand insight_logo')]/img[@alt='Hatch Insight']")
	private WebElement hatch_Insight_Logo;

	String CommonsubmenuLink = "//a[contains(@class, 'dropdown-item') and contains(text(), '$submenu$')]";

//    ***************************************************
//    Growth Report

	@FindBy(how = How.XPATH, using = "(//a[contains(@class, 'dropdown-item') and contains(text(), 'Support Needed')])[2]")
	private WebElement supportNeededSubmenu;

	@FindBy(how = How.ID, using = "selectSchool")
	private WebElement selectSchoolDropDrown;

	@FindBy(how = How.ID, using = "selectClass")
	private WebElement selectClassDropDrown;

	@FindBy(how = How.ID, using = "selectChild")
	private WebElement selectChildDropDrown;

	@FindBy(how = How.XPATH, using = "//div[@class='progress-heading']")
	private WebElement seeDomain;

	String seeDomainXpath = "//div[@class='progress-heading']";
	String indexDomainXpath = "//div[@class='progress-heading']['$index$']";

	String entryBlankProgressBar = "(//div[@class='growth-progress-bar-one white-bg'])['$index$']";
	String exitBlankProgressBar = "(//div[@class='growth-progress-bar-two white-bg'])[$index$]";

	String entryProgressBar = "(//div[@class='growth-progress-bar-one white-bg']/div)[$index$]";
	String exitProgressBar = "(//div[@class='growth-progress-bar-two white-bg']/div)[$index$]";

// ******************************************************
//    Child Time and Progress Export Page

	@FindBy(how = How.XPATH, using = "//h2/div[@id='advance_filtering']")
	private WebElement selectFilteringOptionOnChildTimeAndProgressExport;

//    Calender

	@FindBy(how = How.XPATH, using = "//input[contains(@id, 'datepicker_start_date')]")
	private WebElement startDateCalender;

	@FindBy(how = How.XPATH, using = "//input[contains(@id, 'datepicker_end_date')]")
	private WebElement endDateCalender;

	@FindBy(how = How.XPATH, using = "//input[contains(@id, 'start_date')]")
	private static WebElement startDateCalenderOnClassPlayTime;

	@FindBy(how = How.XPATH, using = "//input[contains(@id, 'end_date')]")
	private static WebElement endDateCalenderOnClassPlayTime;

	@FindBy(how = How.XPATH, using = "//button[contains(@id, 'apply_date_filter')]")
	private static WebElement clickOnSubMitButton;

	String date_xpath = "//*[@class='ui-datepicker-calendar']//td//a[text()='$day$']";

	String month_xpath = "//select[@class='ui-datepicker-month']";
	String year_xpath = "//select[@class='ui-datepicker-year']";

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-1']")
	private WebElement clickOnSchoolDropDown;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-2']")
	private WebElement clickOnClassDropDown;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-3']")
	private WebElement clickOnChildDropDown;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-4']")
	private WebElement clickOnDomainButton;

	String selectSchoolCheckBoxXpath = "//label[@title='$SchoolName$' and  contains(for,'ms-opt-')='']/span";

	String selectClassCheckBoxXpath = "//input[@title='$ClassName$']/following-sibling::span";

	String selectChildCheckBoxXpath = "//input[@title='$ChildName$']/following-sibling::span";

	String selectDomainCheckBoxXpath = "//input[@title='$DomainName$']/following-sibling::span";

	String selectTimeFormatXpath = "//input[@type='radio' and @value='$SetTimeFormat$']";

	// for listing subcolumns on school utilization pages
	String subcolumnsXpathIgniteUsage = "//th//a[contains(text(),'$Subcolumn$')]";
	
	String subcolumnsXpathTeachers="//th//span[contains(text(),'$Subcolumn$')]";

	@FindBy(how = How.XPATH, using = "//body")
	private WebElement clickOnBlankSapace;

	@FindBy(how = How.XPATH, using = "//input[@name='filter_time_metric' and @value='3600']")
	private WebElement selectTimeAsHours;

	@FindBy(how = How.XPATH, using = "//input[@name='filter_time_metric' and @value='60']")
	private WebElement selectTimeAsMinutes;

	@FindBy(how = How.XPATH, using = "//input[@name='filter_time_metric' and @value='1']")
	private WebElement selectTimeAsSeconds;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-5']")
	private WebElement clickOnAgeDropDown;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-6']")
	private WebElement clickOnGradeDropDown;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-7']")
	private WebElement clickOnLanguageDropDown;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-8']")
	private WebElement clickOnRaceDropDown;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-9']")
	private WebElement clickOnEthnicityDropDown;

	@FindBy(how = How.XPATH, using = "//div/button[@id='downloadPlaytimeProgressCsv']")
	private WebElement clickOnDownloadReportButtonWE;

	@FindBy(how = How.XPATH, using = " //div/button[@id='saveTsgOrg' and text()='Try Again']")
	private WebElement clickOnTryAgainButton;

	@FindBy(how = How.XPATH, using = "//div/button[@id='saveTsgOrg' and text()='Done']")
	private WebElement clickOnDoneButton;

	String selectAgeCheckBoxXpath = "//input[@title='$selectAge$']/following-sibling::span";

	String selectGradeCheckBoxXpath = "//input[@title='$selectGrade$']/following-sibling::span";

	String selectLanguageCheckBoxXpath = "//input[@title='$Language$']/following-sibling::span";

	String selectRaceCheckBoxXpath = "//input[@title='$Race$']/following-sibling::span";

	String selectEthnicityCheckBoxXpath = "//input[@title='$Ethnicity$']/following-sibling::span";

//****************************************************************************************************
	// Class PlayTime

	@FindBy(how = How.ID, using = "class_playtime_school_id")
	private WebElement selectSchoolFromSchoolDropdownOnClassPlaytime;

	@FindBy(how = How.XPATH, using = "//div/input[@name='class_progress_filter' and @value='1']")
	private WebElement clickOnThisWeekPlatime;

	@FindBy(how = How.XPATH, using = "//div/input[@name='class_progress_filter' and @value='2']")
	private WebElement clickOnLastWeekPlatime;

	@FindBy(how = How.XPATH, using = "//div/input[@name='class_progress_filter' and @value='3']")
	private WebElement clickOnSchoolYearPlatime;

	@FindBy(how = How.XPATH, using = "//div/input[@name='class_progress_filter' and @value='4']")
	private static WebElement clickOnCustomPlatime;

	@FindBy(how = How.XPATH, using = "//button[@class='drift-widget-naked-button drift-widget-message-close-button drift-widget-close-button--align-right']")
	private static WebElement closeButtonOfRobot;

	@FindBy(how = How.XPATH, using = "//div[@id='playtime30']")
	private WebElement seeGreenColortext;

	@FindBy(how = How.XPATH, using = "//div[@id='playtime10_29']")
	private WebElement seeOrangeColortext;

	@FindBy(how = How.XPATH, using = "//div[@id='playtime10']")
	private WebElement seeRedColortext;

	String seeClassesPerSelectedSchoolXpath = "//td[@class='report-childname pl-0']/a";
	String seeClassProgressPerSelectedSchoolXpath = "//td[@class='report-childname pl-0']//following-sibling::td/a";

	@FindBy(how = How.ID, using = "select_domain_view")
	private static WebElement selectDomainforSchoolEntry;

	@FindBy(how = How.ID, using = "select_subdomain_view")
	private static WebElement selectSubDomainforSchoolEntry;

	@FindBy(how = How.XPATH, using = "//div[@id='demographics']/button")
	private static WebElement clickOnDemographicDroDown;

	@FindBy(how = How.ID, using = "select_school_view")
	private static WebElement selectSchoolforSchoolEntry;

	@FindBy(how = How.XPATH, using = "//div[@class='custom-progress-bar entry-prog-bar mt-2']")
	private static WebElement classEntryCompletedBar;

	@FindBy(how = How.XPATH, using = "//span[@class='d-block cc-pointer fs-14']")
	private static List<WebElement> listofSchool;

	@FindBy(how = How.ID, using = "load-more-class")
	private static WebElement schoolEntrhLoadMoreButton;

	// @FindBy(how = How.XPATH, using = "//span[contains(text(),'Entry Completion
	// By')]")
	// private static WebElement seeNumberOfclassescompletedText;

	@FindBy(how = How.ID, using = "entryReportClassId")
	private static WebElement selectClassforSchoolEntry;

	@FindBy(how = How.XPATH, using = "//li[@class='position-relative']")
	private static List<WebElement> skilldemonstrateddot;

	@FindBy(how = How.XPATH, using = "//small[text()='Skill Emerging']")
	private static WebElement skillEmerging;

	@FindBy(how = How.XPATH, using = "//small[text()='Skill Demonstrated']")
	private static WebElement skillDemonstrated;

	@FindBy(how = How.XPATH, using = "//small[text()='Not Offered']")
	private static WebElement notoffers;

	@FindBy(how = How.XPATH, using = "//div[@class='custom-progress-bar entry-prog-bar mt-2']")
	private static WebElement schoolEntryCompletedBar;

	@FindBy(how = How.XPATH, using = "//span[text()='Entry Completion By School:']")
	private static WebElement seeNumberOfschoolcompletedText;

	@FindBy(how = How.XPATH, using = "//h2[text()='Class Journey Through Entry Experiences']")
	private static WebElement classentryPage;

	@FindBy(how = How.XPATH, using = "//h2[text()='Child Journey Through Entry Experiences']")
	private static WebElement childentryPage;

	@FindBy(how = How.ID, using = "load-more-children")
	private static WebElement childEntrhLoadMoreButton;

	String actualChildName = "//span[@class='d-block cc-pointer fs-14']/a";

	// @FindBy(how = How.XPATH, using = "//div[@class='custom-progress-bar
	// entry-prog-bar mt-2']")
	// private static WebElement childEntryCompletedBar;

	@FindBy(how = How.XPATH, using = "//h3/span[contains(text(),'Entry Completion By')]")
	private static WebElement seeNumberOfChildrencompletedText;

//	@FindBy(how = How.XPATH, using = "//span[@class='d-block cc-pointer fs-14']/a")
	// private static WebElement actualSchoolName;

	@FindBy(how = How.XPATH, using = "(//span[@class='d-block cc-pointer fs-14']/a)[1]")
	private static WebElement actualclassName;

	@FindBy(how = How.XPATH, using = "(//span[@class='d-block cc-pointer fs-14']/a)[1]")
	private static WebElement actualchildName;

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Child Skill Detail')]")
	private static WebElement childSkillDetailsPage;
	
	
	//@FindBy (how = How.XPATH, using = "//input[@id = 'range_filter_start_time']")
	@FindBy (how = How.XPATH, using = "//input[contains(@id,'start')]")
	private static WebElement startTime;
	
	//@FindBy (how = How.XPATH, using = "//input[@id = 'range_filter_end_time']")
	@FindBy (how = How.XPATH, using = "(//input[contains(@id,'end')])[1]")
	private static WebElement endTime;
	
//	@FindBy(how = How.XPATH, using = "(//span[@id='date_range_text']/parent::button")
//	@FindBy(how = How.XPATH, using = "//button[@type='button']//parent::div[@class='dropdown']")
	@FindBy(how = How.XPATH, using = "//span[@id='date_range_text']")
	//span[@id='date_range_text']
    private WebElement dateRangeDropdown;
	
	@FindBy (how = How.XPATH, using = "//label [contains (text(), 'Exclude Weekends')]")
	private WebElement ExcludeWeekends;
	
	@FindBy (how = How.XPATH, using = "//select [@id = 'accessPlayType']")
	private WebElement accessplaytypefilter;
	
	@FindBy (how = How.XPATH, using = "//div[@class='teacher_ids']//button")
	private WebElement teacherfilter;
	
	@FindBy (how = How.XPATH, using = "(//input[@type = 'text'])[1]")
	private WebElement searchteacher;
	
	String selectteacherCheckBoxXpath =  "//label[@title='$Teacher$' and contains(for,'ms-opt-')='']/span";
// ***************************************************************

	// Child Skill Conference page
	@FindBy(how = How.XPATH, using = "//h1[@class='title']")
	private WebElement title;

	@FindBy(how = How.XPATH, using = "//span[@class='selected_options']")
	private WebElement childdrp;

	@FindBy(how = How.XPATH, using = "//body")
	private WebElement clickOnBlankSpace;

	@FindBy(how = How.XPATH, using = "//th[@id='organization_grid_c0']")
	private WebElement childname;

	@FindBy(how = How.XPATH, using = "//th[@id='organization_grid_c1']")
	private WebElement ignitereportname;

	@FindBy(how = How.XPATH, using = "//th[@id='organization_grid_c2']")
	private WebElement ignitetablereportname;

	@FindBy(how = How.XPATH, using = "//th[@id='organization_grid_c3']")
	private WebElement ignitetablegamereport;

	@FindBy(how = How.XPATH, using = "//table[@class='items fullwidth parent-conf-table alternating view-all-classes-table view-all-schools-table common-table-layout table-striped']//tbody/tr")
	private List<WebElement> childnames;

	@FindBy(how = How.XPATH, using = "//tr[1]/td[2]/a[2]")
	private WebElement viewignite;

	@FindBy(how = How.XPATH, using = "//tr[1]/td[3]/a[2]")
	private WebElement viewignitetable;

	@FindBy(how = How.XPATH, using = "//tr[1]/td[4]/a[2]")
	private WebElement viewgameplayreport;

	@FindBy(how = How.XPATH, using = "//tr[1]/td[2]/a[3]")
	private WebElement printbtn;

	@FindBy(how = How.XPATH, using = "//h2[@class='text-black font-nunito fw-800 mb-3']")
	private WebElement ignitetitle;

	@FindBy(how = How.XPATH, using = "//h2[@class='text-black font-nunito fw-800']")
	private WebElement ignitetabletitle;

	String ChildlistXpath = "//input[@type='checkbox' and @ title='$childlist$']";

	// School Setup Page
	@FindBy(how = How.XPATH, using = "//h2[contains(text(), \"School Setup Report\")] ")
	private WebElement SchoolSetuppagetitle;

	@FindBy(how = How.XPATH, using = "//h1[@class='title']")
	private WebElement SchoolSetuppageBlueHeadertitle;

	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'LEARN MORE')]")
	private WebElement LeanMoreLink;

	@FindBy(how = How.XPATH, using = "//a [@class = 'active']")
	private WebElement IgniteTab;

	@FindBy(how = How.LINK_TEXT, using = "IGNITETABLE")
	private WebElement IgniteTableTab;

	@FindBy(how = How.XPATH, using = "//th[@class = 'mr-2 text-dark']")
	private WebElement TeacherColumn;

	@FindBy(how = How.XPATH, using = "//th[@class = 'ml-2 text-dark']")
	private WebElement ChildrenColumn;

	@FindBy(how = How.XPATH, using = "//a[@class='bluetext schoolsetup_ignite_sort_col sort_active']")
	private WebElement SchoolNameColumn;

	@FindBy(how = How.XPATH, using = "//a[@data-sortby='no_of_classes']")
	private WebElement classnamecolumn;

	@FindBy(how = How.XPATH, using = "//a[@data-sortby='total_teachers']")
	private WebElement Totalcolumn;

	@FindBy(how = How.XPATH, using = "//a[@data-sortby='teacher_accessed_insights']")
	private WebElement totalacessedinsights;

	@FindBy(how = How.XPATH, using = "//a[@data-sortby='total_children']")
	private WebElement Totalcolumn1;

	@FindBy(how = How.XPATH, using = "//a[@data-sortby='children_ignite_assigned']")
	private WebElement igniteassigned;

	@FindBy(how = How.XPATH, using = "//a[@data-sortby='children_with_family_members']")
	private WebElement withfamilymembers;

	@FindBy(how = How.XPATH, using = "//a[@data-sortby='children_with_photos']")
	private WebElement withphotos;

	@FindBy(how = How.XPATH, using = "//a[@data-sortby='total_children_played']")
	private WebElement childrenplayed;

	@FindBy(how = How.XPATH, using = "//div[@id='ignite_school_list']")
	private List<WebElement> SchoolNameList;

	@FindBy(how = How.XPATH, using = "//tr[1]/td[1]/a")
	private WebElement SchoolNameLink;

	@FindBy(how = How.XPATH, using = "//h2[@class='mt-0 mb-4 font-nunito fw-800']")
	private WebElement ClassSetuppage;

	// class setup page

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Class Setup Report')]")
	private WebElement ClassSetuppagetitle;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Class Name ')]")
	private WebElement ClassNameColumn;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Teacher Name')]")
	private WebElement TeacherNameColumn;

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Accessed Insights')]")
	private WebElement AccessesInsights;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Children')]")
	private WebElement ChildrenColumnOnClassSetup;

	@FindBy(how = How.XPATH, using = "//th/a[contains(text(),'Total')]")
	private WebElement TotalcolumnOnClassSetup;

	@FindBy(how = How.XPATH, using = "//th/a[contains(text(),'Ignite Assigned ')]")
	private WebElement igniteassignedOnClassSetup;

	@FindBy(how = How.XPATH, using = "//th/a[@id='sort_class_child_count_with_FamilyMember']")
	private WebElement withfamilymembersOnClassSetup;

	@FindBy(how = How.XPATH, using = "//th/a[@id='sort_class_child_count_with_picture']")
	private WebElement withphotosOnClassSetup;

	@FindBy(how = How.XPATH, using = "//th/a[@id='sort_total_children_played']")
	private WebElement childrenPlaying;

	@FindBy(how = How.XPATH, using = "//td[contains(@class, 'org-utilization-sch-name')]")
	private List<WebElement> ClassNameList;
	
	
	// Class utilization page

	@FindBy(how = How.XPATH, using = "//table//th//span[contains(text(),'Ignite Usage')]")
	private WebElement igniteUsage;

	@FindBy(how = How.XPATH, using = "//table//th//span[contains(text(),'Teachers')]")
	private WebElement TeachersColumn;
	
	//School Utilization page
	
		@FindBy(how= How.XPATH, using = "//h1[@class='title']")
		private WebElement SchoolUtilizationPageHeader;
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(), 'LEARN MORE')]")
		private WebElement learmore1;
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'# of Classes')]")
		private WebElement classnamecolumn1;
		
		@FindBy (how = How.XPATH, using = "//a[contains(text(),'# of Children playing')]")
		private WebElement ChildrenPlaying;
		
		@FindBy (how = How.XPATH, using = "//a[contains(text(),'Total Games Played')]")
		private WebElement TotalGamePlayed;
		
		@FindBy (how = How.XPATH, using = "//a[contains(text(),'Avg Child Skill Level ')]")
		private WebElement TotalAvgSkilllevel;
		
		@FindBy (how = How.XPATH, using = "//i[contains(text(),'(Last Week)') ] | //a[contains(text(),'Avg Child Playtime')]")
		private WebElement AvgChildPlaytime;
		
		@FindBy (how = How.XPATH, using = "//a[contains(text(),'Total Insights Logins ')]")
		private WebElement TotalinsightsLogins ;
		
		//Class Utilizaqtion page
		
		@FindBy (how = How.XPATH, using = "//a[contains(text(),'Name ')]")
		private WebElement name ;
		
		@FindBy (how = How.XPATH, using = "//a[contains(text(),'Last Login  ')]")
		private WebElement LastLogin ; 
		
		// child progress
		
		@FindBy (how = How.XPATH, using = "//a[contains(text(),'Entry Progress')]")
		private WebElement entryprogresslink ; 
		
		@FindBy (how = How.XPATH, using = "	//a/*[@class='bluetext' and contains(text(),'Name')]")
		private WebElement namesort ; 
		
		@FindBy (how = How.XPATH, using = "(//tr[@class='row align-items-start']//a)[1]")
		private WebElement childnamelink ; 
		
		@FindBy (how = How.XPATH, using = "//a[@class='ghosthover backbtn']")
		private WebElement backbutton ; 
		
		
		// School Progress
		@FindBy(how = How.XPATH, using = "//div[@class='domain_ids domain-filter']//button")
		private WebElement clickOnDomainButtonSchoolProress;
		
		@FindBy (how = How.XPATH, using = "(//tr[@class='row']/td/a)[1]")
		private WebElement classProgresslink ; 
		
		@FindBy (how = How.XPATH, using = "//h1[contains(text(),'Class Progress')]")
		private WebElement classProgressTitle ; 
		
		String entryTitle= "//h2[text()='$Title$']";
		

	public OrgAdminReportPage(WebDriver driver) throws ParseException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(this.driver);
		common = new CommonPage(this.driver);

	}

	public void seeReportMenusOnSubsection(DataTable expectedReportSubmenus) {
		List<String> carousellist = expectedReportSubmenus.asList();
		for (String expectedReportMenu : carousellist) {
			String submenuXpath = CommonsubmenuLink.replace("$submenu$", expectedReportMenu);
			WebElement reportMenuwe = driver.findElement(By.xpath(submenuXpath));
			selUtil.waitUntilElementIsPresentOnPage(10, reportMenuwe);
			selUtil.getAction().moveToElement(reportMenuwe).perform();
			System.out.println(reportMenuwe.getText());
			Assert.assertTrue(reportMenuwe.getText().contains(expectedReportMenu), "Menu are present");
		}
	}

	public void supportNeededSubmenuPresent(String expectedSubmenu) {
		selUtil.getAction().moveToElement(supportNeededSubmenu).perform();
		String actualsupportNeedeMenu = supportNeededSubmenu.getText();
		Assert.assertEquals(actualsupportNeedeMenu, expectedSubmenu);
	}

//	*********************************************************************************************************
//	Growth Report Page
	public void selectSchoolFromDropDown(String expected_SchoolName) {
		selUtil.getAction().moveToElement(selectSchoolDropDrown);
		Select selectSchool = new Select(selectSchoolDropDrown);
		selectSchoolDropDrown.click();
		selectSchool.selectByVisibleText(expected_SchoolName);

	}

	public void selectClassFromDropDown(String expected_ClassName) {
		selUtil.waitUntilElementIsPresentOnPage(10, selectClassDropDrown);
		selUtil.getAction().moveToElement(selectClassDropDrown);
		Select selectClass = new Select(selectClassDropDrown);

		selectClassDropDrown.click();
		selectClass.selectByVisibleText(expected_ClassName);
	}

	public void selectChildFromDropDown(String expected_ChildName) {
		selUtil.hardWait(3);
		selUtil.getAction().moveToElement(selectChildDropDrown);
		Select selectChild = new Select(selectChildDropDrown);

		selectChildDropDrown.click();
		selectChild.selectByVisibleText(expected_ChildName);
		clickOnBlankSapace.click();
		selUtil.hardWait(2);
	}

	public void selectDomainsWithProgressBar(DataTable expectedDomainName) {

//		Entry Session
		int i = 0;
		List<String> domainlist = expectedDomainName.asList();
		for (String expectedDomain : domainlist) {
			List<WebElement> listOfDomain = driver.findElements(By.xpath(seeDomainXpath));
			String actualDomainName = listOfDomain.get(i).getText();
			selUtil.getAction().moveToElement(listOfDomain.get(i)).perform();
			Assert.assertEquals(actualDomainName, expectedDomain);

			i++;
			String s = String.valueOf(i);
			String entryProgressBarXpath = entryProgressBar.replace("$index$", s);
			WebElement entryProgressBarWe = driver.findElement(By.xpath(entryProgressBarXpath));

			selUtil.getAction().moveToElement(entryProgressBarWe).perform();

			String entryBlankXpath = entryBlankProgressBar.replace("$index$", s);
			WebElement entryBlankProgressBarMenuwe = driver.findElement(By.xpath(entryBlankXpath));

			String entryProgress = entryProgressBarWe.getAttribute("style");
			{
				if (entryProgress.contains("width: 0%")) {
					Assert.assertTrue(entryBlankProgressBarMenuwe.isDisplayed(),
							"Child not playing nor Complted its entry Level game of Domain: " + actualDomainName);
				} else {
					Assert.assertTrue(entryProgressBarWe.isDisplayed(),
							"This child playing or completed entry level game for Domain : " + actualDomainName);
				}
			}
//			Exit Sessions
			String exitProgressBarXpath = exitProgressBar.replace("$index$", s);
			WebElement exitProgressBarWe = driver.findElement(By.xpath(exitProgressBarXpath));

			selUtil.getAction().moveToElement(exitProgressBarWe).perform();
			String exitProgress = exitProgressBarWe.getAttribute("style");
			{
				if (exitProgress.contains("width: 0%")) {
					Assert.assertTrue(exitProgressBarWe.isDisplayed(),
							"Child not playing nor Complted its exit Level game of Domain: " + actualDomainName);
				} else {
					Assert.assertTrue(exitProgressBarWe.isDisplayed(),
							"Child playing or completed exit level game for Domain : " + actualDomainName);
				}
			}
		}

//	*********************************************************************************************************
	}

	public void clickFilteringOptionOnChildTimeAndProgressExport() {
		selUtil.hardWait(5);
		selectFilteringOptionOnChildTimeAndProgressExport.click();
	}

	public void enterStartDateOnChildTimeAndProgressExport(String setStartDate, String setEndDate) {
		selUtil.getAction().moveToElement(startDateCalender).click().perform();
//		startDateCalender.click();
		common.setDate(setStartDate);

		endDateCalender.click();
		common.setDate(setEndDate);
	}

	public void selectSchoolFromDropdown(DataTable expectedSchoolName) {
//		Select School
		selUtil.hardWait(3);

		clickOnSchoolDropDown.click();

		selUtil.hardWait(3);

		List<String> schoolFromDropDownlist = expectedSchoolName.asList();
		selUtil.hardWait(2);
		for (String school : schoolFromDropDownlist) {

			String selectSchoolNameXpath = selectSchoolCheckBoxXpath.replace("$SchoolName$", school);

			WebElement selectSchoolNameMenuwe = driver.findElement(By.xpath(selectSchoolNameXpath));

			selUtil.waitUntilElementIsPresentOnPage(30, selectSchoolNameMenuwe);
			selUtil.getAction().moveToElement(selectSchoolNameMenuwe).click().perform();
			Assert.assertTrue(selectSchoolNameMenuwe.isDisplayed());
//		selectDomainNameMenuwe.click();
		}
		clickOnBlankSapace.click();
	}

	public void selectClassFromDropdown(DataTable expectedClassName) {
//			clickOnBlankSapace.click();
		clickOnClassDropDown.click();

		List<String> classFromDropDownlist = expectedClassName.asList();
		for (String classes : classFromDropDownlist) {
			String selectClassNameXpath = selectClassCheckBoxXpath.replace("$ClassName$", classes);

			WebElement selectClassNameMenuwe = driver.findElement(By.xpath(selectClassNameXpath));

			selUtil.waitUntilElementIsPresentOnPage(10, selectClassNameMenuwe);

			selUtil.getAction().moveToElement(selectClassNameMenuwe).click().perform();
			Assert.assertTrue(selectClassNameMenuwe.isDisplayed());
//				selectDomainNameMenuwe.click();
		}
		clickOnBlankSapace.click();
	}

	public void selectChildFromDropdown(DataTable expectedChildName) {
		clickOnChildDropDown.click();

		List<String> childFromDropDownlist = expectedChildName.asList();
		for (String child : childFromDropDownlist) {
			String selectChildNameXpath = selectChildCheckBoxXpath.replace("$ChildName$", child);
			WebElement selectChildNameMenuwe = driver.findElement(By.xpath(selectChildNameXpath));

			selUtil.waitUntilElementIsPresentOnPage(10, selectChildNameMenuwe);
			selUtil.getAction().moveToElement(selectChildNameMenuwe).click().perform();
			Assert.assertTrue(selectChildNameMenuwe.isDisplayed());
		}
		clickOnBlankSapace.click();

	}

	public void selectDomainNameFromDropdown(DataTable selectDomainName) {
		selUtil.waitUntilElementIsPresentOnPage(40, clickOnDomainButton);
		selUtil.getAction().moveToElement(clickOnDomainButton).perform();
		clickOnDomainButton.click();

		List<String> domainFromDropDownlist = selectDomainName.asList();
		for (String expectedDomain : domainFromDropDownlist) {

			String selectDomainNameXpath = selectDomainCheckBoxXpath.replace("$DomainName$", expectedDomain);

			WebElement selectDomainNameMenuwe = driver.findElement(By.xpath(selectDomainNameXpath));

			selUtil.waitUntilElementIsPresentOnPage(40, selectDomainNameMenuwe);
			selUtil.getAction().moveToElement(selectDomainNameMenuwe).click().perform();
			Assert.assertTrue(selectDomainNameMenuwe.isDisplayed());
//		selectDomainNameMenuwe.click();
		}
		clickOnBlankSapace.click();
	}

	public void selcetDisplayeTimeAs() {
		selectTimeAsHours.click();
		Assert.assertTrue(selectTimeAsHours.isSelected());

		selectTimeAsMinutes.click();
		Assert.assertTrue(selectTimeAsMinutes.isSelected());
		selectTimeAsSeconds.click();
		Assert.assertTrue(selectTimeAsSeconds.isSelected());
	}

	public void setAgefilterDemograghicDataDownload(DataTable expectedAgeList) {
		selUtil.getNonStaleElement(20, clickOnAgeDropDown);
		clickOnAgeDropDown.click();

		List<String> ageFromDropDownlist = expectedAgeList.asList();
		for (String expectedAge : ageFromDropDownlist) {

			String selectAgeNameXpath = selectAgeCheckBoxXpath.replace("$selectAge$", expectedAge);
			WebElement selectAgeMenuwe = driver.findElement(By.xpath(selectAgeNameXpath));

			selUtil.getAction().moveToElement(selectAgeMenuwe).click().perform();
			Assert.assertTrue(selectAgeMenuwe.isDisplayed());
		}
		clickOnBlankSapace.click();
	}

	public void setGradefilterDemograghicDataDownload(DataTable expectedGradeList) {
		selUtil.getAction().moveToElement(clickOnGradeDropDown).click().perform();

		List<String> gradeFromDropDownlist = expectedGradeList.asList();
		for (String expectedGrade : gradeFromDropDownlist) {
			String selectGradeXpath = selectGradeCheckBoxXpath.replace("$selectGrade$", expectedGrade);
			WebElement selectGradeMenuwe = driver.findElement(By.xpath(selectGradeXpath));

			selUtil.getAction().moveToElement(selectGradeMenuwe).click().perform();
			Assert.assertTrue(selectGradeMenuwe.isDisplayed());
		}
		clickOnBlankSapace.click();
	}

	public void setLanguagefilterDemograghicDataDownload(DataTable expectedLanguageList) {
		selUtil.getAction().moveToElement(clickOnLanguageDropDown).click().perform();

		List<String> languageFromDropDownlist = expectedLanguageList.asList();
		for (String expectedLanguage : languageFromDropDownlist) {
			String selectLanguageXpath = selectLanguageCheckBoxXpath.replace("$Language$", expectedLanguage);
			WebElement selectLanguagedNameMenuwe = driver.findElement(By.xpath(selectLanguageXpath));

			selUtil.getAction().moveToElement(selectLanguagedNameMenuwe).click().perform();
			System.out.println(selectLanguageXpath);
			Assert.assertTrue(selectLanguagedNameMenuwe.isDisplayed());
		}
		clickOnBlankSapace.click();
	}

	public void setRaceFilterDemograghicDataDownload(DataTable expectedRaceList) {
		selUtil.getAction().moveToElement(clickOnRaceDropDown).click().perform();

		List<String> raceFromDropDownlist = expectedRaceList.asList();
		for (String expectedRace : raceFromDropDownlist) {
			String selectRaceXpath = selectRaceCheckBoxXpath.replace("$Race$", expectedRace);
			WebElement selectRaceMenuwe = driver.findElement(By.xpath(selectRaceXpath));

			selUtil.getAction().moveToElement(selectRaceMenuwe).click().perform();
			System.out.println(selectRaceXpath);
			Assert.assertTrue(selectRaceMenuwe.isDisplayed());
		}
		clickOnBlankSapace.click();
	}

	public void setEthnicityFilterDemograghicDataDownload(DataTable expectedEthnicityList) {
		selUtil.getAction().moveToElement(clickOnEthnicityDropDown).click().perform();

		List<String> ethnicityFromDropDownlist = expectedEthnicityList.asList();
		for (String expectedEthnicity : ethnicityFromDropDownlist) {
			String selectEthnicityXpath = selectEthnicityCheckBoxXpath.replace("$Ethnicity$", expectedEthnicity);
			WebElement selectEthnicityNameMenuwe = driver.findElement(By.xpath(selectEthnicityXpath));

			selUtil.getAction().moveToElement(selectEthnicityNameMenuwe).click().perform();
			System.out.println(selectEthnicityXpath);
			Assert.assertTrue(selectEthnicityNameMenuwe.isDisplayed());
		}
		clickOnBlankSapace.click();

	}

	public void clickOnDownloadReportButton() {
		clickOnBlankSapace.click();

//		JavaScriptExecutor use beacause application UI and HTML has been manage by css and javascrripts

		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click()", clickOnDownloadReportButtonWE);

		Assert.assertTrue(clickOnDownloadReportButtonWE.isEnabled());
		selUtil.hardWait(5);

		boolean setAfterDownloadReportButton = selUtil.isElementExists(clickOnDoneButton);

		if (setAfterDownloadReportButton) {
			selUtil.getAction().moveToElement(clickOnDoneButton).click().perform();
		} else {
			selUtil.getAction().moveToElement(clickOnTryAgainButton).click().perform();
		}
	}

//	Class Play Time
	public void selectSchoolFromSchoolDropDownClassPlaytime(String expectedSchoolName) {
		selUtil.waitUntilElementIsPresentOnPage(60, selectSchoolFromSchoolDropdownOnClassPlaytime);
		Select select = new Select(selectSchoolFromSchoolDropdownOnClassPlaytime);
		selUtil.waitUntilElementIsPresentOnPage(60, selectSchoolFromSchoolDropdownOnClassPlaytime);
		selectSchoolFromSchoolDropdownOnClassPlaytime.click();
		select.selectByVisibleText(expectedSchoolName);

	}

	public void selectShowPlayTimeThisWeek() {
		selUtil.waitUntilElementIsPresentOnPage(30, clickOnThisWeekPlatime);
		clickOnThisWeekPlatime.click();
		Assert.assertTrue(clickOnThisWeekPlatime.isSelected());
	}

	public void selectShowPlayTimeLastWeek() {
		selUtil.hardWait(2);
		clickOnLastWeekPlatime.click();
		Assert.assertTrue(clickOnLastWeekPlatime.isSelected());
	}

	public void clickOnSchoolYearOnClassPlayTimePage() {
		selUtil.hardWait(2);
		clickOnSchoolYearPlatime.click();
		Assert.assertTrue(clickOnSchoolYearPlatime.isSelected());
	}

	public void clickOnCustomDateOnClassPlayTimePage() {
		selUtil.hardWait(2);
		clickOnCustomPlatime.click();
		Assert.assertTrue(clickOnCustomPlatime.isSelected());
	}

	public void selectShowPlayTimeCustomDate(String expectedStartDate, String expectedEndDate) throws ParseException {

//		startDateCalenderOnClassPlayTime.click();
		selUtil.hardWait(5);
		common.setDateStart(expectedStartDate);

//		endDateCalenderOnClassPlayTime.click(); setDateEnd
		selUtil.hardWait(2);
		common.setDateEnd(expectedEndDate);

//		clickOnSubMitButton.click();
		selUtil.hardWait(2);

		common.verifyColorProgress(expectedStartDate, expectedEndDate);

	}
	
	
	public void selectShowPlayTimeCustomTime (String StartTime, String EndTime) throws ParseException
	{    
		selUtil.waitUntilElementIsPresentOnPage(50, dateRangeDropdown);
		dateRangeDropdown.click();
		selUtil.hardWait(5);
		startTime.clear();
		startTime.sendKeys(StartTime);
		selUtil.hardWait(5);
		endTime.clear();
		endTime.sendKeys(EndTime);
		selUtil.hardWait(5);
		ExcludeWeekends.click();
		dateRangeDropdown.click();

	}
	
	public void PlayAccessTypefilter(String playaccesstype1,String playaccesstype2, String playaccesstype3 )
	{
		accessplaytypefilter.click();
		selUtil.getAction().moveToElement(accessplaytypefilter);
		Select selectplayaccess= new Select(accessplaytypefilter);
		accessplaytypefilter.click();
		selectplayaccess.selectByVisibleText(playaccesstype1);
		System.out.println(selectplayaccess.getFirstSelectedOption().getText());
		
		selUtil.getAction().moveToElement(accessplaytypefilter);
		Select selectplayaccess1= new Select(accessplaytypefilter);
		accessplaytypefilter.click();
		selectplayaccess1.selectByVisibleText(playaccesstype2);
		System.out.println(selectplayaccess1.getFirstSelectedOption().getText());
		
		selUtil.getAction().moveToElement(accessplaytypefilter);
		Select selectplayaccess2= new Select(accessplaytypefilter);
		accessplaytypefilter.click();
		selectplayaccess2.selectByVisibleText(playaccesstype3);
		System.out.println(selectplayaccess2.getFirstSelectedOption().getText());
		accessplaytypefilter.click();

	}
	
	public void verifyteacherfilter(DataTable selectteacher)
	{
	
		teacherfilter.click();
			   selUtil.hardWait(3);

			   List<String>TeacherFromDropDownlist = selectteacher.asList();
				selUtil.hardWait(2);
				for(String Teacher : TeacherFromDropDownlist)
				{
				String selectTeacherNameXpath = selectteacherCheckBoxXpath.replace("$Teacher$", Teacher);

				WebElement selectTeacherNameMenuwe = driver.findElement(By.xpath(selectTeacherNameXpath));

				selUtil.waitUntilElementIsPresentOnPage(10, selectTeacherNameMenuwe);
				selUtil.getAction().moveToElement(selectTeacherNameMenuwe).click().perform();
				Assert.assertTrue(selectTeacherNameMenuwe.isDisplayed());
//				clickOnBlankSpace.click();
				}
				
			}

	
	
	

	public void seeProgressBarColorDispaleyed(String expectedGreenBar, String expectedOrangear, String expectedRedBar)
			throws ParseException {

		if (selUtil.isElementExists(closeButtonOfRobot)) {
			closeButtonOfRobot.click();
		}

		seeGreenColortext.click();
		Assert.assertEquals(expectedGreenBar, seeGreenColortext.getText());

		if (selUtil.isElementExists(closeButtonOfRobot)) {
			closeButtonOfRobot.click();
		}

		seeOrangeColortext.click();
		Assert.assertEquals(expectedOrangear, seeOrangeColortext.getText());

		if (selUtil.isElementExists(closeButtonOfRobot)) {
			closeButtonOfRobot.click();

			seeRedColortext.click();
			Assert.assertEquals(expectedRedBar, seeRedColortext.getText());
		}
	}

	public void seeListOfClassesAsPerSelectedSchool() {
		List<WebElement> listOfClassesAsPerSchool = driver.findElements(By.xpath(seeClassesPerSelectedSchoolXpath));
		List<WebElement> listOfClassProgressAsPerSchool = driver
				.findElements(By.xpath(seeClassProgressPerSelectedSchoolXpath));

		for (int i = 0; i < listOfClassesAsPerSchool.size(); i++) {
			String classNameOnClassPlaytimePage = listOfClassesAsPerSchool.get(i).getText();
			selUtil.getAction().moveToElement(listOfClassesAsPerSchool.get(i));
			Assert.assertTrue(listOfClassesAsPerSchool.get(i).isDisplayed(),
					"Class from the list is displayed on Class PlayTime Report page");

			String classProgressPercentage = listOfClassProgressAsPerSchool.get(i).getAttribute("style");

			if (classProgressPercentage.contains("width: 0%;")) {
				Assert.assertTrue(listOfClassProgressAsPerSchool.get(i).isDisplayed(),
						"Class Prgress is 0% Or less Than 0.1%");
			} else {
				Assert.assertTrue(listOfClassProgressAsPerSchool.get(i).isDisplayed(), "Class Prgress is More than 0%");
			}

		}
	}

	public void selectDomainForSchoolEntryReport(String expectedDomainName) {
		selUtil.hardWait(5);
		Select domain_drp = new Select(selectDomainforSchoolEntry);
		domain_drp.selectByVisibleText(expectedDomainName);
	}

	public void selectSubDomainForSchoolEntryReport(String expectedSubDomain) {
		selUtil.hardWait(5);
		Select subdomain_drp = new Select(selectSubDomainforSchoolEntry);
		subdomain_drp.selectByVisibleText(expectedSubDomain);
	}

	public void selectDemographicDataForSchoolEntryReport() {
		selUtil.hardWait(5);
		clickOnDemographicDroDown.click();
	}

	public void selectSchoolsFromSchoolDropdownForSchoolEntryReport(String expectedSchoolName) {

		Select domain_drp = new Select(selectSchoolforSchoolEntry);
		domain_drp.selectByVisibleText(expectedSchoolName);

	}

	public void seeClassEntryCompletedProgressBar() {
		Assert.assertTrue(classEntryCompletedBar.isDisplayed());
	}

	public void seeclassEntryCompletedProgressBar() {
		selUtil.waitUntilElementIsPresentOnPage(40,
				driver.findElement(By.xpath("//span[contains(text(),'Entry Completion By')]")));
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Entry Completion By')]")).isDisplayed());
	}

	public void selectClassFromClassDropdownForClassEntryReport(String expectedClassname) {
		Select domain_drp = new Select(selectClassforSchoolEntry);
		domain_drp.selectByVisibleText(expectedClassname);
	}

	public void seeListOfClassesonSchoolEntryPage() {
//		actualSchoolName.isDisplayed();
		selUtil.hardWait(2);
		selUtil.waitUntilElementIsPresentOnPage(50,
				driver.findElement(By.xpath("//span[@class='d-block cc-pointer fs-14']/a")));
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='d-block cc-pointer fs-14']/a")).isDisplayed());
	}

	public void seeListOfSchoolsonSchoolEntryPage() {
//		actualSchoolName.isDisplayed();
		selUtil.waitUntilElementIsPresentOnPage(50,
				driver.findElement(By.xpath("//span[@class='d-block cc-pointer fs-14']/a")));
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='d-block cc-pointer fs-14']/a")).isDisplayed());

	}

	public void skillDemonstratedAfterHoveringOverOnDotsForSchoolEntryReport() {
//		for(int i=0;i>=skilldemonstrateddot.size();i++)
//		{
//
//		}
		List<WebElement> skillDotList = new ArrayList<>();
		for (WebElement skilldot : skillDotList) {
//		    	skillDotList.add(element);
			selUtil.getAction().moveToElement(skilldot).perform();
			selUtil.hardWait(2);
		}
	}

	public void clickOnLoadMoreButtonForSchoolEntryReport() {
		// selUtil.waitUntilElementIsPresentOnPage(60, schoolEntrhLoadMoreButton);
		Boolean isLoaDmoreExist = selUtil.isElementExists(schoolEntrhLoadMoreButton);
		if (isLoaDmoreExist) {
			selUtil.getAction().moveToElement(schoolEntrhLoadMoreButton).perform();
			schoolEntrhLoadMoreButton.click();
		} else
			System.out.println("This user don't have more than 20 schools");
	}

	public void seeSkillEmergingSkillDemonstratedAndSkillNotOffered() {
		Assert.assertTrue(skillEmerging.isDisplayed());
		Assert.assertTrue(skillDemonstrated.isDisplayed());
		Assert.assertTrue(notoffers.isDisplayed());
	}

	public void seeSchoolEntryCompletedProgressBar() {
		Assert.assertTrue(schoolEntryCompletedBar.isDisplayed());
	}

	public void seeNumberOfCompltedEntryCount() {
		selUtil.waitUntilElementIsPresentOnPage(40, seeNumberOfschoolcompletedText);
		Assert.assertTrue(seeNumberOfschoolcompletedText.isDisplayed());
	}

	public void afterClickingSchoolNameNavigateToClassEntryReportPage() {
		selUtil.waitUntilElementIsPresentOnPage(10,
				driver.findElement(By.xpath("//span[@class='d-block cc-pointer fs-14']/a")));
		selUtil.hardWait(4);
		driver.findElement(By.xpath("//span[@class='d-block cc-pointer fs-14']/a")).click();
		selUtil.waitUntilElementIsPresentOnPage(30, classentryPage);
		Assert.assertTrue(classentryPage.isDisplayed());
	}

	public void afterClickingClassNameNavigateToChildEntryReportPage() {
		selUtil.waitUntilElementIsPresentOnPage(50, actualclassName);
		selUtil.hardWait(4);
		actualclassName.click();
		selUtil.waitUntilElementIsPresentOnPage(50, childentryPage);
		Assert.assertTrue(childentryPage.isDisplayed());
	}

	public void clickOnLoadMoreButtonForChildEntryReport() {
//		selUtil.waitUntilElementIsPresentOnPage(50, schoolEntrhLoadMoreButton);
		Boolean isLoaDmoreExist = selUtil.isElementExists(childEntrhLoadMoreButton);
		if (isLoaDmoreExist) {
			selUtil.getAction().moveToElement(childEntrhLoadMoreButton).perform();
			childEntrhLoadMoreButton.click();
		} else
			System.out.println("This user don't have more than 20 schools");
	}

	public void seeListOfChildrenonChildEntryPage() {
		List<WebElement> listOfChildren = driver.findElements(By.xpath(actualChildName));

		for (WebElement listOfChild : listOfChildren) {
//		String childNameDisplayedOnChildEntryPage=listOfChildren.get(i).getText();
			selUtil.getAction().moveToElement(listOfChild);
			Assert.assertTrue(listOfChild.isDisplayed(),
					"Class from the list is displayed on Class PlayTime Report page");
//		System.out.println(childNameDisplayedOnChildEntryPage);
		}
	}

	public void seeChildEntryCompletedProgressBar() {
		selUtil.getNonStaleElement(20, schoolEntryCompletedBar);
		
		selUtil.waitUntilElementIsPresentOnPage(60,schoolEntryCompletedBar);
		Assert.assertTrue(
				schoolEntryCompletedBar.isDisplayed());
	}

	public void seeNumberOfChildrenCompletedEntry() {
		clickOnBlankSpace.click();
		selUtil.getNonStaleElement(20, driver.findElement(By.xpath("//h3/span[contains(text(),'Entry Completion By')]")));
		selUtil.waitUntilElementIsPresentOnPage(60,
				driver.findElement(By.xpath("//h3/span[contains(text(),'Entry Completion By')]")));
		Assert.assertTrue(
				driver.findElement(By.xpath("//h3/span[contains(text(),'Entry Completion By')]")).isDisplayed());
	}

	public void afterClickingChildNameNavigateToChildSkillDetailsPage() {
//		selUtil.waitUntilElementIsPresentOnPage(50, actualchildName);
		Boolean isChildExist = selUtil.isElementExists(actualchildName);
		if (isChildExist) {
			selUtil.hardWait(5);
			actualchildName.click();
			selUtil.waitUntilElementIsPresentOnPage(50, childSkillDetailsPage);
			Assert.assertTrue(childSkillDetailsPage.isDisplayed());
		} else
			System.out.println("Children not present for the applied filters");
	}

	public void verifyChildSkillConferencePage(String page) {
		String actualpagename = title.getText();
		Assert.assertEquals(actualpagename, page);
		System.out.println("Page name is displayed as" + actualpagename);
	}

	public void verifyChildnamColumn() {
		Assert.assertTrue(childname.isDisplayed(), "Child name column is not displayed on page");
	}

	public void verifyIgniteReportColumn() {
		Assert.assertTrue(ignitereportname.isDisplayed(), "ignitereport column is not displayed on page");
	}

	public void verifyIgniteTableReportColumn() {
		Assert.assertTrue(ignitetablereportname.isDisplayed(), "ignitetablereport column is not displayed on page");
	}

	public void verifyIgniteTableGameReportColumn() {
		Assert.assertTrue(ignitetablegamereport.isDisplayed(), "ignitetablegamereport column is not displayed on page");
	}

	public void VerifyChildlist() {
		for (WebElement child_list : childnames) {

			String childnamelist = child_list.getText();
			System.out.println("Child list is displayed as" + childnamelist);
		}

	}

	public void clickOnViewIgniteTablereport() {
		viewignitetable.click();
	}

	public void clickOnViewIgniteGamereport() {
		viewgameplayreport.click();
	}

	public void verifyIgniteChildSkillPage(String ignitepage) {
		viewignite.click();
		String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
			if (!childWindowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(childWindowHandle);
				String pagename = ignitetitle.getText();
				Assert.assertEquals(pagename, ignitepage);
				System.out.println("Page name is displayed as" + pagename);
				// Close child windows
				driver.close();
			}
		}

		driver.switchTo().window(mainWindowHandle);

	}

	public void verifyIgnitetableChildSkillPage(String ignitetablepage) {
		selUtil.hardWait(5);
		viewignitetable.click();
		String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
			if (!childWindowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(childWindowHandle);
				String actualname = ignitetabletitle.getText();
				Assert.assertEquals(actualname, ignitetablepage);
				System.out.println("Page name is displayed as" + actualname);
				// Close child windows
				driver.close();
			}
		}

		driver.switchTo().window(mainWindowHandle);
	}

	public void verifyGamePlayreportPage(String gamplaypage) {
		selUtil.hardWait(5);
		viewgameplayreport.click();
		String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
			if (!childWindowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(childWindowHandle);
				String pagename = title.getText();
				Assert.assertEquals(pagename, gamplaypage);
				System.out.println("Page name is displayed as" + pagename);
				// Close child windows
				driver.close();
			}
		}

		driver.switchTo().window(mainWindowHandle);
	}

	public void selectClassname(DataTable expectedChildrenClass) {
		selUtil.waitUntilElementIsPresentOnPage(10, childdrp);
		childdrp.click();
		List<String> ChilclassList = expectedChildrenClass.asList();
		for (String chilclass : ChilclassList) {
			String selectclassNameXpath = ChildlistXpath.replace("$childlist$", chilclass);
			WebElement selectclassNamewe = driver.findElement(By.xpath(selectclassNameXpath));
//    		selUtil.waitUntilElementIsPresentOnPage(10, selectclassNamewe);
			selUtil.hardWait(5);
			selUtil.getAction().moveToElement(selectclassNamewe).click().perform();
//    		Assert.assertTrue(selectclassNamewe.isDisplayed());
			selUtil.hardWait(5);
//    		selectclassNamewe.click();
			clickOnBlankSpace.click();
		}
	}

	public void clickOnPrintbtn() {
		Assert.assertTrue(printbtn.isEnabled(), "Print button is not enabled on the page");
	}
	// School setup page

	public void verifySchoolSetupPage(String expectedReortPageTitle) {
		String actualpagename = SchoolSetuppagetitle.getText();
		Assert.assertEquals(actualpagename, expectedReortPageTitle);
		System.out.println("Page name is displayed as " + actualpagename);
	}

	public void verifyTextInTheBlueBanner(String expectedReportPageTitle1) {
		String actualpagename = SchoolSetuppageBlueHeadertitle.getText();
		Assert.assertEquals(actualpagename, expectedReportPageTitle1);
		System.out.println("School Setup bule banner text is displayed as " + actualpagename);

	}

	public void clickOnLearnMoreLink() {
		selUtil.hardWait(5);
		LeanMoreLink.click();
		driver.navigate().back();

	}

	public void verifyIgniteTab(String expectedtabname) {
		String actualpagename = IgniteTab.getText();
		Assert.assertEquals(actualpagename, expectedtabname);
		System.out.println("IgniteTab name is displayed as " + actualpagename);
		selUtil.hardWait(5);
		IgniteTab.click();
		selUtil.hardWait(5);
	}

	public void verifyIgniteTableTab(String expectedtabname) {
		String actualpagename = IgniteTableTab.getText();
		Assert.assertEquals(actualpagename, expectedtabname);
		System.out.println("IgniteTableTab name is displayed as " + actualpagename);
		selUtil.hardWait(5);
		IgniteTableTab.click();
		selUtil.hardWait(5);
	}

	public void verifyTeacherColumn(String expectedcolumnname) {
		String actualcolumnname = TeacherColumn.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Teacher cloumn name is " + actualcolumnname);
	}

	public void verifyChildrenColumn(String expectedcolumnname1) {
		String actualcolumnname = ChildrenColumn.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname1);
		System.out.println("Children cloumn is getting displayed");
		System.out.println("Children cloumn name is " + actualcolumnname);
	}

	public void verifySchoolNameColumn(String expectedcolumnname) {
		String actualcolumnname = SchoolNameColumn.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("School Name cloumn is getting displayed");
		System.out.println("School Name cloumn name is " + actualcolumnname);
	}

	public void verifyOfClassessCloumn(String expectedcolumnname) {
		String actualcolumnname = classnamecolumn.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("OfClasses cloumn is getting displayed");
		System.out.println("OfClasses cloumn name is " + actualcolumnname);
	}

	public void verifyTotalColumn(String expectedcolumnname) {
		String actualcolumnname = Totalcolumn.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Total cloumn is getting displayed");
		System.out.println("Total cloumn name is " + actualcolumnname);

	}

	public void verifyaccessedinsightsColumn(String expectedcolumnname) {
		String actualcolumnname = totalacessedinsights.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Total Acessed Insights is getting displayed");
		System.out.println("Total Acessed Insights name is " + actualcolumnname);
	}

	public void verifyTotalColumn1(String expectedcolumnname) {
		String actualcolumnname = Totalcolumn1.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Total cloumn is getting displayed");
		System.out.println("Total cloumn name is " + actualcolumnname);

	}

	public void verifyigniteassigned(String expectedcolumnname) {
		String actualcolumnname = igniteassigned.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Ignite Assigned cloumn is getting displayed");
		System.out.println("Ignite Assigned name is " + actualcolumnname);
	}

	public void verifyChildrenWithFamilyMembers(String expectedcolumnname) {
		String actualcolumnname = withfamilymembers.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Children With Family Members cloumn is getting displayed");
		System.out.println("Children With Family Members cloumn name is " + actualcolumnname);
	}

	public void verifyWithPhotos(String expectedcolumnname) {
		String actualcolumnname = withphotos.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("With Photos cloumn is getting displayed");
		System.out.println("With Photos cloumn name is " + actualcolumnname);
	}

	public void verifyChildrenplaying(String expectedcolumnname) {
		String actualcolumnname = childrenplayed.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Children Playing cloumn is getting displayed");
		System.out.println("Children Playing cloumn name is " + actualcolumnname);
	}

	public void verifyschoolnamelist() {
		selUtil.hardWait(2);
		for (WebElement schoollist : SchoolNameList) {

			String Namelist = schoollist.getText();
			System.out.println("School list is displayed as" + Namelist);
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
	}

	public void clickonSchoolName(String classsetuppage) {
		SchoolNameLink.click();
		selUtil.hardWait(5);
		String pagename = ClassSetuppage.getText();
		Assert.assertEquals(pagename, classsetuppage);
		System.out.println("Class Setup page is displayed with title " + pagename);

	}

	// class setup page
	public void verifyClassSetupPage(String expectedReortPageTitle) {
		String actualpagename = ClassSetuppagetitle.getText();
		Assert.assertEquals(actualpagename, expectedReortPageTitle);
		System.out.println("Page name is displayed as " + actualpagename);
	}

	public void verifyClassNameColumn(String expectedcolumnname) {
		String actualcolumnname = ClassNameColumn.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Class Name column is getting displayed");
		System.out.println("Class Name column name is " + actualcolumnname);
	}

	public void verifyTeacherNameColumn(String expectedcolumnname) {
		String actualcolumnname = TeacherNameColumn.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Teacher Name column is getting displayed");
		System.out.println("Teacher Name column name is " + actualcolumnname);
	}

	public void verifyAccessedInsightsColumn(String expectedcolumnname) {
		String actualcolumnname = AccessesInsights.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Accessed insights column is getting displayed");
		System.out.println("Accessed insights column name is " + actualcolumnname);
	}

	public void verifyLearnMoreLinkForClassSetup() {
		selUtil.hardWait(5);
		LeanMoreLink.click();
		selUtil.hardWait(5);
		// Getting all windows handle
		List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
		// switching the drive instance to the child tab
		driver.switchTo().window(windowHandles.get(1));
		// closing the Child tab
		driver.close();
//    	// Switch the drive instance to the child tab
		driver.switchTo().window(windowHandles.get(0));

	}

	public void verifyChildrenColumnOnClassSetup(String expectedcolumnname2) {
		String actualcolumnname = ChildrenColumnOnClassSetup.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname2);
		System.out.println("Children cloumn is getting displayed");
		System.out.println("Children cloumn name is " + actualcolumnname);

	}

	public void verifyTotalColumnOnClassSetup(String expectedcolumnname) {
		String actualcolumnname = TotalcolumnOnClassSetup.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Total cloumn is getting displayed");
		System.out.println("Total cloumn name is " + actualcolumnname);

	}

	public void verifyigniteassignedOnClassSetup(String expectedcolumnname) {
		String actualcolumnname = igniteassignedOnClassSetup.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Ignite Assigned cloumn is getting displayed");
		System.out.println("Ignite Assigned name is " + actualcolumnname);

	}

	public void verifyChildrenWithFamilyMembersOnClassSetup(String expectedcolumnname) {
		String actualcolumnname = withfamilymembersOnClassSetup.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Children With Family Members cloumn is getting displayed");
		System.out.println("Children With Family Members cloumn name is " + actualcolumnname);
	}

	public void verifyWithPhotosOnClassSetup(String expectedcolumnname) {
		String actualcolumnname = withphotosOnClassSetup.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("With Photos cloumn is getting displayed");
		System.out.println("With Photos cloumn name is " + actualcolumnname);
	}

	public void verifyChildrenplayingOnClassSetup(String expectedcolumnname) {
		String actualcolumnname = childrenPlaying.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Children Playing cloumn is getting displayed");
		System.out.println("Children Playing cloumn name is " + actualcolumnname);
	}

	public void verifyClassnamelist() {
		selUtil.hardWait(2);
		for (WebElement Classlist : ClassNameList) {

			String Namelist = Classlist.getText();
			System.out.println("Class list is displayed as" + Namelist);
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
	}

	public void verifyIgniteUsageColumn(String expectedcolumnname) {
		String actualcolumnname = igniteUsage.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Ignite Usage cloumn is getting displayed");
		System.out.println("Ignite Usage cloumn name is " + actualcolumnname);
	}

	public void verifyTeachersColumn(String expectedcolumnname) {
		String actualcolumnname = TeachersColumn.getText();
		Assert.assertEquals(actualcolumnname, expectedcolumnname);
		System.out.println("Teachers cloumn is getting displayed");
		System.out.println("Teachers cloumn name is " + actualcolumnname);
	}

	public void VerifyingSubcolumnunderIgniteUsageColumn(DataTable expectedColumnsName) {

		List<String> subcolumnslist = expectedColumnsName.asList();
		selUtil.hardWait(2);
		for (String Subcolumn : subcolumnslist) {

			String selectSubcolumnNameXpath = subcolumnsXpathIgniteUsage.replace("$Subcolumn$", Subcolumn);

			WebElement selectSubcolumNamewe = driver.findElement(By.xpath(selectSubcolumnNameXpath));

			selUtil.waitUntilElementIsPresentOnPage(10, selectSubcolumNamewe);
			selUtil.getAction().moveToElement(selectSubcolumNamewe).click().perform();
			Assert.assertTrue(selectSubcolumNamewe.getText().contains(Subcolumn));
			System.out.println("I am able to see " + Subcolumn + " Column under Ignite Usage Column");
		}
		clickOnBlankSpace.click();
	}
	
	public void sortSubcolumnunderIgniteUsageColumn(DataTable expectedColumnsName) {

		List<String> subcolumnslist = expectedColumnsName.asList();
		selUtil.hardWait(2);
		for (String Subcolumn : subcolumnslist) {

			String selectSubcolumnNameXpath = subcolumnsXpathIgniteUsage.replace("$Subcolumn$", Subcolumn);

			WebElement selectSubcolumNamewe = driver.findElement(By.xpath(selectSubcolumnNameXpath));
			selectSubcolumNamewe.click();
			System.out.println("I am able to sort the " + Subcolumn + " Column under Ignite Usage Column");
		}
		clickOnBlankSpace.click();
	}
	
	public void VerifyingSubcolumnunderTeachersColumn(DataTable expectedColumnsName) {

		List<String> subcolumnslist = expectedColumnsName.asList();
		selUtil.hardWait(2);
		for (String Subcolumn : subcolumnslist) {

			String selectSubcolumnNameXpath = subcolumnsXpathTeachers.replace("$Subcolumn$", Subcolumn);

			WebElement selectSubcolumNamewe = driver.findElement(By.xpath(selectSubcolumnNameXpath));

			selUtil.waitUntilElementIsPresentOnPage(10, selectSubcolumNamewe);
			selUtil.getAction().moveToElement(selectSubcolumNamewe).click().perform();
			Assert.assertTrue(selectSubcolumNamewe.getText().contains(Subcolumn));
			System.out.println("I am able to see " + Subcolumn + " Column under Teachers Column");
		}
		clickOnBlankSpace.click();
	}
	
	
	// School Utilization page

	
	public void verifySchoolUtiliaztion(String expectedname)
	{
		{
			String actualpagename = SchoolUtilizationPageHeader.getText();
			Assert.assertEquals(actualpagename, expectedname);
			System.out.println("Page name is displayed as " + actualpagename);
		}
		
	}
	
	public void verifyLearnMoreLinkForSchoolUtilizationpage() {
		selUtil.hardWait(5);
		learmore1.click();
		selUtil.hardWait(5);
		// Getting all windows handle
		List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
		// switching the drive instance to the child tab
		driver.switchTo().window(windowHandles.get(1));
		// closing the Child tab
		driver.close();
//    	// Switch the drive instance to the child tab
		driver.switchTo().window(windowHandles.get(0));

	}
	
	public void verifyclassnamecolumn(String expectedname)
	{
		String actualpagename = classnamecolumn1.getText();
		Assert.assertEquals(actualpagename, expectedname);
		System.out.println("column name is displayed as " + actualpagename);
	}
	
	public void verifyChildrenPlaying(String expectedname)
	{
		String actualpagename = ChildrenPlaying.getText();
		Assert.assertEquals(actualpagename, expectedname);
		System.out.println("column name is displayed as " + actualpagename);
	}
	
	public void verifyTotalGamePlayed(String expectedname )
	{
		String actualpagename = TotalGamePlayed.getText();
		Assert.assertEquals(actualpagename, expectedname);
		System.out.println("column name is displayed as " + actualpagename);
	}
	
	public void verifyTotalAvgSkilllevel(String expectedname )
	{
		String actualpagename = TotalAvgSkilllevel.getText();
		Assert.assertEquals(actualpagename, expectedname);
		System.out.println("column name is displayed as " + actualpagename);
	}
	
	public void verifyAvgChildPlaytime(String expectedname )
	{
		String actualpagename = AvgChildPlaytime.getText();
		Assert.assertTrue(actualpagename.contains(expectedname));
		System.out.println("column name is displayed as " + actualpagename);
	}
	
	public void verifyTotalInsightsLogins(String expectedname )
	{
		String actualpagename = TotalinsightsLogins.getText();
		Assert.assertEquals(actualpagename, expectedname);
		System.out.println("column name is displayed as " + actualpagename);
	}
	
	
	
	// Child Progress page
	
	public void verify_entry_report_page(String expectedTitle)
	{
		entryprogresslink.click();
		String entryTitleXpath=entryTitle.replace("$Title$", expectedTitle);
		WebElement entryTitleWE=driver.findElement(By.xpath(entryTitleXpath));
		selUtil.waitUntilElementIsPresentOnPage(10, entryTitleWE);
		Assert.assertEquals(entryTitleWE.getText(), expectedTitle);
		System.out.println("The title of the page is " + entryTitleWE.getText());
	}
	
	public void Verify_i_should_able_to_sort_children_list()
	{
		selUtil.waitUntilElementIsPresentOnPage(30, namesort);
		namesort.click();
	}
	
	
	public void setCustomDateForProgressPages(String expectedStartDate,String expectedEndDate)
	
	{
		selUtil.hardWait(3);
		common.setDateStart(expectedStartDate);
		selUtil.hardWait(3);
		common.setDateEnd(expectedEndDate);
	}
	
	public void VerifyingNavigationToChildSkillDetailsPage()
	{
		selUtil.waitUntilElementIsPresentOnPage(20, childnamelink);
		childnamelink.click();
		common.popOnReportPages();
		selUtil.waitUntilElementIsPresentOnPage(30, childSkillDetailsPage);
		Assert.assertTrue(childSkillDetailsPage.isDisplayed());
		backbutton.click();
		
		
	}
	
	// School Progress report

	public void selectDomainNameFromDropdownSchoolProgress(DataTable selectDomainName) {
		selUtil.waitUntilElementIsPresentOnPage(40, clickOnDomainButtonSchoolProress);
		clickOnDomainButtonSchoolProress.click();

		List<String> domainFromDropDownlist = selectDomainName.asList();
		for (String expectedDomain : domainFromDropDownlist) {
			String selectDomainNameXpath = selectDomainCheckBoxXpath.replace("$DomainName$", expectedDomain);
			WebElement selectDomainNameMenuwe = driver.findElement(By.xpath(selectDomainNameXpath));
			selUtil.waitUntilElementIsPresentOnPage(40, selectDomainNameMenuwe);
			selUtil.getAction().moveToElement(selectDomainNameMenuwe).click().perform();
		}
		
		
	}
	
	
	public void navigationtotheClassProgress() {
		
		selUtil.waitUntilElementIsPresentOnPage(20, classProgresslink);
		classProgresslink.click();
		common.popOnReportPages();
		selUtil.waitUntilElementIsPresentOnPage(30, classProgressTitle);
		Assert.assertTrue(childSkillDetailsPage.isDisplayed());
		backbutton.click();
		
	}
	

}
