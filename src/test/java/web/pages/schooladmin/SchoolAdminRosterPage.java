package web.pages.schooladmin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import de.erichseifert.vectorgraphics2d.intermediate.commands.Command;
import io.cucumber.datatable.DataTable;
import util.Selenium;
import web.pages.CommonPage;

public class SchoolAdminRosterPage {

	public static CommonPage common;
	private WebDriver driver;
	private Selenium selUtil;

	@FindBy(how = How.XPATH, using = "//h1[@class='title']")
	private WebElement title;

	@FindBy(how = How.ID, using = "view_all_users_c0")
	private WebElement nameheader;

	@FindBy(how = How.XPATH, using = "//a[text()='Email Address']")
	private WebElement emailheader;

	@FindBy(how = How.ID, using = "view_all_users_c2")
	private WebElement childheader;

	@FindBy(how = How.ID, using = "view_all_users_c3")
	private WebElement activationheader;

	@FindBy(how = How.ID, using = "view_all_users_c6")
	private WebElement editheader;

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Reset Password')]")
	private WebElement passwordResentButton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Resend Invite')]")
	private WebElement resendInviteButton;

	public SchoolAdminRosterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(driver);
		common = new CommonPage(driver);

	}

	String CommonSubmenuAndLink = "//a[@href='/menuPlaceHolder/view/']";

	public void seeReportMenusOnSubsection(DataTable expectedReportSubmenus) {
		List<String> menuslist = expectedReportSubmenus.asList();
		for (String expectedReportMenu : menuslist) {
			String CommonSubmenuXpath = CommonSubmenuAndLink.replace("menuPlaceHolder", expectedReportMenu);

			WebElement submenuWe = driver.findElement(By.xpath(CommonSubmenuXpath));
			selUtil.waitUntilElementIsPresentOnPage(10, submenuWe);

			selUtil.getAction().moveToElement(submenuWe).perform();

			Assert.assertTrue(submenuWe.getText().contains(expectedReportMenu), "Submenus are present");
		}
	}

	public void verifyPageTitle(String pagename) {
		String actualpgname = title.getText();
		Assert.assertEquals(actualpgname, pagename);
		System.out.println("Page name is displayed as" + actualpgname);
	}

	public void verifyParentnameHeader() {
		Assert.assertTrue(nameheader.isDisplayed(), "Parent header is not displayed on page");
	}

	public void verifyEmailHeader() {
		Assert.assertTrue(emailheader.isDisplayed(), "Email Address header is not displayed on page");
	}

	public void verifyChildHeader() {
		Assert.assertTrue(childheader.isDisplayed(), "Child Header is not displayed on page");
	}

	public void verifyActivationHeader() {
		Assert.assertTrue(activationheader.isDisplayed(), "Activation header is not displayed on page");
	}

	public void verifyEditHeader() {
		Assert.assertTrue(editheader.isDisplayed(), "Edit header is not displayed on page");
	}

	public void resetParentUserPassword() {

		selUtil.hardWait(5);
		common.applyFilters.click();
		selUtil.hardWait(3);
		passwordResentButton.click();
		selUtil.hardWait(3);
	}

	public void resendInviteToParentUser() {
		resendInviteButton.click();
		selUtil.hardWait(3);
	}
}
