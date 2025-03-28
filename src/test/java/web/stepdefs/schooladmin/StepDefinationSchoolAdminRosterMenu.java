package web.stepdefs.schooladmin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import web.stepdefs.BaseClass;

public class StepDefinationSchoolAdminRosterMenu extends BaseClass {

	@And("Verify i can select Class or Classes from class DropDown")
	public void verify_i_can_select_Class_Name_from_DropDown(DataTable expectedClassName)
	{
		sch_rostermenu.clickOnSelectClassDrodownAndSelectClass(expectedClassName);
	}

	@And("Verify list of Classes displayed under header name")
	public void verify_list_of_classes_displayed_under_header_name() {
		sch_rostermenu.seeListOfclassesUnderHeaderName();
	}

	@Then("Verify Edit info button for listed classes {string}")
	public void i_am_able_to_edit_info_button_for_listed_classes(String string) {
		sch_rostermenu.availabilityofeditbutton(string);
	}

	@Then("I am able to filter classes with the status {string}")
	public void i_am_able_to_filter_classes_with_the_status(String string) {
		sch_rostermenu.verifyThelistofInactiveClasses(string);

	}
	@And("clicked on the Carry Over Last Year's Children button")
	public void clicked_on_the_Carry_Over_Last_Years_Children_button()
	{
		sch_rostermenu.clickOnAddLastYearsChildrenButton();
	}
	@And("Verify i can remove the parent")
	public void Verify_i_can_remove_the_parent()
	{
		sch_rostermenu.removeParent();
	}
	@And("Verify i can click on save & add another button")
	public void Verify_i_can_click_on_saveandadd_another_button()
	{
		sch_rostermenu.saveandaddanother();
	}


}
