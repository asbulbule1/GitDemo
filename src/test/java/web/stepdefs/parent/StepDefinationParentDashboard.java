package web.stepdefs.parent;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import web.stepdefs.BaseClass;

public class StepDefinationParentDashboard extends BaseClass{

	@Given("I navigate to top menu bar {string} {string}")
	public void i_navigate_top_menu_bar(String level_1_menu, String level_2_menu)
	{
	  commonPage.navigate_Top_MenuBar(level_1_menu, level_2_menu);
	}

	@When("I am able to verify top menu bar {string} {string}")
	public void i_am_able_to_verify_DASHBOARD_top_menu_bar(String level_1_menu,String level_2_menu)
	{
		commonPage.verify_Top_MenuBar(level_1_menu, level_2_menu);
	}

	@And("I able to close hatch support page {string}")
	public void i_able_to_close_hatch_support_page(String ExpectedTitle)
	{
		parent_dashpage.hatch_support_page(ExpectedTitle);
	}
	@When("I am able to see Child skill level panel with title")
	public void i_am_able_To_see_child_skill_level_panel_with_title ()
	{
		parent_dashpage.childSkillLevelPanel();
	}

	@And("I am able to see Parctice together panel with title {string}")
	public void i_am_able_to_see_Parctice_together_panel_with_title(String expectedPanelText1)
	{
		parent_dashpage.Parcticetogetherpanelwithtitle(expectedPanelText1);
	}

    @And("I am able to see Practice Together page {string}")
    public void i_am_able_to_see_Practice_Together_page(String Expectedtitle)
    {
    	parent_dashpage.ableToSeePracticeTogetherpage(Expectedtitle);
    }

	@And("I am able to see child art work with title")
	public void i_am_able_to_see_child_art_work_with_title ()
	{
		parent_dashpage.childArtWork();
	}

   @And("I able to click on HatchEarlyLearningcom link {string}")
	public void i_able_to_click_on_HatchEarlyLearningcom_link (String ExpectedTitle)
	{
	   parent_dashpage.hatchEarlyLearningcomlink(ExpectedTitle);
	}

	@When("I click on HatchInsights Logo")
	public void i_click_on_HatchInsights_Logo()
	{
		parent_dashpage.hatchInsightsLogo();
	}
	
	
	}

