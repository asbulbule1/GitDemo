package web.pages.orgadmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import util.Selenium;

public class DashboardPanelPage {

		private WebDriver driver;
		private Selenium sel;
		private Selenium selUtil;

		@FindBy(how=How.XPATH,using="//h1[contains(text(),'Setup Report')]")
		private WebElement setuptitle;

		@FindBy(how=How.CLASS_NAME,using="welcome-title")
		private WebElement dashboardtitle;

		@FindBy(how=How.XPATH,using="//*[@id='insightreports-page']//span[contains(text(),'View Detailed Report')]")
		private WebElement ignitetiletitle;

		@FindBy(how=How.XPATH,using="//a[@class='ghosthover backbtn']")
		private WebElement backbtn;

		@FindBy(how=How.XPATH,using="//p[@class='dashp']")
		private WebElement paneltext;

		@FindBy(how=How.XPATH,using="//h1[contains(text(),'Ignite by Hatch')]")
		private WebElement ignitebyhatchtext;

		@FindBy(how=How.XPATH,using="//strong[normalize-space()='0']")
		private WebElement titlezeronumber;

		@FindBy(how=How.XPATH,using="//strong[contains(@class,'bluetext panelnumber_sm')]")
		private WebElement titleothernumber;

		@FindBy(how=How.XPATH,using="//strong[normalize-space()='10']")
		private WebElement titletenclasses;

		@FindBy(how=How.XPATH,using="//p[contains(text(),'schools')]/strong")
		private WebElement schoolnameforclasses;

		@FindBy(how=How.XPATH,using="//strong[@class='bluetext panelnumber_sm' ]/parent::p")
		private WebElement schoolnameforschools;

		@FindBy(how=How.XPATH,using="//strong[@class='yellowtext panelnumber_sm']/following::p[@class='dashp'][2]")
		private WebElement classnameforschools;

		@FindBy(how=How.XPATH,using="//div[@class='org-setup-count']//h6[contains(text(),'Setup Remaining')]")
		private WebElement setuptablename;

		@FindBy(how=How.XPATH,using="//th[@id='setupschool_c0']/a[contains(text(),'School Name')]")
		private WebElement tablenameschool;

		@FindBy(how=How.XPATH,using="//h1[text()='Average Demonstrated']")
		private WebElement avgtiletitle;

		@FindBy(how=How.XPATH,using="//th/span[contains(text(),'CURRENT')]")
		private WebElement currenttexttile;

		@FindBy(how=How.XPATH,using="//th[@class='custom-progress-title small' and contains(text(),'30 DAYS AGO')]")
		private WebElement Thirtydaysagotitle;

		@FindBy(how=How.XPATH,using="//a[@class='text_decoration_no_hover thumb-bt-link' and contains(text(),'View Detailed Progress')]")
		private WebElement viewdetailedlink;

		@FindBy(how=How.XPATH,using="//div[@class='custom-progress-bar']")
		private WebElement progressbar;

		@FindBy(how=How.XPATH,using=" //h1[@class='title']")
		private WebElement schoolprogresspage;

		@FindBy(how=How.XPATH,using="//*[@id='setupschool_c0']/a/i")
		private WebElement schoolname;

		@FindBy(how=How.XPATH,using="//*[@id='setupschool_c1']/a/i")
		private WebElement teachername;

		@FindBy(how=How.XPATH,using="//*[@id='setupschool_c2']/a/i")
		private WebElement classname;

		@FindBy(how=How.ID,using="setupschool_c3")
		private WebElement trainedthisyear;

		@FindBy(how=How.XPATH,using="//*[@id='setupschool_c4']/a/i")
		private WebElement visitedinsights;

		@FindBy(how=How.ID,using="setupschool_c5")
		private WebElement childrenadded;

		@FindBy(how=How.XPATH,using="//*[@id='setupschool_c6']/a/i")
		private WebElement withparent;

		@FindBy(how=How.XPATH,using="//*[@id='setupschool_c6']/a/i")
		private WebElement withphotos;

		@FindBy(how=How.XPATH,using="//*[@id='setupschool_c8']/a/i")
		private WebElement startedplay;

		@FindBy(how=How.XPATH,using="//span[@class='progress greenbg ']")
		private WebElement currentprogressbar;

		@FindBy(how=How.XPATH,using="//span[@class='progress greenbg small']")
		private WebElement anotherprogressbar;

		@FindBy(how=How.XPATH,using="//div/h6[text()='School Utilization']")
		private WebElement schoolutilizationtable;

		@FindBy(how=How.ID,using="org_utilization_report_c0')]")
		private WebElement setupschoolname;

		@FindBy(how=How.ID,using="org_utilization_report_c1")
		private WebElement setupclassesname;

		@FindBy(how=How.ID,using="org_utilization_report_c2")
		private WebElement setupactivechildname;

		@FindBy(how=How.XPATH,using="//*[@id='org_utilization_report_c3']/a")
		private WebElement setupgolddocsent;

		@FindBy(how=How.ID,using="org_utilization_report_c5")
		private WebElement setuploginperclass;

		@FindBy(how=How.ID,using="org_utilization_report_c7")
		private WebElement setupchildplaytime;

		@FindBy(how=How.ID,using="org_utilization_report_c8")
		private WebElement setupchildsession;

		@FindBy(how=How.ID,using="org_utilization_report_c9")
		private WebElement setupchildskilllevel;

		@FindBy(how=How.XPATH,using="//*[@id='setupschool']/table/tbody/tr[2]/td[1]/a")
		private WebElement schoolnameclick;

		@FindBy(how=How.XPATH,using="//h1[@class='title']")
		private WebElement classsetuptitle;

		@FindBy(how=How.XPATH,using="//h6[contains(text(),'Setup Remaining')]")
		private WebElement classsetupremainingtitle;

		@FindBy(how=How.XPATH,using="//select[@id='setup_remaining_table_id']")
		private WebElement setupschooldropdown;

		@FindBy(how=How.XPATH,using="//th[@id='class_report_c0']/a[contains(text(),'Class')]")
		private WebElement classsetupclassname;

		@FindBy(how=How.ID,using="class_report_c1")
		private WebElement classsetupteachername;

		@FindBy(how=How.ID,using="class_report_c2")
		private WebElement classsetuptrainedthisyear;

		@FindBy(how=How.ID,using="class_report_c3")
		private WebElement classsetupvisitedinsights;

		@FindBy(how=How.ID,using="class_report_c4")
		private WebElement classsetupchildern;

		@FindBy(how=How.ID,using="class_report_c5")
		private WebElement classsetupwithparent;

		@FindBy(how=How.ID,using="class_report_c6")
		private WebElement classsetupwithphotos;

		@FindBy(how=How.ID,using="class_report_c7")
		private WebElement classsetupstartedplay;

		@FindBy(how=How.XPATH,using="//h6[contains(text(),'Class Utilization')]")
		private WebElement classutilizationheader;

		@FindBy(how=How.XPATH,using="//select[@id='class_utilization_id']")
		private WebElement utilizationschooldropdown;

		@FindBy(how=How.ID,using="school_utilization_report_c0")
		private WebElement utilizationclassname;

		@FindBy(how=How.ID,using="school_utilization_report_c1")
		private WebElement utilizationgolddoc;

		@FindBy(how=How.ID,using="school_utilization_report_c3")
		private WebElement utilizationteacher;

		@FindBy(how=How.ID,using="school_utilization_report_c4")
		private WebElement utilizationreportslogin;

		@FindBy(how=How.ID,using="school_utilization_report_c5")
		private WebElement utilizationlastreportslogin;

		@FindBy(how=How.ID,using="school_utilization_report_c7")
		private WebElement utilizationchildplaytime;

		@FindBy(how=How.ID,using="school_utilization_report_c8")
		private WebElement utilizationchildsession;

		@FindBy(how=How.ID,using="school_utilization_report_c9")
		private WebElement utilizationskilllevel;



		public DashboardPanelPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			sel = new Selenium(driver);
			selUtil = new Selenium(driver);
		}

		public void verifyPagetitle(String title)
		{
			selUtil.waitUntilElementIsPresentOnPage(10, setuptitle);
			String actualtitle= setuptitle.getText();
			Assert.assertEquals(actualtitle, title);
			System.out.println("Page name is displayed as"+actualtitle);

		}
		public void clickOnIgniteTile()
		{	selUtil.waitUntilElementIsPresentOnPage(20, ignitetiletitle);
			ignitetiletitle.click();
		}
		public void verifyIgnitByHatchText(String tilename)
		{
			selUtil.hardWait(5);
			String actualname=ignitebyhatchtext.getText();
			Assert.assertTrue(actualname.contains(tilename));
			System.out.println("Tile name displayed as"+actualname);
		}

		public void verifyNumberofSchools(String totalnumberofschool)
		{
            String actualschoolcount= schoolnameforschools.getText();
            Assert.assertTrue(schoolnameforschools.isDisplayed());

			System.out.println("school count displayed as" +actualschoolcount);

		}
		public void verifyNumberOfClasses(String numberofschoolforclasses)
		{
			String actualclasscount= classnameforschools.getText();
			Assert.assertTrue(classnameforschools.isDisplayed());
			System.out.println("Class count is displayed as"+actualclasscount);
		}

	   public void verifyTableName(String tablename)
	   {
		   selUtil.waitUntilElementIsPresentOnPage(10, setuptablename);
		   String actualtablename=setuptablename.getText();
		   Assert.assertEquals(actualtablename, tablename);
		   System.out.println("Table name displayed as"+actualtablename);
	   }
	   public void verifyAverageTitle(String tilename)
	   {
		   selUtil.hardWait(5);
		   String actualtitle=avgtiletitle.getText();
		   Assert.assertTrue(actualtitle.contains(tilename));
		   System.out.println("Title name displayed as"+tilename);
	   }
	   public void verifyCurrentTileProgressBar(String current)
	   {
		   String actualbarname=currenttexttile.getText();
		   Assert.assertEquals(actualbarname, current);
		   System.out.println("Progress Bar name displayed as"+actualbarname);
		   selUtil.isElementExists(currentprogressbar);

	   }
	   public void verifyThirtyTileProgreeBar(String Thirtydaysago)
	   {
		   String actualprogressbar=Thirtydaysagotitle.getText();
		   Assert.assertEquals(actualprogressbar, Thirtydaysago);
		   System.out.println("Progress Bar name is "+actualprogressbar);
		   selUtil.isElementExists(anotherprogressbar);
	   }
	  public void verifyViewDetailedLink(String viewdetailedprogress)
	  {
		  String actuallinkname=viewdetailedlink.getText();
		  Assert.assertEquals(actuallinkname, viewdetailedprogress);
		  System.out.println("Link name displayed as"+actuallinkname);
		  Assert.assertTrue(progressbar.isDisplayed());
	  }
	  public void clickOnDetailedProgress()
	  {		
		  selUtil.waitUntilElementIsPresentOnPage(20, viewdetailedlink);
		  viewdetailedlink.click();
	  }
	  public void verifySchoolProgressPage(String schoolprogress)
	  {
		  selUtil.waitUntilElementIsPresentOnPage(10, schoolprogresspage);
		  String actualpagename=schoolprogresspage.getText();
		  Assert.assertEquals(actualpagename, schoolprogress);
		  System.out.println("Page name displayed as"+actualpagename);
		  String strUrl = driver.getCurrentUrl();
	      System.out.println("Current Url is:"+ strUrl);

	  }
	  public void verifyTeachersHeader()
	  {
		  Assert.assertTrue(teachername.isDisplayed(),"The element teachername is not displayed on page");
	  }
	  public void verifySchoolHeader()
	  {
		  Assert.assertTrue(schoolname.isDisplayed(),"The element schoolname is not displayed on page");
	  }
	  public void verifyClassesHeader()
	  {
		  Assert.assertTrue(classname.isDisplayed(),"The element classname is not displayed on page");
	  }
	 public void verifyTrainedThisYear()
	 {
		 Assert.assertTrue(trainedthisyear.isDisplayed(),"The element trainedthisyear is not displayed on page");
	 }
	 public void verifyVisitedInsights()
	 {
		 Assert.assertTrue(visitedinsights.isDisplayed(),"The element visitedinsights is not displayed on page");
	 }
	 public void verifyChildrenAdded()
	 {
		 Assert.assertTrue(childrenadded.isDisplayed(),"The element childrenadded is not displayed on page");
	 }
	 public void verifyWithparents()
	 {
		 Assert.assertTrue(withparent.isDisplayed(),"The element withparent is not displayed on page");
	 }
	 public void verifyWithPhotos()
	 {
		 Assert.assertTrue(withphotos.isDisplayed(),"The element withphotos is not displayed on page");
	 }
	 public void verifyStartedPlay()
	 {
		 Assert.assertTrue(startedplay.isDisplayed(),"The element startedplay is not displayed on page");
	 }
	 public void verifySetupSchoolname()
	 {
		 Assert.assertTrue(setupschoolname.isDisplayed(),"The element setupschoolname is not displayed on page");
	 }
	 public void verifySetupClassname()
	 {
		 Assert.assertTrue(setupclassesname.isDisplayed(),"The element setupclassname is not displayed on page");
	 }
	 public void verifyActiveChildren()
	 {
		 Assert.assertTrue(setupactivechildname.isDisplayed(), "The element setupactivechildname is not displayed on page");
	 }
	 public void verifyGoldDocsSent()
	 {
		 boolean headerresult = sel.isElementExists(5, setupgolddocsent);
			if (headerresult)
			{
				Assert.assertTrue(setupgolddocsent.isDisplayed());
				System.out.println("This org is TSg enabled");
			}
			else
			{
				System.out.println("This Org Is not TSG enabled");

			}

	 }
	 public void verifyLoginperClas()
	 {
		 Assert.assertTrue(setuploginperclass.isDisplayed(), "The element setupgolddocsent is not displayed on page");
	 }
	 public void verifyChildPlaytime()
	 {
		 Assert.assertTrue(setupchildplaytime.isDisplayed(), "The element setupchildplaytime is not displayed on page");
	 }
	 public void verifyChildSession()
	 {
		 Assert.assertTrue(setupchildsession.isDisplayed(), "The element setupchildsession is not displayed on page");
	 }
	 public void verifyChildSkilllevel()
	 {
		 Assert.assertTrue(setupchildskilllevel.isDisplayed(), "The element setupchildskilllevel is not displayed on page");
	 }
	 public void verifySchoolUtilizationName(String headertablename)
	 {
		 String actualheadername=schoolutilizationtable.getText();
		 Assert.assertEquals(actualheadername, headertablename);
		 System.out.println("Table name displayed as"+actualheadername);
	 }
	 public void clickOnSchoolName()
	 {
		 schoolnameclick.click();
	 }
	 public void verifyClassSetupTitle(String setuptitle)
	 {
		 selUtil.waitUntilElementIsPresentOnPage(5, classsetuptitle);
		 String actualtitlename=classsetuptitle.getText();
		 Assert.assertEquals(actualtitlename, setuptitle);
		 System.out.println("Page title displayed as"+actualtitlename);
	 }
	 public void seeSetupSchooldropdown(String schooldropdown)
	 {
		 Select selectSchool=new Select(setupschooldropdown);
		  selectSchool.selectByVisibleText(schooldropdown);
		  setupschooldropdown.click();
	 }
	 public void verifySetupTitle(String header1)
	 {
		 String actualheader=classsetupremainingtitle.getText();
		 Assert.assertEquals(actualheader, header1);
		 System.out.println("Table name is displayed as"+actualheader);
	 }
	 public void verifySetupClassHeader()
	 {
		 Assert.assertTrue(classsetupclassname.isDisplayed(),"The element classsetupclassname is not displayed on page");
	 }
	 public void verifySetupTeacherHeader()
	 {
		 Assert.assertTrue(classsetupteachername.isDisplayed(),"The element classsetupteachername is not displayed on page");
	 }
	 public void verifySetupTrainedThisYearHeader()
	 {
		 Assert.assertTrue(classsetuptrainedthisyear.isDisplayed(),"The element classsetuptrainedthisyear is not displayed on page");
	 }
	 public void verifySetupVisitedInsights()
	 {
		 Assert.assertTrue(classsetupvisitedinsights.isDisplayed(),"The element classsetupvisitedinsights is not displayed on page");
	 }
	 public void verifySetupChildernHeader()
	 {
		 Assert.assertTrue(classsetupchildern.isDisplayed(),"The element classsetupchildern is not displayed on page");
	 }
	 public void verifySetupWithParentHeader()
	 {
		 Assert.assertTrue(classsetupwithparent.isDisplayed(),"The element classsetupwithparent is not displayed on page");
	 }
	 public void verifySetupWithPhotosHeader()
	 {
        sel.hardWait(2);
		 Assert.assertTrue(classsetupwithphotos.isDisplayed(),"The element classsetupwithphotos is not displayed on page");
	 }
	 public void verifySetupStartedPlayHeader()
	 {
		 Assert.assertTrue(classsetupstartedplay.isDisplayed(),"The element classsetupstartedplay is not displayed on page");
	 }
	 public void verifyClassUtilizationHeader(String header2)
	 {
		 String actualTablename=classutilizationheader.getText();
		 Assert.assertEquals(actualTablename,header2);
		 System.out.println("Table name is displayed as"+actualTablename);
	 }
	 public void seeUtilizationSchoolDropdown(String classutilizationdropdown)
	 {
		  Select selectSchool=new Select(utilizationschooldropdown);
		  selectSchool.selectByIndex(2);
		  utilizationschooldropdown.click();
	 }
	 public void verifyClassUtilizationClassHeader()
	 {
		 Assert.assertTrue(utilizationclassname.isDisplayed(), "The element utilizationclassname is not displayed on page");
	 }
	 public void verifyClassUtilizationGoldHeader()
	 {
		 boolean headerresult = sel.isElementExists(5, utilizationgolddoc);
			if (headerresult)
			{
				sel.hardWait(2);
				Assert.assertTrue(utilizationgolddoc.isDisplayed());
				System.out.println("This org is TSg enabled");
			}
			else
			{
				System.out.println("This Org Is not TSG enabled");

			}

	 }
	 public void verifyClassUtilizationTeacherHeader()
	 {
		 Assert.assertTrue(utilizationteacher.isDisplayed(),"The element utilizationteacher is not displayed on page");
	 }
	 public void verifyClassUtilizationReportsLogin()
	 {
		 Assert.assertTrue(utilizationreportslogin.isDisplayed(),"The element utilizationreportslogin is not displayed on page");
	 }
	 public void verifyClassUtilizationReportsLastLoginHeader()
	 {
		 Assert.assertTrue(utilizationlastreportslogin.isDisplayed(),"The element utilizationlastreportslogin is not displayed on page");
	 }
	 public void verifyClassClassUtilizationChildPlaytimeHeader()
	 {
		 Assert.assertTrue(utilizationchildplaytime.isDisplayed(),"The element utilizationchildplaytime is not displayed on page");
	 }
	 public void verifyClassUtilizationChildSessionHeader()
	 {
		 Assert.assertTrue(utilizationchildsession.isDisplayed(),"The element utilizationchildsession is not displayed on page");
	 }
	 public void verifyClassUtilizationSkillLevelHeader()
	 {
		 Assert.assertTrue(utilizationskilllevel.isDisplayed(),"The element utilizationskilllevel is not displayed on page");
//		 selUtil.waitUntilElementIsPresentOnPage(5, utilizationskilllevel);
		 selUtil.getNonStaleElement(7, utilizationskilllevel);
	 }
}



