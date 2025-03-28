package web.stepdefs.orgadmin;

import java.awt.AWTException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.stepdefs.BaseClass;

public class StepdefSchoolPlaytime extends BaseClass {


	//Scenario 9:Verify_Reports_SupportNeeded_Panel_IQA-83

		@Given("I login with {string} using {string} {string}")
		public void i_login_with_using(String url, String username, String password) throws AWTException, InterruptedException
		{
			driver.get(url);
			loginPage.enterEmailID(username);
			loginPage.enterPassword(password);
			loginPage.clickOnLetsGo();
		}

		@When("I am navigated on {string} {string}")
		public void i_am_navigated_on(String level_1_menu, String level_2_menu) {
			commonPage.navigate_to_Reports_Supportneeded(level_1_menu, level_2_menu);
		}

		@Then("verify Support Needed page {string}")
		public void verify_Support_Needed_page(String Support_Title)
		{
			schoolplaytimepage.VerifySupportNeeded2(Support_Title);
		}

		@Then("verify the schools with score less than eighty {string}")
		public void verify_the_schools_with_score_less_than_eighty(String ScoreEighty) {
			schoolplaytimepage.Schoolslessthan80percent(ScoreEighty);
		}

		@Then("verify the schools with score less than fifty {string}")
		public void verify_the_schools_with_score_less_than_fifty(String Scorefifty) {
			schoolplaytimepage.Schoolslessthan50percent(Scorefifty);
		}

		//Scenario 10: @REPORTS_School_Play_Time_IQA-76

		@When("I am navigated to the {string} {string}")
		public void i_am_navigated_to_the(String level_1_menu, String level_2_menu)
		{
			commonPage.navigate_to_Reports_SchoolPlaytime(level_1_menu, level_2_menu);
		}

		@Then("Verify This Week button is selected")
		public void Verify_this_Week_button_is_selected()
		{
			schoolplaytimepage.VerifyToogleButton();
		}

		@Then("Verify the List of schools with playtime bar")
		public void verify_the_list_of_schools_with_playtime_bar()
		{
			schoolplaytimepage.VerifyListofschoolswithplaytimebar();
		}

		@And("Display the time for this week")
		public void display_the_time_for_this_week()
		{
			schoolplaytimepage.Displaytime();
		}

		@And("I am able to select play time as school year on School Playtime Page")
		public void i_am_able_to_select_play_time_as_school_year_on_School_Playtime_Page()
		{
			schoolplaytimepage.clickOnSchoolYearOfSchoolPlayTimePage();
		}

		@And("I am able to select play time as custom on School playtime page")
		public void i_am_able_to_select_play_time_as_custom_on_School_playtime_page()
		{
			schoolplaytimepage.clickOnCustomOfSchoolPlayTimePage();
		}


		@And("Verify the time {string} {string} {string}")
		public void verify_the_time(String Green, String Orange, String Red)
		{
		schoolplaytimepage.verifytime(Green, Orange, Red);
		}
		//Scenario 11: @REPORTS_School_Play_Time_IQA-77

		@Then("Verify last Week button is selected")
		public void verify_last_week_button_is_selected() {
			schoolplaytimepage.VerifyToogleButton2();
		}

//		@Then("Verify the List of schools with playtime bar2")
//		public void verify_the_list_of_schools_with_playtime_bar2()
//		{
//		    Footerlinkspage.VerifyListofschoolswithplaytimebar();
//		    Footerlinkspage.PlayTimeBar();
//		}

		//Scenario 11: @REPORTS_School_Play_Time


		@Then("Verify School Year button is selected")
		public void verify_school_year_button_is_selected() throws InterruptedException {
			schoolplaytimepage.VerifyToogleButton3();
		}

		@Then("Verify the List of schools with playtime bar4")
		public void verify_the_list_of_schools_with_playtime_bar4() throws InterruptedException
		{
			schoolplaytimepage.VerifyListofschoolswithplaytimebar4();
		}


		//Scenario 11: @REPORTS_School_Play_Time_custom date

		@Then("Verify dates is selected from the calender")
		public void verify_dates_is_selected_from_the_calender() throws InterruptedException {
			schoolplaytimepage.VerifyToogleButton4();
			schoolplaytimepage.setDate();
		}

		//@REPORTS_School_Play_Time_last_week_IQA-86

		@When("I am navigated to {string} {string}")
		public void i_am_navigated_to(String level_1_menu, String level_2_menu)
		{
			commonPage.navigate_to_Reports_DeviceIgniteversion(level_1_menu, level_2_menu);
		}

		@Then("Verify I am able to select the school from the dropdown {string}")
		public void verify_i_am_able_to_select_the_school_from_the_dropdown(String Schooldropdown)
		{
			schoolplaytimepage.schooldropdown(Schooldropdown);
		}

		@Then("Verify I am able to select the teacher from the dropdown by searching {string}")
		public void verify_i_am_able_to_select_the_teacher_from_the_dropdown_by_searching(String Teacherdropdown) throws InterruptedException
		{
			schoolplaytimepage.teacherdropdown(Teacherdropdown);
		}

		@Then("Verify I am able to select the parent from the dropdown {string}")
		public void verify_i_am_able_to_select_the_parent_from_the_dropdown(String Parentbutton)
		{
			schoolplaytimepage.parentdropdown(Parentbutton);
		}

		@Then("Verify I am able to select the device from the dropdown {string}")
		public void verify_i_am_able_to_select_the_device_from_the_dropdown(String deviceName)
		{
			schoolplaytimepage.devicedropdown(deviceName);
		}

		@Then("Verify I am able to see Last Sync {string}")
		public void verify_i_am_able_to_see_last_sync(String LastSync)
		{
			schoolplaytimepage.lastsync(LastSync);
		}

		@Then("Verify I am able to see App Version {string}")
		public void verify_i_am_able_to_see_app_version(String AppVersion ) {
			schoolplaytimepage.appversion(AppVersion);

		}

		@Then("Verify I am able to see Schoolhome Device {string}")
		public void verify_i_am_able_to_see_schoolhome_device(String string) {
			schoolplaytimepage.schoolhomedevice(string);
		}

		@Then("Verify I am able to see Teacher Parent name {string}")
		public void verify_i_am_able_to_see_teacher_parent_name(String string) {
			schoolplaytimepage.teacherparentname(string);
		}

		@Then("Verify I am able to see School {string}")
		public void verify_i_am_able_to_see_school(String School) {
			schoolplaytimepage.verifyschool(School);
		}

		@Then("Verify I am able to see Device Type {string}")
		public void verify_i_am_able_to_see_device_type(String string) {
			schoolplaytimepage.devicetype(string);
		}

		@Then("Verify I am able to see ID number {string}")
		public void verify_i_am_able_to_see_id_number(String IDnumber) {
			schoolplaytimepage.idnumber(IDnumber);
		}

}
