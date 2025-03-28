package web.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import util.Selenium;
import util.Util;

public class CommonPage {
	private WebDriver driver;
	private Selenium selUtil;
	private Util util;

	public CommonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(driver);
		util = new Util();
	}

	@FindBy(how = How.XPATH, using = "//h1[text()='504 Gateway Time-out']")
	private WebElement gateWayTimeOutHandle;
	
	@FindBy(how = How.XPATH, using = "//button[@label='Apply Filters']")
	public WebElement applyFilters;
	
	@FindBy(how = How.XPATH, using = "//button[@label='Clear Filters']")
	public WebElement clearFilters;

	// Reports-Device Ignite version
	public void navigate_to_Reports_DeviceIgniteversion(String level_1_menu, String level_2_menu) {
		String Mainmenu_xpath = "//a[contains(@class, 'nav-link') and contains(text(), 'REPORTS')]";
		String Submenu_xpath = "//*[@id='navbarTogglerDemo02']/ul/li[2]/div/div[2]/div[2]/div/a[1]";
		// String Submenu_xpath="//div[@class='dropdown-menu mega-dropdown' or
		// @class='single-menu-block']//a[contains(text(),'Support Needed')]";

		String level1_xpath = Mainmenu_xpath.replace("menuPlaceHolder", level_1_menu);
		WebElement we_level1 = driver.findElement(By.xpath(level1_xpath));

		if (we_level1.isDisplayed())
			we_level1.click();

		if (level_2_menu != "") {
			String level2_xpath = Submenu_xpath;
			WebElement we_level2 = driver.findElement(By.xpath(level2_xpath));
			// selUtil.waitUntilElementIsPresentOnPage(2, we_level2);
			if (we_level2.isDisplayed())
				we_level2.click();
		}
	}

	// Reports-School Play time
	public void navigate_to_Reports_SchoolPlaytime(String level_1_menu, String level_2_menu) {
		String Mainmenu_xpath = "//a[contains(@class, 'nav-link') and contains(text(), 'REPORTS')]";
		String Submenu_xpath = "//a[normalize-space()='School Play Time']";
		// String Submenu_xpath="//div[@class='dropdown-menu mega-dropdown' or
		// @class='single-menu-block']//a[contains(text(),'Support Needed')]";

		String level1_xpath = Mainmenu_xpath.replace("menuPlaceHolder", level_1_menu);
		WebElement we_level1 = driver.findElement(By.xpath(level1_xpath));

		if (we_level1.isDisplayed())
			we_level1.click();

		if (level_2_menu != "") {
			String level2_xpath = Submenu_xpath;
			WebElement we_level2 = driver.findElement(By.xpath(level2_xpath));
			// selUtil.waitUntilElementIsPresentOnPage(2, we_level2);
			if (we_level2.isDisplayed())
				we_level2.click();
		}
	}

	// Reports-support needed
	public void navigate_to_Reports_Supportneeded(String level_1_menu, String level_2_menu) {
		String Mainmenu_xpath = "//a[contains(@class, 'nav-link') and contains(text(), 'REPORTS')]";
		String Submenu_xpath = "//a[@id='navbarreportsdropdown_reports']/parent::*//a[text()='Support Needed']";
		// String Submenu_xpath="//div[@class='dropdown-menu mega-dropdown' or
		// @class='single-menu-block']//a[contains(text(),'Support Needed')]";

		String level1_xpath = Mainmenu_xpath.replace("menuPlaceHolder", level_1_menu);
		WebElement we_level1 = driver.findElement(By.xpath(level1_xpath));

		if (we_level1.isDisplayed())
			we_level1.click();

		if (level_2_menu != "") {
			String level2_xpath = Submenu_xpath;
			WebElement we_level2 = driver.findElement(By.xpath(level2_xpath));
			// selUtil.waitUntilElementIsPresentOnPage(2, we_level2);
			if (we_level2.isDisplayed())
				we_level2.click();
		}
	}

	// only for skillsupport support needed
	public void navigate_to_Skill_Support(String level_1_menu, String level_2_menu) {
		String Mainmenu_xpath = "//a[contains(@class, 'nav-link') and contains(text(), 'menuPlaceHolder')]";
		String Submenu_xpath = "//a[@id='navbarreportsdropdown_skill_support']/parent::*//a[text()='Support Needed']";
		// String Submenu_xpath="//div[@class='dropdown-menu mega-dropdown' or
		// @class='single-menu-block']//a[contains(text(),'Support Needed')]";

		String level1_xpath = Mainmenu_xpath.replace("menuPlaceHolder", level_1_menu);
		WebElement we_level1 = driver.findElement(By.xpath(level1_xpath));

		if (we_level1.isDisplayed())
			we_level1.click();

		if (level_2_menu != "") {
			String level2_xpath = Submenu_xpath;
			WebElement we_level2 = driver.findElement(By.xpath(level2_xpath));
			// selUtil.waitUntilElementIsPresentOnPage(2, we_level2);
			if (we_level2.isDisplayed())
				we_level2.click();
		}
	}

	// only for teacher skill support support needed
	public void navigate_to_Support_Needed(String level_1_menu, String level_2_menu) {
		String Mainmenu_xpath = "//a[contains(@class, 'nav-link') and contains(text(), 'menuPlaceHolder')]";
		String Submenu_xpath = "(//a[@href='/insightchild/weeklystatus'])[2]";
		// String Submenu_xpath="//div[@class='dropdown-menu mega-dropdown' or
		// @class='single-menu-block']//a[contains(text(),'Support Needed')]";

		String level1_xpath = Mainmenu_xpath.replace("menuPlaceHolder", level_1_menu);
		WebElement we_level1 = driver.findElement(By.xpath(level1_xpath));

		if (we_level1.isDisplayed())
			we_level1.click();

		if (level_2_menu != "") {
			String level2_xpath = Submenu_xpath;
			WebElement we_level2 = driver.findElement(By.xpath(level2_xpath));
			// selUtil.waitUntilElementIsPresentOnPage(2, we_level2);
			if (we_level2.isDisplayed())
				we_level2.click();
		}
	}

	public boolean verify_Top_MenuBar(String level_1_menu, String level_2_menu) {
		Boolean isPresent = false;

		String menu_xpath = "//a[contains(@class, 'nav-link') and contains(text(), 'menuPlaceHolder')]";
		String subMenu_xpath = "//a[contains(@class, 'dropdown-item') and contains(text(), 'menuPlaceHolder')]";

		String level1_xpath = menu_xpath.replace("menuPlaceHolder", level_1_menu);
		WebElement we_level1 = driver.findElement(By.xpath(level1_xpath));

		selUtil.hardWait(6);
		selUtil.waitUntilElementIsPresentOnPage(20, we_level1);
		if (we_level1.isDisplayed())
			we_level1.click();

		if (level_2_menu != "") {
			String level2_xpath = subMenu_xpath.replace("menuPlaceHolder", level_2_menu);
			WebElement we_level2 = driver.findElement(By.xpath(level2_xpath));
			// selUtil.waitUntilElementIsPresentOnPage(2, we_level2);
			isPresent = selUtil.isElementExists(we_level2);
		}

		return isPresent;
	}

	public boolean verify_Top_MenuBarAnd(String level_1_menu, String level_2_menu) {
		Boolean isPresent = false;

		String menu_xpath = "//a[contains(@class, 'nav-link') and contains(text(), 'menuPlaceHolder')]";
//		String subMenu_xpath = "//a[@href='/menuPlaceHolder/view/']";
		String subMenu_xpath = "//a[contains(@href,'menuPlaceHolder') and contains(@href,'view')]";

		String level1_xpath = menu_xpath.replace("menuPlaceHolder", level_1_menu);
		WebElement we_level1 = driver.findElement(By.xpath(level1_xpath));

		selUtil.hardWait(5);
		if (we_level1.isDisplayed())
			we_level1.click();
		selUtil.hardWait(5);

		if (level_2_menu != "") {
			String level2_xpath = subMenu_xpath.replace("menuPlaceHolder", level_2_menu);
			WebElement we_level2 = driver.findElement(By.linkText(level_2_menu));
			// selUtil.waitUntilElementIsPresentOnPage(2, we_level2);
			isPresent = selUtil.isElementExists(we_level2);
		}

		return isPresent;
	}

	public void navigate_Top_MenuBar(String level_1_menu, String level_2_menu) {
		selUtil.hardWait(5);// wait added to avoid loading issues

//		String menu_xpath = "//a[contains(@class, 'nav-link') and contains(text(), 'menuPlaceHolder')]";
//		String subMenu_xpath = "//a[contains(@class, 'dropdown-item') and contains(text(), 'menuPlaceHolder')]";

		String menu_xpath = "//button[contains(@class, 'MuiButton') and contains(text(), 'menuPlaceHolder')]";
		String subMenu_xpath = "//div[contains(@class,'link MuiBox-root') and text()='menuPlaceHolder']";

		String level1_xpath = menu_xpath.replace("menuPlaceHolder", level_1_menu);
		WebElement we_level1 = driver.findElement(By.xpath(level1_xpath));

		if (we_level1.isDisplayed() == true)
			we_level1.click();

		if (level_2_menu != "") {
			String level2_xpath = subMenu_xpath.replace("menuPlaceHolder", level_2_menu);
			WebElement we_level2 = driver.findElement(By.xpath(level2_xpath));
			// selUtil.waitUntilElementIsPresentOnPage(2, we_level2);
			selUtil.waitUntilElementIsPresentOnPage(60, we_level2);
//			if (we_level2.isDisplayed())
			selUtil.hardWait(2);
			we_level2.click();
		}
	}

	public void setDate(String dateToSet) {
		String[] dateParts = dateToSet.split("/");
		String day = dateParts[0];
		String month = dateParts[1];
		String year = dateParts[2];

//		//click on date element
//		String date_input_xpath = "//input[contains(@class, 'datepicker')]";
//		driver.findElement(By.xpath(date_input_xpath)).click();

		// set year
		String year_xpath = "//select[@class='ui-datepicker-year']";
		Select yearSelect = new Select(driver.findElement(By.xpath(year_xpath)));
		yearSelect.selectByVisibleText(year);

		// set month
		String month_xpath = "//select[@class='ui-datepicker-month']";
		Select monthSelect = new Select(driver.findElement(By.xpath(month_xpath)));
		monthSelect.selectByVisibleText(month);

		// set date
		String date_xpath = "//*[@class='ui-datepicker-calendar']//td//a[text()=" + day + "]";
		driver.findElement(By.xpath(date_xpath)).click();
	}

	public void setDateStart(String dateToSet) {
		String[] dateParts = dateToSet.split("/");
		String day = dateParts[0];
		String month = dateParts[1];
		String year = dateParts[2];

//		//click on date element
//		String date_input_xpath = "//input[contains(@class, 'datepicker')]";
//		driver.findElement(By.xpath(date_input_xpath)).click();

		// set year

		// WebElement DateRangetextPresent
		// =driver.findElement(By.xpath("//label[text()='Date Range']"));
		// The above line is not working for the progress page due to which below line
		// has been added
		WebElement DateRangetextPresent = driver.findElement(By.xpath("//*[text()='Date Range']"));
		String year_startxpath = "(//select[@class='ui-datepicker-year'])[1]";
		Select yearSelect = new Select(driver.findElement(By.xpath(year_startxpath)));
		selUtil.getAction().moveToElement(DateRangetextPresent).perform();
		yearSelect.selectByVisibleText(year);

		// set month
		String month_xpath = "(//select[@class='ui-datepicker-month'])[1]";
		Select monthSelect = new Select(driver.findElement(By.xpath(month_xpath)));
		monthSelect.selectByVisibleText(month);

		// set date
		String date_xpath = "(//*[@class='ui-datepicker-calendar']//td//a[text()=" + day + "])[1]";
		driver.findElement(By.xpath(date_xpath)).click();
	}

	public void setDateEnd(String dateToSet) {
		String[] dateParts = dateToSet.split("/");
		String day = dateParts[0];
		String month = dateParts[1];
		String year = dateParts[2];

//		//click on date element
//		String date_input_xpath = "//input[contains(@class, 'datepicker')]";
//		driver.findElement(By.xpath(date_input_xpath)).click();

		// set year

		String year_endxpath = "(//select[@class='ui-datepicker-year'])[2]";
		Select yearSelect = new Select(driver.findElement(By.xpath(year_endxpath)));

		yearSelect.selectByVisibleText(year);

		// set month
		String month_endxpath = "(//select[@class='ui-datepicker-month'])[2]";
		Select monthSelect = new Select(driver.findElement(By.xpath(month_endxpath)));
		monthSelect.selectByVisibleText(month);

		// set date
		String date_xpath = "(//*[@class='ui-datepicker-calendar']//td//a[text()=" + day + "])[2]";

		WebElement enddate = driver.findElement(By.xpath(date_xpath));
		selUtil.getAction().moveToElement(enddate).perform();
		// selUtil.executeJavaScript("arguments[0].scrollIntoView()", enddate);
		enddate.click();
	}

	// hardcoded for SkillSupport-Support Needed

	public void navigate_to_Skill_Support1(String level_1_menu, String level_2_menu) {
		String Mainmenu_xpath = "//a[contains(@class, 'nav-link') and contains(text(), 'menuPlaceHolder')]";
		String Submenu_xpath = "//a[@href='/insightreports/supportneeded/']";

//		String menu_xpath = "//button[contains(@class, 'MuiButton') and contains(text(), 'menuPlaceHolder')]";
//		String subMenu_xpath = "//div[contains(@class,'link MuiBox-root') and text()='menuPlaceHolder']']";

		String level1_xpath = Mainmenu_xpath.replace("menuPlaceHolder", level_1_menu);
		WebElement we_level1 = driver.findElement(By.xpath(level1_xpath));

		if (we_level1.isDisplayed())
			we_level1.click();

		if (level_2_menu != "") {
			String level2_xpath = Submenu_xpath;
			WebElement we_level2 = driver.findElement(By.xpath(level2_xpath));
			if (we_level2.isDisplayed())
				we_level2.click();
		}

	}

	public void verifyColorProgress(String expectedStartDate, String expectedEndDate) throws ParseException {
		long days = util.getDateDiff_InMinutes(expectedStartDate, expectedEndDate);

		int weeks = (int) (days / 7);
		int daysRemains = (int) (days % 7);

		if (daysRemains >= 3) {
			weeks = weeks + 1;
		} else {
			weeks = weeks + 0;
		}

		System.out.println(weeks);
		String expectedGreenBar = (30 * weeks + "+ min");
		String expectedOrangeBar = (10 * weeks + "-" + 29 * weeks + " min");
		String expectedRedBar = ("< " + 10 * weeks + " min");
		System.out
				.println("Green : " + expectedGreenBar + " Orange : " + expectedOrangeBar + " Red : " + expectedRedBar);

		selUtil.hardWait(5);
		String actualGreenColor = selUtil.getDriver().findElement(By.xpath("//div[@id='playtime30']")).getText();
		String actualOrangeColor = selUtil.getDriver().findElement(By.xpath("//div[@id='playtime10_29']")).getText();
		String actualRedColor = selUtil.getDriver().findElement(By.xpath("//div[@id='playtime10']")).getText();

		Assert.assertEquals(expectedGreenBar, actualGreenColor);
		Assert.assertEquals(expectedOrangeBar, actualOrangeColor);
		Assert.assertEquals(expectedRedBar, actualRedColor);
	}

	public void navigate_Top_MenuBarAnd(String level_1_menu, String level_2_menu) {
		selUtil.hardWait(2);
		String menu_xpath = "//button[contains(@class, 'MuiButton') and contains(text(), 'menuPlaceHolder')]";
		String subMenu_xpath = "//div[contains(@class,'link MuiBox-root') and text()='menuPlaceHolder']";

		String level1_xpath = menu_xpath.replace("menuPlaceHolder", level_1_menu);
		WebElement we_level1 = driver.findElement(By.xpath(level1_xpath));
		selUtil.waitUntilElementIsPresentOnPage(10, we_level1);
		we_level1.click();
//		if(we_level1.isDisplayed()) {
//			we_level1.click();
//		}
		selUtil.hardWait(2);

//		if (level_2_menu != "") {
//			String level2_xpath = subMenu_xpath.replace("menuPlaceHolder", level_2_menu);
//			WebElement we_level2 = driver.findElement(By.linkText(level_2_menu));
//			selUtil.waitUntilElementIsPresentOnPage(40, we_level2);
////			if (we_level2.isDisplayed())
//			we_level2.click();

		if (level_2_menu != "") {
			String level2_xpath = subMenu_xpath.replace("menuPlaceHolder", level_2_menu);
			WebElement we_level2 = driver.findElement(By.xpath(level2_xpath));
			// selUtil.waitUntilElementIsPresentOnPage(2, we_level2);
			selUtil.waitUntilElementIsPresentOnPage(60, we_level2);
//				if (we_level2.isDisplayed())
			selUtil.hardWait(2);
			we_level2.click();
		}
	}

	// Device Ignite Version Of resources
	public void navigate_Top_MenuBarResourcesDeviceIgnite(String level_1_menu, String level_2_menu) {
		String menu_xpath = "//a[contains(@class, 'nav-link') and contains(text(), 'menuPlaceHolder')]";
		String subMenu_xpath = " //div[@class='row single-row-menu no-gutters']//a[@class='dropdown-item'][normalize-space()='Device Ignite Version']";

		String level1_xpath = menu_xpath.replace("menuPlaceHolder", level_1_menu);
		WebElement we_level1 = driver.findElement(By.xpath(level1_xpath));
		selUtil.waitUntilElementIsPresentOnPage(10, we_level1);
		we_level1.click();
//		if(we_level1.isDisplayed()) {
//			we_level1.click();
//		}
		selUtil.hardWait(2);

		if (level_2_menu != "") {
			String level2_xpath = subMenu_xpath.replace("menuPlaceHolder", level_2_menu);
			WebElement we_level2 = driver.findElement(By.linkText(level_2_menu));
			// selUtil.waitUntilElementIsPresentOnPage(2, we_level2);
			if (we_level2.isDisplayed())
				we_level2.click();
		}
	}

	public void gateWayTimeOutHandle504() {
		gateWayTimeOutHandle.isDisplayed();
		boolean chechgatewaytimeoutappears = selUtil.isElementExists(gateWayTimeOutHandle);
		if (chechgatewaytimeoutappears) {
			String current_url = selUtil.getDriver().getCurrentUrl();

			String[] splitedURL = current_url.split("/");
			System.out.println(splitedURL[0]);

			selUtil.getDriver().get(splitedURL[0]);
		}
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'×') and @class='_pendo-close-guide']")
	private WebElement popbutton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'×') and @class='_pendo-close-guide']")
	private WebElement popCloseButton;

	public void popOnReportPages() {
		try {
			selUtil.waitUntilElementIsPresentOnPage(5, popbutton);
			if (popbutton.isDisplayed()) {
				popCloseButton.click();
				System.out.println("pop-up is  closed");
			} else {
				System.out.println("pop-up not found!");
			}
		} catch (Exception e) {
			System.out.println("popup not found");
		}

	}

	public void waitUntillTheLoaderInvisible() {
		try {

			selUtil.waitUntilElementToBeInvisible(60,
					driver.findElement(By.xpath("//div[@id='custom-loader-wrapper']")));
			System.out.println("The Loader has disappeared");
		} catch (Exception e) {
			System.out.println("The loader has not appeared");
		}
	}

	public void waitUntillTheEntryLoaderInvisible() {
		try {

			selUtil.waitUntilElementToBeInvisible(60,
					driver.findElement(By.xpath("//div[@class='section-loader entry-exit-loader']")));
			System.out.println("The Entry Loader has disappeared");
		} catch (Exception e) {
			System.out.println("The Entry loader has not appeared");
		}
	}
	
	public void clickApplyfilter () {
		applyFilters.click();
	}
	

}