package web.pages.orgadmin;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import util.Selenium;
import web.stepdefs.BaseClass;

public class OrgAdminResourcesPage extends BaseClass {

		public String parentWindow = driver.getWindowHandle();

		@FindBy(how = How.XPATH, using = "//a[@class='ghosthover backbtn']")
		private WebElement Back;

		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Click Here For Back To School Resources')]")
		private WebElement actualHelpCenterAndKnowldegBaseWE;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Hatch On-Demand Webinars')]")
		private WebElement actualWebinarPageWE;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Engaging Content & Proven Results')]")
		private WebElement actualVideosPagetitleWE;

		@FindBy(how = How.XPATH, using = "//h1[text()='Discussion']")
		private WebElement actualDiscussionBoardtitleWE;

		@FindBy(how = How.XPATH, using = "//h1[text()='Your Hatch Knowledge Base']")
		private WebElement actualHatchHubtitleWE;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Digital Learning Tools Backed by Research')]")
		private WebElement actualResearchtitleWE;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Alignments & Correlations')]")
		private WebElement alignmentsStandardsWE;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Success Stories & Partnerships')]")
		private WebElement successStoriesWE;
		
		@FindBy(how = How.XPATH, using = "//h1[contains(text(),'The Hatch Early Learning Blog')]")
		private WebElement blogWE;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Professional Development')]")
		private WebElement ProffesionalTitleWE;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Product Training')]")
		private WebElement productTrainingTitleWE;
		
		@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Introducing IgniteTable by Hatch™ (Previously WePl')]")
		private WebElement IGTGetingStartedTitleWE;
		
		@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Submit a request')]")
		private WebElement SubmitTicketTitleWE;
		
		@FindBy(how = How.XPATH, using = "//h1[text()='Product Guides']")
		private WebElement actualPDFAndPrintableTitleWE;

		@FindBy(how=How.XPATH,using="//h1[@class='title']")
		private WebElement pagetitle;


		public OrgAdminResourcesPage(WebDriver driver)
		{
			BaseClass.driver = driver;
			PageFactory.initElements(driver, this);
			selUtil = new Selenium(BaseClass.driver);
		}


		public void navigateBackToHomePage()
		{
			selUtil.hardWait(10);
			driver.navigate().back();
		}
		public void whatDoesItMeanToIgnite(String expectedWhatdoesitmeantoignitePageTitle)
		{
			selUtil.hardWait(7);
			String actualWhatDoesitMeanByIgnite=driver.getTitle();
			System.out.println(actualWhatDoesitMeanByIgnite);
			Assert.assertEquals("Login",actualWhatDoesitMeanByIgnite);
		}

		public void pDFAndPrintable(String expectedPDFAndPrintablePagetitle)
		{
			String parent = driver.getWindowHandle();
			selUtil.hardWait(5);
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        	driver.switchTo().window(ChildWindow);

			String actualPDFAndPrintableTitle= actualPDFAndPrintableTitleWE.getText();
			System.out.println(actualPDFAndPrintableTitle);
			Assert.assertTrue(actualPDFAndPrintableTitle.contains(expectedPDFAndPrintablePagetitle));

			driver.close();

			System.out.println("Child window closed");
        	driver.switchTo().window(parent);
	        }
	        }
		}
		public void helpCenterKnowldegeBase(String expectedHelpCenterAndKnowldegBasePage)
		{
			String parent = driver.getWindowHandle();
			selUtil.hardWait(5);
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        	driver.switchTo().window(ChildWindow);

			String actualHelpCenterAndKnowldegBase= actualHelpCenterAndKnowldegBaseWE.getText();
			System.out.println(actualHelpCenterAndKnowldegBase);
			Assert.assertTrue(actualHelpCenterAndKnowldegBase.contains(expectedHelpCenterAndKnowldegBasePage));

			driver.close();

			System.out.println("Child window closed");
        	driver.switchTo().window(parent);
	        }
	        }
		}

		public void theHatchHub(String expectedHatchHubTitle)
		{
			String parent = driver.getWindowHandle();
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        	selUtil.getDriver().switchTo().window(ChildWindow);

	        	String actualHatchHubtitle=  actualHatchHubtitleWE.getText();
	        	System.out.println(actualHatchHubtitle);
	        	Assert.assertEquals(actualHatchHubtitle,expectedHatchHubTitle);

	        	driver.close();

	        	System.out.println("Child window closed");
	        	selUtil.getDriver().switchTo().window(parent);
	        }
	        }
		}

		public void closeChildWindowAndBackToParentWindow()
		{
//			String parent = driver.getWindowHandle();
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parentWindow.equalsIgnoreCase(ChildWindow))
	        {
	        	selUtil.getDriver().switchTo().window(ChildWindow);
	        	driver.close();

	        	System.out.println("Child window closed");
	        	selUtil.getDriver().switchTo().window(parentWindow);
	        }
	        }
		}
		public void videosPage(String expectedVideosPageTitle)
		{
			String parent = driver.getWindowHandle();
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        	selUtil.getDriver().switchTo().window(ChildWindow);

	        	String actualVideosPagetitle=  actualVideosPagetitleWE.getText();
	        	System.out.println(actualVideosPagetitle);
	        	Assert.assertEquals(actualVideosPagetitle,expectedVideosPageTitle);

	        	driver.close();

	        	System.out.println("Child window closed");
	        	selUtil.getDriver().switchTo().window(parent);
	        }
	        }
		}
		public void discussionBorad(String expectedDiscussionBoardTitle)
		{
			String parent = driver.getWindowHandle();
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        	selUtil.getDriver().switchTo().window(ChildWindow);

	        	String actualDiscussionBoardtitle= actualDiscussionBoardtitleWE.getText();
	        	System.out.println(actualDiscussionBoardtitle);
	        	Assert.assertTrue(actualDiscussionBoardtitle.contains(expectedDiscussionBoardTitle));

	        	driver.close();

	        	System.out.println("Child window closed");
	        	selUtil.getDriver().switchTo().window(parent);
	        }
	        }
		}

		public void webinarsPage(String expectedWebinars)
		{
			String parent = driver.getWindowHandle();
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        driver.switchTo().window(ChildWindow);

	        String actualWebinarPage=actualWebinarPageWE.getText();
			System.out.println(actualWebinarPage);
			Assert.assertEquals(expectedWebinars,actualWebinarPage);

	        driver.close();
			selUtil.getDriver().switchTo().window(parent);
	        }
	        }
		}
		public void verifyDevicePage(String page)
		{
			String actualname=pagetitle.getText();
			Assert.assertEquals(actualname,page);
			System.out.println("Page name is displayed as"+actualname);
		}
		
		
		public void research_Backed(String expectedReasearchTitle)
		{
			String parent = driver.getWindowHandle();
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        	selUtil.getDriver().switchTo().window(ChildWindow);
	        	Assert.assertEquals(actualResearchtitleWE.getText(),expectedReasearchTitle);
	        	driver.close();
	        	System.out.println("Child window closed");
	        	selUtil.getDriver().switchTo().window(parent);
	        }
	        }
		}
		
		
		public void alignments_Standards(String expectedReasearchTitle)
		{
			String parent = driver.getWindowHandle();
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        	selUtil.getDriver().switchTo().window(ChildWindow);
	        	Assert.assertEquals(alignmentsStandardsWE.getText(),expectedReasearchTitle);
	        	driver.close();
	        	System.out.println("Child window closed");
	        	selUtil.getDriver().switchTo().window(parent);
	        }
	        }
		}


		public void success_Stories(String expectedSuccessTitle) {
			String parent = driver.getWindowHandle();
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        	selUtil.getDriver().switchTo().window(ChildWindow);
	        	Assert.assertEquals(successStoriesWE.getText(),expectedSuccessTitle);
	        	driver.close();
	        	System.out.println("Child window closed");
	        	selUtil.getDriver().switchTo().window(parent);
	        }
	        }
			
		}


		public void blog(String expectedBlogTitle) {
			String parent = driver.getWindowHandle();
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        	selUtil.getDriver().switchTo().window(ChildWindow);
	        	Assert.assertEquals(blogWE.getText(),expectedBlogTitle);
	        	driver.close();
	        	System.out.println("Child window closed");
	        	selUtil.getDriver().switchTo().window(parent);
	        }
	        }
		}


		public void professional_development_page(String expectedSProffesionalTitle) {
			String parent = driver.getWindowHandle();
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        	selUtil.getDriver().switchTo().window(ChildWindow);
	        	Assert.assertEquals(ProffesionalTitleWE.getText(),expectedSProffesionalTitle);
	        	driver.close();
	        	System.out.println("Child window closed");
	        	selUtil.getDriver().switchTo().window(parent);
	        }
	        }
			
		}


		public void paid_product_training(String expectedproductTrainingTitle) {
			String parent = driver.getWindowHandle();
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        	selUtil.getDriver().switchTo().window(ChildWindow);
	        	Assert.assertEquals(productTrainingTitleWE.getText(),expectedproductTrainingTitle);
	        	driver.close();
	        	System.out.println("Child window closed");
	        	selUtil.getDriver().switchTo().window(parent);
	        }
	        }
			
		}


		public void ignite_table_getting_started(String expectedIGTGetingStartedTitle) {
			String parent = driver.getWindowHandle();
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        	selUtil.getDriver().switchTo().window(ChildWindow);
	        	Assert.assertEquals(IGTGetingStartedTitleWE.getText(),expectedIGTGetingStartedTitle);
	        	driver.close();
	        	System.out.println("Child window closed");
	        	selUtil.getDriver().switchTo().window(parent);
	        }
	        }
			
		}


		public void submit_a_support_ticket(String expectedSubmitTicketTitle) {
			String parent = driver.getWindowHandle();
	        Set<String> s = driver.getWindowHandles();
	        for (String ChildWindow : s) {
	        if (!parent.equalsIgnoreCase(ChildWindow))
	        {
	        	selUtil.getDriver().switchTo().window(ChildWindow);
	        	Assert.assertEquals(SubmitTicketTitleWE.getText(),expectedSubmitTicketTitle);
	        	driver.close();
	        	System.out.println("Child window closed");
	        	selUtil.getDriver().switchTo().window(parent);
	        }
	        }
			
		}


	}

