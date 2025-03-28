package web.stepdefs.orgadmin;

import java.text.ParseException;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import web.pages.schooladmin.SchoolAdminReportPage;
import web.stepdefs.BaseClass;


public class StepDefinationReport extends BaseClass
{

	@Then("verify given menus present on subsection")
	public void verify_given_menus_present_on_subsection(DataTable expectedReportSubmenus)
	{
		org_ReportPage.seeReportMenusOnSubsection(expectedReportSubmenus);
	}

	@Then("Verify {string} Submenu Present on Skill Support Menu")
	public void support_Needed_Submenu_Present_on_Skill_Support_Menu(String expectedSubmenu)
	{
		org_ReportPage.supportNeededSubmenuPresent(expectedSubmenu);
	}

//******************************************************************************************
//	Growth REport

	@Then("Verify i select School {string} from school dropdown")
	public void verify_select_School_from_school_dropdown(String expected_SchoolName)
	{
		org_ReportPage.selectSchoolFromDropDown(expected_SchoolName);
	}

	@Then("Verify i select Class {string} from Class dropdown")
	public void verify_select_Class_from_school_dropdown(String expected_ClassName)
	{
		org_ReportPage.selectClassFromDropDown(expected_ClassName);
	}

	@Then("Verify i select Child {string} from child dropdown")
	public void verify_select_Child_from_school_dropdown(String expected_ChildName)
	{
		org_ReportPage.selectChildFromDropDown(expected_ChildName);
	}

	@Then("Verify i see a List of Domains with the progress bar of Entry and Exit Session")
	public void verify_see_list_of_Domains_with_Progress_bar(DataTable expectedDomainName)
	{
		org_ReportPage.selectDomainsWithProgressBar(expectedDomainName);
	}

	@And("Click On filtering option on the Child Time & Progress Export")
	public void click_filtring_option_on_the_child_time_and_progress_export()
	{
		org_ReportPage.clickFilteringOptionOnChildTimeAndProgressExport();
	}

	@And("Enter the start date {string} and end Date {string}")
	public void enter_Start_Date_On_Child_Time_And_Progress_Export(String setStartDate,String setEndDate)
	{
		org_ReportPage.enterStartDateOnChildTimeAndProgressExport(setStartDate,setEndDate);
	}

	@And("Select School Name from list of schools in dropdown")
	public void select_school_from_dropdown(DataTable expectedSchoolName)
	{
		org_ReportPage.selectSchoolFromDropdown(expectedSchoolName);
	}

	@And("Select Class Name from list of Class in dropdown")
	public void select_class_from_dropdown(DataTable expectedClassName)
	{
		org_ReportPage.selectClassFromDropdown(expectedClassName);
	}

	@And("Select Child Name from list of Children in dropdown")
	public void select_child_from_dropdown(DataTable expectedChildName)
	{
		org_ReportPage.selectChildFromDropdown(expectedChildName);
	}

	@Then("Select Domain from list in dropdown")
	public void select_Domain_from_list_in_dropdown(DataTable expectedDomainNameInDropDown)
	{
		org_ReportPage.selectDomainNameFromDropdown(expectedDomainNameInDropDown);
	}
	@Then("Set the duration format of data to download")
	public void set_the_Duration_format_of_data_to_download( )
	{
		org_ReportPage.selcetDisplayeTimeAs();
	}

	@Then("Set Age for Demograghic data")
	public void set_Age_for_Demograghic_data(DataTable expectedAge)
	{
		org_ReportPage.setAgefilterDemograghicDataDownload(expectedAge);
 	}

	@Then("Set Grade for Demograghic data")
	public void set_Grade_for_Demograghic_data(DataTable expectedGrade)
	{
		org_ReportPage.setGradefilterDemograghicDataDownload(expectedGrade);
 	}

	@Then("Set Language for Demograghic data")
	public void set_Language_for_Demograghic_data(DataTable expectedLanguage)
	{
		org_ReportPage.setLanguagefilterDemograghicDataDownload(expectedLanguage);
 	}

	@Then("Set Race for Demograghic data")
	public void set_Race_for_Demograghic_data(DataTable expectedRace)
	{
		org_ReportPage.setRaceFilterDemograghicDataDownload(expectedRace);
 	}

	@Then("Set Ethnicity for Demograghic data")
	public void set_Ethnicity_for_Demograghic_data(DataTable expectedEthnicity)
	{
		org_ReportPage.setEthnicityFilterDemograghicDataDownload(expectedEthnicity);
 	}

	@Then("Click on Download Report button")
	public void click_on_Download_Report_button()
	{
		org_ReportPage.clickOnDownloadReportButton();
	}

	@Then("Verify i Select {string} from School dropdown")
	public void select_School_From_School_DropDown_Class_Playtime(String expectedSchoolName)
	{
		org_ReportPage.selectSchoolFromSchoolDropDownClassPlaytime(expectedSchoolName);
	}

	@Then("I am able to select play time as school year on Class Play Time Page")
	public void i_am_able_to_select_play_time_as_school_year_on_Class_Play_Time_Page()
	{
		org_ReportPage.clickOnSchoolYearOnClassPlayTimePage();
	}

	@Then("I am able to select play time as Custom Date on Class Play Time Page")
	public void i_am_able_to_select_play_time_as_Custom_Date_on_Class_Play_Time_Page()
	{
		org_ReportPage.clickOnCustomDateOnClassPlayTimePage();
	}


	@Then("Verify i Select Show play time for This Week")
	public void select_show_play_time_for_This_Week()
	{
		org_ReportPage.selectShowPlayTimeThisWeek();
	}

	@Then("Verify i Select Show play time for Last Week")
	public void select_show_play_time_for_Last_Week()
	{
		org_ReportPage.selectShowPlayTimeLastWeek();
	}

	@Then("Verify {string} for green {string} for orange {string} for red color progress bar")
	public void verify_ProgressBar_color_Dispaleyed(String expectedGreenBar,String expectedOrangear,String expectedRedBar) throws ParseException
	{
		org_ReportPage.seeProgressBarColorDispaleyed(expectedGreenBar,expectedOrangear,expectedRedBar);
	}

	@Then("Verify i see a list of classes as per the selected school")
	public void verify_i_see_a_list_of_classes_as_per_the_selected_school()
	{
		org_ReportPage.seeListOfClassesAsPerSelectedSchool();
	}

	@Then("I am able to see playtime with respective colors for custom {string} {string}")
	public void i_am_able_to_see_playtime_with_respective_colors_for_custom(String start_Date, String end_Date) throws ParseException
	{
		org_ReportPage.selectShowPlayTimeCustomDate(start_Date,end_Date);
	}
	
	@And("I am able to see playtime with StartTime and EndTime{string}{string} with Exclude Weekends checkbox")
	public void i_am_able_to_See_playtimr_with_StratTime_and_EndTime_with_Exclude_Weekends_checkbox(String Start_time, String End_time) throws ParseException
	{
		org_ReportPage.selectShowPlayTimeCustomTime(Start_time,End_time);
	}
	
	@And("I am able to verify access play type filter{string}{string}{string}")
	public void i_am_able_to_verify_access_play_type_filter(String playaccesstype1, String playaccesstype2, String playaccesstype3 )
	{
		org_ReportPage.PlayAccessTypefilter(playaccesstype1, playaccesstype2, playaccesstype3);
	}
	@Then("I am able to select Teacher from Teacher filter")
	public void i_am_able_to_verify_Teacher_from_Teacher_filter(DataTable selectteacher)
	{
		org_ReportPage.verifyteacherfilter(selectteacher);
	}
	
	@Then("The user should be able to select a domain {string} from the domain dropdown")
 	public void the_user_should_be_able_to_select_a_domain_from_the_domain_dropdown(String expectedDomainName)
 	{
		org_ReportPage.selectDomainForSchoolEntryReport(expectedDomainName);
 	}
  @Then("User should be able to select a subdomain {string} from the subdomain dropdown")
	public void user_should_be_able_to_select_a_subdomain_from_the_subdomain_dropdown(String expectedSubDomain)
	{
	  org_ReportPage.selectSubDomainForSchoolEntryReport(expectedSubDomain);
	}
  @Then("User should be able to select fields from the demographics dropdown")
	public void user_should_be_able_to_select_all_fields_from_the_demographics_dropdown()
	{
	  org_ReportPage.selectDemographicDataForSchoolEntryReport();
	}

  @Then("User should be able to select schools {string} from the school dropdown")
 	public void user_should_be_able_to_select_schools_from_the_school_dropdown(String expectedSchoolName)
 	{
	  org_ReportPage.selectSchoolsFromSchoolDropdownForSchoolEntryReport(expectedSchoolName);
 	}
  @Then("User should be able to select class {string} from the class dropdown")
  public void user_should_be_able_to_select_class_from_the_class_dropdown(String expectedClassname)
  {
	  org_ReportPage.selectClassFromClassDropdownForClassEntryReport(expectedClassname);
  }
  @Then("The user should be able to see the list of classes")
  public void the_user_should_be_able_to_see_the_list_of_classes()
	{
	  org_ReportPage.seeListOfClassesonSchoolEntryPage();
	}
  @Then("The user should be able to see the list of schools")
	public void the_user_should_be_able_to_see_the_list_of_schools()
	{
	  org_ReportPage.seeListOfSchoolsonSchoolEntryPage();
	}
  @Then("User should be able to see the skill demonstrated after hovering over on dots present on the page")
	public void user_should_be_able_to_see_the_skill_demonstrated_after_hovering_over_on_dots_present_on_the_page()
	{
	  org_ReportPage.skillDemonstratedAfterHoveringOverOnDotsForSchoolEntryReport();
	}
  @Then("The user should be able to click on load more button")
 	public void the_user_should_be_able_to_click_on_load_more_button()
 	{
	  org_ReportPage.clickOnLoadMoreButtonForSchoolEntryReport();
 	}
  @Then("Users should be able to see skill emerging, Skill Demonstrated and Not Offered text on the school entry report page")
	public void users_should_be_able_to_see_skill_emerging_Skill_Demonstrated_and_Not_Offered_text_on_the_school_entry_report_page()
	{
	  org_ReportPage.seeSkillEmergingSkillDemonstratedAndSkillNotOffered();
	}
  @Then("The user should be able to see the entry completion by class bar")
  public void the_user_should_be_able_to_see_entry_completion_by_class_bar()
  {
	  org_ReportPage.seeClassEntryCompletedProgressBar();
  }
  @Then("The user should be able to see the number of classes completed entry count")
  public void The_user_should_be_able_to_see_the_number_of_classes_completed_entry_count()
  {
	  org_ReportPage.seeclassEntryCompletedProgressBar();
  }
  @Then("After clicking on class names user should be able to navigate to the child entry report page")
  public void After_clicking_on_class_names_user_should_be_able_to_navigate_to_the_child_entry_report_page()
  {
	  org_ReportPage.afterClickingClassNameNavigateToChildEntryReportPage();
  }
  @Then("The user should be able to click on load more children button")
  public void the_user_should_be_able_to_click_on_load_more_children_button()
  {
	  org_ReportPage.clickOnLoadMoreButtonForChildEntryReport();
  }
  @Then("The user should be able to see the list of children")
	public void the_user_should_be_able_to_see_the_list_of_children()
	{
	  org_ReportPage.seeListOfChildrenonChildEntryPage();
	}
  @Then("The user should be able to see the entry completion by child bar")
  public void the_user_should_be_able_to_see_the_entry_completion_by_child_bar()
  {
	  org_ReportPage.seeChildEntryCompletedProgressBar();
  }
  @Then("The user should be able to see the number of children completed entry count")
  public void the_user_should_be_able_to_see_the_number_of_children_completed_entry_count()
  {
	  org_ReportPage.seeNumberOfChildrenCompletedEntry();
  }
  @Then("After clicking on child names user should be able to navigate to the child skill details page")
  public void after_clicking_on_child_names_user_should_be_able_to_navigate_to_the_child_skill_details_page()
  {
	  org_ReportPage.afterClickingChildNameNavigateToChildSkillDetailsPage();
  }
  @Then("The user should be able to see the entry completion by school bar")
 	public void The_user_should_be_able_to_see_the_entry_completion_by_school_bar()

 	{
	  org_ReportPage.seeSchoolEntryCompletedProgressBar();
 	}
  @Then("The user should be able to see the number of schools completed entry count")
	public void the_user_should_be_able_to_see_the_number_of_schools_completed_entry_count()

	{
	  org_ReportPage.seeNumberOfCompltedEntryCount();
	}
  @Then("After clicking on school names user should be able to navigate to the class entry report page")
 	public void after_clicking_on_school_names_user_should_be_able_to_navigate_to_the_class_entry_report_page()

 	{
	  org_ReportPage.afterClickingSchoolNameNavigateToClassEntryReportPage();

 	}
	
	@And("I am able to see conference report page {string}")
	public void I_am_able_to_see_conference_report_page(String page)
	{
		org_ReportPage.verifyChildSkillConferencePage(page);
	}
	@And("I select option for class")
	public void I_select_option_for_class(DataTable expectedChildrenClass)
	{
		org_ReportPage.selectClassname(expectedChildrenClass);
	}
	@And("I am able to see child name column")
	public void I_am_able_to_see_child_name_column()
	{
		org_ReportPage.verifyChildnamColumn();
	}
	@And("I am able to see Ignite reports column")
	public void I_am_able_to_see_Ignite_reports_column()
	{
		org_ReportPage.verifyIgniteReportColumn();
	}
	@And("I am able to see IgniteTable reports column")
	public void I_am_able_to_see_IgniteTable_reports_column()
	{
		org_ReportPage.verifyIgniteTableReportColumn();
	}
	@And("I am able to see IgniteTable gameplay reports column")
	public void I_am_able_to_see_IgniteTable_gameplay_reports_column()
	{
		org_ReportPage.verifyIgniteTableGameReportColumn();
	}
	@And("I am able to see the child name lists")
	public void I_am_able_to_see_the_child_name_lists()
	{
		org_ReportPage.VerifyChildlist();
	}
	@And("I am able to navigate to ignite child skill detail page {string}")
	public void I_am_able_to_navigate_to_ignite_child_skill_detail_page(String ignitepage)
	{
		org_ReportPage.verifyIgniteChildSkillPage(ignitepage);
	}
	@And("I am able to navigate to ignitetble child skill detail page {string}")
	public void I_am_able_to_navigate_to_ignitetble_child_skill_detail_page(String ignitetablepage)
	{
		org_ReportPage.verifyIgnitetableChildSkillPage(ignitetablepage);
	}
	@And("I am able to navigate to gameplay report {string}")
	public void I_am_able_to_navigate_to_gameplay_report(String gamplaypage)
	{
		org_ReportPage.verifyGamePlayreportPage(gamplaypage);
	}
	@And("I am able to click on print button")
	public void I_am_able_to_click_on_print_button()
	{
		org_ReportPage.clickOnPrintbtn();
	}

//	School Setup Report
	@And("I am able to see school setup report page {string}")
	public void I_am_able_to_see_school_setup_report_page (String expectedReortPageTitle)
	{
		org_ReportPage.verifySchoolSetupPage(expectedReortPageTitle);
	}

	@And("Verify text in blue banner {string}")
	public void Verify_text_in_blue_banner(String expectedReportPageTitle1)
	{
		org_ReportPage.verifyTextInTheBlueBanner(expectedReportPageTitle1);
	}
	@And("I am able to click on learn more link")
	public void I_am_able_to_click_on_learn_more_link()
	{
		org_ReportPage.clickOnLearnMoreLink();
	}
	@And ("I am able to see Ignite Tab {string}")
	public void I_am_able_to_see_Ignite_Tab (String expectedtabname)
	{
		org_ReportPage.verifyIgniteTab(expectedtabname);
	}
	@And ("I am able to see IgniteTable Tab {string}")
	public void I_am_able_to_see_IgniteTable_Tab (String expectedtabname)
	{
		org_ReportPage.verifyIgniteTableTab(expectedtabname);
	}
	@And ("I am able to see the teachers column {string}")
	public void I_am_able_to_see_the_teacher_column (String expectedcolumnname)
	{
		org_ReportPage.verifyTeacherColumn(expectedcolumnname);
	}
	@And ("I am able to see the children column {string}")
	public void I_am_able_to_see_the_chidren_column (String expectedcolumnname1)
	{
		org_ReportPage.verifyChildrenColumn(expectedcolumnname1);
	}
	@And ("I am able to see the school name column {string}")
	public void I_am_able_to_see_the_school_name_column (String expectedcolumnname)
	{
		org_ReportPage.verifySchoolNameColumn(expectedcolumnname);
	}
	@And ("I am able to see of classes name column {string}")
	public void I_am_able_to_see_of_classes_name_column (String expectedcolumnname)
	{
		org_ReportPage.verifyOfClassessCloumn(expectedcolumnname);
	}
	@And ("I am able to see Total name column{string}")
	public void I_am_able_to_see_Total_name_column(String expectedcolumnname)
	{
		org_ReportPage.verifyTotalColumn(expectedcolumnname);
	}
	@And ("I am able to see accessed insights name column{string}")
	public void I_am_able_to_see_accessed_insights_name_column(String expectedcolumnname)
	{
		org_ReportPage.verifyaccessedinsightsColumn(expectedcolumnname);
	}
	@And ("I am able to see children Total column{string}")
	public void I_am_able_to_see_children_Total_column(String expectedcolumnname)
	{
		org_ReportPage.verifyTotalColumn1(expectedcolumnname);
	}
	@And ("I am able to see ignite assigned column{string}")
	public void I_am_able_to_see_ignite_assigned_column(String expectedcolumnname)
	{
		org_ReportPage.verifyigniteassigned(expectedcolumnname);
	}
	@And ("I am able to see children with family members column{string}")
	public void I_am_able_to_see_children_with_family_members_column(String expectedcolumnname)
	{
		org_ReportPage.verifyChildrenWithFamilyMembers(expectedcolumnname);
	}
	@And ("I am able to see with photos column{string}")
	public void I_am_able_to_see_with_photos_column(String expectedcolumnname)
	{
		org_ReportPage.verifyWithPhotos(expectedcolumnname);
	}
	@And ("I am able to see children playing column{string}")
	public void I_am_able_to_see_children_playing_column(String expectedcolumnname)
	{
		org_ReportPage.verifyChildrenplaying(expectedcolumnname);
	}
	@And ("I am able list school name")
	public void I_am_able_list_school_name()
	{
		org_ReportPage.verifyschoolnamelist();
	}
    @Then ("I am able to click on School name and navigate class setup page {string}")
    public void I_am_able_to_click_on_school_name_and_navigate_class_setup_page(String classsetuppage)
    {
    	org_ReportPage.clickonSchoolName(classsetuppage);
    }
    
 // Class setup page

 	@And("I am able to see class setup report page {string}")
 	public void I_am_able_to_see_class_setup_report_page(String expectedReortPageTitle) {
 		org_ReportPage.verifyClassSetupPage(expectedReortPageTitle);
 	}

 	@And("I am able to see the class name column {string}")
 	public void I_am_able_to_see_the_class_name_column(String expectedcolumnname) {
 		org_ReportPage.verifyClassNameColumn(expectedcolumnname);
 	}

 	@And("I am able to see the Teacher name column {string}")
 	public void I_am_able_to_see_the_Teacher_name_column(String expectedcolumnname) {
 		org_ReportPage.verifyTeacherNameColumn(expectedcolumnname);
 	}

 	@And("I am able to see the Accessed insights column {string}")
 	public void I_am_able_to_see_the_Accessed_insights_column(String expectedcolumnname) {
 		org_ReportPage.verifyAccessedInsightsColumn(expectedcolumnname);
 	}

 	@And("I am able to click on learn more link on class setup page")
 	public void I_am_able_to_click_on_learn_more_link_on_class_setup_page() {
 		org_ReportPage.verifyLearnMoreLinkForClassSetup();
 	}

 	@And("I am able to see the children column on class setup page {string}")
 	public void I_am_able_to_see_Children_column_on_class_setup_page(String expectedcolumnname2) {
 		org_ReportPage.verifyChildrenColumnOnClassSetup(expectedcolumnname2);
 	}

 	@And("I am able to see children Total column on class setup page {string}")
 	public void I_am_able_to_see_children_column_on_Class_setup_page(String expectedcolumnname) {
 		org_ReportPage.verifyTotalColumnOnClassSetup(expectedcolumnname);
 	}

 	@And("I am able to see ignite assigned column on class setup page {string}")
 	public void I_am_able_to_see_ignite_assigned_column_o_clas_setup_page(String expectedcolumnname) {
 		org_ReportPage.verifyigniteassignedOnClassSetup(expectedcolumnname);
 	}

 	@And("I am able to see children with family members column on Class setup {string}")
 	public void I_am_able_to_see_children_with_family_members_column_on_class_setuo(String expectedcolumnname) {
 		org_ReportPage.verifyChildrenWithFamilyMembersOnClassSetup(expectedcolumnname);
 	}

 	@And("I am able to see with photos column On Class Setup{string}")
 	public void I_am_able_to_see_with_photos_column_On_Class_Setup(String expectedcolumnname) {
 		org_ReportPage.verifyWithPhotosOnClassSetup(expectedcolumnname);
 	}

 	@And("I am able to see children playing column On Class Setup{string}")
 	public void I_am_able_to_see_children_playing_column_On_class_Setup(String expectedcolumnname) {
 		org_ReportPage.verifyChildrenplayingOnClassSetup(expectedcolumnname);
 	}

 	@And("I am able to list Class name")
 	public void I_am_able_list_Class_name() {
 		org_ReportPage.verifyClassnamelist();
 	}
 	
 	
 	// Class Utilization report
 	
 	@And("I am able to see the Ignite Usage column {string}")
 	public void I_am_able_to_see_the_Ignite_usage_column(String expectedcolumnname) {
 		org_ReportPage.verifyIgniteUsageColumn(expectedcolumnname);
 	}
 	
 	@And("I am able to see the Teachers column {string}")
 	public void I_am_able_to_see_the_Teachers_column(String expectedcolumnname) {
 		org_ReportPage.verifyTeachersColumn(expectedcolumnname);
 	}
 	
 	
 	@And("Verify subcolumns names under the Ignite Usage column")
 	  public void Verify_subcolumns_names_under_the_Ignite_Usage_column(DataTable expectedsubcolumnName)
 	  {
 		org_ReportPage.VerifyingSubcolumnunderIgniteUsageColumn(expectedsubcolumnName);
 	  }
 	
 	@And("I am able to sort the subcolumns under the Ignite Usage column")
	  public void I_am_able_to_sort_the_subcolumns_under_the_Ignite_Usage_column(DataTable expectedsubcolumnName)
	  {
		org_ReportPage.sortSubcolumnunderIgniteUsageColumn(expectedsubcolumnName);
	  }
 	
 	@And("Verify subcolumns names under the Teachers column")
	  public void Verify_subcolumns_names_under_the_Teachers_column(DataTable expectedsubcolumnName)
	  {
		org_ReportPage.VerifyingSubcolumnunderTeachersColumn(expectedsubcolumnName);
	  }
 	
 	
 //School Utiliazation report page
 	
 	@And("I am able to see School utilization report page{string}")
 	public void I_am_able_see_school_utilization_report_page(String expectedname) 
 	{
 		org_ReportPage.verifySchoolUtiliaztion(expectedname);
 	}
 	
 	@And("I am able to click on learn more link on School Utilization page")
 	public void I_am_able_to_click_on_learn_more_link_on_School_Utilization_page()
 	{
 		org_ReportPage.verifyLearnMoreLinkForSchoolUtilizationpage();
 	}
 	
 	@And("I am able to see the class name column of School utilization report page {string}")
 	public void I_am_able_to_see_the_class_name_column_of_School_utilization_report_page (String expectedcolumnname1)
 	{
 		org_ReportPage.verifyclassnamecolumn(expectedcolumnname1);
 		
 	}
    
	@And("I am able to see the ChildrenPlaying column of School utilization report page {string}")
 	public void I_am_able_to_see_the_ChildrenPlaying_column_of_School_utilization_report_page (String expectedcolumnname1)
 	{
 		org_ReportPage.verifyChildrenPlaying(expectedcolumnname1);
 		
 	}
	
	@And("I am able to see the TotalGamePlayed column of School utilization report page {string}")
 	public void I_am_able_to_see_the_TotalGamePlayed_column_of_School_utilization_report_page (String expectedcolumnname1)
 	{
 		org_ReportPage.verifyTotalGamePlayed(expectedcolumnname1);
 		
 	}
	
	@And("I am able to see the  TotalAvgSkilllevel column of School utilization report page {string}")
 	public void I_am_able_to_see_the_TotalAvgSkilllevel_column_of_School_utilization_report_page (String expectedcolumnname1)
 	{
 		org_ReportPage.verifyTotalAvgSkilllevel(expectedcolumnname1);
 		
 	}
	
	@And("I am able to see the TotalInsightsLogins column of School utilization report page {string}")
 	public void I_am_able_to_see_the_TotalInsightsLogins_column_of_School_utilization_report_page (String expectedcolumnname1)
 	{
 		org_ReportPage.verifyTotalInsightsLogins(expectedcolumnname1);
 		
 	}
	
	@And("I am able to see the AvgChildPlaytime column of School utilization report page {string}")
 	public void I_am_able_to_see_the_AvgChildPlaytime_column_of_School_utilization_report_page (String expectedcolumnname1)
 	{
 		org_ReportPage.verifyAvgChildPlaytime(expectedcolumnname1);
 		
 	}
	
	
	//  Child Progress 
	@Then("Verify i can select Teacher from the Teachers dropdown")
	public void Verif_i_ycan_select_Teacher_from_the_Teachers_dropdown(DataTable expectedTeacherName)
	{
		sch_reportpage.selectTeacherFromDropdown(expectedTeacherName);
		//commonPage.waitUntillTheLoaderInvisible();
	}
 	
	
	
	@And("Verify on clicking the Entry Progress I should navigated to the {string} page")
	public void Verify_on_clicking_the_Entry_Progress_I_should_navigated_to_the_Entry_Report_page(String expectedTitle)
	{
		org_ReportPage.verify_entry_report_page(expectedTitle);
	}
	
	@And("Verify i should able to sort the list of children")
	public void  Verify_i_should_able_to_sort_the_list_of_children()
	{
		org_ReportPage.Verify_i_should_able_to_sort_children_list();
	}
    
	@And("I am able to set custom date range {string} {string}")
	public void I_am_able_to_set_custom_date_range(String expectedStartDate,String expectedEndDate)
	{
		org_ReportPage.setCustomDateForProgressPages(expectedStartDate,expectedEndDate);
	}
	
	@Then("I clicked on Child name and naviagted to the child skill details page")
	public void I_clicked_on_Child_name_and_naviagted_to_the_child_skill_details_page()
	{
		org_ReportPage.VerifyingNavigationToChildSkillDetailsPage();
	}
    
}


 