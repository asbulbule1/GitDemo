package web.stepdefs.orgadmin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.stepdefs.BaseClass;

public class StepDefinationResources extends BaseClass

{
	@Then("Naviagate back to orgadmin Home page")
	public void navigateBackToOrgAdminHomePage()
	{
		orgAdmin_ResorcesPage.navigateBackToHomePage();
	}
	@Then("I close child window if any and navigate back to parent window")
	public void closeChildWindowAndNavigateToParentWindow()
	{
		orgAdmin_ResorcesPage.closeChildWindowAndBackToParentWindow();
	}


	@Then("Naviagate back to school admin Home page")
	public void navigateBackToSchoolAdminHomePage()
	{
		orgAdmin_ResorcesPage.navigateBackToHomePage();
	}
	@Then("Verify we are on resources what does it mean to ignite {string} Page")
	public void verify_we_are_on_resources_IgniteByHatchPage(String expectedIgnitebyHatchPage)
	{
		orgAdmin_ResorcesPage.whatDoesItMeanToIgnite(expectedIgnitebyHatchPage);
	}

	@Then("Verify we are on resources Help Center & Knowledge Base {string} Page")
	public void verify_we_are_on_resources_Help_Center_Knowledge_Base_Page(String expectedHelpCenterKnowledgeBaseTittle)
	{
		orgAdmin_ResorcesPage.helpCenterKnowldegeBase(expectedHelpCenterKnowledgeBaseTittle);
	}

	@Then("Verify we are on resources PDF and Printable {string} Page")
	public void verify_we_are_on_resources_PDF_and_Printable_Page(String expectedPDFAndPrintablePagetitle)
	{
		orgAdmin_ResorcesPage.pDFAndPrintable(expectedPDFAndPrintablePagetitle);
	}

	@Then("Verify we are on resources Videos {string} Page")
	public void verify_we_are_on_resources_Videos_Page(String expectedVideosPagetitle)
	{
		orgAdmin_ResorcesPage.videosPage(expectedVideosPagetitle);
	}

	@Then("Verify we are on resources The Hatch Hub {string} Page")
	public void verify_we_are_on_resources_The_Hatch_Hub_Page(String expectedDiscussionBoard)
	{
		orgAdmin_ResorcesPage.theHatchHub(expectedDiscussionBoard);
	}

	@Then("Verify we are on resources Discussion Board {string} Page")
	public void verify_we_are_on_resources_DiscussionBoard_Page(String expectedDiscussionBoard)
	{
		orgAdmin_ResorcesPage.discussionBorad(expectedDiscussionBoard);
	}

	@Then("Verify we are on resources Webinars {string} Page")
	public void verify_we_are_on_resources_Webinars_Page(String expectedWebinars)
	{
		orgAdmin_ResorcesPage.webinarsPage(expectedWebinars);
	}
	@Then("I am able to see device ignite page {string}")
	public void i_am_able_to_see_device_ignite_page(String page)
	{
		orgAdmin_ResorcesPage.verifyDevicePage(page);
	}
	@When("I navigate to the top menu bar {string} {string}")
	public void I_navigate_to_the_top_menu_bar(String level_1_menu, String level_2_menu)
	{
		commonPage.navigate_to_Reports_DeviceIgniteversion(level_1_menu, level_2_menu);
	}
	@When("I navigate to a top menu bar {string} {string}")
     public void I_navigate_to_a_top_menu_bar(String level_1_menu, String level_2_menu)
     {
    	 commonPage.navigate_Top_MenuBarResourcesDeviceIgnite(level_1_menu, level_2_menu);
     }
	
	@Then("Verify we are on resources Research Backed {string} Page")
	public void verify_we_are_on_resources_Research_Backed_Page(String expectedTitle)
	{
		orgAdmin_ResorcesPage.research_Backed(expectedTitle);
	}
	
	@Then("Verify we are on resources Alignments & Standards {string} Page")
	public void verify_we_are_on_resources_Alignments_Standards_Page(String expectedTitle)
	{
		orgAdmin_ResorcesPage.alignments_Standards(expectedTitle);
	}
		
	@Then("Verify we are on resources Success Stories {string} Page")
	public void verify_we_are_on_resources_Success_Stories_Page(String expectedTitle)
	{
		orgAdmin_ResorcesPage.success_Stories(expectedTitle);
	}
	
	@Then("Verify we are on resources Blog {string} Page")
	public void verify_we_are_on_resources_blog_page(String expectedTitle) {
		orgAdmin_ResorcesPage.blog(expectedTitle);
	}
	
	@Then("Verify we are on resources Paid Product Training {string} Page")
	public void verify_we_are_on_resources_paid_product_training_page(String expectedTitle) {
		orgAdmin_ResorcesPage.paid_product_training(expectedTitle);
	}
	
	@Then("Verify we are on resources Professional Development {string} Page")
	public void verify_we_are_on_resources_professional_development_page(String expectedTitle) {
		orgAdmin_ResorcesPage.professional_development_page(expectedTitle);
	}
	
	@Then("Verify we are on resources IgniteTable - Getting Started {string} Page")
	public void verify_we_are_on_resources_ignite_table_getting_started_page(String expectedTitle) {
		orgAdmin_ResorcesPage.ignite_table_getting_started(expectedTitle);
	}
	@Then("Verify we are on resources Submit a Support Ticket  {string} Page")
	public void verify_we_are_on_resources_submit_a_support_ticket_page(String expectedTitle) {
		orgAdmin_ResorcesPage.submit_a_support_ticket(expectedTitle);
	}
	
}
