package web.stepdefs.P1P2Issue;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import web.stepdefs.BaseClass;

public class StepdefImportStatusPage extends BaseClass
{

	@Then("Verify Headers of import history Log should displayed")
	public void verify_headers_of_import_history_log_displayed(DataTable expectedImportLogHeaders)
	{
		import_statuspage.headersOfImportHistoryLogDisplayed(expectedImportLogHeaders);
	}
	@Then("Verify i can select history log button")
	public void verify_i_can_select_history_log_button()
	{
		import_statuspage.selectHistoryLogButton();
	}
	@Then("Verify cron job is executed at {string} overnight")
	public void verify_cron_job_is_executed_at_night(String expectedCronTime)
	{
		import_statuspage.rosterSyncCronJobExecuted(expectedCronTime);
	}
	@Then("Verify on import status summary page count labels should displayed.")
	public void verify_on_import_status_summary_page_count_labels_should_displayed(DataTable expectedSummaryHeaders)
	{
		import_statuspage.importStatusSummaryPageCountLabelsdDisplayed(expectedSummaryHeaders);
	}
	@Then("Verify two option present for carryover {string} and {string}")
	public void verify_two_option_present_for_Carryover(String expectedSimpleCarryOver, String expectedBulkCarryOver)
	{
		import_statuspage.verifyTwoOptionPresentForCarryover(expectedSimpleCarryOver,expectedBulkCarryOver);
	}
	@Then("Click on Continue button for {string}")
	public void click_on_Continue_Button_Carry_Over_Option(String expectedCarryoverOption)
	{
		import_statuspage.clickOnContinueButtonCarryOverOption(expectedCarryoverOption);
	}
	@Then("Verify i can select and expand Import Carryover Children accordion")
	public void verify_i_can_select_and_expand_Import_Carryover_Children_accordion()
	{
		import_statuspage.expandImportCarryoverChildrenAccordion();
	}
	@Then("Verify Available schools dropdown present")
	public void verify_Available_schools_dropdown_present()
	{
		import_statuspage.availalableSchoolDropDown();
	}
	@Then("Verify i can select school from dropdown")
	public void verify_i_can_select_school_from_dropdown(DataTable expectedSchoolName)
	{
		import_statuspage.selectSchoolNameFromDropDown(expectedSchoolName);
	}
	@Then("Verify i can select class {string} from dropdown")
	public void verify_i_can_select_class_from_dropdown(String expectedClassName)
	{
		import_statuspage.selectClassNameFromDropdown(expectedClassName);
	}

	@Then("Verify i can select children from list to carry over")
	public void verify_i_can_select_children_from_list(DataTable expectedChilName)
	{
		import_statuspage.selectChildFromListToCarryover(expectedChilName);
	}
	@Then("Verify i can select all children at time")
	public void verify_i_can_select_all_children_at_time()
	{
		import_statuspage.selectAllChildrenToCarryOver();
	}
	@Then("Verify Save Roster button is clickable")
	public void verify_Save_Roster_button_is_clickable()
	{
		import_statuspage.saveRosterButtonIsClickable();
	}
	@Then("Verify Next class button is clickable")
	public void verify_Next_class_button_is_clickable()
	{
		import_statuspage.nextClassButtonIsClickable();
	}

	@Then("verify Finish button is clickable")
	public void verify_Finish_button_is_clickable()
	{
		import_statuspage.finishButtonIsClickable();
	}
	@Then("Verify Add New Class button present, after clicking on it navigate to {string} page")
	public void verify_Add_New_Class_button_present_after_clicking_on_it_navigate_to_create_your_class_page(String expectedPageTitle)
	{
		import_statuspage.addNewClassButtonPresentandClickingNavigateTOCreateClassPage(expectedPageTitle);
	}
	@Then("Verify Download Last Years Data button present and clickable")
	public void verify_Download_Last_Years_Data_button_present_and_clickable()
	{
		import_statuspage.verifyDownloadLastYearsDataButtonPresentAndClickable();
	}
	@Then("Verify See Current Classes button present and clickable")
	public void verify_See_Current_Classes_button_present_and_clickable()
	{
		import_statuspage.verifySeeCurrentClassesButtonPresentAndClickable();
	}
	@Then("Verify Choose a File button is present and clickable")
	public void verify_Choose_a_File_button_is_present_and_clickable()
	{
		import_statuspage.verifyChooseFileButtonIsPresentAndClickable();
	}
}
