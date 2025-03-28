package web.pages.teacher;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.Selenium;
import web.pages.CommonPage;
import web.stepdefs.BaseClass;

public class TeacherReportPage extends BaseClass {
	private WebDriver driver;
	private Selenium selUtil;
	

	@FindBy(how = How.ID, using = "childplaytimeSchoolId")
	private WebElement selectSchoolFromSchoolDropdownOnChildPlaytime;

	@FindBy(how = How.ID, using = "childplaytimeClassId")
	private WebElement selectClassFromSchoolDropdownOnChildPlaytime;

	@FindBy(how = How.ID, using = "childplaytimeSubdomainId")
	private WebElement selectSubdomainFromSchoolDropdownOnChildPlaytime;

	@FindBy(how = How.XPATH, using = "//div[@class='dropdown demographics-dropdown']/button")
	private WebElement demographicdropdown;

	@FindBy(how = How.XPATH, using = "//button[@type='button']//parent::div[@class='dropdown']")
	private WebElement dateRangeDropdown;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Custom Range']")
	private static WebElement customRangeOption;

//	@FindBy(how = How.XPATH, using = "//button[@type='button']//parent::div[@class='dropdown']")
//    private WebElement dateRangeDropdown;

	String dateRangeSelect = "//a[text()='$dateRange$' and @class='dropdown-item progress_filter']";

	public TeacherReportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(driver);
	}

	public void selectSchoolFromSchoolDropDownChildPlaytime(String expectedSchoolName) {
		Select select = new Select(selectSchoolFromSchoolDropdownOnChildPlaytime);
		select.selectByVisibleText(expectedSchoolName);

	}

	public void select_ChildClassdropdown(String expectedClassName) {
		Select select = new Select(selectClassFromSchoolDropdownOnChildPlaytime);
		select.selectByVisibleText(expectedClassName);
	}

	public void clickOnSubdomainDropdown(String expectedSubdomainName) 
    {
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectteacher);
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", clickonSubdomainfilter);
        WebElement wesub=driver.findElement(By.xpath("//p[normalize-space(.)='Subdomain']/following-sibling::div[contains(@class, 'MuiOutlinedInput-root')]"));
        if (wesub.isDisplayed()) {
            
            js.executeScript("arguments[0].click();", wesub);
            selUtil.hardWait(5);        
            wesub.click();
            
            System.out.println("Dropdown Element is found");
        } else {
            System.out.println("Dropdown element not found.");
        }
//        js.executeScript("arguments[0].click();", selectsubdomain);
//        String subdomain=" self Identity"
        WebElement selectsubdomain=driver.findElement(By.xpath("//li[@title='Self-Identity']"));
        selectsubdomain.click();
        }

	public void clickOnDemograpghicButton() {
//			selUtil.waitUntilElementIsPresentOnPage(20, demographicdropdown);
		selUtil.hardWait(2);
		selUtil.waitUntilElementIsPresentOnPage(20, demographicdropdown);
		demographicdropdown.click();
	}

	public void selectShowChildPlayTimeThisWeek(String expectedDateRange) {
		commonPage.waitUntillTheLoaderInvisible();
		selUtil.hardWait(3);
		selUtil.waitUntilElementIsPresentOnPage(30, dateRangeDropdown);
		dateRangeDropdown.click();
		String dateRangeXpath = dateRangeSelect.replace("$dateRange$", expectedDateRange);
		WebElement dateRangeWE = driver.findElement(By.xpath(dateRangeXpath));
		dateRangeWE.click();
	}

	public void customRangeOptionselect() {
		selUtil.hardWait(3);
		dateRangeDropdown.click();
		selUtil.waitUntilElementIsPresentOnPage(20, customRangeOption);
		selUtil.getAction().moveToElement(customRangeOption).perform();
////		selUtil.getAction().click(customRangeOption).perform();
//		selUtil.hardWait(3);
//		customRangeOption.click();

	}
}
