package web.stepdefs.parent;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.parent.ParentAccount;
import web.stepdefs.BaseClass;

public class StepDefinationParentAccountMenu extends BaseClass{

	@Given("I navigate to top menu bar and {string} {string}")
	public void i_navigate_top_menu_bar_and(String level_1_menu, String level_2_menu)
	{
	  commonPage.verify_Top_MenuBarAnd(level_1_menu, level_2_menu);
	}

   @And("I able to click on go to dashbaord page")
	public void i_able_to_click_on_go_to_dashbaord_page()
	{
	   ParentAccount.ClickOngoToDashboardpage();
	}


    @When("I am able to top menu bar {string} {string}")
	public void i_am_able_top_menu_bar(String level_1_menu, String level_2_menu)
	{
	  commonPage.navigate_Top_MenuBarAnd(level_1_menu, level_2_menu);
	}

    @And("I Click on Language Setting page")
    public void I_click_on_Language_Setting_page()
   {
    	   parent_Account.LanguageSettingpage();
   }

   @And ("I am able see Language Setting page {string}")
   public void i_am_able_see_Language_Setting_page(String ExpectedTitle)
{
	   parent_Account.languageSettingspageTitle(ExpectedTitle);
    }

   @And ("I am able to select english language button")
   public void i_am_able_to_select_english_language_button()
   {
	   parent_Account.selectEnglishLanguage();
   }

   @And("I am able to save the language setting changes")
   public void i_am_able_to_save_the_language_setting_changes()
   {
	   parent_Account.savelanguagechanges();
   }

   @And ("I am able to select spanish language button")
   public void i_am_able_to_select_spnaish_language_button()
   {
	   parent_Account.selectSpanishLanguage();
   }

   @And ("I click on canclebutton")
   public void i_click_on_canclebutton()
   {
	   parent_Account.cancleButton();
   }

   @Then("I click on Go to Dashboard button")
   public void i_click_on_Go_to_Dashboard_button()
   {
	   ParentAccount.ClickOngoToDashboardpage();
   }
}





