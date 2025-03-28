package web.pages.orgadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import util.Selenium;
import web.pages.CommonPage;

public class OrgAdminRosterChildrenPage {

	private WebDriver driver;
	public static Selenium selUtil;
	public static CommonPage common;

	String childFirstName = randomFirstName();
	String childLastName = randomLastName();
	String parentEmailAdress = randomEmailAddress();

	@FindBy(how = How.ID, using = "select_school")
	private WebElement schoolDropDownAddChil;

	@FindBy(how = How.ID, using = "select_class")
	private WebElement classDropDownAddChil;

	@FindBy(how = How.ID, using = "first_name")
	private WebElement childFirstNameEnter;

	@FindBy(how = How.ID, using = "last_name")
	private WebElement childLastNameEnter;

	@FindBy(how = How.ID, using = "dob")
	private WebElement childBirthDateDropDown;

	@FindBy(how = How.ID, using = "select_grade")
	private WebElement gradeDropDownAddChild;

	@FindBy(how = How.ID, using = "select_gender")
	private WebElement genderDropDownAddChild;

	@FindBy(how = How.ID, using = "select_race")
	private WebElement raceDropDownAddChild;

	@FindBy(how = How.ID, using = "select_ethnicity")
	private WebElement ethnicityDropDownAddChild;

	@FindBy(how = How.ID, using = "parent_first_name0")
	private WebElement enterParentFirstName;

	@FindBy(how = How.ID, using = "parent_last_name0")
	private WebElement enterParentLastName;

	@FindBy(how = How.ID, using = "parent_email_0")
	private WebElement enterParentEmailId;

	@FindBy(how = How.ID, using = "parent_phone_part1_0")
	private WebElement parentphonePart01;

	@FindBy(how = How.ID, using = "parent_phone_part2_0")
	private WebElement parentphonePart02;

	@FindBy(how = How.ID, using = "parent_phone_part3_0")
	private WebElement parentphonePart03;

	@FindBy(how = How.XPATH, using = "//label[@for='requestPhotoCheckbox0']")
	private WebElement requestphotofromFamily;

	@FindBy(how = How.ID, using = "saveAndViewChild")
	private WebElement doneAddChildButton;

	@FindBy(how = How.ID, using = "child_name_search_string")
	private WebElement searchBoxOfChildName;

	@FindBy(how = How.XPATH, using = "//td/a/div[text()='Deactivate']")
	private WebElement deactivateChildButton;

	@FindBy(how = How.XPATH, using = "//td/a/div[text()='Activate']")
	private WebElement activateChildButton;

	@FindBy(how = How.ID, using = "search_child")
	private WebElement serchButton;

	@FindBy(how = How.XPATH, using = "//*[@id='view_all_children']/table/tbody/tr[1]/td[1]/a/div")
	private WebElement childNameFoundOnPage;

	@FindBy(how = How.ID, using = "search_child")
	private WebElement searchbutton;

	@FindBy(how = How.XPATH, using = "//input[@id='first_name']/following-sibling::p")
	private WebElement validationMessageforFirstNameFiled;

	@FindBy(how = How.XPATH, using = "//input[@id='last_name']/following-sibling::p")
	private WebElement validationMessageforLastNameFiled;

	@FindBy(how = How.XPATH, using = "//select[@id='gender']/following-sibling::p")
	private WebElement validationMessageforGenderDropDown;

	@FindBy(how = How.XPATH, using = "//select[@id='race']/following-sibling::p")
	private WebElement validationMessageforRaceDropDown;

	@FindBy(how = How.XPATH, using = "//select[@id='ethnicity']/following-sibling::p")
	private WebElement validationMessageforEthnicityDropDown;

	@FindBy(how = How.XPATH, using = "//p[normalize-space(.)='School']/following-sibling::div[contains(@class, 'MuiOutlinedInput-root')]")
	private WebElement schooldropDown;

	@FindBy(how = How.XPATH, using = "//li/label")
	private List<WebElement> schoolNameList;

	@FindBy(how = How.ID, using = "select_class_view")
	private WebElement classNameWE;

	@FindBy(how = How.XPATH, using = "//body")
	private WebElement clickOnBlankSapace;

	@FindBy(how = How.ID, using = "select_is_active")
	private WebElement statusOptionWE;

	@FindBy(how = How.XPATH, using = "(//div[@class='ghosthoverblue editbtn'])[1]")
	private WebElement editInfoButton;

	@FindBy(how = How.XPATH, using = "//a[@class='ghosthover backbtn']")
	private WebElement backButton;

	@FindBy(how = How.XPATH, using = "//h3[@class='title']")
	private WebElement childSkillDetailsPage;

	@FindBy(how = How.XPATH, using = " (//td[@align='left']/a)[1]")
	private WebElement childNameLink;

	@FindBy(how = How.XPATH, using = "//p[@class='m-0']")
	private List<WebElement> accordians;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-2']//li/label")
	private List<WebElement> classNameList;

	@FindBy(how = How.XPATH, using = "//p[normalize-space(.)='Class']/following-sibling::div[contains(@class, 'MuiOutlinedInput-root')]")
	private WebElement classldropDown;

	@FindBy(how = How.XPATH, using = "//div[contains (@class,'MuiDataGrid-columnHeaders')]//p[contains (text(),'Name')]")
	private WebElement clickOnParentNameHeader;

	@FindBy(how = How.XPATH, using = "//div[contains (@class,'MuiDataGrid-columnHeaders')]//p[contains (text(),'Email Address')]")
	private WebElement clickOnParentEmailHeader;

	@FindBy(how = How.XPATH, using = "//div[contains (@class,'MuiDataGrid-columnHeaders')]//p[contains (text(),'Child')]")
	private WebElement clickOnParentChildHeader;

	@FindBy(how = How.XPATH, using = "//div[@data-field='firstName' and @role='cell']")
	private List<WebElement> listOfParentOnViewAllParentPage;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search by Name']")
	private WebElement searchBoxByParentName;

	@FindBy(how = How.ID, using = "search_name")
	private WebElement searchByNameButton;

	@FindBy(how = How.XPATH, using = "//div[@data-field='firstName' and @role='cell']")
	private WebElement parentNameFound;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search by email address']")
	private WebElement searchBoxByParentEmail;

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Activate')]")
	private WebElement activateParentUser;

	@FindBy(how = How.XPATH, using = "//button[@id='search_class']")
	private WebElement searchByEmailButton;

	@FindBy(how = How.XPATH, using = "//div[@data-field='email']/div[contains(text(), '@')]")
	private WebElement parentEmailFound;

	@FindBy(how = How.XPATH, using = "//tr/td[@align='left']")
	private List<WebElement> childrenNameList;

	@FindBy(how = How.XPATH, using = "//td/div[text()='Reset Password']")
	private WebElement passwordResentButton;

	@FindBy(how = How.XPATH, using = "//div/i[text()='Password Reset']")
	private WebElement resentSuccesfullText;

	@FindBy(how = How.XPATH, using = "//td/div[text()='Resend Invite']")
	private WebElement resendInviteButton;

	@FindBy(how = How.XPATH, using = "//div/i[text()='Invite Resent']")
	private WebElement resendInviteSuccesfullText;

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Edit Info')]")
	private WebElement parentEditInfoButton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Deactivate')]")
	private WebElement parentDeactivateButton;

	@FindBy(how = How.XPATH, using = "//a/div[text()='Delete']")
	private WebElement childDeleteButton;

	@FindBy(how = How.ID, using = "delete_child_view_all")
	private WebElement confirmDeleteChild;

	@FindBy(how = How.XPATH, using = "//label[@id='ignite_checkbox']")
	private WebElement selectIgniteCheckBox;

	@FindBy(how = How.ID, using = "open_webcam")
	private WebElement cameraButton;

	@FindBy(how = How.ID, using = "take_snapshot")
	private WebElement takePhotoButton;

	@FindBy(how = How.XPATH, using = "//button[@data-dismiss='modal' and text()='Close']")
	private WebElement closeCameraButton;

	@FindBy(how = How.XPATH, using = "//div[@id='placeholderShowHide']/label[contains(text(),'Use placeholder image')]")
	private WebElement usePlaceHolderChildPhoto;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Request photo from family member') and @for='reqPhoto']")
	private WebElement requestPhotoFromFamily;

	@FindBy(how = How.XPATH, using = "//button[@id='step1' and contains(text(),'Continue')]")
	private WebElement addChildPageContinueButton;

	@FindBy(how = How.ID, using = "childNameDOB")
	private WebElement childFirstNameNLastNameaddedInForm;

	@FindBy(how = How.ID, using = "childSchoolClass")
	private WebElement childSchoolNClassNameaddedInForm;

	@FindBy(how = How.ID, using = "childLang")
	private WebElement childSLanguageNameaddedInForm;

	String gameLanguageXpath = "//div[@id='game_language']//input[@value='$gameLangauage$']";

	//@FindBy(how = How.XPATH, using = "//ul[@class='list-unstyled pl-0 mb-0']/li[text()='Adding Multiple Children? ']")
	@FindBy(how = How.XPATH, using = "//p[contains (text(), 'Adding Multiple Children?')]")
	private WebElement addingMultipleChildren;

	//@FindBy(how = How.XPATH, using = "//li[text()='Adding Multiple Children? ']/a")
	@FindBy(how = How.XPATH, using = "//a[contains (text(), 'CSV Import')]")
	private WebElement csvImportLink;

	@FindBy(how = How.XPATH, using = "//h2")
	private WebElement csvImportPageTitle;

	@FindBy(how = How.XPATH, using = "//p[contains (text(), 'Adding children from last year?')]")
	private WebElement addingChildrenlastyear;

	@FindBy(how = How.XPATH, using = "//a[contains (text(), 'Carryover Children')]")
	private WebElement carryOverChildrenLink;

	@FindBy(how = How.XPATH, using = "//h2")
	private WebElement carryoverChildrenPageTitle;

	@FindBy(how = How.XPATH, using = "//p[contains (text(), 'Need to see current Hatch roster?')]")
	private WebElement currentHatchRoster;

	@FindBy(how = How.XPATH, using = "//a[contains (text(), 'View & Edit Children')]")
	private WebElement viewAllChildrenLink;

	@FindBy(how = How.XPATH, using = "//h2")
	private WebElement viewAllChildrenPageTitle;

	@FindBy(how = How.XPATH, using = "(//div[@class='ghosthoverblue editbtn'])[1]")
	private WebElement childInfoEdit;

	@FindBy(how = How.ID, using = "child_full_name_btn")
	private WebElement childNameEditPencil;

	@FindBy(how = How.ID, using = "child_full_name_save_btn")
	private WebElement childNameSaveButton;

	@FindBy(how = How.XPATH, using = "//p[@id='child_gender']/parent::*//button")
	private WebElement genderEditPencil;

	@FindBy(how = How.ID, using = "gender_btn")
	private WebElement gendersaveButton;

	@FindBy(how = How.XPATH, using = "//p[@id='child_race']/parent::*//button")
	private WebElement raceEditPencil;

	@FindBy(how = How.ID, using = "race_btn")
	private WebElement racesaveButton;

	@FindBy(how = How.XPATH, using = "//p[@id='child_ethnicity']/parent::*//button")
	private WebElement ethnicityEditPencil;

	@FindBy(how = How.ID, using = "ethnicity_btn")
	private WebElement ethnicitysaveButton;

	@FindBy(how = How.XPATH, using = "//p[@id='child_language']/parent::*//button")
	private WebElement instructionLanguageEditPencil;

	@FindBy(how = How.ID, using = "language_btn")
	private WebElement instructionLanguagesaveButton;

	@FindBy(how = How.XPATH, using = "//p[@id='child_dob']/parent::*//button")
	private WebElement childDOBEditPencil;

	@FindBy(how = How.ID, using = "dob_btn")
	private WebElement childDOBsaveButton;

	@FindBy(how = How.XPATH, using = "//p[@id='child_grade']/parent::*//button")
	private WebElement gradeEditPencil;

	@FindBy(how = How.ID, using = "grade_btn")
	private WebElement gradesaveButton;

	@FindBy(how = How.XPATH, using = "//p[@id='child_educational_journey']/parent::*//button")
	private WebElement educationalJournyeEditPencil;

	@FindBy(how = How.ID, using = "educational_journey_btn")
	private WebElement educationalJournyesaveButton;

	@FindBy(how = How.XPATH, using = "//button[@class='edit-btn parent-edit-btn']")
	private WebElement familyMemberEditPencil;

	@FindBy(how = How.XPATH, using = "//button[@class='save-btn add-parent-btn bgn-green-bg  w-auto mt-0 fs-14']")
	private WebElement familyMembersaveButton;

	@FindBy(how = How.XPATH, using = "//p[@id='matchedUnmatch']/parent::*//button")
	private WebElement childGOLDMacthEditPencil;

	@FindBy(how = How.XPATH, using = "//div[@id='matchUnmatchbtn']/button[@class='btn cancel-btn']")
	private WebElement childGOLDMacthCancelButton;

	@FindBy(how = How.XPATH, using = "//p[@id='languageObjective']/parent::*//button")
	private WebElement childGOLDLanguageEditPencil;

	@FindBy(how = How.XPATH, using = "//button[@class='save-btn bgn-green-bg save-tsg-lang']")
	private WebElement childGOLDLanguageCancelButton;

	@FindBy(how = How.XPATH, using = "//a[text()=' Basic Info']")
	private WebElement basicInfoSideButton;

	@FindBy(how = How.ID, using = "basic_info")
	private WebElement basicInfoSectionText;

	@FindBy(how = How.XPATH, using = "//a[text()=' Educational Journey ']")
	private WebElement educationalJourneySideButton;

	@FindBy(how = How.ID, using = "educational_journey")
	private WebElement EducationalJourneySectionText;

	@FindBy(how = How.XPATH, using = "//a[text()=' Family Members ']")
	private WebElement familyMemberSideButton;

	@FindBy(how = How.ID, using = "parents_guard")
	private WebElement FamilyMembersSectionText;

	@FindBy(how = How.XPATH, using = "//a[text()=' GOLD Settings']")
	private WebElement goldSettingsSideButton;

	@FindBy(how = How.ID, using = "gold_setting")
	private WebElement GOLSettingsSectionText;

	@FindBy(how = How.XPATH, using = "//p[normalize-space(.)='Status:']/following-sibling::div[contains(@class, 'MuiOutlinedInput-root')]")
	private WebElement statusDropDown;

	String commanSchoolClassNameOnfamilymember = "//li[@value='$SchoolName$']";

	public OrgAdminRosterChildrenPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(this.driver);
		common = new CommonPage(this.driver);

	}

	public String randomFirstName() {
		String makeitrandom = "abcdefghijklmnopqrstuvwxyz";
		String firstName = "John" + "_" + (RandomStringUtils.random(4, makeitrandom));
		return firstName;
	}

	public String randomLastName() {
		String makeitrandom = "abcdefghijklmnopqrstuvwxyz";
		String lastName = "Cena" + "_" + (RandomStringUtils.random(4, makeitrandom));
		return lastName;
	}

	public String randomEmailAddress() {
		String makeitrandom = "abcdefghijklmnopqrstuvwxyz";
		String emailAddress = (RandomStringUtils.random(4, makeitrandom) + "_JohnCena@inboxeen.com");
		return emailAddress;
	}

	public void selectSchoolAndClass(String expectedSchoolName, String expectedClassName) {
		Select selectSchool = new Select(schoolDropDownAddChil);
		selectSchool.selectByVisibleText(expectedSchoolName);

		selUtil.hardWait(3);
		Select selectClass = new Select(classDropDownAddChil);
		selectClass.selectByVisibleText(expectedClassName);
	}

	public void enterChildFisrtName() {
		childFirstNameEnter.sendKeys(childFirstName);
	}

	public void enterChildLastName() {
		childLastNameEnter.sendKeys(childLastName);
	}

	public void enterChildBirthDate(String expectedBirthDate) {
		childBirthDateDropDown.click();
		common.setDate(expectedBirthDate);
		clickOnBlankSapace.click();
	}

	public void selectEducatoinalJourneyGameNLanguage(String expectedGame, String expectedLanguage) {
		clickOnBlankSapace.click();
		selUtil.waitUntilElementIsPresentOnPage(30, selectIgniteCheckBox);
		selectIgniteCheckBox.click();
		Map<String, String> language = new HashMap<>();
		language.put("English", "1");
		language.put("Spanish", "2");
		selectIgniteCheckBox.click();

		String gameLanguageXpathWe = gameLanguageXpath.replace("$gameLangauage$", language.get(expectedLanguage));
		WebElement gameLanguageWE = driver.findElement(By.xpath(gameLanguageXpathWe));
//			selUtil.waitUntilElementIsPresentOnPage(20, gameLanguageWE);
		selUtil.getAction().moveToElement(gameLanguageWE).perform();
		gameLanguageWE.click();
		selUtil.hardWait(3);
	}

	public void selectGradeofChild(String expectedGrade) {
		Select selectGrade = new Select(gradeDropDownAddChild);
		selectGrade.selectByVisibleText(expectedGrade);
	}

	public void selectGenderOfChild(String expectedChildGender) {
		Select selectgender = new Select(genderDropDownAddChild);
		selectgender.selectByVisibleText(expectedChildGender);
	}

	public void selectRaceOfChild(String expectedRace) {
		Select selectRace = new Select(raceDropDownAddChild);
		selectRace.selectByVisibleText(expectedRace);
	}

	public void selectEthnicityOfChild(String expectedEthnicity) {
		Select selectEthnicity = new Select(ethnicityDropDownAddChild);
		selectEthnicity.selectByVisibleText(expectedEthnicity);
	}

	public void selectLanguageOfChild(String expectedLanguage) {

		String languageOfChild_Xpath = "//label[text()=' $Language$ ']//parent::div";

		String languageXpath = languageOfChild_Xpath.replace("$Language$", expectedLanguage);
		WebElement selectLangugeOfChild = driver.findElement(By.xpath(languageXpath));

		selectLangugeOfChild.click();
	}

	public void enetrParentFirstName() {
		String parentFirstName = randomFirstName();
		enterParentFirstName.sendKeys(parentFirstName);
	}

	public void enetrParentLastName() {
		String parentLastName = randomLastName();
		enterParentLastName.sendKeys(parentLastName);
	}

	public void enetrParentEmailAddress() {
		String parentEmailID = randomEmailAddress();
		enterParentEmailId.sendKeys(parentEmailID);
	}

	public void enterParentPhonenumber() {
		selUtil.hardWait(3);
		parentphonePart01.sendKeys("111");
		parentphonePart02.sendKeys("111");
		parentphonePart03.sendKeys("1111");

	}

	public void clickOnCheckRequestPhotoFromFamilyMemberStep2() {
		requestphotofromFamily.click();
	}

	public void clickOnDoneAddChild() {
		selUtil.hardWait(5);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", doneAddChildButton);

	}

	public void addedChildDisplayedOnViewAllChildrenPage() {
		selUtil.hardWait(3);
		searchBoxOfChildName.sendKeys(childFirstName);
		searchbutton.click();
		selUtil.hardWait(3);
		Assert.assertTrue(childNameFoundOnPage.getText().contains(childFirstName));
	}

	public void ChildDeleteFromViewAllChildrenPage() {
		selUtil.waitUntilElementIsPresentOnPage(10, childDeleteButton);
		childDeleteButton.click();
		selUtil.waitUntilElementIsPresentOnPage(10, confirmDeleteChild);
//		selUtil.getAction().moveToElement(confirmDeleteChild).click().perform();
		confirmDeleteChild.click();
		selUtil.hardWait(5);
		Assert.assertFalse(childNameFoundOnPage.getText().contains(childFirstName));
	}

	public void validationMessageOfMandoatoryNameField(String expectedValiationMessage) {
		String actualValidationMsgForFirstName = validationMessageforFirstNameFiled.getText();
		Assert.assertEquals(actualValidationMsgForFirstName, expectedValiationMessage);

		String actualValidationMsgForLastName = validationMessageforLastNameFiled.getText();
		Assert.assertEquals(actualValidationMsgForLastName, expectedValiationMessage);
	}

	public void validationMessageOfMandoatoryDropDown(String expectedValiationMessage) {
		String actualValidationMsgGenderDropDown = validationMessageforGenderDropDown.getText();
		Assert.assertEquals(actualValidationMsgGenderDropDown, expectedValiationMessage);

		String actualValidationMsgRaceDropDown = validationMessageforRaceDropDown.getText();
		Assert.assertEquals(actualValidationMsgRaceDropDown, expectedValiationMessage);

		String actualValidationMsgEthnicityDropDown = validationMessageforEthnicityDropDown.getText();
		Assert.assertEquals(actualValidationMsgEthnicityDropDown, expectedValiationMessage);
	}

	public void searchChildByName(String expectedChildName) {
		searchBoxOfChildName.sendKeys(expectedChildName);
		serchButton.click();
		selUtil.hardWait(7);
		String actualChildNamefound = childNameFoundOnPage.getText();
		System.out.println(actualChildNamefound);
	}

	public void deactivateChildFromChildrenList() {
		selUtil.hardWait(5);
		deactivateChildButton.click();
	}

	public void activateChildFromChildrenList() {
		selUtil.hardWait(7);
		activateChildButton.click();
	}

	public void selectSchoolForChildFilter(String expectedSchoolName) {
		schooldropDown.click();
		selUtil.waitUntilElementIsPresentOnPage(20, schooldropDown);
		for (WebElement schoolName : schoolNameList) {
			if (schoolName.getAttribute("title").equals(expectedSchoolName)) {
//				schoolName.click();
				selUtil.executeJavaScript("arguments[0].click()", schoolName);
			}
		}
		selUtil.hardWait(3);
	}

	public void selectClassForChildFilter(String expectedClassName) {
		Select className = new Select(classNameWE);
		className.selectByVisibleText(expectedClassName);
		clickOnBlankSapace.click();
		selUtil.hardWait(5);
	}

	public void selectStatusActive(String expecetedstatusName) {
		selUtil.hardWait(3);
		selUtil.waitUntilElementIsPresentOnPage(10, statusDropDown);
		statusDropDown.click();
		String statusXpath = "//li[@title='$status$']";
		statusXpath = statusXpath.replace("$status$", expecetedstatusName);
		WebElement statusElement = driver.findElement(By.xpath(statusXpath));
		selUtil.waitUntilElementIsPresentOnPage(20, statusElement);
		statusElement.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", common.applyFilters);
	}

	public void listOfChildrenOnViewChildrenPage() {
		selUtil.hardWait(3);
		for (WebElement child : childrenNameList) {
			System.out.println(child.getText());
			Assert.assertTrue(child.isDisplayed());
		}
	}

	public void editChildInfo() {
		selUtil.waitUntilElementIsPresentOnPage(40, editInfoButton);
		editInfoButton.click();
	}

	public void clickOnBackbutton() {
		selUtil.hardWait(5);
		backButton.click();
	}

	public void childSkillDetailsPage(String expectedChildSkillPageTitle) {
		selUtil.hardWait(3);
		childNameLink.click();
		selUtil.waitUntilElementIsPresentOnPage(20, childSkillDetailsPage);
		String actualChildSkillTitle = childSkillDetailsPage.getText();
		Assert.assertTrue(actualChildSkillTitle.contains(expectedChildSkillPageTitle));
	}

	public void selectClassFromClassDropDownFOrParet(String expectedClassName) {
		classldropDown.click();
//
//		for(WebElement className:classNameList)
//		{
//			if(className.getAttribute("title").equals(expectedClassName))
//			{
//				className.click();
//				break;
//			}
//		}
		String schoolName = commanSchoolClassNameOnfamilymember.replace("$SchoolName$", expectedClassName);
		selUtil.hardWait(2);
		WebElement selectSchoolFromList = driver.findElement(By.xpath(schoolName));
		selUtil.getAction().moveToElement(selectSchoolFromList).click().perform();
		selUtil.hardWait(2);
		clickOnBlankSapace.click();
	}

	public void selectSchoolNameFromDropDown(String expectedSchoolName) throws InterruptedException {
		schooldropDown.click();
//
//		for(WebElement schoolName:schoolNameList)
//		{
//			if(schoolName.getAttribute("title").equals(expectedSchoolName))
//			{
//				schoolName.click();
//				break;
//			}
//		}
//		
		String schoolName = commanSchoolClassNameOnfamilymember.replace("$SchoolName$", expectedSchoolName);
		selUtil.hardWait(2);
		WebElement selectSchoolFromList = driver.findElement(By.xpath(schoolName));
		selUtil.getAction().moveToElement(selectSchoolFromList).click().perform();
		selUtil.hardWait(2);
		clickOnBlankSapace.click();

	}

	public void clickOnNameOfParentToSortList() {
		selUtil.hardWait(3);
		clickOnParentNameHeader.click();
		selUtil.hardWait(3);
	}

	public void clickOnEmailOfParentToSortList() {
		clickOnParentEmailHeader.click();
		selUtil.hardWait(3);
	}

	public void clickOnChildOfParentToSortList() {
		clickOnParentChildHeader.click();
		selUtil.hardWait(3);
	}

	public void listOfParentPresentOnViewAllParentPage() {
		for (WebElement parentName : listOfParentOnViewAllParentPage) {
			String parentNameFound = parentName.getText();
			System.out.println(parentNameFound);
			Assert.assertTrue(parentName.isDisplayed());
		}
	}

	public void searchParentByNameInSearchBox(String expectedParentName) {
		selUtil.hardWait(7);
		searchBoxByParentName.sendKeys(expectedParentName);
		common.applyFilters.click();
//		searchByNameButton.click();
		selUtil.hardWait(7);
		selUtil.waitUntilElementIsPresentOnPage(20, parentNameFound);
		Assert.assertEquals(parentNameFound.getText(), expectedParentName);
	}

	public void activateParentUser() {
		selUtil.hardWait(5);
		selUtil.executeJavaScript("arguments[0].click()", activateParentUser);
		common.clearFilters.click();
	}

	public void searchParentNameByEmail(String expectedParentEmail) {
		// common.clearFilters.click();
		selUtil.waitUntilElementIsPresentOnPage(10, searchBoxByParentEmail);
		searchBoxByParentEmail.clear();
		selUtil.hardWait(3);
		searchBoxByParentEmail.sendKeys(expectedParentEmail);
		common.applyFilters.click();
		selUtil.hardWait(3);
		selUtil.waitUntilElementIsPresentOnPage(10, parentEmailFound);
		Assert.assertEquals(parentEmailFound.getText(), expectedParentEmail);
		searchBoxByParentEmail.clear();
	}

	public void resetParentUserPassword() {
		selUtil.hardWait(5);
		passwordResentButton.click();
		selUtil.hardWait(3);
		Assert.assertTrue(resentSuccesfullText.isDisplayed());
	}

	public void resendInviteToParentUser() {
		resendInviteButton.click();
		selUtil.hardWait(3);
		Assert.assertTrue(resendInviteSuccesfullText.isDisplayed());
	}

	public void editInfoOfParentUser() {
		parentEditInfoButton.click();
	}

	public void deactivateParentUer() {
		selUtil.hardWait(3);
		parentDeactivateButton.click();
		common.clearFilters.click();

	}

	public void takeChildPhotoUsingCamera() {
		Assert.assertTrue(cameraButton.isDisplayed());
		cameraButton.click();
		selUtil.hardWait(3);

//		selUtil.waitUntilElementToBeInvisible(20, takePhotoButton);
		Assert.assertTrue(takePhotoButton.isDisplayed());
		Assert.assertTrue(closeCameraButton.isDisplayed());
		selUtil.hardWait(3);
//		selUtil.waitUntilElementToBeInvisible(20, closeCameraButton);
		takePhotoButton.click();

//			closeCameraButton.click();
	}

	public void useChildPhotoPlaceHolderCheckBox() {
//		usePlaceHolderChildPhoto.isDisplayed();
		// selUtil.waitUntilElementIsPresentOnPage(20, usePlaceHolderChildPhoto);
		Assert.assertTrue(usePlaceHolderChildPhoto.isDisplayed());
	}

	public void selectRequestPhotoFromFamilyMemeber() {
		selUtil.waitUntilElementIsPresentOnPage(20, requestPhotoFromFamily);
		Assert.assertTrue(requestPhotoFromFamily.isDisplayed());
		requestPhotoFromFamily.click();
	}

	public void clickOnContinueButton() {
		selUtil.waitUntilElementIsPresentOnPage(60, addChildPageContinueButton);
		selUtil.getAction().moveToElement(addChildPageContinueButton).perform();
		addChildPageContinueButton.click();
	}

	public void childDetailsAddedInStepOneDisplayed(String schoolName, String className, String language) {
		Assert.assertTrue(childFirstNameNLastNameaddedInForm.getText().contains(childFirstName));
		Assert.assertTrue(childFirstNameNLastNameaddedInForm.getText().contains(childLastName));

		Assert.assertTrue(childSchoolNClassNameaddedInForm.getText().contains(className));
		Assert.assertTrue(childSchoolNClassNameaddedInForm.getText().contains(schoolName));
		System.out.println(childSLanguageNameaddedInForm.getText());
		Assert.assertTrue(childSLanguageNameaddedInForm.getText().contains(language));

	}

	public void seeAddingMultipleChildren(String expectedTextofAddingMultipleChildren) {
		String actualTextOfAddingMultipleChildren = addingMultipleChildren.getText();
		Assert.assertTrue(actualTextOfAddingMultipleChildren.contains(expectedTextofAddingMultipleChildren));

	}

	public void csvImportLink(String expectedImportPageTitle) {
		csvImportLink.click();
		common.popOnReportPages();
		selUtil.hardWait(3);
		String actualPageTitle = csvImportPageTitle.getText();
		Assert.assertEquals(actualPageTitle, expectedImportPageTitle);
	}

	public void seeAddingChildrenLastYear(String expectedAddingChildrenText) {
		String actualTextOfAddingChildren = addingChildrenlastyear.getText();
		Assert.assertTrue(actualTextOfAddingChildren.contains(expectedAddingChildrenText));
	}

	public void carryoverChildrenBlueLink(String expectedcarryoverChildrenBlueLink) {
		carryOverChildrenLink.click();
		selUtil.hardWait(3);
		String actualPageTitle = carryoverChildrenPageTitle.getText();
		Assert.assertEquals(actualPageTitle, expectedcarryoverChildrenBlueLink);
	}

	public void seeNeedCurrentHatchRoster(String expectedCurrentHatchRoster) {
		String actualTextOfCurrentHatchRoster = currentHatchRoster.getText();
		Assert.assertTrue(actualTextOfCurrentHatchRoster.contains(expectedCurrentHatchRoster));
	}

	public void viewEditChildrenBlueLink(String expectedViewAllChildrenPageTitle) {
		viewAllChildrenLink.click();
		selUtil.hardWait(3);
	}

	// 1
	public void childEditInfoButtonClick() {
		selUtil.waitUntilElementIsPresentOnPage(60, childInfoEdit);
		childInfoEdit.click();
	}

	public void childNameEditPencilClick() {
		selUtil.waitUntilElementIsPresentOnPage(60, childNameEditPencil);
		childNameEditPencil.click();
		selUtil.hardWait(2);
		childNameSaveButton.click();
	}

	public void genderEditPencilClick() {
		selUtil.waitUntilElementIsPresentOnPage(60, genderEditPencil);
		genderEditPencil.click();
		selUtil.hardWait(2);
		gendersaveButton.click();
	}

	public void raceEditPencilClick() {
		selUtil.waitUntilElementIsPresentOnPage(60, raceEditPencil);
		raceEditPencil.click();
		selUtil.hardWait(2);
		racesaveButton.click();
	}

	public void ethnicityEditPencilClick() {
		selUtil.waitUntilElementIsPresentOnPage(60, ethnicityEditPencil);
		ethnicityEditPencil.click();
		selUtil.hardWait(2);
		ethnicitysaveButton.click();
	}

	public void instructionLanguageEditPencilClick() {
		selUtil.waitUntilElementIsPresentOnPage(60, instructionLanguageEditPencil);
		instructionLanguageEditPencil.click();
		selUtil.hardWait(2);
		instructionLanguagesaveButton.click();
	}

	public void dateOfBirthEditPencilClick() {
		selUtil.waitUntilElementIsPresentOnPage(60, childDOBEditPencil);
		childDOBEditPencil.click();
		selUtil.hardWait(2);
		childDOBsaveButton.click();
	}

	public void educationalJourneyEditPencilClick() {
		selUtil.waitUntilElementIsPresentOnPage(60, educationalJournyeEditPencil);
		educationalJournyeEditPencil.click();
		selUtil.hardWait(2);
		educationalJournyesaveButton.click();
	}

	public void gradeEditPencilClick() {
		selUtil.waitUntilElementIsPresentOnPage(60, gradeEditPencil);
		gradeEditPencil.click();
		selUtil.hardWait(2);
		gradesaveButton.click();
	}

	public void familyMemberEditPencilClick() {
		selUtil.waitUntilElementIsPresentOnPage(10, familyMemberEditPencil);
		familyMemberEditPencil.click();
		selUtil.hardWait(2);
		familyMembersaveButton.click();
	}

	public void goldSettingMatchEditPencilClick() {
		selUtil.waitUntilElementIsPresentOnPage(60, childGOLDMacthEditPencil);
		selUtil.getAction().moveToElement(childGOLDMacthEditPencil).perform();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", childGOLDMacthEditPencil);
//		childGOLDMacthEditPencil.click();
		selUtil.hardWait(2);
		childGOLDMacthCancelButton.click();
	}

	public void goldSettingLanguageEditPencilClick() {

		boolean isGoldLangugeenable = selUtil.isElementExists(30, childGOLDLanguageEditPencil);
		if (isGoldLangugeenable) {
			selUtil.getAction().moveToElement(childGOLDMacthEditPencil).perform();
			childGOLDLanguageEditPencil.click();
			selUtil.hardWait(2);
			childGOLDLanguageCancelButton.click();
		} else {
			System.out.println("Child is not matched to TSG");
		}
	}

	public void basicInfoSideButtonClick(String expectedbasicinfotext) {
		selUtil.waitUntilElementIsPresentOnPage(60, basicInfoSideButton);
		selUtil.getAction().moveToElement(basicInfoSideButton).perform();
		basicInfoSideButton.click();
		String actualBasicInfoSectionText = basicInfoSectionText.getText();
		Assert.assertEquals(expectedbasicinfotext, actualBasicInfoSectionText);
	}

	public void educationalJourneySideButtonClick(String expectedEducationalJourneyTitle) {
		selUtil.waitUntilElementIsPresentOnPage(60, educationalJourneySideButton);
		selUtil.getAction().moveToElement(educationalJourneySideButton).perform();
		educationalJourneySideButton.click();
		String actualEducationalJourneySectionText = EducationalJourneySectionText.getText();
		Assert.assertEquals(expectedEducationalJourneyTitle, actualEducationalJourneySectionText);
	}

	public void familyMemberSideButtonClick(String expectedFamilyMembersTitle) {
		selUtil.waitUntilElementIsPresentOnPage(60, familyMemberSideButton);
		selUtil.getAction().moveToElement(familyMemberSideButton).perform();
		familyMemberSideButton.click();
		String actualFamilyMembersSectionText = FamilyMembersSectionText.getText();
		Assert.assertEquals(expectedFamilyMembersTitle, actualFamilyMembersSectionText);
	}

	public void goldSettingSideButtonClick(String expectedGOLDSettingsTitle) {
		selUtil.waitUntilElementIsPresentOnPage(60, goldSettingsSideButton);
		selUtil.getAction().moveToElement(goldSettingsSideButton).perform();
		goldSettingsSideButton.click();
		String actualGOLSettingsSectionText = GOLSettingsSectionText.getText();
		Assert.assertEquals(expectedGOLDSettingsTitle, actualGOLSettingsSectionText);
	}
}
