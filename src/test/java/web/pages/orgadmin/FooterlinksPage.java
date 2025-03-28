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

public class FooterlinksPage extends BaseClass {

	// Scenario 1:Back button
	public WebDriver driver;
	public Selenium selUtil;

	@FindBy(how = How.XPATH, using = "//a[@class='ghosthover backbtn']")
	private WebElement Back;

	@FindBy(how = How.XPATH, using = "//h1[@class='title']")
	private WebElement T1;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,!')]")
	private WebElement T2;

	// Scenario 2 :Footerlinks

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome, !')]")
	private WebElement dashboardpage;

	@FindBy(how = How.LINK_TEXT, using = "Privacy Policy")
	private WebElement policies;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Terms Of')]")
	private WebElement Termsofuse;

	@FindBy(how = How.LINK_TEXT, using = "HatchEarlyLearning.com")
	private WebElement Hatchearly;

	@FindBy(how = How.XPATH, using = "//*[@id='hs_cos_wrapper_widget_1623872146573']/header/div/h1/span")
	private WebElement WelcomeHatch;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Online Privacy Policy']")
	private WebElement policy_title;

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Terms of Use')]")
	private WebElement Termsofuse_title;

	// Scenario 3 :SkillSupport-support needed

	@FindBy(how = How.XPATH, using = "/html/body/nav/div/ul/li[4]/a")
	private WebElement SkillSupport;

	@FindBy(how = How.LINK_TEXT, using = "Support Needed")
	private WebElement SupportNeeded;

	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Support Needed']")
	private WebElement Supportneededheading;

	// Scenario 4 :Skillsupport-Recommended Circular experiences

	@FindBy(how = How.LINK_TEXT, using = "Recommended Curricular Experiences")
	private WebElement Curricular;

	@FindBy(how = How.XPATH, using = "//h1[@class='title']")
	private WebElement curriculartitle;

	// Scenario 1:Back button

	public void see_Title_page(String Title) {
		selUtil.waitUntilElementIsPresentOnPage(7, T1);
		String actualTitlefield = T1.getText();
		Assert.assertEquals(actualTitlefield, Title);
		System.out.println("Title found as  " + actualTitlefield);
	}

	public void click_on_backbutton()
	{
		selUtil.waitUntilElementIsPresentOnPage(20, Back);
		Back.click();
	}

	//// Scenario 2 :Footerlinks

	public FooterlinksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		new Selenium(driver);
		selUtil = new Selenium(this.driver);
	}

	public void Click_privacy_policy(String ExpectedPolicyTitle)
	{

		selUtil.waitUntilElementIsPresentOnPage(60, policies);
//		driver.navigate().refresh();
		selUtil.waitUntilElementIsPresentOnPage(20, policies);
		policies.click();

		// verify the privacy policy title
		String actual_policy_text = policy_title.getText();
		Assert.assertEquals(actual_policy_text, ExpectedPolicyTitle);
		System.out.println("Title found as  " + actual_policy_text);
		selUtil.hardWait(3);
		driver.navigate().back();
	}

	public void Click_terms_of_use(String ExpectedTermTitle)
	{
		selUtil.waitUntilElementIsPresentOnPage(60, Termsofuse);
		selUtil.getAction().moveToElement(Termsofuse).perform();
		Termsofuse.click();

		// verify the TermofuseTitle
		selUtil.waitUntilElementIsPresentOnPage(7, Termsofuse_title);
		String ActualTermstitle = Termsofuse_title.getText();
		Assert.assertEquals(ActualTermstitle, ExpectedTermTitle);
		System.out.println("Title found as  " + ActualTermstitle);
		//selUtil.waitUntilElementIsPresentOnPage(20, Back);
		driver.navigate().back();
	}

	public void Click_hatch_early_learning(String ExpectedTitle) {
		// Load the website
		// selUtil.waitUntilElementIsPresentOnPage(20, Hatchearly);
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

			}

		}
		selUtil.hardWait(3);
		driver.close();
		System.out.println("New tab is closed");
		// switch to the parent window
		driver.switchTo().window(parent);

	}

	// Scenario 3 :SkillSupport-support needed

	public void see_Support_page(String Support_Title)
	{
		selUtil.hardWait(5);
		boolean issupportneededactive=selUtil.isElementExists(20,Supportneededheading);
		if(issupportneededactive)
		{
		String actual_heading = Supportneededheading.getText();
		Assert.assertEquals(actual_heading, Support_Title);
		System.out.println("Title found as  " + actual_heading);
		// selUtil.waitUntilElementIsPresentOnPage(20, Back);
		Back.click();
		}
		else
		{
			System.out.println("Support needed Tiles not active for this school admin");
		}
	}

	// Scenario 4 :Skillsupport-Recommended Circular experiences

	public void Dashboardpage(String WelcomeTitle) {

		String actual_text = dashboardpage.getText();
		System.out.println("Before removing text Welcome Title found as  " + actual_text);

		// Removing word after space using regular expression
		String Actual_newText = actual_text.replaceAll(" .+$", "");

		// Comparing string with expected and actual text
		Assert.assertEquals(Actual_newText, WelcomeTitle);
		System.out.println("Dashboard Welcome Title found as  " + Actual_newText);
	}

	public void ClickSkillSupports() {
		SkillSupport.click();
	}

	public void seeCurricularTitle(String recommendecurricular) {
		String actualtitle = curriculartitle.getText();
		Assert.assertEquals(actualtitle, recommendecurricular);
		System.out.println("Title name displayed is" + actualtitle);
		Back.click();
	}
}
