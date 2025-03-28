package web.stepdefs.schooladmin;

import io.cucumber.java.en.And;
import web.stepdefs.BaseClass;

public class StepDefinationSkillSupportPage extends BaseClass
{
 @And("I am able to verify {string} {string}")
 public void i_am_able_to_verify(String level_1_menu, String level_2_menu)
 {
	 commonPage.verify_Top_MenuBarAnd(level_1_menu, level_2_menu);
 }
 @And("I am able to verify the {string} {string}")
 public void I_am_able_to_verify_the(String level_1_menu,String level_2_menu)
 {
	 commonPage.verify_Top_MenuBar(level_1_menu, level_2_menu);
 }
}
