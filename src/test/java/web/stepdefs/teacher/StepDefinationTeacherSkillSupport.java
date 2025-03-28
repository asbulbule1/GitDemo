package web.stepdefs.teacher;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import web.stepdefs.BaseClass;

public class StepDefinationTeacherSkillSupport extends BaseClass
{

	@And("I am able to select school from school dropdown {string}")
	public void I_am_able_to_select_schools_from_school_dropdown(String chilschdropdwon)
	{
		teach_skillsupport.select_school_dropdown(chilschdropdwon);
	}


	@And("I am able to select class name from dropdown")
	  public void I_am_able_to_select_class_name_from_dropdown(DataTable expectedclassName)
	  {
		teach_skillsupport.select_class_dropdown(expectedclassName);
	  }

	@And("i am able to see listed tiles and childrens on page")
	  public void i_am_able_to_see_listed_tiles_and_childrens_on_page()
	  {
		teach_skillsupport.getchildname();
	  }

	@And("I clicked on the Browse the Full Experience Library button")
	  public void  I_clicked_on_the_Browse_the_Full_Experience_Library_button()
	  {
		teach_skillsupport.clickonBrowsethefullexpButton();
	  }

	@And("I am able to see recommended curricular experience pages {string}")
	public void i_am_able_to_see_recommended_curricular_experience_page(String recommendecurricular)
	{
		teach_skillsupport.seeCurricularTitle(recommendecurricular);
	}
	@When("I am on menu of {string}  {string}")
	public void I_am_on_menu_of(String level_1_menu, String level_2_menu)
	{
		commonPage.navigate_to_Support_Needed(level_1_menu, level_2_menu);
	}
	@And("I am able to see Support Needed page title {string}")
	public void I_am_able_to_see_Support_Needed_page_title(String Support_Title)
	{
		teach_skillsupport.verifySupportNeededTitle(Support_Title);
	}



}