package web.stepdefs.schooladmin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import web.pages.CommonPage;
import web.stepdefs.BaseClass;

public class StepDefinationSchoolAdminReportsPage extends BaseClass

{
  @And("I am able to verify menu {string} {string}")
  public void i_am_able_to_verify_menu(String level_1_menu, String level_2_menu)
  {
	 commonPage.verify_Top_MenuBar(level_1_menu, level_2_menu);
  }
  @Then("I verify menus present in the subsections")
  public void i_verify_menus_present_in_the_subsections(DataTable expectedReportSubmenus)
  {
	  sch_reportpage.seeReportMenusOnSubsection(expectedReportSubmenus);
  }
  @And("I am able to see class play time page {string}")
  public void i_am_able_to_see_class_play_time_page(String classplaytime)
  {
	  sch_reportpage.verifyClassPlaytimePage(classplaytime);
  }
  @And("I am able to see list of classes")
  public void I_am_able_to_see_list_of_classes()
  {
	  sch_reportpage.seeClassNameList();
  }
  @And("I am able to select class play time as this week")
  public void I_am_able_to_select_class_play_time_as_this_week()
  {
	  sch_reportpage.selectThisWeek();
  }
  @And("I am able to select class play time as last week")
  public void I_am_able_to_select_class_play_time_as_last_week()
  {
	  sch_reportpage.selectClassLastWeek();
  }
  @And("I am able to select schools from dropdown {string}")
  public void I_am_able_to_select_schools_from_dropdown(String schdrp)
  {
	  sch_reportpage.selectSchoolDropdown(schdrp);
  }
  @And("I am able to select class play time as school year")
  public void I_am_able_to_select_class_play_time_as_school_year()
  {
	  sch_reportpage.selectSchoolYear();
  }
  @And("I am able to select class play time as custom")
  public void I_am_able_to_select_class_play_time_as_custom()
  {
	  sch_reportpage.selectCustomYear();
  }
  @And("I am able to select school from dropdown {string}")
  public void i_am_able_to_select_school_from_dropdown(String schdrp)
  {
	  sch_reportpage.selectSchoolDropdown(schdrp);
  }
  @And("I am able to select subdomain from dropdown {string}")
  public void I_am_able_to_select_subdomain_from_dropdown(String subdrp)
  {
	  sch_reportpage.selectSubdomain(subdrp);
  }
  @And("I am able to select school from dropdown child playtime {string}")
  public void I_am_able_to_select_school_from_dropdown_child_playtime(String schdrp)
  {
	  sch_reportpage.selectChildSchool(schdrp);
  }
  @And("I am able to select class from dropdown child playtime {string}")
  public void I_am_able_to_select_class_from_dropdown_child_playtime(String clsdrp)
  {
	  sch_reportpage.selectChildClassDrp(clsdrp);
  }
  @And("I am able to select schools from school dropdown school progress {string}")
  public void I_am_able_to_select_schools_from_school_dropdown_school_progress(String schdrp)
  {
	  sch_reportpage.selectSchoolProgressSchool(schdrp);
  }
  @And("I am able to select subdomain from subdomain dropdown form school progress {string}")
  public void I_am_able_to_select_subdomain_from_subdomain_dropdown_form_school_progress(String subdrp)
  {
	  sch_reportpage.selectSchoolProgressSubdomain(subdrp);
  }
  @And("I am able to select langauge from progress page")
  public void I_am_able_to_select_langauge_from_progress_page()
  {
	  sch_reportpage.selectEnglishRadioBtn();
	  sch_reportpage.selectSpanishRadioBtn();
	  sch_reportpage.selectAllRadioBtn();

  }
  @And("I am able to see list of schools with progress bar")
  public void I_am_able_to_see_list_of_schools_with_progress_bar()
  {
	  sch_reportpage.verifyListOfSchool();
  }
  @And("I am able to select schools from school dropdown class progress {string}")
  public void I_am_able_to_select_schools_from_school_dropdown_class_progress(String schdrp)
  {
	  sch_reportpage.selectClassSchDrp(schdrp);
  }
  @And("I am able to select subdomain from subdomain dropdown class progress {string}")
  public void I_am_able_to_select_subdomain_from_subdomain_dropdown_class_progress(String clsdrp)
  {
	  sch_reportpage.selectClassSubDrp(clsdrp);
  }
  @And("I am able to see list of class with progress bar")
  public void I_am_able_to_see_list_of_class_with_progress_bar()
  {
	  sch_reportpage.verifyListOfClass();
  }
  @And("I am able to select schools from child progress dropdown {string}")
  public void I_am_able_to_select_schools_from_child_progress_dropdown(String schdrp)
  {
	  sch_reportpage.selectChildProgressSchdrp(schdrp);
  }
  @And("I am able to select class from child progress dropdown {string}")
  public void I_am_able_to_select_class_from_child_progress_dropdown(String clsdrp)
  {
	  sch_reportpage.selectChildProgressClsdrp(clsdrp);
  }
  @And("I am able to select subdomain from child progress dropdown {string}")
  public void I_am_able_to_select_subdomain_from_child_progress_dropdown(String subdrp)
  {
	  sch_reportpage.selectChildProgressSubdrp(subdrp);
  }
  @And("I am able to see list of child with progress bar")
  public void I_am_able_to_see_list_of_child_with_progress_bar()
  {
	  sch_reportpage.verifyListOfChild();
  }
  @And("I am able to select school play time as last week")
  public void I_am_able_to_select_school_play_time_as_last_week()
  {
	  sch_reportpage.clickOnSchoolPlaytimeLastWeek();
  }
  @And("I am able to select school play time as school year")
  public void I_am_able_to_select_school_play_time_as_school_year()
  {
	  sch_reportpage.clickOnSchoolPlaytimeSchoolYear();
  }
  @And("I am able to select school play time as custom")
  public void I_am_able_to_select_school_play_time_as_custom()
  {
	  sch_reportpage.clickOnSchoolPlaytimeCustom();
  }
  @And("I am able to see support needed page {string}")
  public void I_am_able_to_see_support_needed_page(String supportneededpage)
  {
	  sch_reportpage.verifySupportNeededTitle(supportneededpage);
  }
  @And("I am able to see class header")
  public void I_am_able_to_see_class_header()
  {
	  sch_reportpage.verifyClassHeader();
  }
  @And("I am able to see scores less than 80 percentage")
  public void I_am_able_to_see_scores_less_than_80_percentage()
  {
	  sch_reportpage.verifyScoresLessThan80Header();
  }
  @And("I am able to see scores less than 50 percentage")
  public void I_am_able_to_see_scores_less_than_50_percentage()
  {
	  sch_reportpage.verifyScoresLessThan50Header();
  }
  @And("I am able to see device ignite version page {string}")
  public void I_am_able_to_see_device_ignite_version_page(String deviceversionpage)
  {
	  sch_reportpage.verifyDeviceIgniteTitle(deviceversionpage);
  }
  @And("I am able to select schools name from dropdown")
  public void I_am_able_to_select_schools_name_from_dropdown(DataTable expectedSchoolName)
  {
	  sch_reportpage.selectSchoolsFromDropdown(expectedSchoolName);
  }
  @And("I am able to select teacher name from dropdown")
  public void I_am_able_to_select_teacher_name_from_dropdown(DataTable expectedTeacherName)
  {
	  sch_reportpage.selectTeacherFromDropdown(expectedTeacherName);
  }
  @And("I am able to select parent name from dropdown")
  public void I_am_able_to_select_parent_name_from_dropdown(DataTable expectedParentName)
  {
	  sch_reportpage.selectParentFromDropdown(expectedParentName);
  }
  @And("I am able to select device type from dropdown")
  public void I_am_able_to_select_device_type_from_dropdown(DataTable expectedDeviceName)
  {
	  sch_reportpage.selectDeviceFromDropdown(expectedDeviceName);
  }
  @And("I am able to see last sync header")
  public void I_am_able_to_see_last_sync_header()
  {
	  sch_reportpage.verifyLastSyncHeader();
  }
  @And("I am able to see app version header")
  public void I_am_able_to_see_app_version_header()
  {
	  sch_reportpage.verifyAppVersionHeadre();
  }
  @And("I am able to see school or home device header")
  public void I_am_able_to_see_school_or_home_device_header()
  {

  }
  @And("I am able to see teacher or parent name header")
  public void I_am_able_to_see_teacher_or_parent_name_header()
  {
	  sch_reportpage.verifyTeacherHeader();
  }
  @And("I am able to see device type header")
  public void I_am_able_to_see_device_type_header()
  {
	  sch_reportpage.verifyDeviceTypeHeader();
  }
  @And("I am able to see id number header")
  public void I_am_able_to_see_id_number_header()
  {
	  sch_reportpage.verifyIdNumberHeader();
  }
  @And("I am able to see detail list")
  public void I_am_able_to_see_detail_list()
  {
	  sch_reportpage.verifyListDetails();
  }
  @Then("Verify i click on demographic dropdown button")
	public void verify_i_click_on_demographic_dropdown_button()
	{
	  commonPage.waitUntillTheLoaderInvisible();
	  sch_reportpage.clickOnDemographicDropdown();
	}
  @Then("I select option for age of children")
	public void i_select_option_for_age_of_children(DataTable expectedChildrenAge)
	{
	  sch_reportpage.selectAgeOfTheChildren(expectedChildrenAge);
	}

  @Then("I select option for grade of children")
	public void i_selectoption_for_grade_of_children(DataTable expectedChildrenGrade)
	{
	  sch_reportpage.selectGradeOfTheChildren(expectedChildrenGrade);
	}
  @Then("I select option for Language of children")
	public void i_select_option_for_Language_of_children(DataTable expectedChildrenLanguage)
	{
	  sch_reportpage.selectLanguageOfChildren(expectedChildrenLanguage);
	}
  @Then("I select option for Race of children")
	public void i_select_option_for_Race_of_children(DataTable expectedChildrenRace)
	{
	  sch_reportpage.selectRaceOfChildren(expectedChildrenRace);
	}

  @Then("I select option for Ethnicity of children")
	public void i_select_option_for_Ethnicity_of_children(DataTable expectedChildrenEthnicity)
	{
	  sch_reportpage.selectEthnicityOfChildren(expectedChildrenEthnicity);
	}
  @Then("i click on demographic filter apply button")
	public void i_click_on_demographic_filter_apply_button()
	{
	  sch_reportpage.clickOnDemographicFilterApplyButton();
	}
  @Then("Verify i Select Show play time for Custom Range for class playtime")
	public void i_Select_Show_play_time_for_Custom_Range_Class_Playtime()
	{
	  sch_reportpage.customRangeOptionselectClassPlaytime();
	}
  @Then("Verify i Select Show play time for {string} for class playtime")
	public void i_Select_Show_play_time_for_duration_Class_Playtime(String expectedDateRange)
	{
	  sch_reportpage.selectShowPlayTimeThisWeekClassPlaytime(expectedDateRange);
	}
  @Then("Verify i Select Show play time for Custom Range")
	public void i_Select_Show_play_time_for_Custom_Range()
	{
	  sch_reportpage.customRangeOptionselect();
	}
  @Then("Verify i Select Show play time for {string}")
	public void select_show_play_time_for_This_Week(String expectedDateRange)
	{
	  sch_reportpage.selectShowPlayTimeThisWeek(expectedDateRange);
	}
  @Then("The user should be able to see the child name column")
  public void the_user_should_be_able_to_seethe_child_name_column()
  {
	  sch_reportpage.childNameColumnonCSDPageDisplay();
  }
  @Then("The user should be able to see Ignite report column")
  public void the_user_should_be_able_to_see_Ignite_report_column()
  {
	  sch_reportpage.igniteReportColumnOnCSDPage();
  }
  @Then("The user should be able to see the IgniteTable report column")
  public void the_user_should_be_able_to_see_the_IgniteTable_report_column()
  {
	  sch_reportpage.igniteTableReportColumnOnCSDPage();
  }
  @Then("The user should be able to see the child name list")
  public void the_user_should_be_able_to_see_the_child_name_list()
  {
	  sch_reportpage.theUserShouldBeAbleToSeeTheChildNameList();
  }
  @Then("The user should be able to click on view from Ignite reports column")
  public void the_user_should_be_able_to_click_on_view_from_Ignite_reports_column()
  {
	  sch_reportpage.clickOnViewFromIgniteReportsColumn();
  }
  @Then("The user should be able to navigate to the Ignite child skill detail report page of that child")
  public void the_user_should_be_able_to_navigate_to_the_Ignite_child_skill_detail_report_page_of_that_child()
  {
	  sch_reportpage.navigateToIgniteChildSkillDetailsReportPage();
  }
 
  @Then("The user should be able to navigate to the IgniteTable child skill detail report page of that child")
  public void the_user_should_be_able_to_navigate_to_the_IgniteTable_child_skill_detail_report_page_of_that_child()
  {
	  sch_reportpage.navigateToIgniteTableChildSkillDetailsReportPage();
  }
  
  @Then("The user should be able to click on the print button")
  public void the_user_should_be_able_to_click_on_the_print_button()
  {
	  sch_reportpage.clickOnPrintButton();
  }
  @Then("Select classes from the filter")
  public void Select_classes_from_the_filter(DataTable expectedClassName)
  {
	  sch_reportpage.selectClassesFromDropdownOnCSDReportPage(expectedClassName);
  }

}
