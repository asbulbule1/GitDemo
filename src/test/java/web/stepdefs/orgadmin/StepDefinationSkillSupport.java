package web.stepdefs.orgadmin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.stepdefs.BaseClass;

public class StepDefinationSkillSupport extends BaseClass
{
	@When("I navigate to the menu {string} {string}")
	public void i_navigate_to_the_menu(String level_1_menu,String level_2_menu)
	{
		commonPage.verify_Top_MenuBar(level_1_menu, level_2_menu);

	}
	@And("I am able to see data driven instruction menu {string}")
	public void i_am_able_to_see_data_driven_instruction_menu(String DataDrivenInstruction)
	{
		skillsupportpage.seeDataDriven(DataDrivenInstruction);
	}
	@And("I am able to see recommended curricular experience menu {string}")
	public void i_am_able_to_see_recommended_curricular_experience_menu(String RecommendedCurricularExperiences)
	{
		skillsupportpage.seeRecommendedExperiences(RecommendedCurricularExperiences);
	}
	@And("I am able to see all curricular experience menu {string}")
	public void i_am_able_to_see_all_curricular_experience_menu(String AllCurricularExperiences)
	{
		skillsupportpage.seeAllCurricular(AllCurricularExperiences);
	}
	@Then("I am able to see support needed menu {string}")
	public void i_am_able_to_see_support_needed_menu(String SupportNeeded)
	{
		skillsupportpage.seeSupportNeeded(SupportNeeded);
	}
	@When("I navigate to menu {string} {string}")
	public void i_navigate_to_menu(String level_1_menu,String level_2_menu)
	{
		commonPage.navigate_Top_MenuBar(level_1_menu, level_2_menu);
	}
	@And("I am able to see All Curricular Experince page {string}")
	public void i_am_able_to_see_All_Curricular_experience_page(String AllCurricularExperience)
	{
		skillsupportpage.seeAllCurricularExp(AllCurricularExperience);
	}
	@And("I am able to see all domain")
	public void i_am_able_to_see_all_domain(DataTable table)
	{
		skillsupportpage.verifyDomain(table);
	}
	@And("I am able to click on accordian {string}")
	public void i_am_able_to_click_on_accordian(String accordiandomain)
	{
		skillsupportpage.clickOnDomain(accordiandomain);
	}
	@And("I am able to see social studies subdomains")
	public void i_am_able_to_see_social_studies_subdomains(DataTable datatable)
	{
		skillsupportpage.verifySubdomain(datatable);

	}
	@And("I am able to click on recommended for your class")
	public void i_am_able_to_click_on_recommended_for_your_class()
	{
		skillsupportpage.clickOnRecommended();
	}
	@And("I am able to see curricular experience recommendation page {string}")
	public void i_am_able_to_see_curicular_experience_recommendation_page(String CurricularExperiencesRecommendations)
	{
		skillsupportpage.seeCurricularExpRe(CurricularExperiencesRecommendations);
	}
	@And("I am able to click on to accordian {string}")
	public void i_am_able_to_click_on_to_accordian(String accordiandomain)
	{
		skillsupportpage.clickOnDomain(accordiandomain);
	}
	@And("I am able to see science and technology subdomains")
	public void i_am_able_to_see_science_and_technology_subdomains(DataTable datatable)
	{
		skillsupportpage.verifySubdomain(datatable);
	}
	@And("I am able to click onto {string}")
	public void i_am_able_to_click_onto(String accordiandomain)
	{
		skillsupportpage.clickOnDomain(accordiandomain);
	}
	@Then("I am able to see social emotional development subdomains")
	public void i_am_able_to_see_social_emotional_development_subdomains(DataTable datatable)
	{
		skillsupportpage.verifySubdomain(datatable);

	}
	@And("I am able to click {string}")
	public void i_am_able_to_click(String accordiandomain)
	{
		skillsupportpage.clickOnDomain(accordiandomain);
	}
	@And("I am able to see langauge and communication development subdomains")
	public void i_am_able_to_see_langauge_and_communication_development_subdomains(DataTable datatable)
	{
		skillsupportpage.verifySubdomain(datatable);
	}
	@And("I am able to click into {string}")
	public void i_am_able_to_click_into(String accordiandomain)
	{
		skillsupportpage.clickOnDomain(accordiandomain);
	}
	@And("I am able to see literacy subdomains")
	public void i_am_able_to_see_literacy_subdomains(DataTable datatable)
	{
		skillsupportpage.verifySubdomain(datatable);
	}
	@And("I am able to click in to {string}")
	public void i_am_able_to_click_in_to(String accordiandomain)
	{
		skillsupportpage.clickOnDomain(accordiandomain);
	}
	@And("I am able to see physical development subdomains")
	public void i_am_able_to_see_physical_development_subdomains(DataTable datatable)
	{
		skillsupportpage.verifySubdomain(datatable);
	}
	@And("I am able to click into the {string}")
	public void i_am_able_to_click_into_the(String accordiandomain)
	{
		skillsupportpage.clickOnDomain(accordiandomain);
	}
	@And("I am able to see mathematics subdomains")
	public void i_am_able_to_see_mathematics_subdomains(DataTable datatable)
	{
		skillsupportpage.verifySubdomain(datatable);
	}
	@When("I am on the menu {string} {string}")
	public void I_am_on_the_menu(String level_1_menu,String level_2_menu)
	{
		commonPage.navigate_to_Skill_Support1(level_1_menu, level_2_menu);
	}


}
