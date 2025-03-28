package web.stepdefs.schooladmin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import web.stepdefs.BaseClass;

public class StepDefinationSchoolAdminRosterPage extends BaseClass
{
 @And("I am able to verify submenus")
 public void I_am_able_to_verify(DataTable expectedReportSubmenus)
 {
	sch_rosterpage.seeReportMenusOnSubsection(expectedReportSubmenus);
 }
 @And("I am able to see view all children page {string}")
 public void I_am_able_to_see_view_all_children_page(String pagename)
 {
	 sch_rosterpage.verifyPageTitle(pagename);
 }

 @And("I am able to see parent name header")
 public void I_am_able_to_see_parent_name_header()
 {
	sch_rosterpage.verifyParentnameHeader();
 }
 @And("I am able to see email address header")
 public void I_am_able_to_see_email_address_header()
 {
	 sch_rosterpage.verifyEmailHeader();
 }
 @And("I am able to see child header")
 public void I_am_able_to_see_child_header()
 {
	 sch_rosterpage.verifyChildHeader();
 }
 @And("I am able to see activation header")
 public void I_am_able_to_see_activation_header()
 {
	 sch_rosterpage.verifyActivationHeader();
 }
 @And("I am able to see edit header")
 public void I_am_able_to_see_edit_header()
 {
	 sch_rosterpage.verifyEditHeader();
 }
}
