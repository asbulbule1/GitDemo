package web.stepdefs.schooladmin;

import io.cucumber.java.en.And;
import web.stepdefs.BaseClass;

public class StepDefinationSchoolAdminResourcesPage extends BaseClass
{
	@And("I am able to see your hatch knowledge base {string}")
	  public void I_am_able_to_see_your_hatch_knowledge_base(String pagetitle)
	  {
		  sch_resourcespage.navigateToChildWindow();
		  sch_resourcespage.verifyPageTitle(pagetitle);
	  }
	  @And("I am able to see header learn")
	  public void I_am_able_to_see_header_learn()
	  {
		  sch_resourcespage.verifyLearnHeader();
	  }
	  @And("I am able to see header discuss")
	  public void I_am_able_to_see_header_discuss()
	  {
		  sch_resourcespage.verifyDicussHeader();
	  }
	  @And("I am able to see header my info")
	  public void I_am_able_to_see_header_my_info()
	  {
		  sch_resourcespage.verifyMyinfoHeader();
	  }
	  @And("I am able to see header team")
	  public void I_am_able_to_see_header_team()
	  {
		  sch_resourcespage.verifyTeamHeader();
	  }
	  @And("I am able to see header support")
	  public void I_am_able_to_see_header_support()
	  {
		  sch_resourcespage.verifySupportHeader();
	  }
	  @And("I am able to see header hatch insights")
	  public void I_am_able_to_see_header_hatch_insights()
	  {
		  sch_resourcespage.verifyhatchInsightsHeader();
	  }
	  @And("I am able to click on profile link")
	  public void I_am_able_to_click_on_profile_link()
	  {
		  sch_resourcespage.clickOnProfileLink();
	  }
	  @And("I am able to see profile page {string}")
	  public void I_am_able_to_see_profile_page(String profilepage)
	  {
		  sch_resourcespage.verifyProfilePage(profilepage);
		  sch_resourcespage.clickOnHomeLink();
	  }
	  @And("I am able to see logout button")
	  public void I_am_able_to_see_logout_button()
	  {
		  sch_resourcespage.seeLogoutLink();
	  }
	  @And("I am able to see product guides page {string}")
	  public void I_am_able_to_see_product_guides_page(String pagename)
	  {
		  sch_resourcespage.verifyProductGuideTitle(pagename);
	  }
	  @And("I am able to see ignite by hatch accordian")
	  public void I_am_able_to_see_ignite_by_hatch_accordian()
	  {
		  sch_resourcespage.verifyIgnitebyHatchAccordian();
	  }
	  @And("I am able to see istartsmart tablet and computer accordian")
	  public void I_am_able_to_see_istartsmart_tablet_and_computer_accordian()
	  {
		  sch_resourcespage.verifyIStartSmartAccordian();
	  }
	  @And("I am able to see weplaysmart multi touch table accordian")
	  public void I_am_able_to_see_weplaysmart_multi_touch_table_accordian()
	  {
		  sch_resourcespage.verifyWePlaySmartAccordian();
	  }
	  @And("I am able to see teach smart display and board accordian")
	  public void I_am_able_to_see_teach_smart_display_and_board_accordian()
	  {
		  sch_resourcespage.verifyTeachSmartAccordian();
	  }
	  @And("I am able to click on hatch insights text")
	  public void I_am_able_to_click_on_hatch_insights_text()
	  {
		  sch_resourcespage.clickOnHatchInsights();
		  sch_resourcespage.closeChildWindow();
	  }
	  @And("I am able to see product videos page {string}")
	  public void I_am_able_to_see_product_videos_page(String pgname)
	  {
		  sch_resourcespage.verifyProductVideosPage(pgname);
	  }
	 @And("I am able to see expert webinars page {string}")
	 public void I_am_able_to_see_expert_webinars_page(String title)
	 {
		 sch_resourcespage.verifyExpertWebniarsPage(title);
	 }
	 @And("I am able to see ignite by hatch page {string}")
	 public void I_am_able_to_see_ignite_by_hatch_page(String Title)
	 {
		 sch_resourcespage.verifyIgniteByHatchPage(Title);
	 }
	 @And("I am able to see discussion page {string}")
	 public void I_am_able_to_see_discussion_page(String pgname)
	 {
		 sch_resourcespage.verifyDiscussionTitle(pgname);
	 }
	 @And("I am able to discussion topics list")
	 public void I_am_able_to_discussion_topics_list()
	 {
		 sch_resourcespage.verifyListOfDiscussion();
	 }
	 @And("I am able to search using search box {string}")
	 public void I_am_able_to_search_using_search_box(String searchname)
	 {
		 sch_resourcespage.searchNameInSearchBox(searchname);
	 }
	 @And("I am able to click on search button")
	 public void I_am_able_to_click_on_search_button()
	 {
		 sch_resourcespage.clickOnSearchBtn();
	 }


}
