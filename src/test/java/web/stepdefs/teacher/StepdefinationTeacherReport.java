package web.stepdefs.teacher;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import web.stepdefs.BaseClass;

public class StepdefinationTeacherReport extends BaseClass
{
	@Then("Verify i Select {string} from School dropdown for child Playtime")
	public void select_School_From_School_DropDown_Class_Playtime(String expectedSchoolName)
	{
		teach_ReportPage.selectSchoolFromSchoolDropDownChildPlaytime(expectedSchoolName);
	}
	@And("I am able to select class from class dropdown {string} for child playtime")
	public void I_am_able_to_select_class_from_class_dropdown(String chiclassdropdown)
	{
		teach_ReportPage.select_ChildClassdropdown(chiclassdropdown);
	}

	@Then("I am able to select subdomain from subdomain dropdown {string} for child playtime")
	public void verify_i_click_on_demographic_dropdown_button_Child_Playtime(String expectedSubdomainName)
	{
		teach_ReportPage.clickOnSubdomainDropdown(expectedSubdomainName);
	}
	@Then("Verify i click on demographic dropdown button for child playtime")
	public void Verify_i_click_on_demographic_dropdown_button_for_child_playtime()
	{
		teach_ReportPage.clickOnDemograpghicButton();
	}
	@Then("Verify i Select Show play time for {string} for child Playtime")
	public void verify_i_Select_Show_play_time__for_child_Playtime(String ExpectedDurationName)
	{
		teach_ReportPage.selectShowChildPlayTimeThisWeek(ExpectedDurationName);
	}
	@Then("Verify i Select Show play time for Custom Range for child playtime")
	public void i_Select_Show_play_time_for_Custom_Range()
	{
		teach_ReportPage.customRangeOptionselect();
	}
}






//public void navigatedToGivenReportPage(String expectedReportPageTitle)
//	{
//		selUtil.hardWait(5);
//		System.out.println("I Naviagted to "+expectedReportPageTitle+" Report Page");
////		System.out.println(reportPageTitle.getText());
//		Assert.assertEquals(reportPageTitle.getText(), expectedReportPageTitle);
//
//	}