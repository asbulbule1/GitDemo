package web.pages.P1_P2_Issue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import util.Selenium;
import web.stepdefs.BaseClass;

public class ImportStatusPage extends BaseClass {

	private Selenium selUtil;
	public String finalClassName;


		String commonimporlogtheader="//div[@class='histort-table']//th[contains(text(),'$importheader$')]";
		String commonCarryOverOption="//a[@href='/insightchild/$carryoveroption$']";

		@FindBy(how = How.XPATH, using = "//tr[@class='importstatusitem selected']//td[5]")
		private WebElement checkcronetime;

		@FindBy(how = How.XPATH, using = "//div[@class='histort-table']//tbody/tr[1]")
		private WebElement historyLogButton;

		@FindBy(how = How.XPATH, using = "//div[@class='col-lg-6 pr-md-3 pr-0 pl-0']//h2")
		private WebElement simpleCarryoverWE;

		@FindBy(how = How.XPATH, using = "//div[@class='col-lg-6 mt-4 mt-sm-4 mt-lg-0 pl-0 pr-0 pl-md-3']//h2")
		private WebElement bulkCarryoverViaCSVWE;

		@FindBy(how = How.XPATH, using = "//div[@id='ms-list-1']")
		private WebElement availableSchoolDropDown;

		@FindBy(how = How.XPATH, using = "//div[@class='ms-search']/input")
		private WebElement searchSchoolInlist;

		@FindBy(how = How.XPATH, using = "//label[@title='$Schoolname$']/span")
		private WebElement selectschoolNameEnterWE;

		@FindBy(how = How.XPATH, using = "//select[@name='Child[classroom_id]']")
		private WebElement classDropdown;

		@FindBy(how = How.XPATH, using = "//div/a[@href='https://rmsstaging.hatchearlychildhood.com/insightclassroom/add']")
		private WebElement addNewClassButton;

		@FindBy(how = How.XPATH, using = "//h1[@class='title']")
		private WebElement actualCreateYourClassTitleWE;


		@FindBy(how = How.NAME, using = "check_all_chkchild")
		private WebElement selectAllChildren;

		@FindBy(how = How.ID, using = "saverosterbtn")
		private WebElement saveRosterButton;

		@FindBy(how = How.ID, using = "nextclassbtn")
		private WebElement nextClassButton;

		@FindBy(how = How.ID, using = "finishbtn")
		private WebElement finishButton;

		@FindBy(how = How.ID, using = "headingOne")
		private WebElement importCarryoverChildrenAccordion;

		@FindBy(how = How.ID, using = "downloadLastYearsChildData")
		private WebElement downloadLastYearDataButton;

		@FindBy(how = How.ID, using = "downloadCurrentClasses")
		private WebElement seeCurrentClassesButtonPresentAndClickable;

		@FindBy(how = How.XPATH, using = "//label[@for='multipleCarryoverCSVInput']")
		private WebElement chooseFileButtonIsPresentAndClickable;



		String commonSummaryCounttheader="(//div//h3[@class='school' and text()='$summaryheader$'])[1]";
		String commonSchoolOptionSelection="//label[@title='$Schoolname$']/span";
		String commonChildNameCheckBox="(//td[text()='$ChildName$']/preceding-sibling::td)[1]";

		public ImportStatusPage(WebDriver driver)
		{
			BaseClass.driver = driver;
			PageFactory.initElements(driver, this);
			new Selenium(driver);
			selUtil = new Selenium(BaseClass.driver);
		}

		public void headersOfImportHistoryLogDisplayed(DataTable expectedImportLogHeaders)
		{
			List<String>importLogHeaders = expectedImportLogHeaders.asList();
			   for(String importLogHeader : importLogHeaders)
			   {
					String importlogheaderxpath = commonimporlogtheader.replace("$importheader$", importLogHeader);
					WebElement importlogheaderWE = driver.findElement(By.xpath(importlogheaderxpath));
					selUtil.waitUntilElementIsPresentOnPage(10, importlogheaderWE);
					selUtil.getAction().moveToElement(importlogheaderWE).perform();
					System.out.println(importlogheaderWE.getText());
					Assert.assertTrue(importlogheaderWE.getText().contains(importLogHeader), "header is present");
		       }
		}
		public void selectHistoryLogButton()
		{
			historyLogButton.click();
			String cronjobexecutedtime=checkcronetime.getText();
			System.out.println(cronjobexecutedtime);
		}

		public void rosterSyncCronJobExecuted(String expectedCronTime)
		{
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDateTime currentDate = LocalDateTime.now();
			String yesterday=currentDate.minusDays(1).format(dtf);
	        System.out.println("Cron Job expected  Date is : "+yesterday);

			String cronjobexecutedtime=checkcronetime.getText();
			String[] crondateParts = cronjobexecutedtime.split(" ");
			String cronDate = crondateParts[0];
			String cronTime = crondateParts[1];
			System.out.println("cron Date "+ cronDate +" and cron time"+ cronTime);

			Assert.assertEquals(cronDate, yesterday,"Expected Cron Log Date ");
			Assert.assertTrue(cronTime.contains(expectedCronTime),"Expected Cron Log Time");
		}
		public void importStatusSummaryPageCountLabelsdDisplayed(DataTable expectedSummaryHeaders)
		{
			List<String>summaryCountHeaders = expectedSummaryHeaders.asList();
			   for(String summaryCountHeader : summaryCountHeaders)
			   {
					String summaryCountHeaderxpath = commonSummaryCounttheader.replace("$summaryheader$", summaryCountHeader);
					WebElement summaryCountHeaderWE = driver.findElement(By.xpath(summaryCountHeaderxpath));
					selUtil.waitUntilElementIsPresentOnPage(10, summaryCountHeaderWE);
					selUtil.getAction().moveToElement(summaryCountHeaderWE).perform();
					System.out.println(summaryCountHeaderWE.getText());
					Assert.assertTrue(summaryCountHeaderWE.getText().contains(summaryCountHeader), "header is present");
		       }
		}

		public void verifyTwoOptionPresentForCarryover(String expectedSimpleCarryOver, String expectedBulkCarryOver)
		{
			String simpleCarryover=simpleCarryoverWE.getText();
			String bulkCarryoverViaCSV=bulkCarryoverViaCSVWE.getText();
			Assert.assertEquals(expectedSimpleCarryOver, simpleCarryover,"Simple Carry Over Text");
			Assert.assertEquals(expectedBulkCarryOver, bulkCarryoverViaCSV,"Bulk Carry Over Text");
		}
		public void clickOnContinueButtonCarryOverOption(String expectedCarryoverOption)
		{
			String carryoveroptiontext=null;
			if(expectedCarryoverOption.equals("Simple Carryover"))
			{
					carryoveroptiontext="simplecarryover";
			}
			else if(expectedCarryoverOption.equals("Bulk Carryover via CSV"))
			{
				carryoveroptiontext="bulkcarryover";
			}
			String carryoveroptionxpath = commonCarryOverOption.replace("$carryoveroption$", carryoveroptiontext);
			WebElement carryoveroptionWE = driver.findElement(By.xpath(carryoveroptionxpath));
			carryoveroptionWE.click();
		}
		public void expandImportCarryoverChildrenAccordion()
		{
			importCarryoverChildrenAccordion.click();
		}
		public void availalableSchoolDropDown()
		{
			availableSchoolDropDown.isDisplayed();
		}

		public void selectSchoolNameFromDropDown(DataTable expectedSchoolName)
		{
			availableSchoolDropDown.click();
			List<String> schoolNameExpctedtoEnter=expectedSchoolName.asList();
			for(String schoolNameExpcted:schoolNameExpctedtoEnter)
			{
			String schoolNameEnterxpath = commonSchoolOptionSelection.replace("$Schoolname$", schoolNameExpcted);
			WebElement schoolNameEnterWE = driver.findElement(By.xpath(schoolNameEnterxpath));

			searchSchoolInlist.click();
			selUtil.hardWait(5);
			searchSchoolInlist.clear();
			searchSchoolInlist.sendKeys(schoolNameExpcted);
			selUtil.hardWait(5);
//			selectschoolNameEnterWE.click();
			selUtil.getAction().moveToElement(schoolNameEnterWE).click().perform();
//			schoolNameEnterWE.click();
			}
		}
		public void selectClassNameFromDropdown(String expectedClassName)
		{
//			classDropdown.click();
			selUtil.hardWait(5);
			Select classname=new Select(classDropdown);
			classname.selectByVisibleText(expectedClassName);
		}

		public void selectChildFromListToCarryover(DataTable ExpectedchildName)
		{
			List<String> chiildrenNameToCarryOver=ExpectedchildName.asList();
			for(String childNameCarryOver:chiildrenNameToCarryOver)
			{
				String childnameCheckBoxxpath = commonChildNameCheckBox.replace("$ChildName$", childNameCarryOver);
				WebElement childNameCheckBoxWE = driver.findElement(By.xpath(childnameCheckBoxxpath));

				childNameCheckBoxWE.click();
			}
		}
		public void selectAllChildrenToCarryOver()
		{
			selectAllChildren.click();
			Assert.assertTrue(selectAllChildren.isSelected());
		}
		public void saveRosterButtonIsClickable()
		{
			selUtil.getAction().moveToElement(saveRosterButton).perform();
			Assert.assertTrue(saveRosterButton.isEnabled(),"Save Roster Button Is clickable");
		}
		public void nextClassButtonIsClickable()
		{
			selUtil.getAction().moveToElement(nextClassButton).perform();
			Assert.assertTrue(nextClassButton.isEnabled());
		}
		public void finishButtonIsClickable()
		{
			Assert.assertTrue(finishButton.isEnabled());
		}
		public void addNewClassButtonPresentandClickingNavigateTOCreateClassPage(String expectedCreatYourClassPageTitle)
		{
			Assert.assertTrue(addNewClassButton.isDisplayed());
			selUtil.getAction().moveToElement(addNewClassButton).click().perform();
			addNewClassButton.click();

			String parent = driver.getWindowHandle();
			selUtil.hardWait(5);
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        	driver.switchTo().window(ChildWindow);

			String creatYourClassPapgeTitle= actualCreateYourClassTitleWE.getText();
			System.out.println(creatYourClassPapgeTitle);
			Assert.assertTrue(creatYourClassPapgeTitle.contains(expectedCreatYourClassPageTitle));

			driver.close();

			System.out.println("Child window closed");
        	driver.switchTo().window(parent);
	        }
	        }
		}
		public void verifyDownloadLastYearsDataButtonPresentAndClickable()
		{
			downloadLastYearDataButton.click();
			Assert.assertTrue(downloadLastYearDataButton.isEnabled());
		}
		public void verifySeeCurrentClassesButtonPresentAndClickable()
		{
			selUtil.hardWait(2);
			selUtil.getAction().moveToElement(seeCurrentClassesButtonPresentAndClickable).click().perform();
			Assert.assertTrue(seeCurrentClassesButtonPresentAndClickable.isEnabled());
		}
		public void verifyChooseFileButtonIsPresentAndClickable()
		{
			selUtil.getAction().moveToElement(chooseFileButtonIsPresentAndClickable).perform();
		}

}



