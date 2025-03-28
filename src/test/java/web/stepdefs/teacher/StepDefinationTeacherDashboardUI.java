package web.stepdefs.teacher;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import web.stepdefs.BaseClass;

public class StepDefinationTeacherDashboardUI extends BaseClass
{

	@And("I am able to see create your class page {string}")
	public void I_am_able_to_see_create_your_class_page(String pagename)
	{
	   teach_DashPage.verifyCreateClassPage(pagename);
	}

	@Then("Verify child popup appears and close the child pop up")
	public void verify_child_popup_appears_and_close_the_child_pop_up()
	{
		teach_DashPage.childpopUpDisplayed();
	}
	@Then("Verify i can see Hatch Insight Logo")
	public void verify_i_can_see_hatch_insight_logo()
	{
		teach_DashPage.teachHatchInsightLogo();
	}
	@Then("Verify i can see below mega menu")
	public void verify_i_can_see_below_mega_menu(DataTable expectedMegaMenu)
	{
		teach_DashPage.teacherMegaMenu(expectedMegaMenu);
	}

	@Then("Verify i can see class dropdown")
	public void verify_i_can_see_class_dropdown()
	{
		teach_DashPage.teacherClassDropdown();
	}
	@Then("Verify i can see ignite Device Version {string}")
	public void verify_i_can_see_ignite_Device_Version(String expectedCurrentIgniteVersionTitle)
	{
		teach_DashPage.currentIgniteVersionOnDashboard(expectedCurrentIgniteVersionTitle);
	}
	@Then("Verify after clicking on Ignite device version it redirect to {string}")
	public void verify_after_clicking_on_Ignite_device_version_it_redirect(String expectedIgniteversionTitle)
	{
		teach_DashPage.clickOnCurrentIgniteversionBar(expectedIgniteversionTitle);
	}
	@Then("Verify i can see Account icon")
	public void verify_I_CanS_ee_Account_Icon()
	{
		teach_DashPage.accountIconPresentOnMegaMenu();
	}

	@Then("Verify i can click on hatch insight logo")
	public void verify_i_can_click_on_hatch_insight_logo()
	{
		teach_DashPage.teacherHatchInsightLogo();
	}
	@Then("Verify i click on Back button")
	public void verify_i_click_on_Back_button()
	{
		teach_DashPage.clickOnBackButton();
	}

	@Then("I can see Average Demonstrated Skill Progress Panel")
	public void i_can_see_average_demonstrated_skill_progress_panel()
	{
		teach_DashPage.seeAverageDemonstratedSkillProgress();
	}
	@Then("I can see Ignite Play Schedule Panel")
	public void i_can_see_ignite_play_schedule_panel()
	{
		teach_DashPage.seeIgniteplaySchedulPanel();
	}
	@Then("I can see Curricular experiences")
	public void i_can_see_curricular_experiences()
	{
		teach_DashPage.seeCurricularExperiecePanel();
	}
	@Then("I can see Support Needed Panel")
	public void i_can_see_support_needed_panel()
	{
		teach_DashPage.seeSupportNeededPanel();
	}
	@Then("I can see Average Play Time Panel")
	public void i_can_see_average_play_time_panel()
	{
		teach_DashPage.seeAverageplayTimePanel();
	}
	@Then("I can see Teaching Strategies GOLD Panel")
	public void i_can_see_teaching_strategies_gold_panel()
	{
		teach_DashPage.seeTeachingStrategiesGOLDPanel();
	}
	@Then("I can see @2022 Hatch, Inc contains {string} link on footer")
	public void i_can_see_2022_Hatch_Inc_link_on_footer(String expectedHatchYearFooter)
	{
		teach_DashPage.hatchYearFooter(expectedHatchYearFooter);
	}
	@Then("I can see HatchEarlyLearning {string} link on footer")
	public void i_can_see_HatchEarlyLearning_link_on_footer(String expectedHatchEarlylearningLink)
	{
		teach_DashPage.hatchEarlyLearningLink(expectedHatchEarlylearningLink);
	}
	@Then("I can see contact no {string} link on footer")
	public void i_can_see_contact_no_link_on_footer(String expectedContactNumberLink)
	{
		teach_DashPage.seeContactnumberonDashboard(expectedContactNumberLink);
	}
	@Then("I can see tearm of use {string} link on footer")
	public void i_can_see_tearm_of_use_link_on_footer(String expectedTearmOfuseLink)
	{
		teach_DashPage.seeTearmOfUseLink(expectedTearmOfuseLink);
	}
	@Then("I can see Privacy Policy {string} link on footer")
	public void i_can_see_Privacy_Policy_link_on_footer(String expectedPrivacyPolicyLink)
	{
		teach_DashPage.seePrivacyPolicyLink(expectedPrivacyPolicyLink);
	}
	@And("I can see Current ignite version and check my device {string} link on footer")
	public void i_can_see_current_ignite_version_and_check_my_device_link_on_footer(String expectedCurrentigniteVersion)
	{
		teach_DashPage.currentIgniteVersionBarOnDashboard(expectedCurrentigniteVersion);
	}


	@And("I click on Current ignite banner")
	public void I_click_on_Current_ignite_banner()
	{
		teach_DashPage.ClickOnCurrentIgniteBanner();
	}

	@And("Verify average demonstrated panel {string} on Teacher present")
	public void verify_average_demonstrated_panel_on_Teacher_present(String expectedAverageDemonstratedTile)
	{
		teach_DashPage.averageDemonstratedPanelOnTeacherrPesent(expectedAverageDemonstratedTile);
	}

	@And("verify average demonstrated panel on Teacher is clickable")
	public void verify_average_demonstrated_panel_on_Teacher_present()
	{
		teach_DashPage.averageDemonstratedPanelOnTeacherrPesent();
	}

	@And("Verify ignite play schedule panel {string} on Teacher present")
	public void verify_ignite_play_schedule_panel_on_Teacher_present(String expectedIgnitePlayScheduleTitle)
	{
		teach_DashPage.verifyIgnitePlaySchedulePanelOnTeacherPresent(expectedIgnitePlayScheduleTitle);
	}

	@And("Verify ignite play schedule panel on Teacher is clickable")
	public void verify_ignite_play_schedule_panel_on_Teacher_is_clickable()
	{
		teach_DashPage.verifyIgnitePlaySchedulePanelOnTeacherIsClickable();
	}

	@And("Verify Curricular Experiences panel {string} on Teacher present")
	public void verify_Curricular_Experiences_panel_on_Teacher_present(String expectedCurricularExperiencesTitle)
	{
		teach_DashPage.verifyCurricularExperiencesPanelTeacherPresent(expectedCurricularExperiencesTitle);
	}

	@And("Verify Curricular Experiences panel on Teacher is clickable")
	public void verify_Curricular_Experiences_panel_on_Teacher_is_clickable()
	{
		teach_DashPage.verifyCurricularExperiencesPanelOnTeacherIsClickable();
	}

	@And("Verify Support Needed panel {string} on Teacher present")
	public void verify_Support_Needed_panel_on_Teacher_present(String expectedSupportNeededTitle)
	{
		teach_DashPage.supportNeededPanelOnTeacherPresent(expectedSupportNeededTitle);
	}
	@And("Verify Support Needed panel on Teacher is clickable")
	public void verify_Support_Needed_panel_on_Teacher_is_clickable()
	{
		teach_DashPage.supportNeededPanelOnTeacherIsClickable();
	}

	@And("Verify Average Play Time panel {string} on Teacher present")
	public void verify_Average_Play_Time_panel_on_Teacher_present(String expectedAveragePlayTimePanel)
	{
		teach_DashPage.averagePlayTimePanelTeacherPresent(expectedAveragePlayTimePanel);
	}
	@And("Verify Average Play Time panel on Teacher is clickable")
	public void verify_Average_Play_Time_panel_on_Teacher_is_clickable()
	{
		teach_DashPage.averagePlayTimePanelTeacherIsClickable();
	}

	@And("Verify Teaching Strategies GOLD panel {string} on Teacher present")
	public void verify_Teaching_Strategies_GOLD_Panel_Teacher_Present(String expectedTeachingStrategiesGOLDTitle)
	{
		teach_DashPage.teachingStrategiesGOLDPanelTeacherPresent(expectedTeachingStrategiesGOLDTitle);
	}

	@And("Verify Teaching Strategies GOLD panel on Teacher is clickable")
	public void verify_Teaching_StrategiesGOLD_Panel_Teacher_Is_Clickable()
	{
		teach_DashPage.teachingStrategiesGOLDPanelTeacherIsClickable();
	}


}