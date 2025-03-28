package web.pages.parent;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import util.Selenium;

public class ParentDashboard
{
	private WebDriver driver;
	private Selenium selUtil;

	@FindBy(how = How.XPATH, using = "//h1[@class= 'welcome-title']")
	private WebElement Page_Title;

	@FindBy (how = How.XPATH, using = "//a[contains(@class, 'navbar-brand insight_logo')]/img[@alt='Hatch Insight']")
    private WebElement insightslogo;

	@FindBy (how = How.XPATH, using = "//a [@id = 'navbarreportsdropdown_dashboard']")
	private WebElement Dashboardmenu;

	@FindBy (how = How.XPATH, using = "//a [@id = 'navbarreportsdropdown_practice_together']")
	private WebElement Practicetogether ;

	@FindBy (how = How.XPATH, using = "//h1[@class='title']")
	private WebElement Practicetogetherpagetile;

	@FindBy (how = How.XPATH, using = "//a [@id = 'navbarreportsdropdown_resources']")
	private WebElement Resources ;

	@FindBy (how = How.XPATH, using = "//a[@href=\'/hc/en-us\']")
	private WebElement Child_Window;

	@FindBy (how = How.XPATH, using = "//a[@href='https://support.hatchearlylearning.com/hc/en-us/categories/360005493472-Ignite-by-Hatch-']")
	private WebElement Help_Center  ;

	@FindBy (how = How.XPATH, using = "//img [@class = 'd-none d-md-block']")
	private WebElement Accountmenu;

	@FindBy (how = How.XPATH, using = "//span[contains(text(),'View Detailed Progress')]//parent::div")
	private List <WebElement> Skilllevelpanel;

	@FindBy (how = How.XPATH, using = "//div[@class ='white-bg-thumb white-tile text-center skill_activity']")
	private WebElement Practicetogetherpanel;

	@FindBy (how = How.XPATH, using = "//img[@id = 'item1']")
	private WebElement Childartwork;

	@FindBy (how = How.XPATH, using = "//a[@href=\"https://www.hatchearlylearning.com\"]")
	private WebElement Htachlearinglink;


	/// Scenario  :Footerlinks

	@FindBy(how = How.LINK_TEXT, using = "HatchEarlyLearning.com")
	private WebElement Hatchearly;

	public ParentDashboard(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(driver);
	}

	public void parentdashboard()
	{
		selUtil.waitUntilElementIsPresentOnPage(10, Page_Title);
		Page_Title.click();
		String actualpagename= Page_Title.getText();
		System.out.println("Parent Dashboard title is "+actualpagename);
	}

	 public void practiceTogether()
	 {
		 Assert.assertTrue(Practicetogether.isDisplayed(),"practiceTogether menu is not display");
		 String actualpagename1 =Practicetogether.getText();
	     System.out.println("Resources menu title is "+actualpagename1);
	 }


	public void childSkillLevelPanel()
	{
		selUtil.hardWait(5);
		for (WebElement childskilllevel:Skilllevelpanel)
		{
			Assert.assertTrue(childskilllevel.isDisplayed(),"Panel is not getting display");
			String actualPanelText = childskilllevel.getText();
			System.out.println("Child Skill level text"+actualPanelText);
		}
	}

	public void Parcticetogetherpanelwithtitle(String expectedPanelText1)
	{
        selUtil.waitUntilElementIsPresentOnPage(60, Practicetogetherpanel);
		Assert.assertTrue(Practicetogetherpanel.isDisplayed());
		String actualPanelText1 = Practicetogetherpanel.getText();
		System.out.println("Child Skill level text"+actualPanelText1);
	}
	public void childArtWork()
	{
		Assert.assertTrue( Childartwork.isDisplayed(),"Artwork is not getting display");
	}

	public void hatchEarlyLearningcomlink(String ExpectedTitle)
	{
        selUtil.waitUntilElementIsPresentOnPage(60, Hatchearly);
		Hatchearly.click();

	// It will return the parent window name as a String
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		for (String child_window : s) {

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				String ActualTitle = driver.switchTo().window(child_window).getTitle();
			    System.out.println("Actual text found as  " + ActualTitle);
				Assert.assertTrue(ActualTitle.contains(ExpectedTitle));

			driver.close();

			 driver.switchTo().window(parent);
			}
	}
}


	public void hatchInsightsLogo()
	{
		selUtil.waitUntilElementIsPresentOnPage(7, insightslogo);
		insightslogo.click();
	}

	public void hatch_support_page(String ExpectedTitle)
	{
		selUtil.hardWait(5);
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		for (String ChildWindow : s) {
		if (!parent.equalsIgnoreCase(ChildWindow))
		{
		driver.switchTo().window(ChildWindow);
		System.out.println("Heading of child window is " + Child_Window.getText());
		driver.close();
		System.out.println("Child window closed");
		driver.switchTo().window(parent);
	}
		}
	}

	public void ableToSeePracticeTogetherpage(String Expectedtitle)
	{
		String ActualTitle = Practicetogetherpagetile.getText();
		Assert.assertEquals(ActualTitle,Expectedtitle );
		System.out.println("I able to see Practice Together page" +ActualTitle);
	}
}









