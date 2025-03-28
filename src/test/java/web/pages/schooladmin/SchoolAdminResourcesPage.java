package web.pages.schooladmin;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import util.Selenium;

public class SchoolAdminResourcesPage
{
	private WebDriver driver;
	private Selenium selUtil;

	@FindBy(how=How.LINK_TEXT,using="LEARN")
	private WebElement learnheader;

	@FindBy(how=How.LINK_TEXT,using="DISCUSS")
	private WebElement discussheader;

	@FindBy(how=How.LINK_TEXT,using="MY INFO")
	private WebElement myinfoheader;

	@FindBy(how=How.LINK_TEXT,using="TEAM")
	private WebElement teamheader;

	@FindBy(how=How.LINK_TEXT,using="SUPPORT")
	private WebElement suportheader;

	@FindBy(how=How.XPATH,using="//span[@id='istart_menu_img']")
	private WebElement hatchinsigtsheader;

	@FindBy(how=How.XPATH,using="//span[@class='custom-logged-user']/a")
	private WebElement profilelink;

	@FindBy(how=How.XPATH,using="//a[@class='switch-user-text']")
	private WebElement logoutlink;

	@FindBy(how=How.XPATH,using="//h1[@class='page_heading']")
	private WebElement hatchtitle;

	@FindBy(how=How.XPATH,using="//header[@class='page-header']/h1")
	private WebElement ignitebyhatch;

	@FindBy(how=How.XPATH,using="//a[@class='g-breadcrumbs-item']")
	private WebElement homelink;

	@FindBy(how=How.XPATH,using="//a[@class='toggle igniteBlock']//span")
	private WebElement ignitbyhatchaccordian;

	@FindBy(how=How.XPATH,using="//a[@class='toggle startsmart']//span")
	private WebElement istartsmartaccordian;

	@FindBy(how=How.XPATH,using="//a[@class='toggle weplaysmart']//span")
	private WebElement weplayaccordian;

	@FindBy(how=How.XPATH,using="//a[@class='toggle teachsmart']//span")
	private WebElement techsmartaccordian;

	@FindBy(how=How.XPATH,using="//span[@id='istart_menu_img']")
	private WebElement hatchinsights;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]")
    private WebElement welcomeTitle;

	@FindBy(how=How.XPATH,using="//a[@class='bbp-forum-title']")
	private List<WebElement> listofdiscussion;

	@FindBy(how=How.XPATH,using="//input[@id='bbp_search']")
	private WebElement searchbox;

	@FindBy(how=How.XPATH,using="//input[@id='bbp_search_submit']")
	private WebElement searchbtn;


	public SchoolAdminResourcesPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(driver);
	}
	public void verifyLearnHeader()
	{
		Assert.assertTrue(learnheader.isDisplayed(), "Learn header is not displayed on page");
	}
	public void verifyDicussHeader()
	{
		Assert.assertTrue(discussheader.isDisplayed(), "Discuss header is not displayed on page");
	}
	public void verifyMyinfoHeader()
	{
		Assert.assertTrue(myinfoheader.isDisplayed(),"My info header is not displayed on page");
	}
	public void verifyTeamHeader()
	{
		Assert.assertTrue(teamheader.isDisplayed(), "Team header is not displayed on page");
	}
	public void verifySupportHeader()
	{
		Assert.assertTrue(suportheader.isDisplayed(), "Support header is not displayed on page");
	}
	public void verifyhatchInsightsHeader()
	{
		Assert.assertTrue(hatchinsigtsheader.isDisplayed(), "hatch insights header is not displayed on page");
	}
	public void navigateToChildWindow()
	{
		String mainwindow= driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		for (String ChildWindow : s) {
	        if (!mainwindow.equalsIgnoreCase(ChildWindow))
	            {
	            driver.switchTo().window(ChildWindow);

	            }

		}
	}
	public void verifyPageTitle(String page_title)
	{
		String actualname= hatchtitle.getText();
	    Assert.assertEquals(actualname, page_title);
	    System.out.println("Heading of child window is"+actualname);
	}
	public void clickOnProfileLink()
	{	selUtil.hardWait(5);
		profilelink.click();
	}
	public void verifyProfilePage(String profilepage)
	{
		selUtil.hardWait(3);
		String actualpagename=hatchtitle.getText();
		Assert.assertEquals(actualpagename, profilepage);
		System.out.println("Profile page name is displayed as"+actualpagename);
	}
	public void clickOnHomeLink()
	{
		homelink.click();
	}
	public void seeLogoutLink()
	{
		Assert.assertTrue(logoutlink.isDisplayed(), "Logout link is not displayed on page");
	}
	public void closeChildWindow()
	{
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		for (String ChildWindow : s) {
		if (!parent.equalsIgnoreCase(ChildWindow))
		{
			driver.switchTo().window(ChildWindow);
			System.out.println("Heading of child window is " + welcomeTitle.getText());
			driver.close();
			System.out.println("Child window closed");
			driver.switchTo().window(parent);

	}
	}
	}
	public void verifyProductGuideTitle(String pagename)
	{
		String mainwindow= driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		for(String handles:s)
		{
			if(!mainwindow.equals(handles))
				try
			{
				String text=driver.switchTo().window(handles).getPageSource();
				String actualname=hatchtitle.getText();
				Assert.assertEquals(actualname, pagename);
				System.out.println("Page name found as"+actualname);
				break;

			}
			catch(Exception e)
			{
				driver.switchTo().window(mainwindow);
			}
		}

	}
	public void verifyIgnitebyHatchAccordian()
	{
		Assert.assertTrue(ignitbyhatchaccordian.isDisplayed(), "Ignite by Hatch accordian is not displayed on page");
	}
	public void verifyIStartSmartAccordian()
	{
		Assert.assertTrue(istartsmartaccordian.isDisplayed(),"iStartSmart accordian is not displayed on page");
	}
	public void verifyWePlaySmartAccordian()
	{
		Assert.assertTrue(weplayaccordian.isDisplayed(), "WePlaySmart accordian is not displayed on page");
	}
	public void verifyTeachSmartAccordian()
	{
		Assert.assertTrue(techsmartaccordian.isDisplayed(), "TeachSmart accordian is not displayed on page");
	}
	public void clickOnHatchInsights()
	{
		selUtil.hardWait(5);
		hatchinsights.click();
	}
	public void verifyProductVideosPage(String pgname)
	{

		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		for (String ChildWindow : s) {
		if (!parent.equalsIgnoreCase(ChildWindow))
		{
		driver.switchTo().window(ChildWindow);
		System.out.println("Heading of child window is " + hatchtitle.getText());
		}

	}


	}
	public void verifyExpertWebniarsPage(String title)
	{
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		for (String ChildWindow : s) {
		if (!parent.equalsIgnoreCase(ChildWindow))
		{
		driver.switchTo().window(ChildWindow);
		System.out.println("Heading of child window is " + hatchtitle.getText());
		driver.close();
		System.out.println("Child window closed");
		driver.switchTo().window(parent);
		}
	}
}
	public void verifyIgniteByHatchPage(String Title)
	{
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		for (String ChildWindow : s) {
		if (!parent.equalsIgnoreCase(ChildWindow))
		{
		driver.switchTo().window(ChildWindow);
		System.out.println("Heading of child window is " + ignitebyhatch.getText());
		driver.close();
		System.out.println("Child window closed");
		driver.switchTo().window(parent);
	}
}
	}
	public void verifyListOfDiscussion()
	{
		for(WebElement discussion_list: listofdiscussion)
		{
			String topicname= discussion_list.getText();
			System.out.println("list of discusssion topics is displayed as"+topicname);

		}
	}
	public void verifyDiscussionTitle(String pgname)
	{
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		for (String ChildWindow : s) {
		if (!parent.equalsIgnoreCase(ChildWindow))
		{
		driver.switchTo().window(ChildWindow);
		System.out.println("Heading of child window is " + hatchtitle.getText());


	}
}
	}
		public void searchNameInSearchBox(String searchname)
		{
			searchbox.sendKeys(searchname);

		}
		public void clickOnSearchBtn()
		{
			searchbtn.click();
		}

}
