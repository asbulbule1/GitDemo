package web.pages.teacher;

import java.util.List;

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
import web.pages.CommonPage;
import web.stepdefs.BaseClass;

@SuppressWarnings("unused")
public class TeacherDashboardPage extends BaseClass
{
	private WebDriver driver;
	private Selenium sel;
	private Selenium selUtil;
	private CommonPage common=new CommonPage(driver);

	@FindBy(how = How.XPATH, using = "//a/img[@alt='Hatch Insight']")
	private WebElement hatchInsightLogo;

	@FindBy(how = How.XPATH, using = "//a[@class='ghosthover backbtn']")
	private WebElement backButton;

	@FindBy(how = How.XPATH, using = "//h1[text()='Average Demonstrated']//parent::div")
	private WebElement seeAverageDemonstratedSkillProgressPanel;

	@FindBy(how = How.XPATH, using = "//div[@id='needChildPhotosPopup']//button[@class='close']")
    private WebElement ChildPhotosPopupCloseButton;

	@FindBy(how = How.XPATH, using = "(//h5[@class='modal-title'])[2]")
    private WebElement childPopupTitle;

	@FindBy(how = How.XPATH, using="//a/img[@alt='Account']")
	private WebElement accountIcon;

	@FindBy(how = How.XPATH, using="//select[@id='Classroom_classroom_id']")
	private WebElement classDropDown;

	@FindBy(how = How.XPATH, using="//select[@class='tw-col-select']/option")
	private List<WebElement> classlist;

	@FindBy(how = How.XPATH, using = "//body")
    private WebElement clickOnBlankSapace;

	@FindBy(how = How.XPATH, using="//span[text()='Current Ignite Version:']")
	private WebElement currentigniteVersion;

	@FindBy(how = How.XPATH, using="//button[@class='drift-widget-naked-button drift-widget-message-close-button drift-widget-close-button--align-right']")
	private WebElement clickonChatbot;

	@FindBy(how = How.XPATH, using="//div[@class='device-banner-blue']")
	private WebElement checkMyDevices;

	@FindBy(how = How.XPATH, using="//h1[@class='title']")
	private WebElement deviceIgniteVersionTtile;

	@FindBy(how = How.XPATH, using="//h1[@class='title']")
	private WebElement teacherDashboardHatchLogo;

	@FindBy(how=How.XPATH,using="//h1[@class='title']")
	private WebElement pagtitle;

//	Teacher Dashboard Panel

	@FindBy(how = How.XPATH, using="(//h1[text()='Average Demonstrated']//parent::*)[1]")
	private WebElement averageDemonstratedSkillprogress;

	@FindBy(how = How.XPATH, using="(//h1[text()='Ignite Play Schedule']//parent::*)[1]")
	private WebElement 	igniteplaySchedulPanel;

	@FindBy(how = How.XPATH, using="(//h1[text()='Curricular Experiences']//parent::*)[1]")
	private WebElement 	curricularExperiecePanel;

	@FindBy(how = How.XPATH, using="(//h1[text()='Support Needed']//parent::*)[1]")
	private WebElement 	supportNeededPanel;

	@FindBy(how = How.XPATH, using="(//h1[text()='Average Play Time ']//parent::*)[1]")
	private WebElement 	averageplayTimePanel;

	@FindBy(how = How.XPATH, using="(//h1[text()='Teaching Strategies']//parent::*)[1]")
	private WebElement 	teachingStrategiesGOLDPanel;

	@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/HatchSyncConnection']//span[contains(text(),'Manage HatchSync')]")
	private WebElement selectManageHatchSyncConnectionLink;

	@FindBy(how = How.XPATH, using = "//div[@class='panelpadder']/h1")
	private WebElement introducingToHatchHub;

	@FindBy(how = How.XPATH, using = "//footer[@class='row w-100']//span")
	private WebElement seeHatchYearFooter;

	@FindBy(how = How.XPATH, using = "//div[@class='device-banner-blue']")
	private WebElement currentIgniteVersion;

	@FindBy(how = How.XPATH, using = "//a[@href='https://www.hatchearlylearning.com']")
	private WebElement seeHatchEarlylearning;

	@FindBy(how = How.XPATH, using = "//span[@class='contact_span']")
	private WebElement 	contactnumberOnDashboard;

	@FindBy(how = How.XPATH, using = "//p[@class='footerleft']/span/a[contains(text(),'Terms Of')]")
	private WebElement 	seeTearmOIfUse;

	@FindBy(how = How.XPATH, using = "//a[@href='https://www.hatchearlylearning.com/about/policies']")
	private WebElement 	privacyPolicyLink;

	@FindBy(how = How.XPATH, using = "(//a[@href='/insightreports/classprogress/'])[2]")
	private WebElement 	averageDemonstratedPanelLink;

	@FindBy(how = How.XPATH, using = "//h1[text()='Average Demonstrated']//parent::div")
	private WebElement 	averageDemonstratedTile;

	@FindBy(how = How.XPATH, using = "//h1[text()='Ignite Play Schedule']//parent::div/h1")
	private WebElement 	ignitePlayScsduletitle;

	@FindBy(how = How.XPATH, using = "(//a[@href='/insightreports/childplaytime/'])[2]")
	private WebElement 	ignitePlayScsduleLink;

	@FindBy(how = How.XPATH, using = "//h1[text()='Curricular Experiences']")
	private WebElement 	curricularExperienceTitle;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'View Recommended Experiences')]")
	private WebElement 	curricularExperienceLink;

	@FindBy(how = How.XPATH, using = "//h1[text()='Support Needed']")
	private WebElement 	supportNeededTileTitle;

	@FindBy(how = How.XPATH, using = "//h1[text()='Support Needed']//parent::div")
	private WebElement 	supportNeededTileLink;

	@FindBy(how = How.XPATH, using = "//h1[text()='Average Play Time ']")
	private WebElement 	averagePlayTimeTileTitle;

	@FindBy(how = How.XPATH, using = "(//a[@href='/insightreports/classplaytime/'])[2]")
	private WebElement 	averagePlayTimeTileLink;

	@FindBy(how = How.XPATH, using = "//h1[text()='Teaching Strategies']")
	private WebElement 	teachingStrategiesGOLDTileTitle;

	@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/languagemismatchchildrens']")
	private WebElement 	teachingStrategiesGOLDLink;

	@FindBy(how = How.XPATH, using = "//h1[text()='Average Demonstrated']")
	private WebElement 	averageDemonstratedTileTitle;

	public TeacherDashboardPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		sel = new Selenium(driver);
		selUtil = new Selenium(driver);
	}

	public void teachHatchInsightLogo()
	{
		Assert.assertTrue(hatchInsightLogo.isDisplayed());
	}

	public void childpopUpDisplayed()
	{
		try
		{
			selUtil.waitUntilElementIsPresentOnPage(10, ChildPhotosPopupCloseButton);
			//close if any popup window opens
			if(ChildPhotosPopupCloseButton.isDisplayed())
			{
				ChildPhotosPopupCloseButton.click();
			}
			else
			{
				System.out.println("popclosebutton not found!");
			}
		}
		catch(Exception e)
		{
			System.out.println("popup not found");
		}

	}

	public void teacherMegaMenu(DataTable expectedMegamenu)
	{
		List<String>expectedMegamenulist = expectedMegamenu.asList();

		   for(String expectedMegaMenu : expectedMegamenulist)
	   {
			   String menu_xpath = "//a[contains(@class, 'nav-link') and contains(text(), 'menuPlaceHolder')]";
			   String level1_xpath = menu_xpath.replace("menuPlaceHolder", expectedMegaMenu);

			   WebElement we_level1 = driver.findElement(By.xpath(level1_xpath));
			   selUtil.getAction().moveToElement(we_level1).perform();
			   System.out.println(we_level1.getText());
			   Assert.assertTrue(we_level1.isDisplayed());
			   Assert.assertEquals(expectedMegaMenu, we_level1.getText());
	   }
		   clickOnBlankSapace.click();
	}

	public void teacherClassDropdown()
	{
		classDropDown.click();
		Select classDropdownlist= new Select(classDropDown);
		int count=0;
		for(WebElement classes:classlist)
		{
			count++;
			System.out.println(classes.getText());
		}
		for(int i=0;i>=count;i++)
		{
		classDropdownlist.selectByIndex(i);
		}
		classDropdownlist.selectByIndex(0);
		System.out.println(classDropdownlist.toString());
		System.out.println(count+" Number of Calsses present fot this teacher");
		Assert.assertTrue(classDropDown.isDisplayed());
		Assert.assertTrue(count<12);
	}

	public void currentIgniteVersionOnDashboard(String expectedCurrentIgniteVersionTitle)
	{
		selUtil.hardWait(3);
		selUtil.getAction().moveToElement(currentigniteVersion).perform();
		String actualCurrentIgniteVersionTitle=currentigniteVersion.getText();
		System.out.println("Actual title Ignite version"+actualCurrentIgniteVersionTitle);
//		Assert.assertTrue(actualCurrentIgniteVersionTitle.contains(expectedCurrentIgniteVersionTitle));
		Assert.assertTrue(actualCurrentIgniteVersionTitle.contains(expectedCurrentIgniteVersionTitle));
	}

	public void clickOnCurrentIgniteversionBar(String expectedCurrentIgniteversionBar)
	{
		selUtil.hardWait(3);
		boolean chatbotpresent=selUtil.isElementExists(20,clickonChatbot);
		if(chatbotpresent)
		{
		clickonChatbot.click();
		}
		else
		{
		selUtil.getAction().moveToElement(checkMyDevices).perform();
//		selUtil.getAction().click(checkMyDevices).perform();
		checkMyDevices.click();
		selUtil.waitUntilElementIsPresentOnPage(10, deviceIgniteVersionTtile);
		String actualDeciveIgniteVersion=deviceIgniteVersionTtile.getText();
		System.out.println(actualDeciveIgniteVersion);
		Assert.assertEquals(actualDeciveIgniteVersion, expectedCurrentIgniteversionBar);
		}
		common.popOnReportPages();
	}
	public void accountIconPresentOnMegaMenu()
	{
		selUtil.waitUntilElementIsPresentOnPage(10, accountIcon);
		selUtil.getAction().moveToElement(accountIcon);
		Assert.assertTrue(accountIcon.isDisplayed());
	}

	public void averageDemonstratedSkillProgressPanel()
	{
		Assert.assertTrue(seeAverageDemonstratedSkillProgressPanel.isDisplayed());
	}
	public void teacherHatchInsightLogo()
	{
		selUtil.waitUntilElementIsPresentOnPage(10, hatchInsightLogo);
		hatchInsightLogo.click();
	}
	public void clickOnBackButton()
	{
		selUtil.waitUntilElementIsPresentOnPage(10, backButton);
		backButton.click();
	}
	public void seeAverageDemonstratedSkillProgress()
	{
		selUtil.hardWait(3);
		averageDemonstratedSkillprogress.click();
		Assert.assertTrue(averageDemonstratedSkillprogress.isDisplayed());
	}
	public void seeIgniteplaySchedulPanel()
	{
		igniteplaySchedulPanel.click();
		Assert.assertTrue(igniteplaySchedulPanel.isDisplayed());
	}
	public void seeCurricularExperiecePanel()
	{
		curricularExperiecePanel.click();
		Assert.assertTrue(curricularExperiecePanel.isDisplayed());
	}
	public void seeSupportNeededPanel()
	{
		supportNeededPanel.click();
		Assert.assertTrue(supportNeededPanel.isDisplayed());
	}
	public void seeAverageplayTimePanel()
	{
		averageplayTimePanel.click();
		Assert.assertTrue(averageplayTimePanel.isDisplayed());
	}
	public void seeTeachingStrategiesGOLDPanel()
	{
		boolean tsgResult = sel.isElementExists(10, teachingStrategiesGOLDPanel);
		if (tsgResult)
		{
			Assert.assertTrue(teachingStrategiesGOLDPanel.isDisplayed());
			System.out.println(teachingStrategiesGOLDPanel.getText());
		}
		else
		{
			System.out.println("Introducing the Hatch Hub! : " + introducingToHatchHub.getText());
			Assert.assertTrue(introducingToHatchHub.isDisplayed());
		}
	}
	public void hatchYearFooter(String expectedHatchYearFooter)
	{
		selUtil.getAction().moveToElement(seeHatchYearFooter).perform();
		Assert.assertTrue(seeHatchYearFooter.isDisplayed());
		String actualHatchYearFooter=seeHatchYearFooter.getText();
		Assert.assertTrue(actualHatchYearFooter.contains(expectedHatchYearFooter));
	}
	public void hatchEarlyLearningLink(String expectedHatchEarlylearningLink)
	{
		selUtil.getAction().moveToElement(seeHatchEarlylearning).perform();
		String actualHatcEarylylearningLink=seeHatchEarlylearning.getText();
		Assert.assertEquals(expectedHatchEarlylearningLink, actualHatcEarylylearningLink);

	}
	public void seeContactnumberonDashboard(String expectedContactNumberLink)
	{
		selUtil.getAction().moveToElement(seeHatchEarlylearning).perform();
		String actualContactNumber=contactnumberOnDashboard.getText();
		Assert.assertTrue(actualContactNumber.contains(expectedContactNumberLink));
	}
	public void seeTearmOfUseLink(String expectedTearmUseLink)
	{
		selUtil.hardWait(3);
		selUtil.getAction().moveToElement(seeTearmOIfUse).perform();
		String actualTearmOfUse=seeTearmOIfUse.getText();
		Assert.assertEquals(expectedTearmUseLink, actualTearmOfUse);
	}
	public void seePrivacyPolicyLink(String expectedPrivacyPolicyLink)
	{
		selUtil.getAction().moveToElement(privacyPolicyLink).perform();
		String actualprivacypolicylink=privacyPolicyLink.getText();
		Assert.assertEquals(expectedPrivacyPolicyLink, actualprivacypolicylink);
	}
	public void currentIgniteVersionBarOnDashboard(String expectedCurrentIgniteVersion)
	{
		String actualCurrentIgniteVesrion=currentIgniteVersion.getText();
		Assert.assertTrue(currentIgniteVersion.isDisplayed());
	}

	public void ClickOnCurrentIgniteBanner()
	{
		selUtil.waitUntilElementIsPresentOnPage(30, currentIgniteVersion);
		selUtil.getAction().moveToElement(currentIgniteVersion).perform();
		currentIgniteVersion.click();
	}

	public void averageDemonstratedPanelOnTeacherrPesent(String expectedAverageDemonstratedTile)
	{
		selUtil.hardWait(5);
		String averageDemonstredtedTileTitle=averageDemonstratedTileTitle.getText();
		System.out.println(averageDemonstredtedTileTitle);
		Assert.assertTrue(averageDemonstredtedTileTitle.contains(expectedAverageDemonstratedTile));
	}
	public void averageDemonstratedPanelOnTeacherrPesent()
	{
		selUtil.waitUntilElementIsPresentOnPage(30, averageDemonstratedPanelLink);
		averageDemonstratedPanelLink.click();
	}

	public void verifyIgnitePlaySchedulePanelOnTeacherPresent(String expectedIgnitePlayScheduleTitle)
	{
		selUtil.waitUntilElementIsPresentOnPage(20, ignitePlayScsduletitle);
		String actualIgnitePlaySchdeuleTilte=ignitePlayScsduletitle.getText();
		System.out.println(actualIgnitePlaySchdeuleTilte);
		Assert.assertEquals(actualIgnitePlaySchdeuleTilte, expectedIgnitePlayScheduleTitle);
	}

	public void verifyIgnitePlaySchedulePanelOnTeacherIsClickable()
	{
//		selUtil.getAction().moveToElement(ignitePlayScsduleLink).click().perform();
		selUtil.waitUntilElementIsPresentOnPage(30, ignitePlayScsduleLink);
		ignitePlayScsduleLink.click();
	}

	public void verifyCurricularExperiencesPanelTeacherPresent(String expectedCurricularExperienceTitle)
	{
		String actualCurricularExperienceTitle=curricularExperienceTitle.getText();
		Assert.assertEquals(actualCurricularExperienceTitle, expectedCurricularExperienceTitle);
	}
	public void verifyCurricularExperiencesPanelOnTeacherIsClickable()
	{
		selUtil.waitUntilElementIsPresentOnPage(20, curricularExperienceLink);
		selUtil.getAction().moveToElement(curricularExperienceLink).perform();
		curricularExperienceLink.click();
	}
	public void supportNeededPanelOnTeacherPresent(String expectedsupportNeededTileTitle)
	{
		
		selUtil.waitUntilElementIsPresentOnPage(10, supportNeededTileTitle);
		String actualSupportNeededTileTitle=supportNeededTileTitle.getText();
		Assert.assertEquals(actualSupportNeededTileTitle, expectedsupportNeededTileTitle);
	}
	public void supportNeededPanelOnTeacherIsClickable()
	{
		boolean supportNeedePresent=selUtil.isElementExists(supportNeededTileLink);
		if(supportNeedePresent)
		{
		supportNeededTileLink.click();
		}
		else
			Assert.assertTrue(true);
	}
	public void averagePlayTimePanelTeacherPresent(String expectedAveragePlayTimePanelTitle)
	{
		String actualAveragePlayTimeTileTitle=averagePlayTimeTileTitle.getText();
		Assert.assertEquals(actualAveragePlayTimeTileTitle, expectedAveragePlayTimePanelTitle);
	}
	public void averagePlayTimePanelTeacherIsClickable()
	{
		selUtil.getAction().moveToElement(averagePlayTimeTileLink).click().perform();
//		averagePlayTimeTileLink.click();
	}
	public void teachingStrategiesGOLDPanelTeacherPresent(String expectedTeachingStrategiesGOLDTileTitle)
	{
		selUtil.hardWait(5);
		boolean tsgTilePresent=selUtil.isElementExists(10,teachingStrategiesGOLDTileTitle);
		if(tsgTilePresent)
		{
			String actualTeachingStrategiesGOLDTileTitle=teachingStrategiesGOLDTileTitle.getText();
			Assert.assertTrue(actualTeachingStrategiesGOLDTileTitle.contains(expectedTeachingStrategiesGOLDTileTitle));
		}
		else
		{
			System.out.println("Introducing the Hatch Hub! : " + introducingToHatchHub.getText());
			Assert.assertTrue(introducingToHatchHub.isDisplayed());
		}
	}
	public void teachingStrategiesGOLDPanelTeacherIsClickable()
	{
		boolean tsgResult = sel.isElementExists(10, teachingStrategiesGOLDLink);
		if (tsgResult)
		{

			teachingStrategiesGOLDLink.isEnabled();
			System.out.println(teachingStrategiesGOLDPanel.getText());
		}
		else
		{
			System.out.println("Introducing the Hatch Hub! : " + introducingToHatchHub.getText());
			Assert.assertTrue(introducingToHatchHub.isDisplayed());
		}
	}
	public void verifyCreateClassPage(String pagename)
	{
		String actualpgname= pagtitle.getText();
		Assert.assertEquals(actualpgname, pagename);
		System.out.println("Page name is displayed as"+actualpgname);
	}
}
