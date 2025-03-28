package web.stepdefs.schooladmin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import web.stepdefs.BaseClass;

public class StepDefinationSchoolAdminDashboardPanel extends BaseClass
{

 @And("I am able to see ignite by hatch utilization panel {string} is present")
 public void I_am_able_to_see_ignite_by_hatch_utilization_panel_is_present(String panel1)
 {
	 sch_dashpanelpage.verifyHatchUtlizationPanel(panel1);
 }
 @And("I am able to click on ignite by hatch utilization panel")
 public void I_am_able_to_click_on_ignite_by_hatch_utilization_panel()
 {
	 sch_dashpanelpage.clickOnHatchUtilizationPanel();
 }
 @And("I am able to see school set up page {string}")
 public void I_am_able_to_see_school_set_up_page(String pagename)
 {
	 sch_dashpanelpage.verifySchoolSetupPage(pagename);
 }
 @And("I am able to see average demonstrated skill progress panel {string} is present")
 public void I_am_able_to_see_average_demonstrated_skill_progress_panel_is_present(String panel2)
 {
	 sch_dashpanelpage.verifyAvgDemoSkillProgressPanel(panel2);
 }
 @And("I am able to click on average demonstrated skill progress panel")
 public void I_am_able_to_click_on_average_demonstrated_skill_progress_panel()
 {
	 sch_dashpanelpage.clickOnAvgDemoSkillProgressPanel();
 }
 @And("I am able to see school progress page as {string}")
 public void I_am_able_to_see_school_progress_page_as(String schpage)
 {
	 sch_dashpanelpage.verifySchoolProgressPage(schpage);
 }
 @And("I am able to see professional development panel {string} is present")
 public void I_am_able_to_see_professional_development_panel_is_present(String panel3)
 {
	 sch_dashpanelpage.verifyProfessionalPanel(panel3);
 }
 @And("I am able to click on professional development panel")
 public void I_am_able_to_click_on_professional_development_panel()
 {
	 sch_dashpanelpage.clickOnProfessionalPanel();
 }
 @And("I am able to see hatch knowledge base page {string}")
 public void I_am_able_to_see_hatch_knowledge_base_page(String hatchpage)
 {
	 sch_dashpanelpage.verifyHatchKnowledgePage(hatchpage);
 }
 @And("I am able to click on hatch insights")
 public void I_am_able_to_click_on_hatch_insights()
 {
	 sch_dashpanelpage.clickOnHatchInsightsPage();
 }
 @And("I am able to see support needed panel {string} is present")
 public void I_am_able_to_see_support_needed_panel_is_present(String panel4)
 {
	 sch_dashpanelpage.verifySupportPanel(panel4);
 }
 @And("I am able to click on support needed panel")
 public void I_am_able_to_click_on_support_needed_panel()
 {
	 sch_dashpanelpage.clickOnSupportPanel();
 }

 @And("I am able to see average play time panel {string} is present")
 public void I_am_able_to_see_average_play_time_panel_is_present(String panel5)
 {
	 sch_dashpanelpage.verifyAvgPlayTimepanel(panel5);
 }
 @And("I am able to click on average play time panel")
 public void I_am_able_to_click_on_average_play_time_panel()
 {
	 sch_dashpanelpage.clickOnAvgPlayTimePanel();
 }
 @And("I am able to see school play time page {string}")
 public void I_am_able_to_see_school_play_time_page(String schplaytimepage)
 {
	 sch_dashpanelpage.verifySchoolPlayTimepage(schplaytimepage);
 }
 @And("I am able to see teaching strategies gold panel {string} {string} is present")
 public void I_am_able_to_see_teaching_strategies_gold_panel_is_present(String expectedTSGTitle, String expectedNonTSGTitle)
 {
	 sch_dashpanelpage.verifyTsgNonTsgPanel(expectedTSGTitle,expectedNonTSGTitle);
 }
 @And("I am able to click on teaching strategies gold panel")
 public void I_am_able_to_click_on_teaching_strategies_gold_panel()
 {
	 sch_dashpanelpage.clickOnHatchGoldPanel();
 }
 @And("I am able to see teaching strategies gold panel page {string}")
 public void I_am_able_to_see_teaching_strategies_gold_panel_page(String goldpanelpage)
 {
	 sch_dashpanelpage.verifyHatchpage(goldpanelpage);
 }
 @And("I am able to see hatch insight logo")
 public void I_am_able_to_see_hatch_insight_logo()
 {
	 sch_dashpanelpage.verifyHatchLogo();
 }
 @And("I am able to click  on hatch insight logo")
 public void I_am_able_to_click_on_hatch_insight_logo()
 {
	 sch_dashpanelpage.clickOnHatchLogo();
 }
 @And("I am able to verify mega menu {string} {string}")
 public void I_am_able_to_verify_dashboard_mega_menu(String level_1_menu, String level_2_menu)
 {
	 commonPage.verify_Top_MenuBar(level_1_menu, level_2_menu);
 }
 @And("I am able to verify account subsection")
 public void i_am_able_to_verify_account_subsection(DataTable table)
 {
	 sch_dashpanelpage.verifyAccountMenu(table);
 }
 @And("I am able to see logout link")
 public void I_am_able_to_see_logout_link()
 {
	 sch_dashpanelpage.clickOnLogout();
 }
 @And("I am able to see current ignite version")
 public void I_am_able_to_see_current_ignite_version()
 {
	 sch_dashpanelpage.verifyCuurentVersion();
 }
 @And("I am able to see hatch early learning link")
 public void I_am_able_to_see_hatch_early_learning_link()
 {
	 sch_dashpanelpage.verifyHatchLearningLink();
 }
 @And("I am able to click on hatch early learning link")
 public void I_am_able_to_click_on_hatch_early_learning_link()
 {
	 sch_dashpanelpage.clickOnHatchLearning();
 }
 @And("I am able to see welcome to hatch page {string}")
 public void I_am_able_to_see_welcome_to_hatch_page(String pagename)
 {
	 sch_dashpanelpage.verifyWelcomeHatchPage(pagename);
 }
 @And("I am able to see terms of use link")
 public void I_am_able_to_see_terms_of_use_link()
 {
	 sch_dashpanelpage.verifyTermsOfUseLink();
 }

 @And("I am able to see privacy policy link")
 public void I_am_able_to_see_privacy_policy_link()
 {
	 sch_dashpanelpage.verifyPrivacyPolicyLink();
 }
}
