package web.stepdefs.teacher;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import web.stepdefs.BaseClass;

public class StepdefinationTeacherRoster extends BaseClass
{
	@And("verify we are able to see Parent Conference Report page {string}")
	public void verify_we_are_able_to_see_Parent_Conference_Report_page(String ExpectedConferencePageTitle)
	{
		teach_rosterpage.ParentConferenceReport(ExpectedConferencePageTitle);

	}


@And("I am able to select Class Name from list of Class in dropdown")
public void i_am_able_to_select_Class_Name_from_list_of_Class_in_dropdown(DataTable expectedClassName )
{
	teach_rosterpage.selectClassFromDropdown(expectedClassName);
}

@And ("Verify the List of children with report")
public void verify_the_List_of_children_with_report()
{
	teach_rosterpage.VerifylistofChildrenwithprintreport();
}

@And("I am able to see support needed page title {string}")
public void i_am_able_to_see_support_needed_page_title(String supportneededpage)
{
	teach_rosterpage.VerifySupportNeededpageTitle(supportneededpage);
}

@And("I am able to see subdomain header {string}")
public void i_am_able_to_see_subdomain_header (String subdomainheader )
{
	teach_rosterpage.VerifysubDoaminHeader(subdomainheader);

}

@And("I am able to see percentage header {string}")
public void i_am_able_to_see_percentage_header (String precentageHeader )
{
	teach_rosterpage.VerifyPrecentageHeader(precentageHeader);

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