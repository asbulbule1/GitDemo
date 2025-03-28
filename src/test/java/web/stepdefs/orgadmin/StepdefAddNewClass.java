package web.stepdefs.orgadmin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.stepdefs.BaseClass;

public class StepdefAddNewClass extends BaseClass {


	// @REPORTS_View_and_edit_classes_IQA-103_sprint4

	@Then("I verify the view class page title {string}")
	public void i_verify_the_view_class_page_title(String viewTitle) {
		addnewclassPage.Viewtitle(viewTitle);
	}

	@Then("I click on edit info button of class {string}")
	public void i_click_on_edit_info_button_of_class(String EditInfo)
	{
		addnewclassPage.editinfopage(EditInfo);
	}

	@Then("I verify the edit class page title {string}")
	public void i_verify_the_edit_class_page_title(String EditTitle)
	{
		addnewclassPage.EditTitle(EditTitle);
	}

	//@REPORTS_View_and_edit_classes_IQA-102_sprint4

	@Then("I am able to see list of classes and Teacher")
	public void i_am_able_to_see_list_of_classes_and_teacher() {
		addnewclassPage.VerifyListofclassesandteachers();
	}

	@Then("I am able to see count of children and devices below the headers {string} {string}")
	public void i_am_able_to_see_count_of_children_and_devices_below_the_headers_children(String ChildrenTitle,String DeviceTitle) {
		addnewclassPage.Verifychildrenscountanddevices(ChildrenTitle,DeviceTitle);
	}


	@Then("I am able to see filter classes name with School {string}")
	public void i_am_able_to_see_filter_classes_name_with_school(String expectedSchool)
	{
		addnewclassPage.VerifyfilterclassesnamewithSchool(expectedSchool);
	}

	@Then("Verify Status dropdown {string}")
	public void verify_status_dropdown(String Status) {
		addnewclassPage.VerifyStatusdropdown(Status);
	}

	//@REPORTS_View_and_edit_classes_IQA-104_sprint4

	@When("I navigate_Top_MenuBar {string} {string}")
	public void i_navigate_Top_MenuBar(String level_1_menu, String level_2_menu) {
	    commonPage.navigate_Top_MenuBar(level_1_menu,level_2_menu);
	}


	@Then("verify title Create Your Class {string}")
	public void verify_title_create_your_class(String CreateClass) {
		addnewclassPage.VerifyCreateclassTitle(CreateClass);

	}
	@Then("verify see Back button {string}")
	public void verify_see_back_button(String back ) {
		addnewclassPage.VerifyBackbutton(back);

	}
	@Then("verify School dropdown {string}")
	public void verify_school_dropdown(String Schooldropdown) {
		addnewclassPage.VerifySchooldropdown(Schooldropdown);

	}
	@Then("verify Name this class {string}")
	public void verify_name_this_class(String NameClass) {
		addnewclassPage.VerifyNamethisclass(NameClass);
	}
	@Then("verify Assign a Teacher to this class {string}")
	public void verify_assign_a_teacher_to_this_class(String TeacherClass) {
		addnewclassPage.VerifyAssignTeachertoclass(TeacherClass);

	}
	@Then("verify How many children are in this class? {string}")
	public void verify_how_many_children_are_in_this_class(String ChildrenClass) {
		addnewclassPage.Verifychildreninclass(ChildrenClass);

	}
	@Then("verify What curriculum does this class use? {string}")
	public void verify_what_curriculum_does_this_class_use(String CurriculumClass) {
		addnewclassPage.Verifycurriculumclass(CurriculumClass);

	}
	@Then("verify Choose a picture to represent this class {string}")
	public void verify_choose_a_picture_to_represent_this_class(String PictureClass) {
		addnewclassPage.VerifyChoosepicturetorepresentclass(PictureClass);

	}
	@Then("verify Create Class button {string}")
	public void verify_create_class_button(String CreateClass) {
		addnewclassPage.VerifyCreateClassbutton(CreateClass);

	}
	@Then("verify Cancel button {string}")
	public void verify_cancel_button(String Cancelbutton) {
		addnewclassPage.VerifyCancelbutton(Cancelbutton);
	}


	//@REPORTS_Add_new_class_IQA-105_sprint4

	@Then("I click on create class button {string}")
	public void i_click_on_create_class_button(String string) {
		addnewclassPage.clickcreateclassbutton();

	}
	@Then("Verify error message for school {string}")
	public void verify_error_message_for_school(String Errorschool) {
		addnewclassPage.errorschool(Errorschool);

	}
	@Then("Verify error message is displayed for Name this class {string}")
	public void verify_error_message_is_displayed_for_name_this_class(String Errorclass) {
		addnewclassPage.errorclass(Errorclass);

	}
	@Then("Verify error message is displayed for how many children are there in class {string}")
	public void verify_error_message_is_displayed_for_how_many_children_are_there_in_class(String Errorchildren) {
		addnewclassPage.errorchildren(Errorchildren);

	}
	@Then("Verify error message is displayed for What curriculum does this class cause {string}")
	public void verify_error_message_is_displayed_for_what_curriculum_does_this_class_cause(String Errorcurriculum) {
		addnewclassPage.errorcurriculum(Errorcurriculum);

	}
	@Then("Verify error message is displayed for Choose a picture to represent this class. {string}")
	public void verify_error_message_is_displayed_for_choose_a_picture_to_represent_this_class(String Errorpicture) {
		addnewclassPage.errorpicture(Errorpicture);
	}

	//@REPORTS_Add_new_class_IQA-106_sprint4

	@Then("I select school from the dropdown {string}")
	public void i_select_school_from_the_dropdown(String Expected_SchoolName) {
		addnewclassPage.selectschoolfromdropdown(Expected_SchoolName);
	}

	@Then("I enter Name this class text {string}")
	public void i_enter_name_this_class_text(String Expected_ClassName) throws InterruptedException {
		addnewclassPage.enterNamethisclass(Expected_ClassName);
	}

	@Then("I select Assign teacher to this class dropdown {string}")
	public void i_select_assign_teacher_to_this_class_dropdown(String Expected_Assignteacher)
	{
		addnewclassPage.Assignteacherclassdropdown(Expected_Assignteacher);
	}

	@Then("I select count of children in the class dropdown {string}")
	public void i_select_count_of_children_in_the_class_dropdown(String Expected_Childrencount) {
		addnewclassPage.countofchildrenclassdropdown(Expected_Childrencount);
	}
	@Then("I select curriculam class dropdown {string}")
	public void i_select_curriculam_class_dropdown(String Expected_curriculum) {
		addnewclassPage.curriculamclassdropdown(Expected_curriculum);
	}

	@Then("I select the picture")
	public void i_select_the_picture() {
		addnewclassPage.picture();
	}

	@Then("I click on create class button")
	public void i_click_on_create_class_button()
	{
		addnewclassPage.createclassbutton();
	}

	@Then("I verify added school is displayed with all details {string}")
	public void I_verify_added_school_is_displayed_with_all_details(String Expected_ClassName)
	{
		addnewclassPage.Verifyaddschooltitle(Expected_ClassName);
	}
	
	@Then("I verify added class is displayed with all details")
	public void I_verify_added_classl_is_displayed_with_all_details()
	{
		addnewclassPage.Verifyaddedclasstitle();
	}



	//@REPORTS_Add_new_class_IQA-107_sprint4

	@Then("I click on cancel button {string}")
	public void i_click_on_cancel_button(String Cancelbutton) {
		addnewclassPage.clickCancelbutton(Cancelbutton);
	}

	@Then("I verify View all classes page is displayed {string}")
	public void i_verify_view_all_classes_page_is_displayed(String ViewClassPage) {
		addnewclassPage.Verifyviewclasspage(ViewClassPage);
	}


}
