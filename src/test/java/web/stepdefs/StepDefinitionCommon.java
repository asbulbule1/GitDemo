package web.stepdefs;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;

public class StepDefinitionCommon extends BaseClass {

	@Given("I navigate to top menu bar {string}{string}")
	public void i_navigate_top_menu_bar(String level_1_menu, String level_2_menu) {
		commonPage.navigate_Top_MenuBar(level_1_menu, level_2_menu);
	}

	@Given("I am on {string} environment {string}")
	public void i_am_on_environment(String environment, String url) {
		driver.get(url);

	}

	@When("I enter username {string}")
	public void i_enter_username(String username) throws InterruptedException, AWTException {
		loginPage.enterEmailID(username);
	}

	@When("I enter password {string}")
	public void i_enter_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("I click letsgo")
	public void i_click_letsgo() throws AWTException {
		loginPage.clickOnLetsGo();
	}

	@Then("I am on org admin home page")
	public void i_am_on_org_admin_home_page() {
		Assert.assertTrue(org_dashPage.isHomePageOpen());
	}

	@When("I click logout button")
	public void i_click_logout_button() {
		org_dashPage.clickLogout();
	}

	@Then("I am on login page")
	public void i_am_on_login_page() {
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Login"));
	}

	@Then("I am on parent home page")
	public void i_am_on_parent_home_page() {
		Assert.assertTrue(org_dashPage.isHomePageOpen());
	}

	@Then("I am on school admin home page")
	public void i_am_on_school_admin_home_page() {
		Assert.assertTrue(org_dashPage.isHomePageOpen());

	}

	@Then("I am on teacher home page")
	public void I_am_on_teacher_home_page() {
		Assert.assertTrue(org_dashPage.isHomePageOpen());
	}

	@Then("I checked for the Popup")
	public void I_checked_for_the_popup() {
		commonPage.popOnReportPages();
	}
	
	@Then("I checked the Loader")
	public void I_checked_the_loader()
	{
		commonPage.waitUntillTheLoaderInvisible();
	}
	
	@Then("I checked for the entry Loader")
	public void I_checked_the_entry_loader()
	{
		commonPage.waitUntillTheEntryLoaderInvisible();
	}

}
