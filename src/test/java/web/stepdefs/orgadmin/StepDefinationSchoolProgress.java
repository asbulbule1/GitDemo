package web.stepdefs.orgadmin;

import java.awt.AWTException;
import java.text.ParseException;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.stepdefs.BaseClass;

public class StepDefinationSchoolProgress extends BaseClass
{
	@Given("I login into a {string} using {string} {string}")
	public void i_login_into_a(String url, String username, String password) throws AWTException, InterruptedException
	{
		driver.get(url);
		loginPage.enterEmailID(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLetsGo();

	}
	@When("I navigate to the {string} {string}")
	public void i_navigate_to_the(String level_1_menu,String level_2_menu)
	{
		commonPage.navigate_Top_MenuBar(level_1_menu, level_2_menu);
	}
	@And("I am able to select schools from dropdown {string} {string}")
	public void i_am_able_to_select_schools_from_dropdwon(String schooldropdown,String schoolname)
	{
	    schoolprogresspage.selectSchooldropdown(schooldropdown, schoolname);
	}
	@And("I am able to select schools subdomains dropdown {string}")
	public void i_am_able_to_select_subdomains_dropdown(String subdomaindropdown)
	{
		schoolprogresspage.selectSubdomaindropdown(subdomaindropdown);
	}
	@And("I am able to select langauge")
	public void i_am_able_to_select_langauage()
	{
		schoolprogresspage.clickOnSpanishLangaugeButton();
		schoolprogresspage.clickOnEnglishLanguageButton();
		schoolprogresspage.clickOnAllLanguageButton();
	}
	@And("I am able to see list of schools with progress bar {string}")
	public void i_am_able_to_see_list_of_schools_with_progress_bar(String schoollist)
	{
		schoolprogresspage.verifySchoolnameList(schoollist);
	}
	@And("I am able to see class progress page {string}")
	public void i_am_able_to_see_class_progress_page(String classprogress)
	{
		schoolprogresspage.verifyClassProgressTitle(classprogress);
	}
	@And("I am able to select schools dropdown from classprogress {string}")
	public void i_am_able_to_select_schools_from_dropdown(String clsschooldropdown)
	{
		schoolprogresspage.selectClsSchooldropdown(clsschooldropdown);
	}
	@And("I am able to select class subdomain dropdown {string}")
	public void i_am_able_to_select_class_subdomain_dropdown(String clssubdomaindropdown)
	{
		schoolprogresspage.selectClsSubdomaindropdown(clssubdomaindropdown);
	}
	@And("I am able to see list of class with progress bar {string}")
	public void i_am_able_to_see_list_of_class_with_progress_bar(String classlist)
	{
		schoolprogresspage.verifyClassNameList(classlist);
	}
	@Then("I am able to select skill langauge")
	public void i_am_able_to_select_skill_langauge()
	{
		schoolprogresspage.clickOnEnglishLanguageButton();
		schoolprogresspage.clickOnSpanishLangaugeButton();
	}
	@And("I am able to see child progress page {string}")
	public void i_am_able_to_see_child_progress_page(String childprogress)
	{
		schoolprogresspage.verifyChildProgressTitle(childprogress);
	}
	@And("I am able to select schools dropdown from childprogress {string}")
	public void i_am_able_to_select_schools_dropdown_from_childprogress(String childschooldropdown)
	{
		schoolprogresspage.selectChildSchooldropdown(childschooldropdown);
	}
	@And("I am able to select class from dropdown {string}")
	public void i_am_able_to_select_class_from_dropdown(String classdropdown)
	{
		schoolprogresspage.selectClassdropdown(classdropdown);
	}
	@And("I am able to select child subdomain dropdown {string}")
	public void i_am_able_to_select_child_subdomain_dropdown(String childsubdomaindropdown)
	{
		schoolprogresspage.selectChildSubdomaindropdown(childsubdomaindropdown);
	}
	@And("I am able to see list of children with progress bar {string}")
	public void i_am_able_to_see_list_of_children_with_progress_bar(String childlist)
	{
		schoolprogresspage.verifyChildname(childlist);
	}
	@And("I am able to see play log page {string}")
	public void i_am_able_to_see_play_log_page(String playlog)
	{
		schoolprogresspage.verifyPlayLogTitle(playlog);
	}
	@And("I am able to expand the accordian")
	public void i_am_able_to_expand_the_accordian()
	{
		schoolprogresspage.clickonAccordian();
	}
	@And("I am able to select start date from time range section {string}")
	public void i_am_able_to_select_date_from_time_range_section(String startdate)
	{
		schoolprogresspage.clickOnStartdate();
		commonPage.setDate(startdate);

	}
	@And("I am able to select end date from time range section {string}")
	public void i_am_able_to_select_a_date_from_time_range_section(String enddate)
	{
		schoolprogresspage.clickOnEnddate();
		commonPage.setDate(enddate);
	}
	@And("I am able to select time from display time as section {string}")
	public void i_am_able_to_select_time_from_display_time_as_section(String displaytimeas)
	{
		schoolprogresspage.clickOnDisplayTimeAs();
	}
	@And("I am able to select school from filter within organization section {string} {string}")
	public void I_am_able_to_select_school_from_filter_within_organization_section(String schdropdown,String schname)
	{
		schoolprogresspage.selectPlaylogSchooldropdown(schdropdown,schname);
	}
	@And("I am able to select class from filter within organization section {string} {string}")
	public void I_am_able_to_select_class_from_filter_within_organization_section(String clsdropdown, String clsname)
	{
	   schoolprogresspage.selctPlaylogClassdropdown(clsdropdown, clsname);
	}
	@And("I am able to select child from filter within organization section {string} {string}")
	public void I_am_able_to_select_child_from_filter_within_organization_section(String chidropdown, String chiname)
	{
		schoolprogresspage.selectPlaylogChilddropdown(chidropdown, chiname);
	}
	@And("I am able to select age from filter by demographic data section {string} {string}")
	public void I_am_able_to_select_age_from_filter_by_demographic_data_section(String agdropdown,String agedropdown)
	{
		schoolprogresspage.selectPlaylogAgedropdown(agdropdown, agedropdown);
	}
	@And("I am able to select grade from filter by demographic data section {string} {string}")
	public void I_am_able_to_select_grade_from_filter_by_demographic_data_section(String graddropdown,String gradedropdown)
	{
		schoolprogresspage.selectPlaylogGradedropdown(graddropdown, gradedropdown);
	}
	@And("I am able to select langauge from filter by demographic data section {string} {string}")
	public void i_am_able_to_select_langauge_from_filter_by_demographic_data_section(String langdropdown,String langaugedropdown)
	{
		schoolprogresspage.selectPlaylogLanguagedropdown(langdropdown, langaugedropdown);
	}
	@And("I am able to select race from dropdown {string} {string}")
	public void I_am_able_to_select_race_from_dropdown(String racdropdown, String racedropdown)
	{
		schoolprogresspage.selectPlaylogRacedropdown(racdropdown, racedropdown);
	}
	@And("I am able to select ethinicity from dropdown {string} {string}")
	public void I_am_able_to_select_ethinicity_from_dropdown(String ethdropdown,String ethinicitydropdown)
	{
		schoolprogresspage.selectPlaylogEthinicitydropdown(ethdropdown, ethinicitydropdown);
	}
	@And("I am able to select experinece type from filter by subject matter section {string} {string}")
	public void I_am_able_to_select_experinece_type_from_filter_by_subject_matter_section(String exptype,String experinectype)
	{
		 schoolprogresspage.selectPlaylogExperinectype(exptype, experinectype);
	}
	@And("I am able to select domain type from filter by subject matter section {string} {string}")
	public void I_am_able_to_select_domain_type_from_filter_by_subject_matter_section(String domname,String domaindropdown)
	{
		schoolprogresspage.selectPlaylogDomainnametype(domname, domaindropdown);
	}
	@And("I am able to select hatch sync documentaion type {string}")
	public void I_am_able_to_select_hatch_sync_documentaion_type(String hatchsyncdocumentation)
	{
		schoolprogresspage.selectHatchsyncRadiobtn();
	}
	@And("I am able to see download report button")
	public void I_am_able_to_see_download_report_button()
	{
		schoolprogresspage.clickOnDownloadbtn();
	}
	@And("I am able to see child play time page {string}")
	public void I_am_able_to_see_child_play_time_page(String childplaytime)
	{
		schoolprogresspage.verifyChildPlaytimePage(childplaytime);
	}
	@And("I am able to select schools from school dropdown {string}")
	public void I_am_able_to_select_schools_from_school_dropdown(String chilschdropdwon)
	{
		schoolprogresspage.select_ChildSchooldropdown(chilschdropdwon);
	}
	@And("I am able to select class from class dropdown {string}")
	public void I_am_able_to_select_class_from_class_dropdown(String chiclassdropdown)
	{
		schoolprogresspage.select_ChildClassdropdown(chiclassdropdown);
	}
	@And("I am able to select subdomain from subdomain dropdown {string}")
	public void I_am_able_to_select_subdomain_from_subdomain_dropdown(String chisubdomaindropdown)
	{
		schoolprogresspage.select_ChildSubdomaindropdown(chisubdomaindropdown);
	}
	@And("I am able to see list of childerns with progress bar {string}")
	public void I_am_able_to_see_list_of_childerns_with_progress_bar(String childnamelist)
	{
		schoolprogresspage.verifyChildnameList(childnamelist);
	}
	@And("I am able to select play time as last week")
	public void I_am_able_to_select_play_time_as_last_week()
	{
		schoolprogresspage.selectLastWeekRadioBtn();
	}
	@And("I am able to see playtime with respective colors {string} {string} {string}")
	public void I_am_able_to_see_playtime_with_respective_colors(String greencolor, String orangcolor, String redcolor)
	{
		 schoolprogresspage.verifyPlaytimeColor(greencolor, orangcolor, redcolor);
	}
	@And("I am able to select play time as school year")
	public void I_am_able_to_select_play_time_as_school_year()
	{
		schoolprogresspage.selectSchoolYearRadioBtn();
	}
	@And("I am able to see playtime with respective colors for school years")
	public void  I_am_able_to_see_playtime_with_respective_colors_for_school_years() throws ParseException
	{
		schoolprogresspage.schoolyeardate();

	}
	@And("I am able to select play time as custom")
	public void I_am_able_to_select_play_time_as_custom()
	{
		schoolprogresspage.selectCustomRadioBtn();
	}

	@And("I am able to select {string} and {string} and see the {string} {string} {string}")
	public void i_am_able_to_select_and_see_the(String start_date,String end_date,String expectedGreenBar,String expectedOrangeBar,String expectedRedBar) throws ParseException
	{
		util.getDateDiff_InMinutes(start_date, end_date);
	}
	@And("I am able to click on button")
	public void I_am_able_to_click_on_button()
	{
		schoolprogresspage.clickOnButton();
	}
	@And("I am able to see children count")
	public void I_am_able_to_see_children_count()
	{
		schoolprogresspage.verifyChildrenCount();
	}
	@And("I am able to see the text ready to play {string}")
	public void I_am_able_to_see_the_text_ready_to_play(String text)
	{
		schoolprogresspage.verifyTextReadytoPlay(text);
	}
	@And("I am able to see text {string}")
	public void I_am_able_to_see_text(String textpage)
	{
		schoolprogresspage.verifyTextPage(textpage);
	}
	@And("I am able to see view teachers button")
	public void I_am_able_to_see_view_teachers_button()
	{
		schoolprogresspage.seeViewAllChildrenButton();
	}
	@And("I am able to see training options button")
	public void I_am_able_to_see_training_options_button()
	{
		schoolprogresspage.seeViewTraningOptionsButton();
	}
	@And("I am able to see list of schools {string}")
	public void I_am_able_to_see_list_of_schools(String schoolnamelist)
	{
		schoolprogresspage.verifySchoolnames(schoolnamelist);
	}

	@And("I am able to see average playtime")
	public void I_am_able_to_see_average_playtime()
	{
		schoolprogresspage.verifyAveragePlayTimeCount();
	}
	@And("I am able to see average playtime per child last week text {string}")
	public void I_am_able_to_see_average_playtime_per_child_last_week_text(String avgtext)
	{
		schoolprogresspage.verifyAvgText(avgtext);
	}
	@And("I am able to see text on page")
	public void I_am_able_to_see_text_on_page()
	{
		schoolprogresspage.verifyUtilizationText();
	}
	
	///school Progress setpDefinations 
	@Then("Select Domain from list in dropdown on School Progress")
	public void select_Domain_from_list_in_dropdown(DataTable expectedDomainNameInDropDown)
	{
		org_ReportPage.selectDomainNameFromDropdownSchoolProgress(expectedDomainNameInDropDown);
	}
	
	@Then("I clicked on School name and naviagted to the Class Progress Page")
	public void i_clicked_on_school_name_and_naviagted_to_the_class_progress_page() {
		org_ReportPage.navigationtotheClassProgress();
	}
}
