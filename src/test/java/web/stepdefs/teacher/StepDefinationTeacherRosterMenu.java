package web.stepdefs.teacher;

import io.cucumber.java.en.And;
import web.stepdefs.BaseClass;

public class StepDefinationTeacherRosterMenu extends BaseClass
{
 @And("I am able to select schools from list of dropdown {string}")
 public void I_am_able_to_select_schools_from_list_of_dropdown(String schdrpname)
 {
	 teach_rostermenu.selectSchoolDropdown(schdrpname);
 }
 @And("I am able to enter a name in name field {string}")
 public void I_am_able_to_enter_a_name_in_name_field(String clsname)
 {
	 teach_rostermenu.enterClassName(clsname);
 }
 @And("I am able to select curricular from list of dropdown {string}")
 public void I_am_able_to_select_curricular_from_list_of_dropdown(String curdrp)
 {
	 teach_rostermenu.selectCurricularDropdown(curdrp);
 }
 @And("I am able to select picture of class")
 public void I_am_able_to_select_picture_of_class()
 {
	 teach_rostermenu.clickOnProfilePic();
 }
 @And("I am able to click on create class button")
 public void I_am_able_to_click_on_create_class_button()
 {
	 teach_rostermenu.clickOnCreateClassButon();
 }
 @And("I am able to verify succes message {string}")
 public void I_am_able_to_verify_succes_message(String message)
 {
	 teach_rostermenu.verifySuccessMsg();
 }
 @And("I am able to see child profile page {string}")
 public void I_am_able_to_see_child_profile_page(String page)
 {
 	teach_rosterpage.verifyChildProfile(page);
 }
 @And("I am able to click on basic info side menu")
 public void I_am_able_to_click_on_basic_info_side_menu()
 {
 	teach_rosterpage.clickOnBasicInfo();
 }
 @And("I am able to see basic info section")
 public void I_am_able_to_see_basic_info_section()
 {
 	teach_rosterpage.verifyBasicInfoTitle();
 }
 @And("I am able to click on educational journey side menu")
 public void I_am_able_to_click_on_educational_journey_side_menu()
 {
 	teach_rosterpage.clickOnEducationalJourny();
 }
 @And("I am able to see educational joureny section")
 public void I_am_able_to_see_educational_joureny_section()
 {
 	teach_rosterpage.verifyEducationalTitle();
 }
 @And("I am able to click on family member")
 public void I_am_able_to_click_on_family_member()
 {
 	teach_rosterpage.clickOnFamilymember();
 }
 @And("I am able to see family member section")
 public void I_am_able_to_see_family_member_section()
 {
 	teach_rosterpage.verifyFamilyMambertitle();
 }
 @And("I am able to click on gold settings side menu")
 public void I_am_able_to_click_on_gold_settings_side_menu()
 {
 	teach_rosterpage.clickOnGoldSetting();
 }
 @And("I am able to see gold settings section")
 public void I_am_able_to_see_gold_settings_section()
 {
 	teach_rosterpage.verifyGoldSettingTitle();
 }
}
