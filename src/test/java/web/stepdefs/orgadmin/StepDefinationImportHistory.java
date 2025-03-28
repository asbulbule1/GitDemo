package web.stepdefs.orgadmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import web.stepdefs.BaseClass;

public class StepDefinationImportHistory extends BaseClass
{

	@When("I navigate {string} {string}")
	public void i_navigate(String level_1_menu,String level_2_menu)
	{
		commonPage.navigate_Top_MenuBar(level_1_menu, level_2_menu);

	}
	@And("I am able to see import status page {string}")
	public void I_am_able_to_see_import_status_page(String pagename)
	{
		importhistorypage.verifyPageName(pagename);
	}
	@And("I am able to select filter import types {string}")
	public void I_am_able_to_select_filter_import_types(String impfilter)
	{
		importhistorypage.selectImportType(impfilter);
	}
	@And("I am able to see import type header")
	public void I_am_able_to_see_import_type_header()
	{
		importhistorypage.verifyImportTypeHeader();
	}
	@And("I am able to see file name header")
	public void I_am_able_to_see_file_name_header()
	{
		importhistorypage.verifyFileNameHeader();
	}
	@And("I am able to see status header")
	public void I_am_able_to_see_status_header()
	{
		importhistorypage.verifyStatusHeader();
	}
	@And("I am able to see list of import history")
	public void I_am_able_to_see_list_of_import_history()
	{
		importhistorypage.seeimporthisotrylist();
	}
	@And("I am able to see row header for import summary window")
	public void I_am_able_to_see_row_header_for_import_summary_window()
	{
		importhistorypage.verifyRowHeader();
	}
	@And("I am able to see column header for import summary window")
	public void I_am_able_to_see_column_header_for_import_summary_window()
	{
		importhistorypage.verifyColumnHeader();
	}
	@And("I am able to see issue header for import summary window")
	public void I_am_able_to_see_issue_header_for_import_summary_window()
	{
		importhistorypage.verifyIssueHeader();
	}

	@And("I am able to see started header")
	public void I_am_able_to_see_started_header()
	{
		importhistorypage.verifyStartedHeader();
	}
	@And("I am able to see import data child plus page {string}")
	public void I_am_able_to_see_import_data_child_plus_page(String page_title)
	{
		importhistorypage.verifyChildPlusPage(page_title);
	}
	@And("I am able to see video thumbnail")
	public void I_am_able_to_see_video_thumbnail()
	{
		importhistorypage.verifyVideoThumbnail();
	}
	@And("I am able to see choose childplus files button")
	public void I_am_able_to_see_choose_childplus_files_button()
	{
		importhistorypage.buttonisClickable();
	}
	@And("I am able to see organization setting page {string}")
	public void I_am_able_to_see_organization_setting_page(String pagename)
	{
		importhistorypage.verifyOrganizationPageName(pagename);
	}
	@And("I am able to see roster data management section {string}")
	public void I_am_able_to_see_roster_data_management_section(String section)
	{
		importhistorypage.verifyRosterDataManSection(section);
	}
	@And("I am able to toggle teachers from adding or editing classes")
	public void I_am_able_to_toggle_teachers_from_adding_or_editing_classes()
	{
		importhistorypage.clickOnFirstToggle();
//		importhistorypage.clickonToggles();
	}
	@And("I am able to toggle teachers can belongs to up to 10 schools")
	public void I_am_able_to_toggle_teachers_can_belongs_to_up_to_10_schools()
	{
		importhistorypage.clickOnSecToggle();
	}
	@And("I am able to see child photo managment header")
	public void I_am_able_to_see_child_photo_managment_header()
	{
		importhistorypage.verifyChildPhotoHeader();
	}
	@And("I am able to see photo placeholder for children without photo toggle")
	public void I_am_able_to_see_photo_placeholder_for_children_without_photo_toggle()
	{
		importhistorypage.clickOnThirdToggle();
	}
	@And("I am able to see teacher approval for photos toggle")
	public void I_am_able_to_see_teacher_approval_for_photos_toggle()
	{
		importhistorypage.clickOnFourthToggle();
	}
	@And("I am able to see invite parents to submit photo toggle")
	public void I_am_able_to_see_invite_parents_to_submit_photo_toggle()
	{
		importhistorypage.clickOnFifthToggle();
	}
	@And("I am able to see Save Setting button")
	public void I_am_able_to_see_Save_Setting_button()
	{
		importhistorypage.seeSaveSettingBtn();
	}
	@And("I am able to click on save settings button and see save message {string}")
	public void I_am_able_to_click_on_save_settings_button_and_see_save_message(String msg)
	{
		importhistorypage.clickOnSaveSeetingBtn();
		importhistorypage.verifySaveMessage(msg);
	}
	@And("I am able to click on cancle button from organization setting page")
	public void I_am_able_to_click_on_cancle_button_from_organization_setting_page()
	{
		importhistorypage.clickOnCancleBtn();
	}
	@And("I am able to see import roster csv page {string}")
	public void I_am_able_to_see_import_roster_csv_page(String pagename)
	{

	}
	@And("I close the popup if any opens")
	public void Iclosethepopupifanyopens()
	{
		importhistorypage.closepopupIfAnyopens();
	}
	@And("I am able to see four accordian on page")
	public void I_am_able_to_see_four_accordian_on_page()
	{
		importhistorypage.seeFourAccordians();
	}
	@And("I am able to see hatchsync page with name {string}")
	public void I_am_able_to_see_hatchsync_page_with_name(String pagename)
	{
		importhistorypage.verifyHatchSynchTitle(pagename);
	}
	@And("I am able to see connection cards")
	public void I_am_able_to_see_connection_cards()
	{
		importhistorypage.seeHatchSyncCards();
	}
	@And("I am able to add connection card")
	public void I_am_able_to_add_connection_card()
	{
		importhistorypage.clickOnAddCards();
	}
	@And("I am able to see hatchsync pop up {string}")
	public void I_am_able_to_see_hatchsync_pop_up(String popup)
	{
		importhistorypage.verifyHatchSyncPopup(popup);
	}
	@And("I am able to add hatch sync card by entering {string} and {string}")
	public void I_am_able_to_add_hatch_sync_card_by_entering_and(String hatchusername,String hatchpassword )
	{
		importhistorypage.enterhatchusername(hatchusername);
		importhistorypage.enterhatchpassword(hatchpassword);
	}
	@And("I am able to click on radio button")
	public void I_am_able_to_click_on_radio_button()
	{
		importhistorypage.clickOnRadioBtn();
	}
	@And("I am able to click on check box")
	public void I_am_able_to_click_on_check_box()
	{
		importhistorypage.clickonCheckBox();
	}
	@And("I am able to click on save button")
	public void I_am_able_to_click_on_save_button()
	{
		importhistorypage.clickOnSaveBtn();
	}
	@And("I am able to see message {string} or {string}")
	public void I_am_able_to_see_message(String msg1, String msg2)
	{
		importhistorypage.verifymsg(msg1,msg2);
	}
	@And("I am able to click on hatch sync cancle button")
	public void I_am_able_to_click_on_hatch_sync_cancle_button()
	{
		importhistorypage.clickOnCancleButton();
	}
	@And("I am able to see hatch sync table header school")
	public void I_am_able_to_see_hatch_sync_table_header_school()
	{
		importhistorypage.verifySchoolNameHeader();
	}
	@And("I am able to see hatch sync table header number of teachers")
	public void I_am_able_to_see_hatch_sync_table_header_number_of_teachers()
	{
		importhistorypage.verifyTeacherHeader();
	}
	@And("I am able to see hatch sync table header number of children")
	public void I_am_able_to_see_hatch_sync_table_header_number_of_children()
	{
		importhistorypage.verifyChildrenHeader();
	}
	@And("I am able to see hatch sync table header percentage of children match to gold")
	public void I_am_able_to_see_hatch_sync_table_header_percentage_of_children_match_to_gold()
	{
		importhistorypage.verifyPercentageOfChildrenMatch();
	}
	@And("I am able to see hatch sync table header documents sent")
	public void I_am_able_to_see_hatch_sync_table_header_documents_sent()
	{
		importhistorypage.verifyDocumentsentHeader();
	}
	@And("I am able to click on hatchsync school name")
	public void I_am_able_to_click_on_hatchsync_school_name()
	{
		importhistorypage.clickOnSchoolName();
	}
	@And("I am able to see teaching strategies gold report page {string}")
	public void I_am_able_to_see_teaching_strategies_gold_report_page(String reportpgname)
	{
		importhistorypage.verifyTeachingGoldReportPage(reportpgname);
	}

}
