package web.stepdefs.orgadmin;

import io.cucumber.java.en.And;
import web.stepdefs.BaseClass;

public class StepDefinationOrgAdminTsgtile extends BaseClass
{
   @And("I am able to count total number of children from page")
   public void I_am_able_to_count_total_number_of_children_from_page()
   {
	   orgtsgtilemenu.countNumberOfpages();
	   orgtsgtilemenu.countTotalNumberOfChildrenMatched();

   }

   @And("I am able to see hatchsync status of all child")
   public void I_am_able_to_see_hatchsync_status_of_all_child()
   {
	   orgtsgtilemenu.verifyHatchSyncStatus();
   }
   @And("I am able to select result per page {string}")
   public void I_am_able_to_select_result_per_page(String result)
   {
	   orgtsgtilemenu.selectResultPerPage(result);
   }

}
