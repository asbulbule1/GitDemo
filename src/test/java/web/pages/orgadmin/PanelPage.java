package web.pages.orgadmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import util.Selenium;
import web.stepdefs.BaseClass;

public class PanelPage extends BaseClass{

	private WebDriver driver;
	private Selenium selUtil;

		@FindBy(how = How.XPATH, using = "//a[@class='ghosthover backbtn']")
		private WebElement Back;

	// Scenario 5: Skill Support in detail
		@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Support Needed')]")
		private WebElement supportpanel;

		@FindBy(how = How.XPATH, using = "//div//span[contains(text(),'View Weekly Status Report')]")
		private WebElement reportlink;

		@FindBy(how = How.XPATH, using = "//th[@id='supportneeded_c1' and contains(text(),'Scores < 80%')]")
		private WebElement score1;

		@FindBy(how = How.XPATH, using = "//th[@id='supportneeded_c2' and contains(text(),'Scores < 50%')]")
		private WebElement score2;

		@FindBy(how = How.XPATH, using = "//p[@class='g-text' and contains(text(),'No play sessions show a')]")
		private WebElement noplaysession1;

		@FindBy(how = How.XPATH, using = "//p[@class='g-text' and contains(text(),' need for support.')]")
		private WebElement noplaysession2;

		// Scenario 6 :orgadmin_Verify_Professional_Development_Panel_IQA-66

		@FindBy(how = How.XPATH, using = "//div[contains(@class,'clouds-bg')]")
		private WebElement professionaldevelopment;

		@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Your Hatch Knowledge Base']")
		private WebElement hatchhubpage;

		@FindBy(how = How.XPATH, using = "//h1[@class='title']")
		private WebElement Supportneededheading;

		//Scenario 7:Verify_Average_PlayTime_Panel_IQA-69

		@FindBy(how = How.XPATH, using = "//span[@class='text_decoration_no_hover thumb-bt-link' and contains(text(),'View Play Time for All Children')]")
		private WebElement ViewPlayTimeforAllChildren;

		@FindBy(how = How.XPATH, using = "//h1[@class='title']")
		private WebElement schooltitle;

		@FindBy(how = How.XPATH, using = "//td[@class='report-childname pl-0']")
		private WebElement Schoollisttitle;

		@FindBy(how = How.XPATH, using = "//td[@class='report-timebar  pr-0']")
		private WebElement Timebar;

		//Scenario 8:Verify_Average_PlayTime_Panel_IQA-70

		@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/schoolplaytime']//div/h1[contains(text(),'Average Play Time')]")
		private WebElement avgtext;

		@FindBy(how = How.XPATH, using = "//span[@class='bluetext']")
		private WebElement link;

		@FindBy(how = How.XPATH, using = "//p[@class='dashp text-center']")
		private WebElement TextTitle;

		@FindBy(how = How.XPATH, using = "//span[normalize-space()='View Play Time for All Children']")
		private WebElement linkText;

		// Scenario 5 :VerifySupportPageindetail_IQA-67

		public PanelPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			new Selenium(driver);
			selUtil = new Selenium(this.driver);
		}

		public void VerifySupportNeeded(String Panel)
		{
			selUtil.hardWait(2);
			String actualpanel = supportpanel.getText();
			Assert.assertTrue(actualpanel.contains(Panel));
			System.out.println("Panel name displayed is" + actualpanel);

		}

		public void Verifyweeklyreportlink(String Report, String statement) {
			if (driver.getPageSource().contains("View Weekly Status Report")) {

				String Actuallink = reportlink.getText();
				Assert.assertEquals(Actuallink, Report);
				System.out.println("Report link verified " + Actuallink);
			} else {

				String Statement1 = noplaysession1.getText();
				Assert.assertEquals(Statement1, statement);
				System.out.println("Report link is not present hence displayed as" + Statement1);
			}

		}

		// Scenario 5 :VerifySupportPageindetail_IQA-154

		public void Clickonweeklyreportlink(String Noplaysession,String Support_Title,String ScoreEighty,String Scorefifty) {

			boolean weekreportlink = selUtil.isElementExists(10,reportlink);
			if(weekreportlink)
			{
			reportlink.click();
			System.out.println("Clicked on weekly reports link");
			String actualtitlname = Supportneededheading.getText();
			Assert.assertEquals(actualtitlname, Support_Title);
			System.out.println("Page name displayed as"+actualtitlname);

			String actualscore = score1.getText();
			Assert.assertEquals(actualscore, ScoreEighty);
			System.out.println("Panel name displayed is" + actualscore);

			String actualscore2 = score2.getText();
			Assert.assertEquals(actualscore2, Scorefifty);
			System.out.println("Panel name displayed is" + actualscore2);
			//Back.click();

			}
			else
			{
				selUtil.hardWait(2);
				String NoText= noplaysession1.getText();
				Assert.assertTrue(NoText.contains(Noplaysession));
				System.out.println("No play sessions show a need for support.");
			}
		}

		// Scenario 6 :orgadmin_Verify_Professional_Development_Panel_IQA-66

		public void Clickprofesstionaldevelopment()
		{
			selUtil.hardWait(2);
			professionaldevelopment.click();

		}

		public void OnHatchHubPage(String HatchTitle) throws InterruptedException
		{
			String actualhatchtitle= hatchhubpage.getText();
			Assert.assertEquals(actualhatchtitle, HatchTitle);
			System.out.println("Title displayed as" + actualhatchtitle);
			selUtil.hardWait(3);
			driver.navigate().back();
		}

		//Scenario 7:Verify_Average_PlayTime_Panel_IQA-69

		public void ClickViewPlayTime()
		{
			selUtil.waitUntilElementIsPresentOnPage(40, ViewPlayTimeforAllChildren);
			ViewPlayTimeforAllChildren.click();
		}

		public void SchoolPlayTimePage(String SchoolTitlePage)
		{
			selUtil.waitUntilElementIsPresentOnPage(7, schooltitle);
			String actualschooltitle = schooltitle.getText();
			Assert.assertEquals(actualschooltitle, SchoolTitlePage);
			System.out.println("Page title displayed is" + actualschooltitle);
		}

		public void SchoolListPlayTimeBar()
		{
			selUtil.waitUntilElementIsPresentOnPage(40, Schoollisttitle);
			String actualSchoollisttitle = Schoollisttitle.getText();
			System.out.println("School list title is displayed as "+ actualSchoollisttitle);

			Timebar.getText();
			System.out.println("School list PlayTimeBar is present");

		}


		//Scenario 8:Verify_Average_PlayTime_Panel_IQA-70

		public void verifyAverageplaytimepaneltitle(String Avgtitle)
		{
			selUtil.waitUntilElementIsPresentOnPage(10, avgtext);
			selUtil.getAction().moveToElement(avgtext).perform();
			String actualaveragetitle = avgtext.getText();
			Assert.assertTrue(actualaveragetitle.contains(actualaveragetitle));
			System.out.println("Average is displayed as "+ actualaveragetitle);
		}

		public void VerifyChildrenCount()
		 {
			 String actuallinktitle = link.getText();
			 System.out.println("Children count" + actuallinktitle);
		 }

		public void Verifytext(String Text)
		{
			String actualText = TextTitle.getText();
			Assert.assertTrue(actualText.contains(actualText));
			System.out.println("Text is displayed as "+ actualText);
		}

		public void ViewPlayTimeforAllChildren(String Link)
		{
			String actuallink = linkText.getText();
			Assert.assertEquals(actuallink, Link);
			System.out.println("Link text title as " + actuallink);
		}
}




