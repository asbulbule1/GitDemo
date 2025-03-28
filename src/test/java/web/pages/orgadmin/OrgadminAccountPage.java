package web.pages.orgadmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import util.Selenium;

@SuppressWarnings("unused")
public class OrgadminAccountPage {

	private WebDriver driver;
	public static Selenium selUtil;

	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'navbar-brand insight_logo')]/img[@alt='Hatch Insight']")
	private WebElement hatch_Insight_Logo;

// OrgAdmin Account

	@FindBy(how = How.XPATH, using = "//button/img[contains(@src,'data:image')]")
	private WebElement accountIcon;

	@FindBy(how = How.XPATH, using = "//div/a[text()='My Account']")
	private WebElement myAccount;

	@FindBy(how = How.XPATH, using = "//div/h1[text()='Edit My Profile']")
	private WebElement MyProfilePageTitle;

	@FindBy(how = How.ID, using = "emailId")
	private WebElement selectEmailID;

	@FindBy(how = How.ID, using = "firstName")
	private WebElement selectFirstname;

	@FindBy(how = How.ID, using = "lastName")
	private WebElement selectLastname;

	@FindBy(how = How.ID, using = "mobileArea")
	private WebElement selectCellno1;

	@FindBy(how = How.ID, using = "mobileTxt1")
	private WebElement selectCellno2;

	@FindBy(how = How.ID, using = "mobileTxt2")
	private WebElement selectCellno3;

	@FindBy(how = How.ID, using = "txtPhoneArea")
	private WebElement selectPhone1;

	@FindBy(how = How.ID, using = "txtPhonePre")
	private WebElement selectPhone2;

	@FindBy(how = How.ID, using = "txtPhoneDigits")
	private WebElement selectPhone3;

	@FindBy(how = How.ID, using = "phoneExt")
	private WebElement selectExt;

	@FindBy(how = How.ID, using = "change_pass_mod")
	private WebElement selectChangePasswordButton;

	@FindBy(how = How.ID, using = "currentpassword")
	private WebElement selectCurrentpassword;

	@FindBy(how = How.ID, using = "newpassword")
	private WebElement selectNewPassword;

	@FindBy(how = How.ID, using = "confirmpassword")
	private WebElement selectConfirmPassword;

	@FindBy(how = How.XPATH, using = "//div/span[contains(text(),'NOT RIGHT NOW')]")
	private WebElement selectNotRightNowButton;

	@FindBy(how = How.XPATH, using = "//div/button[contains(text(),'SAVE CHANGES')]")
	private WebElement selectmyProfilePageSaveButton;

	@FindBy(how = How.XPATH, using = "//div/a[contains(text(),'Cancel')]")
	private WebElement selectmyProfilePageCancelButton;

	@FindBy(how = How.ID, using = "change_password")
	private WebElement selectChangePasswordButtonOnPopup;

	@FindBy(how = How.XPATH, using = "//a[@href='/user/notificationsettings' and text()='Notification Settings']")
	private WebElement selectNotificationSettingsMenu;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Notification Settings')]")
	private WebElement notificationSettingsPageTitle;

	@FindBy(how = How.XPATH, using = "//span[@class='slider round']")
	private WebElement selectEmailToggle;

	@FindBy(how = How.ID, using = "save_org_setting")
	private WebElement selectNotificationSaveButton;

	@FindBy(how = How.XPATH, using = "//div/a[contains(text(),'Cancel')]")
	private WebElement selectNotificationCancelbutton;

	@FindBy(how = How.XPATH, using = "//div[text()='Log Out']")
	private WebElement selectLogOutmenu;

	@FindBy(how = How.XPATH, using = "//div[text()='Log Out']")
	private WebElement logoutlink;

//	Accounts Methods

	public OrgadminAccountPage(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(this.driver);
	}

	public void hoverOverOnAccount() {
		selUtil.waitUntilElementIsPresentOnPage(20, accountIcon);
		accountIcon.click();
	}

	String commanCarouselXpath1 = "//div[@class='single-menu-block']//a[contains(text(),'Accountmenu')]";

	public void seeAccountSubsection(String colName) {
		Actions action = new Actions(driver);

		String accountmenu = commanCarouselXpath1.replace("Accountmenu", colName);
		WebElement accountSubsection = driver.findElement(By.xpath(accountmenu));
		action.moveToElement(accountSubsection).perform();

		// selUtil.waitUntilElementIsPresentOnPage(20, accountSubsection);

		if (accountSubsection.isDisplayed()) {
			action.moveToElement(accountSubsection).perform();
			System.out.println(colName + " : " + accountSubsection.getText());

		}
	}

	public void clickOnmyAccountMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(myAccount).click().perform();
	}

	public void redirectedToMyProfilePage() {
		selUtil.waitUntilElementIsPresentOnPage(30, MyProfilePageTitle);
		selUtil.getAction().moveToElement(MyProfilePageTitle).perform();
//		 return accountIcon.isDisplayed();
		Assert.assertTrue(MyProfilePageTitle.isDisplayed());
	}

	public void enterinputfield(String email, String firstname, String lastname, String cellno, String phone,
			String ext, String phonedigit) {
		selectEmailID.clear();
		selectEmailID.sendKeys(email);
		selectFirstname.clear();
		selectFirstname.sendKeys(firstname);
		selectLastname.clear();
		selectLastname.sendKeys(lastname);

		selectCellno1.clear();
		selectCellno1.sendKeys(cellno);
		selectCellno2.clear();
		selectCellno2.sendKeys(cellno);
		selectCellno3.clear();
		selectCellno3.sendKeys(phonedigit);

		selectPhone1.clear();
		selectPhone1.sendKeys(phone);

		selectPhone2.clear();
		selectPhone2.sendKeys(phone);

		selectPhone3.clear();
		selectPhone3.sendKeys(phonedigit);

		selectExt.clear();
		selectExt.sendKeys(ext);

	}

	public void clickOnChangePasswordButton() {
		Actions action = new Actions(driver);
		selUtil.waitUntilElementIsPresentOnPage(60, selectChangePasswordButton);
		action.moveToElement(selectChangePasswordButton).perform();

		selectChangePasswordButton.click();
	}

	public void enterresetpassword(String currentpassword, String newPassword, String confirmPassword)

	{

		selUtil.isElementExists(5, selectCurrentpassword);
		if (selectCurrentpassword.isDisplayed())
			selectCurrentpassword.click();
		selectCurrentpassword.sendKeys(currentpassword);

		if (selectCurrentpassword.isDisplayed())
			selectCurrentpassword.click();
		selectNewPassword.sendKeys(newPassword);
		selectConfirmPassword.click();
		selectConfirmPassword.sendKeys(confirmPassword);

	}

	public void passwordresetNCancelButton() {
		Actions action = new Actions(driver);
		action.moveToElement(selectChangePasswordButtonOnPopup).perform();
		boolean changePassword = selectChangePasswordButtonOnPopup.isEnabled();
		Assert.assertTrue(changePassword);

		action.moveToElement(selectNotRightNowButton).click().perform();
	}

	public boolean myProfilePageSaveButton() {
		Actions action = new Actions(driver);
		action.moveToElement(selectmyProfilePageSaveButton).perform();
		return selectmyProfilePageSaveButton.isEnabled();
	}

	public void myProfilePageCancelButton() {
		Actions action = new Actions(driver);
		action.moveToElement(selectmyProfilePageCancelButton).click().perform();
	}

	public void NotificatiionSettingsMenu() {
		Actions action = new Actions(driver);
		selUtil.waitUntilElementIsPresentOnPage(20, selectNotificationSettingsMenu);
		selUtil.getAction().moveToElement(selectNotificationSettingsMenu).perform();
		selectNotificationSettingsMenu.click();

	}

	public boolean notificationSettingsPage() {
		selUtil.waitUntilElementIsPresentOnPage(60, notificationSettingsPageTitle);
		selUtil.getAction().moveToElement(notificationSettingsPageTitle).perform();
		return notificationSettingsPageTitle.isDisplayed();
	}

	public void emailsToggle() {
		selectEmailToggle.click();
	}

	public boolean notificationSaveButton() {
		selUtil.waitUntilElementIsPresentOnPage(7, selectNotificationSaveButton);
		selectNotificationSaveButton.click();
		return selectNotificationSaveButton.isEnabled();

	}

	public void notificationCancelbutton() {

		Actions action = new Actions(driver);
		selUtil.waitUntilElementIsPresentOnPage(7, selectNotificationCancelbutton);
		action.moveToElement(selectNotificationCancelbutton).click().perform();

	}

	public void clickOnlogOutMenu() {
		selUtil.waitUntilElementIsPresentOnPage(20, selectLogOutmenu);
		selUtil.getAction().moveToElement(selectLogOutmenu).perform();
		selectLogOutmenu.click();
	}

	public void logInWindow(String expectedLogInPageTitle) {
		selUtil.hardWait(5);
		String LogingWindow = driver.getTitle();
		System.out.println(LogingWindow);
		Assert.assertEquals(LogingWindow, expectedLogInPageTitle);
	}

	public void clickOnLogoutLink() {
		logoutlink.click();
	}

}