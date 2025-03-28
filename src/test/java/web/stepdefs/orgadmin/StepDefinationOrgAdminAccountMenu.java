package web.stepdefs.orgadmin;

import java.util.List;

//import java.io.File;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.stepdefs.BaseClass;





public class StepDefinationOrgAdminAccountMenu extends BaseClass
{

	@Then("I hover over Account menu")
	public void i_hover_over_account_menu()
	{
		org_accountPage.hoverOverOnAccount();
	}

	@Then("Verify Account subsection")
	public void verify_account_subsection(io.cucumber.datatable.DataTable expecetdAccountMenus)
	{
		List<String>accountSubsectionlist = expecetdAccountMenus.asList();

		   for(String expectedAccountSubsection : accountSubsectionlist)
	   {
			   org_accountPage.seeAccountSubsection(expectedAccountSubsection);
	   }
	}

	@Then("Click on My Account Menu")
	public void click_on_my_account_menu() {
		org_accountPage.clickOnmyAccountMenu();

	}
	@Then("Verify i redirected to Edit My Profile Page")
	public void verify_i_redirected_to_edit_my_profile_page()
	{
		org_accountPage.redirectedToMyProfilePage();

	}
	@Then("Verify i can enter {string} {string} {string} {string} {string} {string} {string}")
	public void verify_i_can_enter_cell_number(String email, String firstname, String lastname, String cellno, String phone, String ext, String phonedigit)
	{
		org_accountPage.enterinputfield(email,firstname,lastname,cellno,phone,ext,phonedigit);
	}
	@Then("Verify i can click on Change password button")
	public void verify_i_can_click_on_change_password_button() {
		org_accountPage.clickOnChangePasswordButton();
	}

	@Then("Verify i can enter {string} {string} and {string}")
	public void verify_i_can_enter_and(String currentpassword, String NewPassword, String ConfirmPassword)
	{
		org_accountPage.enterresetpassword(currentpassword,NewPassword,ConfirmPassword);
	}

	@Then("Verify Not right now button and Change password buttons are enable")
	public void verify_not_right_now_button_and_change_password_buttons_are_enable()
	{
		org_accountPage.passwordresetNCancelButton();
	}

	@Then("Verify Save button is enable and can click on Cancel button")
	public void verify_Save_button_is_enable_and_can_click_on_Cancel_button()
	{
		Assert.assertTrue(org_accountPage.myProfilePageSaveButton());
		selUtil.hardWait(6);
		org_accountPage.myProfilePageCancelButton();
	}

	@Then("Click on Notification Settings menu")
	public void click_on_notification_settings()
	{
		org_accountPage.NotificatiionSettingsMenu();
	}
	@Then("Verify i redirected to Notification Settings Page")
	public void verify_i_redirected_to_notification_settings_page()
	{
		org_accountPage.notificationSettingsPage();
	}
	@Then("Click on emails toggle")
	public void click_on_emails_toggle()
	{
		org_accountPage.emailsToggle();
	}
	@Then("Click on Save Settings button")
	public void click_on_save_settings_button()
	{
		Assert.assertTrue(org_accountPage.notificationSaveButton());
	}
	@Then("Click on Cancel button")
	public void click_on_cancel_button()
	{
		org_accountPage.notificationCancelbutton();
	}

	@When("Click on Log Out Menu")
	public void click_on_Log_Out_Menu()
	{
			org_accountPage.clickOnlogOutMenu();
	}

	@When("I am on Login Window with Title {string}")
	public void i_am_on_LogIn_Window_with_Title(String expectedLogInPageTitle)
	{
			org_accountPage.logInWindow(expectedLogInPageTitle);
	}
	@And("I am able to click on logout link")
	public void I_am_able_to_click_on_logout_link()
	{
		org_accountPage.clickOnLogoutLink();
	}

}

