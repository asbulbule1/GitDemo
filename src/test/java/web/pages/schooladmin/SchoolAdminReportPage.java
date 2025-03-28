package web.pages.schooladmin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import util.Selenium;
import web.stepdefs.BaseClass;

public class SchoolAdminReportPage extends BaseClass {
	private WebDriver driver;
	private Selenium selUtil;

	@FindBy(how = How.XPATH, using = "//h1[@class='title']")
	private WebElement pagetitle;

	@FindBy(how = How.ID, using = "class_playtime_school_id")
	private WebElement sch_drp;

	@FindBy(how = How.XPATH, using = "//td[@class='report-childname pl-0']/a")
	private List<WebElement> classlist;

	@FindBy(how = How.XPATH, using = "//input[@value='1']")
	private WebElement thisweek;

	@FindBy(how = How.XPATH, using = "//input[@value='2']")
	private WebElement lastweek;

	@FindBy(how = How.XPATH, using = "//input[@value='3']")
	private WebElement schoolyear;

	@FindBy(how = How.XPATH, using = "//input[@value='4']")
	private WebElement customyear;

	@FindBy(how = How.ID, using = "childplaytimeSubdomainId")
	private WebElement subdomaindrp;

	@FindBy(how = How.ID, using = "childplaytimeSchoolId")
	private WebElement childplaytimesch;

	@FindBy(how = How.ID, using = "childplaytimeClassId")
	private WebElement childplaytimeclsdrp;

	@FindBy(how = How.XPATH, using = "//span[@class='selected_options']")
	private WebElement drpbtn;

	@FindBy(how = How.XPATH, using = "//select[@id='subdomain_id']")
	private WebElement schoolprogresssubdomain;

	@FindBy(how = How.XPATH, using = "//input[@type='radio' and @value='1']")
	private WebElement engradiobtn;

	@FindBy(how = How.XPATH, using = "//input[@type='radio' and @value='2']")
	private WebElement spanishbtn;

	@FindBy(how = How.XPATH, using = "//input[@type='radio' and @value='all']")
	private WebElement allradiobtn;

	@FindBy(how = How.XPATH, using = "//td[@class='col-md-1 col-sm-12 p-1 align-self-center text-right progress-report']/a")
	private List<WebElement> listofschools;

	@FindBy(how = How.XPATH, using = "//div[@class='custom-progress-bar']")
	private WebElement customebar;

	@FindBy(how = How.XPATH, using = "//div[@class='ms-options']//li/label")
	private List<WebElement> allcheckboxes;

	@FindBy(how = How.ID, using = "School_school_id")
	private WebElement classschdrp;

	@FindBy(how = How.ID, using = "School_subdomain_id")
	private WebElement classsubdrp;

	@FindBy(how = How.XPATH, using = "//td[@class='col-md-1 col-sm-12 p-1 text-right align-self-center']/a")
	private List<WebElement> listofclass;

	@FindBy(how = How.XPATH, using = "//select[@id='schoolId']")
	private WebElement childprogressschdrp;

	@FindBy(how = How.XPATH, using = "//select[@id='classroomId']")
	private WebElement childprogressclsdrp;

	@FindBy(how = How.XPATH, using = "//select[@id='subdomainId']")
	private WebElement childprogresssubdrp;

	@FindBy(how = How.XPATH, using = "//td[@class='col-md-1 col-sm-12 p-1 align-self-center text-right']/a")
	private List<WebElement> childlist;

	@FindBy(how = How.XPATH, using = "//input[@name='school_progress_filter' and @value='2']")
	private WebElement schoolplaytimelastweek;

	@FindBy(how = How.XPATH, using = "//input[@name='school_progress_filter' and @value='3']")
	private WebElement schoolplaytimeschyear;

	@FindBy(how = How.XPATH, using = "//input[@name='school_progress_filter' and @value='4']")
	private WebElement schoolplaytimecustom;

	@FindBy(how = How.ID, using = "supportneeded_c0")
	private WebElement classheader;

	@FindBy(how = How.ID, using = "supportneeded_c1")
	private WebElement scoreslessthan80header;

	@FindBy(how = How.ID, using = "supportneeded_c2")
	private WebElement scoreslessthan50header;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-1']")
	private WebElement clickonschdrp;

	@FindBy(how = How.XPATH, using = "//body")
	private WebElement clickOnBlankSpace;

//	@FindBy(how=How.XPATH,using="//div[@id='ms-list-2']")
	// This line has been commented and a new added to make it compatible with other
	// reports
//p[contains(text(), 'Date Range')]/following-sibling::div[contains(@class, 'MuiOutlinedInput-root')]
	@FindBy(how = How.XPATH, using ="//p[normalize-space(.)='Teacher']/following-sibling::div[contains(@class, 'MuiOutlinedInput-root')]")
	private WebElement clickonteachdrp;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-3']")
	private WebElement clickonparentdrp;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-4']")
	private WebElement clickondevicedrp;

	@FindBy(how = How.XPATH, using = "//tr[@class='odd']/td")
	private List<WebElement> detaillist;

	@FindBy(how = How.XPATH, using = "//th[@id='view_all_children_c0']/a")
	private WebElement lastsyncheader;

	@FindBy(how = How.XPATH, using = "//th[@id='view_all_children_c1']/a")
	private WebElement appversionheader;

	@FindBy(how = How.XPATH, using = "//th[@id='view_all_children_c2']/a")
	private WebElement schoolheader;

	@FindBy(how = How.XPATH, using = "//th[@id='view_all_children_c3']/a")
	private WebElement teacherheader;

	@FindBy(how = How.XPATH, using = "//th[@id='view_all_children_c5']/a")
	private WebElement deviceheader;

	@FindBy(how = How.XPATH, using = "//th[@id='view_all_children_c6']/a")
	private WebElement idnumberheader;

	@FindBy(how = How.XPATH, using = "//div[@id='demographics']/button")
	private static WebElement demographicdropdown;

	@FindBy(how = How.ID, using = "demographic-apply")
	private static WebElement demographicFilterApply;

	@FindBy(how = How.XPATH, using = "//button[@type='button']//parent::div[@class='dropdown']")
	private WebElement dateRangeDropdown;

	@FindBy(how = How.XPATH, using = "//a[text()='Custom Range']")
	private static WebElement customRangeOption;

	@FindBy(how = How.XPATH, using = "//span[text()='Custom Range']")
	private static WebElement customRangeOptionClassPlaytime;

	@FindBy(how = How.XPATH, using = "//th[@id='organization_grid_c0' and text()='Child Name']")
	private static WebElement childNameColumn;

	@FindBy(how = How.XPATH, using = "//th[@id='organization_grid_c1' and text()='Ignite Reports']")
	private static WebElement igniteReportColumnCSDPage;

	@FindBy(how = How.XPATH, using = "//th[@id='organization_grid_c2' and text()='IgniteTable Reports']")
	private static WebElement igniteTableReportColumn;

	@FindBy(how = How.XPATH, using = "(//tr/td/a[@class='mr-2'])[1]")
	private static WebElement viewIgniteReportLink;

	@FindBy(how = How.XPATH, using = "//li/a[@class='active' and text()='IGNITE']")
	private static WebElement igniteChildSkillDetailsPage;

	@FindBy(how = How.XPATH, using = "(//tr/td/a[@class='mr-2'])[2]")
	private static WebElement viewIgniteTableReportLink;

	@FindBy(how = How.XPATH, using = "//li/a[@class='active' and text()='IGNITETABLE']")
	private static WebElement igniteTableChildSkillDetailsPage;

	@FindBy(how = How.XPATH, using = "(//a[@class='mr-0 ml-5'])[1]")
	private static WebElement printButtonCSDPage;

	@FindBy(how = How.XPATH, using = "//div[@class='Classroom_classroom_id']")
	private static WebElement classRoomdropdownCSD;

	@FindBy(how = How.XPATH, using = "//div[@class='ms-search']/input")
	private static WebElement enterClassnameInSearch;

	@FindBy(how = How.XPATH, using = "//body")
	private WebElement clickOnBlankSapace;

	String childNameCSDPage = "//tbody/tr[@class='odd' or @class='even']//td[contains(text(),'')][1]";
	String classNameXpath = "//label[@title='$classname$']";

	String dateRangeSelect = "//a[text()='$dateRange$' and @class='dropdown-item progress_filter']";

	String dateRangeSelectClassPlaytime = "//span[text()='$dateRange$' and @class='dropdown-item progress_filter']";

	String childAgeXpath = "//input[@name='age[]' and @value='$childage$']";
	String childGradeXpath = "//input[@name='grade[]' and @value='$childGrade$']";
	String childLanguageXpath = "//input[@name='language[]' and @value='$childLanguage$']";
	String childRaceXpath = "//input[@name='race[]' and @value='$childRace$']";
	String childEthnicityXpath = "//input[@name='ethnicity[]' and @value='$childEthnicity$']";

	String selectAgeCheckBoxXpath = "//input[@title='$selectAge$']/following-sibling::span";

	String selectGradeCheckBoxXpath = "//input[@title='$selectGrade$']/following-sibling::span";

	String selectLanguageCheckBoxXpath = "//input[@title='$Language$']/following-sibling::span";

	String selectRaceCheckBoxXpath = "//input[@title='$Race$']/following-sibling::span";

	String selectEthnicityCheckBoxXpath = "//input[@title='$Ethnicity$']/following-sibling::span";

	String labelname_xpath = "//label[@title='schoolname']";

	String selectSchoolCheckBoxXpath = "//label[@title='$SchoolName$' and  contains(for,'ms-opt-')='']/span";

	//String selectTeacherCheckBoxXpath = "//label[@title='$TeacherName$' and  contains(for,'ms-opt-')='']/span";
	String selectTeacherCheckBoxXpath = "//li[@value='$TeacherName$']//input[@type='checkbox']";

	
	String selectParentCheckBoxXpath = "//label[@title='$ParentName$' and  contains(for,'ms-opt-')='']/span";

	String selectDeviceCheckBoxXpath = "//label[@title='$DeviceName$' and  contains(for,'ms-opt-')='']/span";

	public SchoolAdminReportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(driver);
	}

	String CommonsubmenuLink = "//a[contains(@class, 'dropdown-item') and contains(text(), '$submenu$')]";

	public void seeReportMenusOnSubsection(DataTable expectedReportSubmenus) {
		selUtil.hardWait(2);
		List<String> menuslist = expectedReportSubmenus.asList();
		for (String expectedReportMenu : menuslist) {
			String submenuXpath = CommonsubmenuLink.replace("$submenu$", expectedReportMenu);
			WebElement reportMenuwe = driver.findElement(By.xpath(submenuXpath));
//				selUtil.waitUntilElementIsPresentOnPage(10, reportMenuwe);
			// selUtil.getAction().moveToElement(reportMenuwe).perform();
			System.out.println(reportMenuwe.getText());
			selUtil.hardWait(2);
			Assert.assertTrue(reportMenuwe.getText().contains(expectedReportMenu), "Menu are present");
		}
	}

	public void verifyClassPlaytimePage(String classplaytime) {
		selUtil.hardWait(5);
		String actualpagename = pagetitle.getText();
		Assert.assertEquals(actualpagename, classplaytime);
		System.out.println("Page name is displayed as" + actualpagename);
	}

	public void selectSchoolDropdown(String schdrp) {
		Select select_class_dropdown = new Select(sch_drp);
		select_class_dropdown.selectByVisibleText(schdrp);
	}

	public void seeClassNameList() {
		selUtil.hardWait(2);
		for (WebElement class_list : classlist) {

			String classnamelist = class_list.getText();
			System.out.println("Class list is displayed as" + classnamelist);

		}

	}

	public void selectThisWeek() {
		thisweek.click();
	}

	public void selectClassLastWeek() {
		lastweek.click();
	}

	public void selectSchoolYear() {
		schoolyear.click();
	}

	public void selectCustomYear() {
		customyear.click();
	}

	public void selectSubdomain(String subdrp) {
		Select select_subdomain_dropdown = new Select(subdomaindrp);
		select_subdomain_dropdown.selectByVisibleText(subdrp);
	}

	public void selectChildSchool(String schdrp) {
		Select select_sch_drp = new Select(childplaytimesch);
		select_sch_drp.selectByVisibleText(schdrp);
	}

	public void selectChildClassDrp(String clsdrp) {
		Select select_cls_drp = new Select(childplaytimeclsdrp);
		select_cls_drp.selectByVisibleText(clsdrp);
	}

	public void selectSchoolProgressSchool(String schdrp) {
		drpbtn.click();

		System.out.println(allcheckboxes.size());

		String schoolname_xpath = labelname_xpath.replace("schoolname", schdrp);

		WebElement we_level1 = driver.findElement(By.xpath(schoolname_xpath));

		if (we_level1.isDisplayed())
			we_level1.click();

		String actualname = we_level1.getText();

		Assert.assertEquals(actualname, schdrp);
		System.out.println("School selected is" + actualname);
	}

	public void selectSchoolProgressSubdomain(String subdrp) {
		Select select_sub_drp = new Select(schoolprogresssubdomain);
		select_sub_drp.selectByVisibleText(subdrp);
	}

	public void selectEnglishRadioBtn() {
		selUtil.hardWait(5);
		engradiobtn.click();
	}

	public void selectSpanishRadioBtn() {
		selUtil.hardWait(5);
		spanishbtn.click();
	}

	public void selectAllRadioBtn() {
		selUtil.hardWait(5);
		allradiobtn.click();
	}

	public void verifyListOfSchool() {
		for (WebElement school_namelist : listofschools) {
			String schoolname = school_namelist.getText();
			System.out.println(schoolname);
		}
		Assert.assertTrue(customebar.isDisplayed(), "Progress bar is not displayed on page");
	}

	public void selectClassSchDrp(String schdrp) {
		Select select_sch_drp = new Select(classschdrp);
		select_sch_drp.selectByVisibleText(schdrp);
	}

	public void selectClassSubDrp(String subdrp) {
		Select select_sub_drp = new Select(classsubdrp);
		select_sub_drp.selectByVisibleText(subdrp);
	}

	public void verifyListOfClass() {
		for (WebElement class_name_list : listofclass) {
			String classname = class_name_list.getText();
			System.out.println(classname);
		}
		Assert.assertTrue(customebar.isDisplayed(), "Progress bar is not displayed on page");
	}

	public void selectChildProgressSchdrp(String schdrp) {
		Select select_sch_drp = new Select(childprogressschdrp);
		select_sch_drp.selectByVisibleText(schdrp);
	}

	public void selectChildProgressClsdrp(String clsdrp) {
		Select select_cls_drp = new Select(childprogressclsdrp);
		select_cls_drp.selectByVisibleText(clsdrp);
	}

	public void selectChildProgressSubdrp(String subdrp) {
		Select select_sub_drp = new Select(childprogresssubdrp);
		select_sub_drp.selectByVisibleText(subdrp);
	}

	public void verifyListOfChild() {
		selUtil.hardWait(5);
		for (WebElement child_name : childlist) {
			String childname = child_name.getText();
			System.out.println(childname);
		}
		Assert.assertTrue(customebar.isDisplayed(), "Progress bar is not displayed on page");
	}

	public void clickOnSchoolPlaytimeLastWeek() {
		schoolplaytimelastweek.click();
	}

	public void clickOnSchoolPlaytimeSchoolYear() {
		schoolplaytimeschyear.click();
	}

	public void clickOnSchoolPlaytimeCustom() {
		schoolplaytimecustom.click();
	}

	public void verifySupportNeededTitle(String supportneededpage) {
		String actualpagename = pagetitle.getText();
		Assert.assertEquals(actualpagename, supportneededpage);
		System.out.println("Page name is displayed as" + actualpagename);
	}

	public void verifyClassHeader() {
		Assert.assertTrue(classheader.isDisplayed(), "Class header is not displayed on page");
	}

	public void verifyScoresLessThan80Header() {
		Assert.assertTrue(scoreslessthan80header.isDisplayed(), "Score less than 80 header is not displayed on page");
	}

	public void verifyScoresLessThan50Header() {
		Assert.assertTrue(scoreslessthan50header.isDisplayed(), "Score less than 50 header is not displayed on page");
	}

	public void selectSchoolsFromDropdown(DataTable expectedSchoolName) {
		clickonschdrp.click();
		selUtil.hardWait(3);

		List<String> schoolFromDropDownlist = expectedSchoolName.asList();
		selUtil.hardWait(2);
		for (String school : schoolFromDropDownlist) {

			String selectSchoolNameXpath = selectSchoolCheckBoxXpath.replace("$SchoolName$", school);

			WebElement selectSchoolNameMenuwe = driver.findElement(By.xpath(selectSchoolNameXpath));

			selUtil.waitUntilElementIsPresentOnPage(10, selectSchoolNameMenuwe);
			selUtil.getAction().moveToElement(selectSchoolNameMenuwe).click().perform();
			Assert.assertTrue(selectSchoolNameMenuwe.isDisplayed());
		}
		clickOnBlankSpace.click();
	}

	public void selectTeacherFromDropdown(DataTable expectedTeacherName) {
		selUtil.hardWait(3);
		clickonteachdrp.click();
		List<String> teacherFromDropDownlist = expectedTeacherName.asList();
		selUtil.hardWait(2);
		for (String teacher : teacherFromDropDownlist) {
			String selectTeacherNameXpath = selectTeacherCheckBoxXpath.replace("$TeacherName$", teacher);
			System.out.println(selectTeacherNameXpath);
			WebElement selectTeacherNameMenuwe = driver.findElement(By.xpath(selectTeacherNameXpath));
			//selUtil.waitUntilElementIsPresentOnPage(10, selectTeacherNameMenuwe);
			selUtil.getAction().moveToElement(selectTeacherNameMenuwe).click().perform();
			//Assert.assertTrue(selectTeacherNameMenuwe.isDisplayed());
		}
		//commonPage.waitUntillTheLoaderInvisible();
		//clickonteachdrp.click();

	}

	public void selectParentFromDropdown(DataTable expecetdParentName) {
		selUtil.hardWait(3);
		clickonparentdrp.click();
		selUtil.hardWait(3);
		List<String> parentFromDropDownlist = expecetdParentName.asList();
		selUtil.hardWait(2);
		for (String parent : parentFromDropDownlist) {
			String selectParentNameXpath = selectParentCheckBoxXpath.replace("$ParentName$", parent);
			WebElement selectParentNamewe = driver.findElement(By.xpath(selectParentNameXpath));
			selUtil.waitUntilElementIsPresentOnPage(10, selectParentNamewe);
			selUtil.getAction().moveToElement(selectParentNamewe).click().perform();
			Assert.assertTrue(selectParentNamewe.isDisplayed());
		}
	}

	public void selectDeviceFromDropdown(DataTable expectedDeviceName) {
		selUtil.hardWait(3);
		clickondevicedrp.click();
		selUtil.hardWait(3);
		List<String> deviceFromDropDownList = expectedDeviceName.asList();
		selUtil.hardWait(2);
		for (String device : deviceFromDropDownList) {
			String selectDeviceNameXpath = selectDeviceCheckBoxXpath.replace("$DeviceName$", device);
			WebElement selectDeviceNamewe = driver.findElement(By.xpath(selectDeviceNameXpath));
			selUtil.waitUntilElementIsPresentOnPage(10, selectDeviceNamewe);
			selUtil.getAction().moveToElement(selectDeviceNamewe).click().perform();
			Assert.assertTrue(selectDeviceNamewe.isDisplayed());
			clickOnBlankSpace.click();
		}

	}

	public void verifyDeviceIgniteTitle(String deviceversionpage) {
		selUtil.hardWait(5);
		String actualname = pagetitle.getText();
		Assert.assertEquals(actualname, deviceversionpage);
		System.out.println("Page name is found as" + actualname);
	}

	public void verifyListDetails() {
		for (WebElement details : detaillist) {
			String listname = details.getText();
			System.out.println("details list is displayed as" + listname);

		}
	}

	public void verifyLastSyncHeader() {
		Assert.assertTrue(lastsyncheader.isDisplayed(), "Last sync header is not dispayed on page");
	}

	public void verifyAppVersionHeadre() {
		Assert.assertTrue(appversionheader.isDisplayed(), "App version header is not displayed on page");
	}

	public void verifySchoolDeviceHeader() {
		Assert.assertTrue(schoolheader.isDisplayed(), "School header is not displayed on page");
	}

	public void verifyTeacherHeader() {
		Assert.assertTrue(teacherheader.isDisplayed(), "Teacehr header is not displayed on page");
	}

	public void verifyDeviceTypeHeader() {
		Assert.assertTrue(deviceheader.isDisplayed(), "Device header is not displayed on page");
	}

	public void verifyIdNumberHeader() {
		Assert.assertTrue(idnumberheader.isDisplayed(), "ID number header is not displayed on page");
	}

	public void clickOnDemographicDropdown() {
//	selUtil.waitUntilElementIsPresentOnPage(20, demographicdropdown);
		selUtil.hardWait(2);
		selUtil.waitUntilElementIsPresentOnPage(30, demographicdropdown);
		commonPage.waitUntillTheLoaderInvisible();
		demographicdropdown.click();
	}

	public void selectAgeOfTheChildren(DataTable expectedChildrenAge) {
		List<String> expectedchildage = expectedChildrenAge.asList();
		for (String childage : expectedchildage) {
			String childAgeXpathWe = childAgeXpath.replace("$childage$", childage);
			WebElement childAgeWE = driver.findElement(By.xpath(childAgeXpathWe));
			selUtil.waitUntilElementIsPresentOnPage(20, childAgeWE);
			selUtil.getAction().moveToElement(childAgeWE).perform();
			childAgeWE.click();
//		selUtil.hardWait(1);
		}
	}

	public void selectGradeOfTheChildren(DataTable expectedChildrenGrade) {

		List<String> expectedchildGrade = expectedChildrenGrade.asList();
		for (String childGrade : expectedchildGrade) {
			Map<String, String> grade = new HashMap<>();
			grade.put("Toddler (2 yrs)", "1");
			grade.put("Preschool (3 yrs)", "2");
			grade.put("Pre-K (4 yrs)", "3");
			grade.put("Kindergarten (5 yrs)", "4");
			grade.put("Mixed Age Pre-school", "5");
			grade.put("Not specified", "6");

			String childGradeXpathWe = childGradeXpath.replace("$childGrade$", grade.get(childGrade));
			WebElement childGradeWE = driver.findElement(By.xpath(childGradeXpathWe));
			selUtil.waitUntilElementIsPresentOnPage(20, childGradeWE);
			selUtil.getAction().moveToElement(childGradeWE).perform();
			childGradeWE.click();
//		selUtil.hardWait(1);
		}
	}

	public void selectLanguageOfChildren(DataTable expectedChildrenLanguage) {
		List<String> expectedchildLanguage = expectedChildrenLanguage.asList();
		for (String childLanguage : expectedchildLanguage) {
			Map<String, String> Language = new HashMap<>();
			Language.put("English", "1");
			Language.put("Spanish", "2");

			String childLanguageXpathWe = childLanguageXpath.replace("$childLanguage$", Language.get(childLanguage));
			WebElement childLanguageWE = driver.findElement(By.xpath(childLanguageXpathWe));
			selUtil.waitUntilElementIsPresentOnPage(20, childLanguageWE);
			selUtil.getAction().moveToElement(childLanguageWE).perform();
			childLanguageWE.click();
//		selUtil.hardWait(1);
		}
	}

	public void selectRaceOfChildren(DataTable expectedChildrenRace) {
		List<String> expectedchildRace = expectedChildrenRace.asList();
		for (String childRace : expectedchildRace) {
			Map<String, String> Race = new HashMap<>();
			Race.put("American Indian or Alaska Native", "4");
			Race.put("Asian", "3");
			Race.put("Black or African American", "2");
			Race.put("Hispanic or Latino", "8");
			Race.put("Native Hawaiian or other Pacific Islander", "5");
			Race.put("White", "1");
			Race.put("Two or More Races", "7");
			Race.put("Not specified", "6");

			String childRaceXpathWe = childRaceXpath.replace("$childRace$", Race.get(childRace));
			WebElement childRaceWE = driver.findElement(By.xpath(childRaceXpathWe));
			selUtil.waitUntilElementIsPresentOnPage(20, childRaceWE);
			selUtil.getAction().moveToElement(childRaceWE).perform();
			selUtil.getAction().moveToElement(childRaceWE).perform();
			childRaceWE.click();
//		selUtil.hardWait(1);
		}

	}

	public void selectEthnicityOfChildren(DataTable expectedChildEthnicity) {
		List<String> expectedchildEthnicity = expectedChildEthnicity.asList();
		for (String childEthnicity : expectedchildEthnicity) {
			Map<String, String> Ethnicity = new HashMap<>();

			Ethnicity.put("Hispanic or Latino", "1");
			Ethnicity.put("Not Hispanic or Latino", "2");
			Ethnicity.put("Not specified", "3");

			String childEthnicityXpathWe = childEthnicityXpath.replace("$childEthnicity$",
					Ethnicity.get(childEthnicity));
			WebElement childEthnicityWE = driver.findElement(By.xpath(childEthnicityXpathWe));
			selUtil.waitUntilElementIsPresentOnPage(20, childEthnicityWE);
			selUtil.getAction().moveToElement(childEthnicityWE).perform();
			childEthnicityWE.click();
//		selUtil.hardWait(1);
		}

	}

	public void clickOnDemographicFilterApplyButton() {
		demographicFilterApply.click();
	}

	public void selectShowPlayTimeThisWeek(String expectedDateRange) {
		selUtil.hardWait(3);
		dateRangeDropdown.click();
		String dateRangeXpath = dateRangeSelect.replace("$dateRange$", expectedDateRange);
		WebElement dateRangeWE = driver.findElement(By.xpath(dateRangeXpath));
		dateRangeWE.click();
	}

	public void customRangeOptionselectClassPlaytime() {
		selUtil.hardWait(3);
		dateRangeDropdown.click();
		selUtil.waitUntilElementIsPresentOnPage(20, customRangeOptionClassPlaytime);
		selUtil.getAction().moveToElement(customRangeOptionClassPlaytime).perform();
////	selUtil.getAction().click(customRangeOption).perform();
//	selUtil.hardWait(3);
//	customRangeOption.click();

	}

	public void customRangeOptionselect() {
		selUtil.hardWait(3);
		dateRangeDropdown.click();
		selUtil.getAction().moveToElement(customRangeOption).perform();
////	selUtil.getAction().click(customRangeOption).perform();
//	selUtil.hardWait(3);
//	customRangeOption.click();
	}

	public void selectShowPlayTimeThisWeekClassPlaytime(String expectedDateRange) {
		selUtil.hardWait(3);
		dateRangeDropdown.click();
		String dateRangeXpath = dateRangeSelectClassPlaytime.replace("$dateRange$", expectedDateRange);
		WebElement dateRangeWE = driver.findElement(By.xpath(dateRangeXpath));
		dateRangeWE.click();
	}

	public void childNameColumnonCSDPageDisplay() {
		Assert.assertTrue(childNameColumn.isDisplayed());
	}

	public void igniteReportColumnOnCSDPage() {
		Assert.assertTrue(igniteReportColumnCSDPage.isDisplayed());
	}

	public void igniteTableReportColumnOnCSDPage() {
		Assert.assertTrue(igniteTableReportColumn.isDisplayed());
	}

	public void theUserShouldBeAbleToSeeTheChildNameList() {
		Assert.assertTrue(igniteTableReportColumn.isDisplayed());
		List<WebElement> childNameWebElements = selUtil.getDriver().findElements(By.xpath(childNameCSDPage));
		for (WebElement childNameWE : childNameWebElements) {
			Assert.assertTrue(childNameWE.isDisplayed());
			String childNameText = childNameWE.getText();
			System.out.println(childNameText);
		}
	}

	public void clickOnViewFromIgniteReportsColumn() {
		Assert.assertTrue(viewIgniteReportLink.isDisplayed());
		viewIgniteReportLink.click();

	}

	public void navigateToIgniteChildSkillDetailsReportPage() {
		Set<String> csdpagewindow = driver.getWindowHandles();
		Iterator<String> navigatedwin = csdpagewindow.iterator();
		String parent = navigatedwin.next();
		String child = navigatedwin.next();
		selUtil.getDriver().switchTo().window(child);

//    selUtil.waitUntilElementIsPresentOnPage(60, igniteChildSkillDetailsPage);
		Assert.assertTrue(igniteChildSkillDetailsPage.isDisplayed());

		selUtil.getDriver().close();
		selUtil.getDriver().switchTo().window(parent);

	}

	public void navigateToIgniteTableChildSkillDetailsReportPage() {
		selUtil.hardWait(5);
//	Assert.assertTrue(viewIgniteTableReportLink.isDisplayed());
		selUtil.getAction().moveToElement(viewIgniteTableReportLink).perform();
		viewIgniteTableReportLink.click();
//	selUtil.executeJavaScript("arguments[0].click();", viewIgniteTableReportLink);

		Set<String> csdpagewindow = driver.getWindowHandles();
		Iterator<String> navigatedwin = csdpagewindow.iterator();
		String parent = navigatedwin.next();
		String child = navigatedwin.next();
		selUtil.getDriver().switchTo().window(child);
//	selUtil.waitUntilElementIsPresentOnPage(50, igniteTableChildSkillDetailsPage);
		Assert.assertTrue(igniteTableChildSkillDetailsPage.isDisplayed());

		selUtil.getDriver().close();
		selUtil.getDriver().switchTo().window(parent);
	}

	public void clickOnPrintButton() {
		Assert.assertTrue(printButtonCSDPage.isDisplayed());

//	Set<String> printReportwindow= driver.getWindowHandles();
//    Iterator<String> printreport = printReportwindow.iterator();
//    String parent =printreport.next();
//    String child = printreport.next();
//    selUtil.getDriver().switchTo().window(child);
//	
//	selUtil.getDriver().close();
//	selUtil.getDriver().switchTo().window(parent);
	}

	public void selectClassesFromDropdownOnCSDReportPage(DataTable expectedClassNameList) {
//	selUtil.waitUntilElementIsPresentOnPage(60, classRoomdropdownCSD);
		classRoomdropdownCSD.click();
		List<String> expectedClassName = expectedClassNameList.asList();
		for (String className : expectedClassName) {
			String classNameXpathWe = classNameXpath.replace("$classname$", className);
			WebElement classNameWE = driver.findElement(By.xpath(classNameXpathWe));

			enterClassnameInSearch.sendKeys(className);

//		selUtil.waitUntilElementIsPresentOnPage(60, classNameWE);
			selUtil.getAction().moveToElement(classNameWE).perform();
			classNameWE.click();
//		selUtil.hardWait(1);
			enterClassnameInSearch.clear();
			System.out.println(className);
		}

		clickOnBlankSapace.click();
	}
}
