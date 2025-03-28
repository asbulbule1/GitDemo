package web.stepdefs.orgadmin;

import io.cucumber.java.en.Then;
import web.stepdefs.BaseClass;

public class StepDefinationOrgAdminDashboardPanel extends BaseClass
{

	@Then("Click on Hatch Insight Logo")
	public void click_On_Hatch_Insight_Logo()
{
		org_PanelPage.clickOnHatchInsightLogo();
}

	@Then("Click on Hatch Hub Logo")
	public void click_On_Hatch_Hub_Logo()
{
		org_PanelPage.clickOnHatchInsightLogoHub();
}

	@Then("verify ignite by hatch utilization panel {string} present")
	public void verify_ignite_by_hatch_utilization_panel(String expectedIgniteByHatchUtilization)
	{
		org_PanelPage.igniteByHatchUtilizationTilePresent(expectedIgniteByHatchUtilization);
	}

	@Then("verify ignite by hatch utilization panle is clickable")
	public void verify_ignite_by_hatch_utilization_panel_clickable( )
	{
			org_PanelPage.igniteByHatchUtilizationTileClickable();
	}

	@Then("verify average demonstrated panel {string} present")
	public void verify_average_demonstrated_panel(String expectedAverageDemonstarted)
	{
			org_PanelPage.averageDemonstratedPanelPresent(expectedAverageDemonstarted);
	}
	@Then("verify average demonstrated panel org admin {string} present")
	public void verify_average_demonstrated_panel_OrgAdmin(String expectedAverageDemonstarted)
	{
			org_PanelPage.averageDemonstratedPanelPresentOrgAdmin(expectedAverageDemonstarted);
	}
	
	@Then("verify average demonstrated panel is clickable")
	public void verify_average_demonstrated_panel_clickable( )
	{
			org_PanelPage.averageDemonstratedPanelClickable();
	}

	@Then("verify professioal development panel {string} present")
	public void verify_professioal_development(String expectedProfessionalDevelopment)
	{
			org_PanelPage.professionalDevelopmentPanelPresent(expectedProfessionalDevelopment);
	}

	@Then("verify professioal development panel is clickable")
	public void verify_professioal_development_panel_clickable( )
	{
			org_PanelPage.professionalDevelopmentPanelClickable();
	}

	@Then("verify support needed panel {string} present")
	public void verify_support_needed_panel(String expectedSupportNeeded)
	{
			org_PanelPage.supportNeededPanelPresent(expectedSupportNeeded);
	}

	@Then("verify support needed panel is clickable")
	public void verify_support_needed_panel_clickable( )
	{
			org_PanelPage.supportNeededPanelClickable();
	}

	@Then("verify average playtime panel {string} present")
	public void verify_average_playtime_panel(String expectedAveragePlaytime)
	{
			org_PanelPage.averagePlayTimePanelPresent(expectedAveragePlaytime);
	}

	@Then("verify average playtime panel is clickable")
	public void verify_average_playtime_panel_clickable()
	{
			org_PanelPage.averagePlayTimePanelClickable();
	}

	@Then("verify teaching strategy gold panel {string} or {string} present")
	public void verify_teaching_strategy_gold_panel(String expectedTSG, String expectedAreYouGOLD)
	{
			org_PanelPage.areYouGoldUserTilePresent(expectedTSG,expectedAreYouGOLD);
	}

	@Then("verify teaching strategy gold panel is clickable")
	public void verify_teaching_strategy_gold_panel_clickable()
	{
			org_PanelPage.areYouGoldUserTileClickable();
	}
//	***************************************************************************
//	TSG Tile UI Verification

	@Then("verify % of children matched to GOLD displayed")
	public void verify_Percentage_of_children_matched_to_GOLD_displayed()
	{
			org_PanelPage.seePercentageOfChildrenMatched();
	}

	@Then("verify Total Document sent displayed")
	public void verify_Total_Document_sent_displayed()
	{
			org_PanelPage.seeTotalDocumentSent();
	}

	@Then("verify {string} link displayed")
	public void verify_Manage_HatchSync_Connection_link_displayed(String expectedManageHatchSyncLink)
	{
			org_PanelPage.seeManageHatchSyncConnectionLink(expectedManageHatchSyncLink);
	}

	@Then("Verify if Organization is not TSG then below links displayed")
	public void verify_Non_TSG_link_displayed(String expectedNonTSGLink)
	{
			org_PanelPage.seeNonTSGLink(expectedNonTSGLink);
	}


// ***************************************************************************

//	NON TSG TILE

	@Then("Verify header text {string} displayed")
	public void verify_Non_TSG_header_displayed(String expectedNonTSGTileHeader)
	{
			org_PanelPage.seeNonTSGHeader(expectedNonTSGTileHeader);
	}


	@Then("Verify {string} link displayed")
	public void verify_hatchsync_today_link_displayed(String expectedGetHatchSyncTodayLink)
	{
			org_PanelPage.seeGetHatchSyncTodayLink(expectedGetHatchSyncTodayLink);
	}

	@Then("Click on Get HatchSync Today and verify its getting nevigate to TSG Page")
	public void click_hatchsync_today_link()
	{
			org_PanelPage.clickGetHatchSyncTodayLink();
	}

//*******************************************************************************

}
