package web.pages.orgadmin;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import util.Selenium;
import web.pages.CommonPage;

public class RosterPage {
	private WebDriver driver;
	private Selenium selUtil;
	public static CommonPage common;

	@FindBy(how = How.XPATH, using = "//h2")
	private WebElement page_title;

	@FindBy(how = How.XPATH, using = "//div[@data-field='name' and @role='cell']")
	private List<WebElement> schools;

	@FindBy(how = How.XPATH, using = "//div[@data-field='teachers' and @role='cell']")
	private List<WebElement> teachers;

	@FindBy(how = How.XPATH, using = "//div[@data-field='classes' and @role='cell']")
	private List<WebElement> classes;

	@FindBy(how = How.XPATH, using = "//div[@data-field='childrens' and @role='cell']")
	private List<WebElement> childrens;

	@FindBy(how = How.XPATH, using = "(//div/*[contains(text(), 'Edit Info')])[1]")
	private WebElement editinfobtn;

	@FindBy(how = How.XPATH, using = "(//div[@data-field='name' and @role='cell'])[1]")
	private WebElement schoolnameclick;

	@FindBy(how = How.XPATH, using = "//input[@name='schoolName']")
	private WebElement enter_schname;

	@FindBy(how = How.XPATH, using = "//input[@name='city']")
	private WebElement enter_city;

	// @FindBy(how = How.XPATH, using = "//select[@id='state']")
	@FindBy(how = How.XPATH, using = "(//label[contains (text(),'State (Optional)')])/parent::div//div[contains(@class, 'MuiOutlinedInput-root')]")
	private WebElement select_state;

	String state = "//li[@title='$state$']";

	@FindBy(how = How.XPATH, using = "//input[@name='zipCode']")
	private WebElement enter_zip;

	@FindBy(how = How.XPATH, using = "//input[@name='isActive']")
	private WebElement activeschools;

	@FindBy(how = How.XPATH, using = "//button/*[contains(text(),'Add School')]")
	private WebElement addschbtn;

	@FindBy(how = How.XPATH, using = "//h5/span")
	private WebElement successmsg;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'School Name')]/following-sibling::p[@class='errorlabel']")
	private WebElement scherrormsg;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Zip Code')]/following-sibling::p[@class='errorlabel']")
	private WebElement ziperrormsg;

	@FindBy(how = How.XPATH, using = "//button[@label='View All Schools']")
	private WebElement viewallschbtn;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='search by name']")
	private WebElement searchbox;

	@FindBy(how = How.ID, using = "search_class")
	private WebElement searchicon;

	@FindBy(how = How.XPATH, using = "(//div[@data-field='name' and @role='cell'])[1]")
	private WebElement verifyschname;

	@FindBy(how = How.XPATH, using = "//button[contains (text(),'CANCEL')]")
	private WebElement canclelinkbtn;

	@FindBy(how = How.CLASS_NAME, using = "welcome-title")
	private WebElement dash_title;

	private String randomizeSchool = randmoizestring();

	public RosterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(this.driver);
		common = new CommonPage(this.driver);
	}

	public void verifyViewAllSchoolPage(String schpagetitle) {
		selUtil.hardWait(2);
		String actualpagename = page_title.getText();
		Assert.assertEquals(actualpagename, schpagetitle);
		System.out.println("Page name is displayed as" + actualpagename);
	}

	public void seeschoolnamelist(String school_namelist) {
		for (WebElement schoolnamelist : schools) {
			String name = schoolnamelist.getText();
			System.out.println("schoolname is displayed as" + name);

		}
	}

	public void seeTeachercountlist(String teacher_count) {
		for (WebElement teachercountlist : teachers) {
			String name = teachercountlist.getText();
			System.out.println("teachercount is displayed as" + name);

		}

	}

	public void seeClassescountlist(String class_count) {
		for (WebElement classcountlist : classes) {
			String name = classcountlist.getText();
			System.out.println("classcount is displayed as" + name);

		}
	}

	public void seeChildrencountlist(String children_count) {
		for (WebElement childrencountlist : childrens) {
			String name = childrencountlist.getText();
			System.out.println("childrencount is displayed as" + name);

		}
	}

	public void clickOnEditInfoButton() {

		boolean editinfo_btn = editinfobtn.isEnabled();
		System.out.println("The download button is present" + editinfo_btn);

		editinfobtn.click();
	}

	public void verifyEditschooltitle(String title) {

		String actulapagename = page_title.getText();
		Assert.assertTrue(actulapagename.contains(title));
		System.out.println("Page name is displayed as" + actulapagename);

	}

	public void clickonSchoolnamelink() {
		selUtil.waitUntilElementIsPresentOnPage(10, schoolnameclick);
		schoolnameclick.click();
	}

	public void verifyViewAllClasses(String pagename) {
		selUtil.waitUntilElementIsPresentOnPage(10, page_title);
		String actualpagename = page_title.getText();
		Assert.assertEquals(actualpagename, pagename);
		System.out.println("Page title is found as" + actualpagename);
	}

	public void verifyAddSchoolPage(String pagenametitle) {
		selUtil.hardWait(2);
		String actualpagename = page_title.getText();
		Assert.assertEquals(actualpagename, pagenametitle);
		System.out.println("Page name displayed as" + actualpagename);
	}

	public void enterCityname(String entercityname) {
		enter_city.clear();
		enter_city.sendKeys(entercityname);
	}

	public void selectStatedropdown(String statedrp) throws InterruptedException {
//Select selectclsschooldropdown = new Select(select_state);
//		selectclsschooldropdown.selectByVisibleText(statedrp);
		select_state.click();
		String stateXpath = state.replace("$state$", statedrp);
		WebElement statewe = driver.findElement(By.xpath(stateXpath));
		selUtil.waitUntilElementIsPresentOnPage(10, statewe);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", statewe);
		Thread.sleep(500); // Small delay to ensure visibility
		statewe.click();

	}

	public void enterZipCode(String zipcode) {
		enter_zip.clear();
		enter_zip.sendKeys(zipcode);
	}

	public void verifyActiveSchoolCheckbox() {
		boolean active_checkbox = activeschools.isEnabled();
		System.out.println("The active school checkbox is present" + active_checkbox);
	}

	public void clickOnAddSchoolsBtn() {
		selUtil.waitUntilElementIsPresentOnPage(10, addschbtn);
		addschbtn.click();
	}

	public void verifySuccessMsg(String message) {
		selUtil.isElementExists(10, successmsg);
		String actualmsg = successmsg.getText();
		Assert.assertTrue(successmsg.isDisplayed(), "Success message is not displayed on page");
	}

	public void verifySchoolErrorMsg(String schnameerrormsg) {
		String actualschmsg = scherrormsg.getText();
		Assert.assertEquals(actualschmsg, schnameerrormsg);
		System.out.println("School Error Message displayed as" + actualschmsg);
	}

	public void verifyZipErrorMsg(String zipcodeerrormsg) {
		String actualzipmsg = ziperrormsg.getText();
		Assert.assertEquals(actualzipmsg, zipcodeerrormsg);
		System.out.println("Zip Error Message displayed as" + actualzipmsg);
	}

	public String randmoizestring() {
		String schoolname = "abcdefghijklmnopqrstuvwzyx";
		String s = RandomStringUtils.random(8, schoolname);
		return s;
	}

	public void clickOnViewAllSchoolsButton() {
		selUtil.waitUntilElementIsPresentOnPage(10, viewallschbtn);
		viewallschbtn.click();
	}

	public void enterschname() {
		enter_schname.sendKeys(randomizeSchool);
	}

	public void verifyAddedSchoolName() {
		searchbox.sendKeys(randomizeSchool);
		common.clickApplyfilter();
		selUtil.hardWait(10);
		String actualschname = verifyschname.getText();
		selUtil.hardWait(2);
		Assert.assertEquals(actualschname, randomizeSchool);
		System.out.println("School name is displayed as" + actualschname);
	}

	public void clickOnCancleButton() {
		canclelinkbtn.click();
	}

	public void verifyDashboardTitle(String dashtitle) {
		String actualname = dash_title.getText();
		Assert.assertTrue(actualname.contains(dashtitle));
		System.out.println("Dashboard name displayed as" + actualname);
	}

}
