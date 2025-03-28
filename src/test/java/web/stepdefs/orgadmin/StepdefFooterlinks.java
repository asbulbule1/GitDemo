package web.stepdefs.orgadmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.stepdefs.BaseClass;


public class StepdefFooterlinks extends BaseClass {


	//Scenario 1: Back Button functionality

//	@Given("login {string} using {string} {string}")
//	public void i_login_using(String url, String username, String password) {
//		driver.get(url);
//		loginPage.enterEmailID(username);
//		loginPage.enterPassword(password);
//		loginPage.clickOnLetsGo();
//}
	@When("Navigate top menu bar {string}  {string}")
	public void navigate_top_menu_bar(String level_1_menu, String level_2_menu)
	{
		commonPage.navigate_Top_MenuBar(level_1_menu, level_2_menu);
	}

	@Then("I am able to see page title {string}")
	public void i_am_able_to_see_page_title(String Title)
	{
		footerlinkspage.see_Title_page(Title);
	}

	@Then("I click on back button")
	public void i_click_on_back_button()
	{
		footerlinkspage.click_on_backbutton();
	}


	@When("I click on privacy policy link {string}")
	public void i_click_on_privacy_policy_link(String policyTitle)
	{
	 footerlinkspage.Click_privacy_policy(policyTitle);
	}

	@When("I click on Terms of Use link {string}")
	public void i_click_on_terms_of_use_link(String ExpectedTermTitle )
	{
		footerlinkspage.Click_terms_of_use(ExpectedTermTitle);

	}
	@When("I click on HatchEarlyLearning.com link {string}")
	public void i_click_on_hatch_early_learning_com_link(String ExpectedTitle) {
		footerlinkspage.Click_hatch_early_learning(ExpectedTitle);
	}


	@When("I am on menu {string}  {string}")
	public void i_am_on_menu(String level_1_menu, String level_2_menu)
	{
	    commonPage.navigate_to_Skill_Support1(level_1_menu, level_2_menu);
	}

	@When("I am able to see Support Needed page {string}")
	public void i_am_able_to_see_support_needed_page(String Support_Title)
	{
		footerlinkspage.see_Support_page(Support_Title);
	}




	// Scenario 4: Skill support - Recommended curricular experience page
//	@Given("Able to see dashboard page1 {string}")
//	public void able_to_see_dashboard_page1(String WelcomeTitle)
//	{
//		footerlinkspage.Dashboardpage(WelcomeTitle);
//	}

	@When("I am on the menu {string}  {string}")
	public void i_am_on_the_menu(String level_1_menu, String level_2_menu)
	{
	    commonPage.navigate_Top_MenuBar(level_1_menu, level_2_menu);
	}
	@And("I am able to see recommended curricular experience page {string}")
	public void i_am_able_to_see_recommended_curricular_experience_page(String recommendecurricular)
	{
		footerlinkspage.seeCurricularTitle(recommendecurricular);
	}


}
