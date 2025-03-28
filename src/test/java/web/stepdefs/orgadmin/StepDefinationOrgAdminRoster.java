package web.stepdefs.orgadmin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import web.stepdefs.BaseClass;

public class StepDefinationOrgAdminRoster extends BaseClass {

//	View and Edit User

	@Then("verify given menus present on Roster subsection")
	public void verify_given_menus_present_on_Roster_subsection(DataTable expectedRosterSubmenus) {
		org_RosterPage.seeReportMenusOnRosterSubsection(expectedRosterSubmenus);
	}

	@Then("verify given menus present on Roster subsection with and")
	public void verify_given_menus_present_on_Roster_subsection_and(DataTable expectedRosterSubmenusWithAnd) {
		org_RosterPage.seeReportMenusOnRosterSubsectionAnd(expectedRosterSubmenusWithAnd);
	}

	@Then("Click on View and edit user")
	public void click_on_view_and_edit_user() {
		org_RosterPage.clickOnViewAndEditUser();
	}

	@Then("Verify list of user displayed under header name")
	public void verify_list_of_user_displayed_under_header_name() {
		org_RosterPage.seeListOfUserUnderHeaderName();
	}

	@Then("Verify header Name {string} is present and able to sort user after clicking on it")
	public void verify_header_name_is_present_and_able_to_sort_user_after_clicking_on_it(String expectedNameTitle) {
		org_RosterPage.nameHeaderisPresentAndClickable(expectedNameTitle);
	}

	@Then("Verify header Email {string} is present and able to sort user after clicking on it")
	public void verify_header_email_is_present_and_able_to_sort_user_after_clicking_on_it(String expectedEmailTitle) {
		org_RosterPage.emailHeaderisPresentAndClickable(expectedEmailTitle);
	}

	@Then("Verify header School {string} is present and able to sort user after clicking on it")
	public void verify_header_school_is_present_and_able_to_sort_user_after_clicking_on_it(String expectedSchoolTitle) {
		org_RosterPage.schoolHeaderisPresentAndClickable(expectedSchoolTitle);
	}

	@Then("Verify header Role with filter {string}")
	public void verify_header_role_with_filter_by_role(String expectedUserRole) {
		org_RosterPage.verifyHeaderRoleWithFilterByRole(expectedUserRole);
	}

	@Then("Verify header Activation {string} displayed on Page")
	public void verify_header_activation_displayed_on_Page(String expectedActiavtionHeader) {
		org_RosterPage.verifyHeaderActivationDisplayedOnPage(expectedActiavtionHeader);
	}

	@Then("Verify reset password icon displayed on Page")
	public void verify_reset_password_icon_displayed_on_Page() {
		org_RosterPage.verifyResetPasswordIconDisplayedOnPage();
	}

	@Then("Verify resend invite icon displayed on Page")
	public void verify_reseend_invite_icon_displayed_on_Page() {
		org_RosterPage.verifyReseendInviteIconDisplayedOnPage();
	}

	@Then("Verify header {string} diaplayed on Page")
	public void verify_header_edit_info_diaplayed_on_Page(String expectedEditHeader) {
		org_RosterPage.verifyHeaderEditInfoDiaplayedOnPage(expectedEditHeader);
	}

	@Then("Verify i can select {string} from school dropdown")
	public void verify_i_can_select_from_school_dropdown(String expectedSchoolName) {
		org_RosterPage.selectSchoolFromSchoolDropDown(expectedSchoolName);
	}

	@Then("Verify i can select {string} from class dropdown")
	public void verify_i_can_select_from_class_dropdown(String expectedClassName) throws InterruptedException {
		org_RosterPage.selectClassFromClassDropDown(expectedClassName);
	}

	@Then("Verify i can select {string} from status dropdown")
	public void verify_i_can_select_from_status_dropdown(String expectedStatusName) {
		org_RosterPage.selectStatusFromStatusDropDown(expectedStatusName);
	}

	@Then("verify i can search user by name {string} from search box")
	public void verify_i_can_search_user_by_name_from_search_box(String expectedUserName) {
		org_RosterPage.enterUserNameInSearchBox(expectedUserName);
	}

	@Then("verify i can search user by email adress {string} from search box")
	public void verify_i_can_search_user_by_email_adress_from_searchbox(String expectedEmailAddres) {
		org_RosterPage.enterEmailAddressInSearchBox(expectedEmailAddres);
	}

//	****************************************************************************************************
//	Add user Page

	@Then("Verify i can select user role {string} from dropdown")
	public void verify_i_can_select_user_role_from_dropdown(String expectedUserRole) {
		org_RosterPage.selectUserRoleFromDropdown(expectedUserRole);
	}

	@And("Verify i can select School or schools from dropdown")
	public void verify_i_can_select_Schools_from_dropdown(DataTable expectedSchoolsName) {
		org_RosterPage.selectSchoolsFromDropdown(expectedSchoolsName);
	}

	@And("Verify i can enter user first name to add user")
	public void verify_i_can_enter_user_first_name_to_add_user() {
		org_RosterPage.enterUserFirstNameToAddUser();
	}

	@And("Verify i can enter user first name")
	public void verify_i_can_enter_user_first_name() {
		org_RosterPage.enterUserFirstName();
	}

	@And("Verify i can enter user last name to add user")
	public void verify_i_can_enter_User_LastName_from_dropdown_to_add_user() {
		org_RosterPage.enterUserLastNameToAddUser();
	}

	@And("Verify i can enter user last name")
	public void verify_i_can_enter_User_LastName_from_dropdown() {
		org_RosterPage.enterUserLastName();
	}

	@And("Verify i can enter user email to add user")
	public void verify_i_can_enter_User_EmailAddress_to_add_user() {
		org_RosterPage.enterUserEmailAddressToAddUser();
	}

	@And("Verify i can enter user email")
	public void verify_i_can_enter_User_EmailAddress() {
		org_RosterPage.enterUserEmailAddress();
	}

	@And("Verify i can click on Add user button")
	public void Verify_i_can_click_on_Cancel_button() {
		org_RosterPage.clickAddUserButton();
	}

	@And("Verify after clicking on done adding user get redirect to view all user page with title {string}")
	public void verify_after_clicking_on_done_adding_user_get_redirect_to_view_all_user_page(
			String expectedUserPageTitle) {
		org_RosterPage.clickOnDoneAddingUser(expectedUserPageTitle);
	}

	@And("Verify added user should get displyed on view all user page using name")
	public void verify_added_user_should_get_displyed_on_view_all_user_page() {
		org_RosterPage.seeAddedUseOnViewAllUserPageUsingName();

	}

	@And("Verify added user should get displayed on view all user Page using email")
	public void verify_added_user_should_get_displayed_on_view_all_user_Page_using_email() {
		org_RosterPage.seeAddedUseOnViewAllUserPageUsingEmail();

	}

	@And("click on Add user button without filling input box")
	public void click_on_Add_user_button_without_filling_input_box() {
		org_RosterPage.clickAddUserButton();
	}

	@And("Verify error message getting diaplyed {string}")
	public void verify_error_message_getting_diaplyed1(String expectedErrorMessage) {
		org_RosterPage.verifyErrorMessageGettingDiaplyed1(expectedErrorMessage);
	}

	@And("Verify after clicking on cancel button reidrect to {string} page")
	public void verify_after_clicking_on_cancel_button_reidrect_to_page(String expectedViewAllUserPageTitle) {
		org_RosterPage.verifyAfterClickingOnCancelButtonRedirectToPage(expectedViewAllUserPageTitle);
	}

}
