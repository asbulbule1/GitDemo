package web.stepdefs.orgadmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.stepdefs.BaseClass;

public class StepDefinationRosterMenu extends BaseClass

{
	@When("I navigate to the and {string} {string}")
	public void i_navigate_to_the_and(String level_1_menu,String level_2_menu)
	{
		commonPage.navigate_Top_MenuBarAnd(level_1_menu, level_2_menu);
	}

	@And("I am able to see view all schools page {string}")
	public void i_am_able_to_see_view_all_schools_page(String schpagetitle)
	{
		rosterpage.verifyViewAllSchoolPage(schpagetitle);
	}
	@And("I am able to see schoolname {string}")
	public void i_am_able_to_see_schoolname(String school_namelist)
	{
		rosterpage.seeschoolnamelist(school_namelist);
	}
	@And("I am able to see teachers count {string}")
	public void I_am_able_to_see_teachers_count(String teacher_count)
	{
		rosterpage.seeTeachercountlist(teacher_count);
	}
	@And("I am able to see classes count {string}")
	public void I_am_able_to_see_classes_count(String class_count)
	{
		rosterpage.seeClassescountlist(class_count);
	}
	@And("I am able to click on edit info button")
	public void I_am_able_to_click_on_edit_info_button()
	{
	   rosterpage.clickOnEditInfoButton();

	}
	@And("I am able to see a children count {string}")
	public void I_am_able_to_see_a_children_count(String children_count)
	{
		rosterpage.seeChildrencountlist(children_count);
	}
	@Then("I am able to see edit school page {string}")
	public void I_am_able_to_see_edit_school_page(String title)
	{
		rosterpage.verifyEditschooltitle(title);

	}
	@And("I am able to click on a school name")
	public void I_am_able_to_click_on_a_school_name()
	{
		rosterpage.clickonSchoolnamelink();
	}
	@And("I am able to see view all classes page {string}")
	public void I_am_able_to_see_view_all_classes_page(String pagename)
	{
		rosterpage.verifyViewAllClasses(pagename);
	}

	@And("I am able to see add school page {string}")
	public void I_am_able_to_see_add_school_page(String pagenametitle)
	{
		rosterpage.verifyAddSchoolPage(pagenametitle);
	}
	@And("I am able to enter a school name")
	public void I_am_able_to_enter_a_school_name()
	{
		rosterpage.enterschname();
	}
	@And("I am able to enter a city name {string}")
	public void I_am_able_to_enter_a_city_name(String entercityname)
	{
		rosterpage.enterCityname(entercityname);
	}
	@And("I am able to select a state {string}")
	public void I_am_able_to_select_a_state(String statedrp) throws InterruptedException
	{
		rosterpage.selectStatedropdown(statedrp);
	}
	@And("I am able to enter a zip code {string}")
	public void I_am_able_to_enter_a_zip_code(String zipcode)
	{
		rosterpage.enterZipCode(zipcode);
	}
	@When("I navigate into menu {string} {string}")
	public void i_navigate_into_menu(String level_1_menu,String level_2_menu)
	{
		commonPage.navigate_Top_MenuBar(level_1_menu, level_2_menu);
	}
	@And("I am able to see active school checkbox")
	public void I_am_able_to_see_active_school_checkbox()
	{
		rosterpage.verifyActiveSchoolCheckbox();
	}
	@And("I am able to click on add school button")
	public void I_am_able_to_click_on_add_school_button()
	{
		rosterpage.clickOnAddSchoolsBtn();
	}
	@And("I am able to see sucess message on page {string}")
	public void I_am_able_to_see_sucess_message_on_page(String message)
	{
		rosterpage.verifySuccessMsg(message);
	}
	@Then("I am able to see error message for school name {string}")
	public void I_am_able_to_see_error_message_for_school_name(String schnameerrormsg)
	{
		rosterpage.verifySchoolErrorMsg(schnameerrormsg);
	}
	@Then("I am able to see error message for zip code {string}")
	public void I_am_able_to_see_error_message_for_zip_code(String zipcodeerrormsg)
	{
		rosterpage.verifyZipErrorMsg(zipcodeerrormsg);
	}
	@And("I am able to click on view all schools button")
	public void I_am_able_to_click_on_view_all_schools_button()
	{
		rosterpage.clickOnViewAllSchoolsButton();
	}
	@And("I am able to see added school on view all school page")
	public void I_am_able_to_see_added_school_on_view_all_school_page()
	{
		rosterpage.verifyAddedSchoolName();
	}
	@And("I am able to click on cancle link of add school page")
	public void I_am_able_to_click_on_cancle_link_of_add_school_page()
	{
		rosterpage.clickOnCancleButton();
	}
	@Then("I am on dashboard page {string}")
	public void I_am_on_dashboard_page(String dashtitle)
	{
		rosterpage.verifyDashboardTitle(dashtitle);
	}

}
