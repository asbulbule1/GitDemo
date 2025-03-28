package web.stepdefs.orgadmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.stepdefs.BaseClass;

public class StepDefinationDashboardPanel extends BaseClass
{
@When("I click on Ignite by Hatch")
public void i_login_on_Ignite_by_Hatch()
{
	dashboardpanelpage.clickOnIgniteTile();
}
@And("I am able to see school set up and utilization page {string}")
public void i_am_able_to_see_school_set_up_and_utilization_page(String title)
{
	dashboardpanelpage.verifyPagetitle(title);
}
@When("I am able to see Ignite by hatch utlization panel {string}")
public void i_am_able_to_see_Ignite_by_hatch_utlization_panel(String tilename)
{
	dashboardpanelpage.verifyIgnitByHatchText(tilename);
}
@And("I am able to see a {string}")
public void i_am_able_to_see_a(String totalnumberofschool)
{
	dashboardpanelpage.verifyNumberofSchools(totalnumberofschool);
}
@Then("I am able to see the {string}")
public void i_am_able_to_see_the(String numberofschoolforclasses)
{
	dashboardpanelpage.verifyNumberOfClasses(numberofschoolforclasses);
}
@And("I am able to see setup remaining table {string}")
public void i_am_able_to_see_setup_remining_table(String tablename)
{
	dashboardpanelpage.verifyTableName(tablename);
}
@And("I am able to see school header")
public void i_am_able_to_see_school_header()
{
	dashboardpanelpage.verifySchoolHeader();
}
@And("I am able to see total teacher header")
public void i_am_able_to_see_total_teacher_header()
{
	dashboardpanelpage.verifyTeachersHeader();
}
@And("I am able to see total classes header")
public void i_am_able_to_see_total_classes_header()
{
	dashboardpanelpage.verifyClassesHeader();
}
@And("I am able to see %teachers trained this year header")
public void i_am_able_to_see_teachers_trained_this_year_header()
{
	dashboardpanelpage.verifyTrainedThisYear();
}
@And("I am able to see %teachers visited insights")
public void I_am_able_to_see_teachers_visited_insights()
{
	dashboardpanelpage.verifyVisitedInsights();
}
@And("I am able to see % of estimated children addded")
public void I_am_able_to_see_of_estimated_children_addded()
{
   dashboardpanelpage.verifyChildrenAdded();
}
@And("I am able to see % of children with parents")
public void I_am_able_to_see_of_children_with_parents()
{
	dashboardpanelpage.verifyWithparents();
}
@And("I am able to see % of children with photos")
public void I_am_able_to_see_of_children_with_photos()
{
	dashboardpanelpage.verifyWithPhotos();
}
@And("I am able to see % of children started play")
public void I_am_able_to_see_of_children_started_play()
{
	dashboardpanelpage.verifyStartedPlay();
}
@When("I am able to see average demonstrated skill progress tile {string}")
public void i_am_able_to_see_average_demonstrated_skil_progress_tile(String tilename)
{
	dashboardpanelpage.verifyAverageTitle(tilename);
}
@And("I am able to see current skill progress bar {string}")
public void i_am_able_to_see_current_skill_progress_bar(String current)
{
	dashboardpanelpage.verifyCurrentTileProgressBar(current);
}
@And("I am able to see 30 days ago progress bar {string}")
public void i_am_able_to_see_30_days_ago_progress_bar(String Thirtydaysago)
{
	dashboardpanelpage.verifyThirtyTileProgreeBar(Thirtydaysago);
}
@Then("I am able to see view detailed progress bar {string}")
public void i_am_able_to_see_view_detailed_progress_bar(String viewdetailedprogress)
{
	dashboardpanelpage.verifyViewDetailedLink(viewdetailedprogress);
}
@When("I click on view detailed progress")
public void i_click_on_view_detailed_progress()
{
	dashboardpanelpage.clickOnDetailedProgress();
}
@Then("I am able to see school progress page {string}")
public void i_am_able_to_see_school_progress_page(String schoolprogress)
{
	dashboardpanelpage.verifySchoolProgressPage(schoolprogress);
}
@And("I am able to see school utilization table {string}")
public void I_am_able_to_see_school_utilization_table(String headertablename)
{
	dashboardpanelpage.verifySchoolUtilizationName(headertablename);
}
@And("I am able to see setup school name header")
public void I_am_able_to_see_setup_school_name_header()
{
	dashboardpanelpage.verifySchoolHeader();
}
@And("I am able to see setup total classes header")
public void I_am_able_to_see_setup_total_classes_header()
{
	dashboardpanelpage.verifyClassesHeader();
}
@And("I am able to see setup active children header")
public void I_am_able_to_see_setup_active_children_header()
{
	dashboardpanelpage.verifyActiveChildren();
}
@And("I am able to see setup gold docs sent header")
public void I_am_able_to_see_setup_gold_docs_sent_header()
{
	dashboardpanelpage.verifyGoldDocsSent();
}
@And("I am able to see setup total reports login per class header")
public void I_am_able_to_see_setup_total_reports_login_per_class_header()
{
	dashboardpanelpage.verifyLoginperClas();
}
@And("I am able to see setup child playtime header")
public void I_am_able_to_see_setup_child_playtime_header()
{
	dashboardpanelpage.verifyChildPlaytime();
}
@And("I am able to see setup child sessions header")
public void I_am_able_to_see_setup_child_sessions_header()
{
	dashboardpanelpage.verifyChildSession();
}
@Then("I am able to see setup child skill level header")
public void I_am_able_to_see_setup_child_skill_level_header()
{
	dashboardpanelpage.verifyChildSkilllevel();
}
@And("I am able to click on school name")
public void I_am_able_to_click_on_school_name()
{
	dashboardpanelpage.clickOnSchoolName();
}
@And("I am able to see class setup and utilization page {string}")
public void I_am_able_to_see_class_setup_and_utilization_page(String setuptitle)
{
	dashboardpanelpage.verifyClassSetupTitle(setuptitle);
}
@And("I am able to see setup remaining table title {string}")
public void I_am_able_to_see_setup_remaining_table_title(String header1)
{
	dashboardpanelpage.verifySetupTitle(header1);
}
@And("I am able to see school dropdown {string}")
public void I_am_able_to_see_school_dropdown(String schooldropdown)
{
	dashboardpanelpage.seeSetupSchooldropdown(schooldropdown);
}
@And("I am able to see classsetup class header")
public void I_am_able_to_see_classsetup_class_header()
{
  dashboardpanelpage.verifySetupClassHeader();
}
@And("I am able to see classsetup teacher header")
public void I_am_able_to_see_classsetup_teacher_header()
{
	dashboardpanelpage.verifySetupTeacherHeader();
}
@And("I am able to see classsetup trained this year header")
public void I_am_able_to_see_classsetup_trained_this_year_header()
{
	dashboardpanelpage.verifySetupTrainedThisYearHeader();
}
@And("I am able to see classsetup visited insights header")
public void I_am_able_to_see_classsetup_visited_insights_header()
{
	dashboardpanelpage.verifySetupVisitedInsights();
}
@And("I am able to see classsetup children header")
public void I_am_able_to_see_classsetup_children_header()
{
	dashboardpanelpage.verifySetupChildernHeader();
}
@And("I am able to see classsetup children with parents header")
public void i_am_able_to_see_classsetup_children_with_parents_header()
{
	dashboardpanelpage.verifySetupWithParentHeader();
}
@And("I am able to see classsetup children with photos header")
public void i_am_able_to_see_classetup_children_with_photos_header()
{
	dashboardpanelpage.verifySetupWithPhotosHeader();
}
@And("I am able to see classsetup started play header")
public void i_am_able_to_see_classsetup_started_play_header()
{
	dashboardpanelpage.verifySetupStartedPlayHeader();
}
@And("I am able to see classutilization table title {string}")
public void i_am_able_to_see_classutilization_table_title(String header2)
{
	dashboardpanelpage.verifyClassUtilizationHeader(header2);
}
@And("I am able to see classutlization school dropdown {string}")
public void i_am_able_to_see_classutilization_school_dropdown(String dropdown)
{
	dashboardpanelpage.seeUtilizationSchoolDropdown(dropdown);
}
@And("I am able to see classutilization class header")
public void i_am_able_to_see_classutilization_class_header()
{
	dashboardpanelpage.verifyClassUtilizationClassHeader();
}
@And("I am able to see classutilization total gold documnets")
public void i_am_able_to_see_classutilization_total_gold_documnets()
{
	dashboardpanelpage.verifyClassUtilizationGoldHeader();
}
@And("I am able to see classutilization teacher header")
public void i_am_able_to_see_classutilization_teacher_header()
{
	dashboardpanelpage.verifyClassUtilizationTeacherHeader();
}
@And("I am able to see classutilization total reports login header")
public void i_am_able_to_see_classutilization_total_reports_login_header()
{
	dashboardpanelpage.verifyClassUtilizationReportsLogin();
}
@And("I am able to see classutilization last reports login header")
public void i_am_able_to_see_classutilization_last_reports_login_header()
{
	dashboardpanelpage.verifyClassUtilizationReportsLastLoginHeader();
}
@And("I am able to see classutilization child playtime header")
public void i_am_able_to_see_classutilization_child_playtime_header()
{
	dashboardpanelpage.verifyClassClassUtilizationChildPlaytimeHeader();
}
@And("I am able to see classutilization child session header")
public void i_am_able_to_see_classutilization_child_session_header()
{
	dashboardpanelpage.verifyClassUtilizationChildSessionHeader();
}
@Then("I am able to see classutilization child skill level header")
public void i_am_able_to_see_classutilization_child_skill_level_header()
{
	dashboardpanelpage.verifyClassUtilizationSkillLevelHeader();
}
@When("I navigate to {string} {string}")
public void i_navigate_to(String level_1_menu,String level_2_menu)
{
	commonPage.navigate_Top_MenuBar(level_1_menu, level_2_menu);
}
}
