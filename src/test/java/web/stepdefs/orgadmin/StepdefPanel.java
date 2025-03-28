package web.stepdefs.orgadmin;

import java.awt.AWTException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.stepdefs.BaseClass;

public class StepdefPanel extends BaseClass {

	@Given("login {string} using {string} {string}")
	public void i_login_using(String url, String username, String password) throws AWTException, InterruptedException {
		driver.get(url);
		loginPage.enterEmailID(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLetsGo();
	}
	@When("Verify support needed panel is displayed {string}")
	public void verify_support_needed_panel_is_displayed(String Panel)
	{
		panelpage.VerifySupportNeeded(Panel);
	}

	@Then("Verify View weekly status report link is displayed {string} {string}")
	public void verify_view_weekly_status_report_link_is_displayed(String Report, String Statement) {
		panelpage.Verifyweeklyreportlink(Report, Statement);
	}

	// Scenario 6:VerifySupportPageindetail_IQA-154

	@When("I click on View weekly status report link {string} {string} {string} {string}")
	public void i_click_on_view_weekly_status_report_link(String Noplaysession,String Support_Title,String ScoreEighty,String Scorefifty) {
		panelpage.Clickonweeklyreportlink(Noplaysession,Support_Title,ScoreEighty,Scorefifty);
	}

	// Scenario 6 :orgadmin_Verify_Professional_Development_Panel_IQA-66

	@When("I click anywhere on professional development panel")
	public void i_click_anywhere_on_professional_development_panel() {
		panelpage.Clickprofesstionaldevelopment();
	}

	@Then("I am navigated to hatchHub page {string}")
	public void i_am_navigated_to_hatch_hub_page(String HatchTitle) throws InterruptedException
	{
		panelpage.OnHatchHubPage(HatchTitle);
	}


	//Scenario 7:Verify_Average_PlayTime_Panel_IQA-69



	@When("I click on View Play Time for All Children")
	public void i_click_on_view_play_time_for_all_children() {
		panelpage.ClickViewPlayTime();
	}

	@Then("I am navigated to School Play time page {string}")
	public void i_am_navigated_to_school_play_time_page(String SchoolTitlePage)
	{
		panelpage.SchoolPlayTimePage(SchoolTitlePage);
	}

	@Then("I am able to see school list with the playtime bar")
	public void i_am_able_to_see_school_list_with_the_playtime_bar() {

		panelpage.SchoolListPlayTimeBar();
	}

	//Scenario 8:Verify_Average_PlayTime_Panel_IQA-70

	@When("I verify Average play time panel title {string}")
	public void i_verify_average_play_time_panel_title(String Avgtitle)
	{
		panelpage.verifyAverageplaytimepaneltitle(Avgtitle);
	}

	@Then("I verify This week children played on average count")
	public void i_verify_this_week_children_played_on_average_count()
	{
		panelpage.VerifyChildrenCount();
	}

	@Then("I verify text We recommend children play Ignite {string}")
	public void i_verify_text_we_recommend_children_play_ignite(String Verifytext)
	{
		panelpage.Verifytext(Verifytext);
	}

	@Then("I am able to see View Play Time for All Children {string}")
	public void i_am_able_to_see_view_play_time_for_all_children(String Link)
	{
	    panelpage.ViewPlayTimeforAllChildren(Link);
	}


}


