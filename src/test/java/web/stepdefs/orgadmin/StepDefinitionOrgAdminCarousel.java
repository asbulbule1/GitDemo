package web.stepdefs.orgadmin;

import java.awt.AWTException;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import web.stepdefs.BaseClass;


public class StepDefinitionOrgAdminCarousel extends BaseClass {


	@Then("Verify we are on {string} Page")
	public void verify_we_are_on_nevigated_report_page(String expectedReportPageTitle)
	{
		org_CaruselPage.navigatedToGivenReportPage(expectedReportPageTitle);
	}

	@Then("wait for {int} second on page")
	public void wait_for_second_on_page(int expectedWaitTime)
	{
		org_CaruselPage.waitTimeForPage(expectedWaitTime);
	}

	@Then("verify carosel is getting dispayed on report page")
	public void verify_carosel_is_getting_dispayed_on_report_page(DataTable expectedCarousel ) throws InterruptedException, AWTException

	{
		org_CaruselPage.seeCarouselProducts(expectedCarousel);
	}

	@Then("click on Carosel_Product and verify getting naviate to respective report page")
	public void click_on_carosel(DataTable expectedCarouselProduct)
	{
	     org_CaruselPage.clickOnCarouselProducts(expectedCarouselProduct);
	}

	@Then("Verify user getting navigated to respective {string}")
	public void verify_getting_navigated_on_report_page(String expectedReportPage )
	{
	   org_CaruselPage.nevigattionToRespectiveReportPage(expectedReportPage);
	}

	}

