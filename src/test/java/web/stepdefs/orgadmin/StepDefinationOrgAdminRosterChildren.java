package web.stepdefs.orgadmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import web.stepdefs.BaseClass;

public class StepDefinationOrgAdminRosterChildren extends BaseClass
{

	@Then("Verify i can select school {string} and Class {string} from given dropdown")
	public void verify_i_can_select_school_and_class_from_given_dropdown(String expectedSchoolname, String expectedClassName)
	{
		org_Roster_ChildrnPage.selectSchoolAndClass(expectedSchoolname,expectedClassName);
	}
	@Then("verify i can enter Child first Name")
	public void verify_i_can_enter_child_first_name()
	{
		org_Roster_ChildrnPage.enterChildFisrtName();
	}
	@Then("verify i can enter Child last Name")
	public void verify_i_can_enter_child_last_name()
	{
		org_Roster_ChildrnPage.enterChildLastName();
	}
	@Then("verify i can enter Child Date of birth {string} from calender")
	public void verify_i_can_enter_child_date_of_birth_from_calender(String expectedBirthDate)
	{
		org_Roster_ChildrnPage.enterChildBirthDate(expectedBirthDate);
	}
	@Then("Verify i can select Educational journey with {string} with Language {string}")
	public void Verify_i_can_select_Educational_journey_with_Language(String expectedGame, String expectedLanguage)
	{
		org_Roster_ChildrnPage.selectEducatoinalJourneyGameNLanguage(expectedGame,expectedLanguage);
	}
	@Then("Verify i can take photo of child by clicking on Camera button")
	public void Verify_i_can_take_photo_of_child_by_clicking_on_Camera_button()
	{
		org_Roster_ChildrnPage.takeChildPhotoUsingCamera();
	}
	@Then("Verify checkboox of Use placholder photo Image already selected if present")
	public void Verify_checkboox_of_Use_placholder_photo_Image_already_selected_if_present()
	{
		org_Roster_ChildrnPage.useChildPhotoPlaceHolderCheckBox();
	}
	@And("Verify i can select Request photo from Family member checkbox")
	public void Verify_i_can_select_Request_photo_from_Family_member_checkbox()
	{
		org_Roster_ChildrnPage.selectRequestPhotoFromFamilyMemeber();
	}
	@Then("Verify i can click on Continue button")
	public void Verify_i_can_click_on_Continue_button()
	{
		org_Roster_ChildrnPage.clickOnContinueButton();
	}
	@Then("Verify the added child details SchoolName {string} ClassName {string} Language {string} getting displayed on step 2 page")
	public void Verify_the_added_child_details_getting_displayed_on_step_2_page(String schoolName, String className, String language)
	{
		org_Roster_ChildrnPage.childDetailsAddedInStepOneDisplayed(schoolName,className,language);
	}
	@Then("verify i can select child Grade {string} from dropdown")
	public void verify_I_can_select_child_Grade_from_dropdown(String expectedGrade)
	{
		org_Roster_ChildrnPage.selectGradeofChild(expectedGrade);
	}

	@Then("verify i can select child Gender {string} from dropdown")
	public void verify_i_can_select_child_gender_from_dropdown(String expectedChildGender)
	{
		org_Roster_ChildrnPage.selectGenderOfChild(expectedChildGender);
	}
	@Then("verify i can select child Race {string} from dropdown")
	public void verify_i_can_select_child_race_from_dropdown(String expectedRaceOfChild)
	{
		org_Roster_ChildrnPage.selectRaceOfChild(expectedRaceOfChild);
	}
	@Then("verify i can select child Ethnicity {string} from dropdown")
	public void verify_i_can_select_child_ethnicity_from_dropdown(String expectedEthnicity)
	{
		org_Roster_ChildrnPage.selectEthnicityOfChild(expectedEthnicity);
	}
	@Then("verify i can select child Language {string}")
	public void verify_i_can_select_child_language(String expectedChildLanguage)
	{
		org_Roster_ChildrnPage.selectLanguageOfChild(expectedChildLanguage);
	}
	@Then("verify i can enter Parent first Name")
	public void verify_i_can_enter_parent_first_name()
	{
		org_Roster_ChildrnPage.enetrParentFirstName();
	}
	@Then("verify i can enter Parent last Name")
	public void verify_i_can_enter_parent_last_name()
	{
		org_Roster_ChildrnPage.enetrParentLastName();
	}
	@Then("verify i can enter Parent Email address")
	public void verify_i_can_enter_parent_email_address()
	{
		org_Roster_ChildrnPage.enetrParentEmailAddress();
	}
	@Then("Verify i can enter Parent Phone Number")
	public void Verify_i_can_enter_Parent_Phone_Number()
	{
		org_Roster_ChildrnPage.enterParentPhonenumber();
	}
	@Then("Verify i can select Request photo from Family member checkbox on step 2")
	public void Verify_i_can_select_Request_photo_from_Family_member_checkbox_on_step_2()
	{
		org_Roster_ChildrnPage.clickOnCheckRequestPhotoFromFamilyMemberStep2();
	}
	@Then("Verify i can click on Done button")
	public void verify_i_can_click_on_done_button()
	{
		org_Roster_ChildrnPage.clickOnDoneAddChild();
	}

	@Then("Verify the added child is displayed on View all children page")
	public void Verify_the_added_child_is_displayed_on_View_all_children_page()
	{
		org_Roster_ChildrnPage.addedChildDisplayedOnViewAllChildrenPage();
	}
	@Then("Verify added child can be deleted")
	public void Verify_added_child_can_be_deleted()
	{
		org_Roster_ChildrnPage.ChildDeleteFromViewAllChildrenPage();
	}

	@Then("Verify validation message dislayed for mandatory name field {string}")
	public void verify_validation_message_dislayed_for_mandatory_name_field(String expectedValidationMessageforName)
	{
		org_Roster_ChildrnPage.validationMessageOfMandoatoryNameField(expectedValidationMessageforName);
	}
	@Then("Verify validation message dislayed for mandatory dropdown field {string}")
	public void verify_validation_message_dislayed_for_mandatory_dropdown_field(String expectedValidationMessageforDropDown)
	{
		org_Roster_ChildrnPage.validationMessageOfMandoatoryDropDown(expectedValidationMessageforDropDown);
	}

	@Then("Verify i can select School {string} from DropDown")
	public void verify_i_can_select_school_from_drop_down(String expectedSchoolName)
	{
		org_Roster_ChildrnPage.selectSchoolForChildFilter(expectedSchoolName);
	}
	@Then("Verify i can search child by name {string} through search box")
	public void verify_i_can_search_child_by_name_through_search_box(String expectedChildName)
	{
		org_Roster_ChildrnPage.searchChildByName(expectedChildName);
	}

	@Then("Verify i can deactivate the child")
	public void verify_i_can_deactivate_the_child()
	{
		org_Roster_ChildrnPage.deactivateChildFromChildrenList();
	}
	@Then("Verify i can select Class {string} from DropDown")
	public void verify_i_can_select_class_from_drop_down(String expectedClassName)
	{
		org_Roster_ChildrnPage.selectClassForChildFilter(expectedClassName);
	}
	@Then("Verify i can select Status {string} from DropDown")
	public void verify_i_can_select_status_from_drop_down(String expectedStatus)
	{
		org_Roster_ChildrnPage.selectStatusActive(expectedStatus);
	}
	@And("I am able to select Status from dropdown {string}")
	public void I_am_able_to_select_Status_from_dropdown(String drp)
	{
		org_Roster_ChildrnPage.selectStatusActive(drp);
	}

	@And("I am able to select active status from dropdown {string}")
	public void I_am_able_to_select_active_status_from_dropdown(String sdrp)
	{
		org_Roster_ChildrnPage.selectStatusActive(sdrp);
	}

	@Then("Verify i can activate the child")
	public void verify_i_can_activate_the_child()
	{
		org_Roster_ChildrnPage.activateChildFromChildrenList();
	}
	@Then("Verify children list displayed on view all children page")
	public void verify_children_list_displayed_on_view_all_children_page()
	{
		org_Roster_ChildrnPage.listOfChildrenOnViewChildrenPage();
	}
	@Then("Verify i can edit the child info")
	public void verify_i_can_edit_the_child_info()
	{
		org_Roster_ChildrnPage.editChildInfo();
	}
	@Then("i click on back button")
	public void i_click_on_back_button()
	{
		org_Roster_ChildrnPage.clickOnBackbutton();
	}
	@Then("Verify after clikcing on child name i redirect to Child Skill Detail page with titl {string}")
	public void verify_after_clikcing_on_child_name_i_redirect_to_Child_Skill_Detail_page(String expectedChildSkillTitle)
	{
		org_Roster_ChildrnPage.childSkillDetailsPage(expectedChildSkillTitle);
	}

	@Then("Verify i can select Class Name {string} from DropDown")
	public void verify_i_can_select_Class_Name_from_DropDown(String expectedClassName)
	{
		org_Roster_ChildrnPage.selectClassFromClassDropDownFOrParet(expectedClassName);
	}

	@Then("Verify i can select School Name {string} from DropDown")
	public void verify_i_can_select_School_Name_from_DropDown(String expectedSchoolName) throws InterruptedException
	{
		org_Roster_ChildrnPage.selectSchoolNameFromDropDown(expectedSchoolName);
	}
	@Then("Verify i can sort by clicking on Parent Name header")
	public void verify_i_can_sort_by_clicking_on_Parent_Name_header()
	{
		org_Roster_ChildrnPage.clickOnNameOfParentToSortList();
	}
	@Then("Verify i can sort by clicking on Parent Email header")
	public void verify_i_can_sort_by_clicking_on_parent_email_header()
	{
		org_Roster_ChildrnPage.clickOnEmailOfParentToSortList();
	}
	@Then("Verify i can sort by clicking on Parent Child header")
	public void verify_i_can_sort_by_clicking_on_Parent_Child_header()
	{
		org_Roster_ChildrnPage.clickOnChildOfParentToSortList();
	}
	@Then("Verify i can see list of parent present on View All Parent Page")
	public void verify_i_can_see_list_of_parent_present_on_View_All_Parent_Page()
	{
		org_Roster_ChildrnPage.listOfParentPresentOnViewAllParentPage();
	}

	@Then("Verify i can search parent by name {string} from search box")
	public void verify_i_can_search_parent_by_name_from_search_box(String expectedParetName)
	{
		org_Roster_ChildrnPage.searchParentByNameInSearchBox(expectedParetName);
	}
	@Then("verify i can Activate Parent user")
	public void verify_i_can_activate_Parent_user()
	{
		org_Roster_ChildrnPage.activateParentUser();
	}
	@Then("Verify i can search parent by email {string} from search box")
	public void verify_i_can_search_parent_by_email_from_search_box(String expectedParentEmail)
	{
		org_Roster_ChildrnPage.searchParentNameByEmail(expectedParentEmail);
	}

	@Then("Verify i can Reset Parent user passowrd")
	public void verify_i_can_reset_parent_user_passowrd()
	{
		sch_rosterpage.resetParentUserPassword();
	}
	@Then("Verify i can resend invite to parent user")
	public void verify_i_can_resend_invite_to_parent_user()
	{
		sch_rosterpage.resendInviteToParentUser();
	}
	@Then("verify i can edit parent user info")
	public void verify_i_can_edit_parent_user_info()
	{
		org_Roster_ChildrnPage.editInfoOfParentUser();
	}
	@Then("verify i can Deactivate Parent user")
	public void verify_i_can_deactivate_parent_user()
	{
		org_Roster_ChildrnPage.deactivateParentUer();
	}
	@Then("Verify The user should be able to see one {string} on side menu")
	public void Verify_The_user_should_be_able_to_see_Adding_Multiple_Children_side_menu(String expectedTextofAddingMultipleChildren)
	{
		org_Roster_ChildrnPage.seeAddingMultipleChildren(expectedTextofAddingMultipleChildren);
	}
	@And("Verify After Clicking on CSV import should be able to navigate to the {string} page")
	public void Verify_After_Clicking_on_CSV_import_should_be_able_to_navigate_to_the_Import_Roster_CSV_page(String expectedImportCSVPageTitle)
	{
		org_Roster_ChildrnPage.csvImportLink(expectedImportCSVPageTitle);
	}
	@And("Verify The user should be able to see two {string} on side menu")
	public void Verify_The_user_should_be_able_to_see_Adding_children_from_last_year_side_menu(String expectedAddingChildrenText)
	{
		org_Roster_ChildrnPage.seeAddingChildrenLastYear(expectedAddingChildrenText);
	}
	@And("Verify After Clicking on Carryover Children blue link text user should be able to navigate to the {string} page")
	public void Verify_After_Clicking_on_Carryover_Children_blue_link_text_user_should_be_able_to_navigate_to_the_Carryover_Children_page(String expectedCarryoverChildrenPage)
	{
		org_Roster_ChildrnPage.carryoverChildrenBlueLink(expectedCarryoverChildrenPage);
	}
	@And("Verify The user should be able to see three {string} on side menu")
	public void The_user_should_be_able_to_see_Need_to_see_current_Hatch_roster_side_menu(String expectedCurrentHatchRoster)
	{
		org_Roster_ChildrnPage.seeNeedCurrentHatchRoster(expectedCurrentHatchRoster);
	}
	@And("After Clicking on the View & Edit Children blue link text user should be able to navigate to {string} page")
	public void After_Clicking_on_the_View_Edit_Children_blue_link_text_user_should_be_able_to_navigate_to_View_All_Children_page(String expectedViewAllChildrenPageTitle)
	{
		org_Roster_ChildrnPage.viewEditChildrenBlueLink(expectedViewAllChildrenPageTitle);
	}
	 //1
	@And("Verify i can click on edit info button of child")
	public void Verify_i_can_click_on_edit_info_button_of_child()
	{
		org_Roster_ChildrnPage.childEditInfoButtonClick();
	}
	//1
	@And("Verify i can click on child name edit pencil")
	public void Verify_i_can_click_on_child_name_edit_pencil()
	{
		org_Roster_ChildrnPage.childNameEditPencilClick();
	}
	//1
	@And("Verify i can click on Gender edit pencil")
	public void Verify_i_can_click_on_Gender_edit_pencil()
	{
		org_Roster_ChildrnPage.genderEditPencilClick();
	}
	@And("Verify i can click on Race edit pencil")
	public void Verify_i_can_click_on_Race_edit_pencil()
	{
		org_Roster_ChildrnPage.raceEditPencilClick();
	}
	@And("Verify i can click on Ethnicity edit pencil")
	public void Verify_i_can_click_on_Ethnicity_edit_pencil()
	{
		org_Roster_ChildrnPage.ethnicityEditPencilClick();
	}
	@And("Verify i can click on Instruction Language edit pencil")
	public void Verify_i_can_click_on_Instruction_Language_edit_pencil()
	{
		org_Roster_ChildrnPage.instructionLanguageEditPencilClick();
	}

	@And("Verify i can click on Date of Birth edit pencil")
	public void Verify_i_can_click_on_Date_of_Birth_edit_pencil()
	{
		org_Roster_ChildrnPage.dateOfBirthEditPencilClick();
	}

	@And("Verify i can click on Educational Journey edit pencil")
	public void Verify_i_can_click_on_Educational_Journey_edit_pencil()
	{
		org_Roster_ChildrnPage.educationalJourneyEditPencilClick();
	}
	@And("Verify i can click on Grade edit pencil")
	public void Verify_i_can_click_on_Grade_edit_pencil()
	{
		org_Roster_ChildrnPage.gradeEditPencilClick();
	}

	@And("Verify i can click on Family Member edit pencil")
	public void Verify_i_can_click_on_Family_Member_edit_pencil()
	{
		org_Roster_ChildrnPage.familyMemberEditPencilClick();
	}
	@And("Verify i can click on Gold Setting Match edit pencil")
	public void Verify_i_can_click_on_Gold_Setting_Match_edit_pencil()
	{
		org_Roster_ChildrnPage.goldSettingMatchEditPencilClick();
	}
	@And("Verify i can click on Gold Setting Language edit pencil")
	public void Verify_i_can_click_on_Gold_Setting_Language_edit_pencil()
	{
		org_Roster_ChildrnPage.goldSettingLanguageEditPencilClick();
	}
	@Then("Verify i can click on Basic info Side button and navigate to {string} section")
	public void Verify_i_can_click_on_Basic_info_Side_button(String expectedBasicInfoTitle)
	{
		org_Roster_ChildrnPage.basicInfoSideButtonClick(expectedBasicInfoTitle);
	}
	@Then("Verify i can click on Educational Journey Side button and navigate to {string} section")
	public void Verify_i_can_click_on_Educational_Journey_Side_button(String expectedEducationalJourneyTitle)
	{
		org_Roster_ChildrnPage.educationalJourneySideButtonClick(expectedEducationalJourneyTitle);
	}
	@Then("Verify i can click on Family Member Side button and navigate to {string} section")
	public void Verify_i_can_click_on_Family_Member_Side_button(String expectedFamilyMembersTitle)
	{
		org_Roster_ChildrnPage.familyMemberSideButtonClick(expectedFamilyMembersTitle);
	}
	@Then("Verify i can click on Gold Setting Side button if the org is TSG enabled and navigate to {string} section")
	public void Verify_i_can_click_on_Gold_Setting_Side_button_if_the_org_is_TSG_enabled(String expectedGOLDSettingsTitle)
	{
		org_Roster_ChildrnPage.goldSettingSideButtonClick(expectedGOLDSettingsTitle);
	}
}


