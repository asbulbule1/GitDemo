package web.pages.orgadmin;

import java.text.ParseException;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import util.Selenium;
import web.pages.CommonPage;
import java.time.Duration;

@SuppressWarnings("unused")
public class OrgAdminRosterPage {
	private WebDriver driver;
	public static Selenium selUtil;
	public static CommonPage common;
	String firstName = randomFirstName();
	String lastName = randomLastName();
	String emailAddress = randomEmailAddress();

//    ***************************************************
//    View And Edit User

	@FindBy(how = How.XPATH, using = "//a[@href='/insightuser/view/']")
	private WebElement clickOnViewAndEditUser;

	@FindBy(how = How.XPATH, using = "//a[@href='/insightuser/view/']")
	private WebElement viewAndEdituserTitle;

	//@FindBy(how = How.XPATH, using = "//th[@id='view_all_users_c0']/a")
	@FindBy(how = How.XPATH, using = "//div[@class='MuiDataGrid-columnHeaderTitleContainer']//p[contains(text(),'Name')]")
	private WebElement headerNameisPresentAndClickable;

	//@FindBy(how = How.XPATH, using = "//th[@id='view_all_users_c2']/a")
	@FindBy(how = How.XPATH, using = "//div[@class='MuiDataGrid-columnHeaderTitleContainer']//p[contains(text(),'Email Address')]")
	private WebElement  headerEmailisPresentAndClickable;
	
	
	//@FindBy(how = How.XPATH, using = "//th[@id='view_all_users_c3']/a")
	@FindBy(how = How.XPATH, using = "//div[@class='MuiDataGrid-columnHeaderTitleContainer']//p[contains(text(),'School')]")
	private WebElement headerSchoolisPresentAndClickable;

	@FindBy(how = How.XPATH, using = "//select[@id='user_role']")
	private WebElement clickonFilterByRoleDropDown;

	//@FindBy(how = How.XPATH, using = "//th[@id='view_all_users_c5']")
	@FindBy(how = How.XPATH, using = "(//div[@class='MuiDataGrid-columnHeaderTitleContainerContent']//p[normalize-space(text())='Activation'])")
	private WebElement seeHeaderActivationDisplayedOnPage;

	//@FindBy(how = How.XPATH, using = "//th[@id='view_all_users_c6']")
	@FindBy(how = How.XPATH, using = "(//div[@class='MuiDataGrid-columnHeaderTitleContainerContent']//img)[1]")
	private WebElement seeResetPasswordIconDisplayedOnPage;

	//@FindBy(how = How.XPATH, using = "//th[@id='view_all_users_c7']")
	@FindBy(how = How.XPATH, using = "(//div[@class='MuiDataGrid-columnHeaderTitleContainerContent']//img)[2]")
	private WebElement seeReseendInviteIconDisplayedOnPage;

	//@FindBy(how = How.XPATH, using = "//th[@id='view_all_users_c8']")
	@FindBy(how = How.XPATH, using = "(//div[@class='MuiDataGrid-columnHeaderTitleContainerContent']//p[normalize-space(text())='Edit'])")
	private WebElement seeHeaderEditInfoDiaplayedOnPage;

	//@FindBy(how = How.XPATH, using = "//select[@id='select_school_view']")
	@FindBy(how = How.XPATH, using = "//p[normalize-space(.)='School:']/following-sibling::div[contains(@class, 'MuiOutlinedInput-root')]")
	private WebElement schoolDropDown;

//FindBy(how = How.XPATH, using = "//select[@id='select_class_view']")
	@FindBy(how = How.XPATH, using = "//p[normalize-space(.)='Class:']/following-sibling::div[contains(@class, 'MuiOutlinedInput-root')]")
	private WebElement classDropDown;
	

	//@FindBy(how = How.XPATH, using = "//select[@id='select_is_active']")
	@FindBy(how = How.XPATH, using = "//p[normalize-space(.)='Status:']/following-sibling::div[contains(@class, 'MuiOutlinedInput-root')]")

	private WebElement statusDropDown;

	//@FindBy(how = How.XPATH, using = "//input[@id='name_search_string']")
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @placeholder='Search by Name']")
	private WebElement searchBynameBox;

	//@FindBy(how = How.XPATH, using = "//input[@id='email_search_string']")
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @placeholder='Search by email address']")
	private WebElement searchByEmailBox;

	@FindBy(how = How.XPATH, using = "//button[@id='search_name']/i[@class='fa fa-search']")
	private WebElement clickOnSearchByUserNameButton;
	
	@FindBy(how = How.XPATH, using = "//button[@label='Apply Filters']")
	private WebElement applyFilters;
	
	
	@FindBy(how = How.XPATH, using = "//button[@label='Clear Filters']")
	private WebElement clearFilters;
	

	@FindBy(how = How.XPATH, using = "//button[@id='search_email']/i[@class='fa fa-search']")
	private WebElement clickOnSearchByEmailButton;

	@FindBy(how = How.XPATH, using = "//div[@data-field='name']//a")
	private WebElement actualNameFound;

	@FindBy(how = How.XPATH, using = "//div[@data-field='email']/div[contains(text(), '@')]")
	private WebElement actualEmailFound;

	//String seeUsersOnViewAllUserPageXpath = "//a[@title='View']";
	String seeUsersOnViewAllUserPageXpath = "(//div[@class='MuiDataGrid-columnHeaderTitleContainerContent' ]//p)";

//    Add New User Page

	@FindBy(how = How.XPATH, using = "//label[normalize-space(.)='User Role']/ancestor::p/following-sibling::div[contains(@class, 'MuiOutlinedInput-root')]")
	private WebElement selectUserRoleWe;

	@FindBy(how = How.XPATH, using = "(//label[normalize-space(.)='User Role']/ancestor::p/following-sibling::div[contains(@class, 'MuiOutlinedInput-root')])/following-sibling::div")
	private WebElement selectedRoleText;

	//@FindBy(how = How.XPATH, using = "//div[@id='add_edit_schools']")
	@FindBy(how = How.XPATH, using = "//label[contains(text(), 'School')]/ancestor::p/following-sibling::div[contains(@class, 'MuiAutocomplete-root')]")
	private WebElement clickOnSchoolDropDrown;

	String commanSchoolNameOnAddUserXpath1 = "//*[contains(text(), '$SchoolName$')]";
	

	@FindBy(how = How.XPATH, using = "//input[@name='firstName']")
	private WebElement fisrtNameInputBox;

	@FindBy(how = How.XPATH, using = "//body")
	private WebElement clickOnBlankSapace;

	@FindBy(how = How.XPATH, using = "//input[@name='lastName']")
	private WebElement lastNameInputBox;

	@FindBy(how = How.XPATH, using = "//input[@name='email']")
	private WebElement emailInputBox;

	@FindBy(how = How.XPATH, using = "//a[text()='Cancel ']")
	private WebElement cancelAddUserButton;

	@FindBy(how = How.XPATH, using = "//button[@label='Add User']")
	private WebElement addUserButton;

//	@FindBy(how = How.XPATH, using = "//button[@id='view-all-users-link']")
	@FindBy(how = How.XPATH, using = "//button[@label='Done Adding Users ']")
	private WebElement doneAddingUserButton;

	@FindBy(how = How.XPATH, using = "//p[@class='errorlabel' and @id='user_type_error']")
	private WebElement expectedErrorMessageUserRole;

	@FindBy(how = How.XPATH, using = "//p[@class='errorlabel' and @id='class_school_error']")
	private WebElement expectedErrorMessageSchool;

	@FindBy(how = How.XPATH, using = "//input[@id='firstName']/following-sibling::*")
	private WebElement expectedErrorMessageFirstName;

	@FindBy(how = How.XPATH, using = "//input[@id='lastName']/following-sibling::*")
	private WebElement expectedErrorMessageLastName;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'View All Users')]")
	private WebElement viewAllUeserPage;

	String CommonsubmenuRosterLink = "//a[contains(@class, 'dropdown-item') and contains(text(), '$submenu$')]";
	
	
	
	//Add new edu
	String userRole="//li[contains(text(),'$userRole$')]";

// ***************************************************************

	public OrgAdminRosterPage(WebDriver driver) throws ParseException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(this.driver);
		common = new CommonPage(this.driver);
	}

//	*********************************************************************************************************

	public void seeReportMenusOnRosterSubsection(DataTable expectedReportSubmenus) {
		List<String> reposrtSubsectionlist = expectedReportSubmenus.asList();
		for (String expectedRostertMenu : reposrtSubsectionlist) {
			String submenuXpath = CommonsubmenuRosterLink.replace("$submenu$", expectedRostertMenu);
			WebElement reportMenuwe = driver.findElement(By.xpath(submenuXpath));
			selUtil.waitUntilElementIsPresentOnPage(10, reportMenuwe);
			selUtil.getAction().moveToElement(reportMenuwe).perform();
			System.out.println(reportMenuwe.getText());
			Assert.assertTrue(reportMenuwe.getText().contains(expectedRostertMenu), "Menu are present");
		}
	}

	public void seeReportMenusOnRosterSubsectionAnd(DataTable expectedReportSubmenus) {
		List<String> subsectionMenulist = expectedReportSubmenus.asList();
		for (String CommonsubmenuRosterAndLink : subsectionMenulist) {
			selUtil.hardWait(2);
//				String submenuXpath = CommonsubmenuRosterAndLink.replace("$submenu$", expectedRosterMenu);
			WebElement reportMenuwe = driver.findElement(By.linkText(CommonsubmenuRosterAndLink));
			selUtil.waitUntilElementIsPresentOnPage(30, reportMenuwe);
			selUtil.getAction().moveToElement(reportMenuwe).perform();
			System.out.println(reportMenuwe.getText());
			Assert.assertTrue(reportMenuwe.getText().contains(CommonsubmenuRosterAndLink), "Menu are present");
		}
	}

	public void clickOnViewAndEditUser() {
		clickOnViewAndEditUser.click();
	}

	public void seeListOfUserUnderHeaderName() {
		List<WebElement> listOfUserOnViewEditUser = driver.findElements(By.xpath(seeUsersOnViewAllUserPageXpath));
		for (WebElement element : listOfUserOnViewEditUser) {
			selUtil.getFluentWait(3);
			String userListOnViewEditUserPage = element.getText();
			System.out.println(userListOnViewEditUserPage);
			Assert.assertTrue(element.isDisplayed());
		}
	}

	public void nameHeaderisPresentAndClickable(String expectedNameTitle) {
		
		clearFilters.click();
	selUtil.hardWait(3);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", headerNameisPresentAndClickable);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(headerNameisPresentAndClickable)).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(@class, 'MuiCircularProgress-root') and @role='progressbar']"))); 
		headerNameisPresentAndClickable.click();
		Assert.assertEquals(expectedNameTitle, headerNameisPresentAndClickable.getText());
	}

	public void emailHeaderisPresentAndClickable(String expectedEmailTitle) {
		selUtil.hardWait(3);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(@class, 'MuiCircularProgress-root') and @role='progressbar']"))); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", headerEmailisPresentAndClickable);
		selUtil.waitUntilElementIsPresentOnPage(10, headerEmailisPresentAndClickable);
		headerEmailisPresentAndClickable.click();
		Assert.assertEquals(expectedEmailTitle, headerEmailisPresentAndClickable.getText());
	}

	public void schoolHeaderisPresentAndClickable(String expectedSchoolTitle) {
		selUtil.hardWait(3);
		selUtil.waitUntilElementIsPresentOnPage(10, headerSchoolisPresentAndClickable);
		headerSchoolisPresentAndClickable.click();
		Assert.assertEquals(expectedSchoolTitle, headerSchoolisPresentAndClickable.getText());
	}

	public void verifyHeaderRoleWithFilterByRole(String expectedUserRole) {
		clickonFilterByRoleDropDown.click();

		selUtil.hardWait(5);
		Select selectRoleByUser = new Select(clickonFilterByRoleDropDown);
		selectRoleByUser.selectByVisibleText(expectedUserRole);
		Assert.assertEquals(false, expectedUserRole.isEmpty());
	}

	public void verifyHeaderActivationDisplayedOnPage(String expectedActiavtionHeader) {
		Assert.assertEquals(seeHeaderActivationDisplayedOnPage.getText(), expectedActiavtionHeader);
	}

	public void verifyResetPasswordIconDisplayedOnPage() {
		Assert.assertTrue(seeResetPasswordIconDisplayedOnPage.isDisplayed());
	}

	public void verifyReseendInviteIconDisplayedOnPage() {
		Assert.assertTrue(seeReseendInviteIconDisplayedOnPage.isDisplayed());
	}

	public void verifyHeaderEditInfoDiaplayedOnPage(String expectedEditHeader) {

		Assert.assertEquals(seeHeaderEditInfoDiaplayedOnPage.getText(), expectedEditHeader);
	}

	public void selectSchoolFromSchoolDropDown(String expectedSchoolName) {
		schoolDropDown.click();
		//Select selectSchool = new Select(schoolDropDown);
		//selectSchool.selectByVisibleText(expectedSchoolName);
		String schoolXpath = "//li[@title='$schoolName$']";
		schoolXpath = schoolXpath.replace("$schoolName$", expectedSchoolName);
		WebElement schoolNameElement = driver.findElement(By.xpath(schoolXpath));
		selUtil.waitUntilElementIsPresentOnPage(20, schoolNameElement);
		schoolNameElement.click();
	}

	public void selectClassFromClassDropDown(String expectedClassName) throws InterruptedException {
		classDropDown.click();
		String classXpath = "//li[@title='$className$']";
		classXpath = classXpath.replace("$className$", expectedClassName);
		WebElement classNameElement = driver.findElement(By.xpath(classXpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", classNameElement);
		selUtil.hardWait(5); 
		classNameElement.click();
		selUtil.waitUntilElementIsPresentOnPage(20, classNameElement);
		classNameElement.click();
	}

	public void selectStatusFromStatusDropDown(String expectedStatusName) {
		selUtil.waitUntilElementIsPresentOnPage(10, statusDropDown);
		statusDropDown.click();
		String statusXpath = "//li[@title='$status$']";
		statusXpath = statusXpath.replace("$status$", expectedStatusName);
		WebElement statusElement = driver.findElement(By.xpath(statusXpath));
		selUtil.waitUntilElementIsPresentOnPage(20, statusElement);
		statusElement.click();
		
		
	
	}

	public void enterUserNameInSearchBox(String expectedUserName) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", searchBynameBox);
		selUtil.hardWait(5);
		searchBynameBox.sendKeys(expectedUserName);
		applyFilters.click();
		selUtil.hardWait(5);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(@class, 'MuiCircularProgress-root') and @role='progressbar']"))); 
		Assert.assertEquals(actualNameFound.getText(), expectedUserName);
		selUtil.hardWait(2);
		searchBynameBox.clear();

	}

	public void enterEmailAddressInSearchBox(String expectedEmailAddress) {
		searchByEmailBox.sendKeys(expectedEmailAddress);
		applyFilters.click();
		selUtil.hardWait(7);
		Assert.assertEquals(actualEmailFound.getText(), expectedEmailAddress);
		selUtil.hardWait(2);
		searchByEmailBox.clear();
		searchByEmailBox.isEnabled();
	}

	public void selectUserRoleFromDropdown(String expectedUserRole) {
		selectUserRoleWe.click();
		// Select selectUserRole = new Select(selectUserRoleWe);
		// selectUserRole.selectByVisibleText(expectedUserRole);
		String userRolexpath = userRole.replace("$userRole$", expectedUserRole);
		WebElement userRolexpathWe = driver.findElement(By.xpath(userRolexpath));
		userRolexpathWe.click();
		
		Assert.assertTrue(selectedRoleText.getText().contains(expectedUserRole));

	}

	public void selectSchoolsFromDropdown(DataTable selectSchoolsFromDropdown) {
		clickOnSchoolDropDrown.click();
		List<String> schoolListexpected = selectSchoolsFromDropdown.asList();
		for (String expectedSchoolName : schoolListexpected) {
			String schoolName = commanSchoolNameOnAddUserXpath1.replace("$SchoolName$", expectedSchoolName);
			WebElement selectSchoolFromList = driver.findElement(By.xpath(schoolName));
			selUtil.getAction().moveToElement(selectSchoolFromList).click().perform();
		}
		clickOnBlankSapace.click();
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
		String emailAddress = (RandomStringUtils.random(4, makeitrandom) + "_johncena@inboxeen.com");
		return emailAddress;
	}

	public void enterUserFirstNameToAddUser() {
		System.out.println(firstName);
		fisrtNameInputBox.sendKeys(firstName);
		Assert.assertTrue(fisrtNameInputBox.isEnabled());
	}

	public void enterUserLastNameToAddUser() {
		System.out.println(lastName);
		lastNameInputBox.sendKeys(lastName);
		Assert.assertTrue(lastNameInputBox.isEnabled());
	}

	public void enterUserEmailAddressToAddUser() {
		System.out.println(emailAddress);
		emailInputBox.sendKeys(emailAddress);
		Assert.assertTrue(emailInputBox.isEnabled());
	}

	public void enterUserFirstName() {
		String firstNamernd = firstName;
		System.out.println(firstNamernd);
		fisrtNameInputBox.sendKeys(firstNamernd);
		Assert.assertTrue(fisrtNameInputBox.isEnabled());
	}

	public void enterUserLastName() {
		String lastNamernd = lastName;
		System.out.println(lastNamernd);
		lastNameInputBox.sendKeys(lastNamernd);
		Assert.assertTrue(lastNameInputBox.isEnabled());
	}

	public void enterUserEmailAddress() {
		String emailAddressrnd = emailAddress;
		System.out.println(emailAddressrnd);
		emailInputBox.sendKeys(emailAddressrnd);
		Assert.assertTrue(emailInputBox.isEnabled());
	}

	public void clickCancekButton() {
		cancelAddUserButton.click();
	}

	public void clickAddUserButton() {
		addUserButton.click();
	}

	public void clickOnDoneAddingUser(String expectedUserPageTitle) {
		selUtil.waitUntilElementIsPresentOnPage(20, doneAddingUserButton);
		doneAddingUserButton.click();
		selUtil.waitUntilElementIsPresentOnPage(20, viewAllUeserPage);
		String viewallUserTitle = viewAllUeserPage.getText();
		System.out.println(viewallUserTitle);
		Assert.assertEquals(viewallUserTitle, expectedUserPageTitle);
	}

	public void verifyErrorMessageGettingDiaplyed1(String expectederrorMessage) {
		String errormsgUserRole = expectedErrorMessageUserRole.getText();
		String expectedErrorMessageSchool = expectedErrorMessageUserRole.getText();
		String expectedErrorMessageFirstName = expectedErrorMessageUserRole.getText();
		String expectedErrorMessageLastName = expectedErrorMessageUserRole.getText();

		Assert.assertEquals(errormsgUserRole, expectederrorMessage);
		Assert.assertEquals(expectedErrorMessageSchool, expectederrorMessage);
		Assert.assertEquals(expectedErrorMessageFirstName, expectederrorMessage);
		Assert.assertEquals(expectedErrorMessageLastName, expectederrorMessage);
	}

	public void verifyAfterClickingOnCancelButtonRedirectToPage(String expectedViewAllUserPage) {
		cancelAddUserButton.click();
		selUtil.waitUntilElementIsPresentOnPage(10, viewAllUeserPage);
		Assert.assertEquals(viewAllUeserPage.getText(), expectedViewAllUserPage);
	}

	public void seeAddedUseOnViewAllUserPageUsingName() {
		searchBynameBox.sendKeys(firstName);
		applyFilters.click();
		selUtil.hardWait(3);
		Assert.assertEquals(actualNameFound.getText(), firstName + " " + lastName);
		selUtil.hardWait(2);
		clearFilters.click();
		System.out.println("Inherited First name to checked in Viea all user Page is : " + firstName
				+ " and Last Name : " + lastName);
	}

	public void seeAddedUseOnViewAllUserPageUsingEmail() {
		searchByEmailBox.sendKeys(emailAddress);
		common.clickApplyfilter();
		selUtil.hardWait(3);
		Assert.assertEquals(actualEmailFound.getText(), emailAddress);
		selUtil.hardWait(3);
		clearFilters.click();
		//searchByEmailBox.isEnabled();
	}

}
