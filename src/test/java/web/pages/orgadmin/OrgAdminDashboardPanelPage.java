package web.pages.orgadmin;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import util.Selenium;

@SuppressWarnings("unused")
public class OrgAdminDashboardPanelPage
{

	private WebDriver driver;
	private Selenium sel;
	public static Selenium selUtil;


public OrgAdminDashboardPanelPage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);

	sel = new Selenium(driver);
	selUtil = new Selenium(this.driver);
}

@FindBy(how = How.XPATH, using = "//*[contains(text(),'Ignite by Hatch')]")
private WebElement select_Ignite_By_Hatch_Utilization;

@FindBy(how = How.XPATH, using = "//h1[text()='Average Demonstrated']")
private WebElement select_Average_Demonstrated_Panel;

@FindBy(how = How.XPATH, using = "//h1[text()='Average Demonstrated']")
private WebElement click_Average_Demonstrated_Panel;

@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/schoolprogress/' and @class='text_decoration_no_hover thumb-bt-link']")
private WebElement orgAdminAverageDemostratedTile;


@FindBy(how = How.XPATH, using = "//a[contains(text(),'View Detailed Progress') and @href='/insightreports/schoolprogress/']")
private WebElement click_ViewDetailedProgress;

@FindBy(how = How.XPATH, using = "//*[contains(text(),'Professional Development')]")
private WebElement select_Professional_Development;

@FindBy(how = How.XPATH, using = "//span[text()=' HATCH INSIGHTS']/parent::*")
private WebElement backToInsight;

@FindBy(how = How.XPATH, using = "//div[@class='white-bg-thumb text-center support-needed mt-0']//*[contains(text(),'Support Needed')]/parent::*")
private WebElement select_Support_Needed;

@FindBy(how = How.XPATH, using = "//*[contains(text(),'Average Play Time')]")
private WebElement select_Average_Play_Time;

@FindBy(how = How.XPATH, using = "//p[contains(text(),'This week children have played on ')]")
private WebElement click_Average_Play_Time_Panel;

@FindBy(how = How.XPATH, using = "//*[contains(text(),'Are You')]")
private WebElement select_Are_You_Gold_User;
//**************************************************************************
//TSG Panel UI

@FindBy(how = How.XPATH, using = "//div[@class='panelnumber']//strong[@class='redtext']")
private WebElement selectPercentageOfChildrenMatched;

@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/HatchSyncConnection']//p[@class='dashp text-center']")
private WebElement selectPercentageOfChildrenMatchedText;

@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/HatchSyncConnection']//span[@class='bluetext']")
private WebElement selectTotalDocumentSent;

@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/HatchSyncConnection']//strong[text()='Total Documents Sent:']")
private WebElement selectTotalDocumentSentText;

@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/HatchSyncConnection']")
private WebElement selectManageHatchSyncConnectionLink;


//*************************************************************************

//NON TSG Panel UI
@FindBy(how = How.XPATH, using = "//a[@href='https://www.hatchearlylearning.com/technology/hatchsync-powered-by-gold']//div[@class='panelaction']")
private WebElement selectGetHatchSyncTodayLink;


@FindBy(how = How.XPATH, using = "//title[text()='Hatch Early Learning | Technology | HatchSync Powered by GOLD']")
private WebElement tsgSiteTitle;

@FindBy(how = How.XPATH, using = "//a[@href='/insightreports/HatchSyncConnection']//h1")
private WebElement tSGTileHeading;

@FindBy(how = How.XPATH, using = "//a[@href='/insightreports' ]/img")
private WebElement hatch_Insight_Logo;

@FindBy(how = How.XPATH, using = "//img[@class='for_default']")
private WebElement hatch_Insight_Logo_Hub;



//***************************************************


public void clickOnHatchInsightLogo()
{   selUtil.waitUntilElementIsPresentOnPage(20, hatch_Insight_Logo);
	hatch_Insight_Logo.click();
}

public void clickOnHatchInsightLogoHub()
{
	selUtil.waitUntilElementIsPresentOnPage(20, hatch_Insight_Logo_Hub);
	hatch_Insight_Logo_Hub.click();
}

public void igniteByHatchUtilizationTilePresent(String expectedIgniteByHatchUtilization)
{
	System.out.println("this is Hatch utilizxatin tile");
	selUtil.waitUntilElementIsPresentOnPage(40, select_Ignite_By_Hatch_Utilization);
	Assert.assertEquals(select_Ignite_By_Hatch_Utilization.getText(), expectedIgniteByHatchUtilization);
}

public void igniteByHatchUtilizationTileClickable()
{
	System.out.println("this is Hatch utilizxatin tile");
	selUtil.waitUntilElementIsPresentOnPage(20, select_Ignite_By_Hatch_Utilization);
	select_Ignite_By_Hatch_Utilization.click();
}

public void averageDemonstratedPanelPresent(String expectedAverageDemonstarted)
{
	selUtil.waitUntilElementIsPresentOnPage(20, select_Average_Demonstrated_Panel);
	Assert.assertTrue(select_Average_Demonstrated_Panel.isDisplayed());
}

public void averageDemonstratedPanelPresentOrgAdmin(String expectedAverageDemonstarted)
{
	selUtil.waitUntilElementIsPresentOnPage(40, orgAdminAverageDemostratedTile);
	orgAdminAverageDemostratedTile.isDisplayed();
	
}

public void averageDemonstratedPanelClickable()
{

	System.out.println("this is average demonstrated panel");
	selUtil.waitUntilElementIsPresentOnPage(40, click_ViewDetailedProgress);
//	click_Average_Demonstrated_Panel.isDisplayed();
	click_ViewDetailedProgress.click();
}

public void professionalDevelopmentPanelPresent(String expectedProfessionalDevelopment)
{
	System.out.println("this is Professional develo0pmemnt tile");
	selUtil.waitUntilElementIsPresentOnPage(20, select_Professional_Development);
	Assert.assertEquals(select_Professional_Development.getText(), expectedProfessionalDevelopment);
}

public void professionalDevelopmentPanelClickable()
{
	System.out.println("this is Professional develo0pmemnt tile");
	selUtil.waitUntilElementIsPresentOnPage(40, select_Professional_Development);
	select_Professional_Development.click();
	selUtil.hardWait(3);
//	backToInsight.click();
}


public void supportNeededPanelPresent(String expectedSupportNeeded)
{
	selUtil.waitUntilElementIsPresentOnPage(20, select_Support_Needed);
	System.out.println(select_Support_Needed.getText()+"This is Support needed panel");
	Assert.assertTrue(select_Support_Needed.getText().contains(expectedSupportNeeded));
}

public void supportNeededPanelClickable()
{
	System.out.println(select_Support_Needed.getText()+"This is Support needed panel");
	selUtil.getAction().moveToElement(select_Support_Needed).perform();
	select_Support_Needed.click();
}

public void averagePlayTimePanelPresent(String expectedAveragePlaytime)
{
	System.out.println("this is playtime panel tile");
	selUtil.waitUntilElementIsPresentOnPage(7, select_Average_Play_Time);
	Assert.assertTrue(select_Average_Play_Time.getText().contains(expectedAveragePlaytime));
}

public void averagePlayTimePanelClickable()
{
	System.out.println("this is playtime panel tile");
	selUtil.waitUntilElementIsPresentOnPage(7, click_Average_Play_Time_Panel);
	click_Average_Play_Time_Panel.click();
}
public void areYouGoldUserTilePresent(String expectedTSG, String expectedAreYouGold)
{

	boolean tsgResult = sel.isElementExists(20, tSGTileHeading);
	if (tsgResult)
	{
		Assert.assertEquals(tSGTileHeading.getText(), expectedTSG);
		System.out.println(tSGTileHeading.getText());
	}
	else
	{
		System.out.println("This Org Is not TSG enabled : " + select_Are_You_Gold_User.getText());
		Assert.assertTrue(select_Are_You_Gold_User.isDisplayed());
	}
}


public void areYouGoldUserTileClickable()
{

	boolean tsgResult = sel.isElementExists(20, tSGTileHeading);
	if (tsgResult)
	{
		tSGTileHeading.click();
	} else {
		System.out.println("This Org Is not TSG enabled : " + select_Are_You_Gold_User.getText());
		Assert.assertTrue(select_Are_You_Gold_User.isDisplayed());
	}
}

//**********************************************************************************************************
//TSG Panel UI

public void seePercentageOfChildrenMatched()
{

	boolean tsgResult = sel.isElementExists(20, selectPercentageOfChildrenMatched);
	if (tsgResult)
	{
		selectPercentageOfChildrenMatched.isDisplayed();
		selectPercentageOfChildrenMatchedText.isDisplayed();
		System.out.println(selectPercentageOfChildrenMatched.getText()+""+selectPercentageOfChildrenMatchedText.getText());
	}
	else
	{
		System.out.println("This Org Is not TSG enabled : " + select_Are_You_Gold_User.getText());
		Assert.assertTrue(select_Are_You_Gold_User.isDisplayed());
	}
}

public void seeTotalDocumentSent()
{

	boolean tsgResult = sel.isElementExists(20, selectTotalDocumentSent);
	if (tsgResult)
	{
		selectTotalDocumentSent.isDisplayed();
		selectTotalDocumentSentText.isDisplayed();
		System.out.println(selectTotalDocumentSentText);
	}
	else
	{
		System.out.println("This Org Is not TSG enabled : " + select_Are_You_Gold_User.getText());
		Assert.assertTrue(select_Are_You_Gold_User.isDisplayed());
	}
}

public void seeManageHatchSyncConnectionLink(String expectedManageHatchSyncLink)
{
	boolean tsgResult = sel.isElementExists(20, selectManageHatchSyncConnectionLink);
	if (tsgResult)
	{
		selectManageHatchSyncConnectionLink.isDisplayed();
		Assert.assertEquals(expectedManageHatchSyncLink, selectManageHatchSyncConnectionLink.getText());
		System.out.println(selectManageHatchSyncConnectionLink.getText());
	}
	else
	{
		System.out.println("This Org Is not TSG enabled : " + select_Are_You_Gold_User.getText());
		Assert.assertTrue(select_Are_You_Gold_User.isDisplayed());
	}
}

public void seeNonTSGLink(String expectedManageHatchSyncLink)
{
	boolean tsgResult = sel.isElementExists(20, selectManageHatchSyncConnectionLink);
	if (tsgResult)
	{
		selectManageHatchSyncConnectionLink.isDisplayed();
		Assert.assertEquals(expectedManageHatchSyncLink, selectManageHatchSyncConnectionLink.getText());
		System.out.println(selectManageHatchSyncConnectionLink.getText());
	}
	else
	{
		System.out.println("This Org Is not TSG enabled : " + select_Are_You_Gold_User.getText());
		Assert.assertTrue(select_Are_You_Gold_User.isDisplayed());
	}
}


//***********************************************************************************************************
//Non TSG ORG TSG Panel

public void seeNonTSGHeader(String expectedNonTSGTileHeader)
{
	boolean tsgResult = sel.isElementExists(60, select_Are_You_Gold_User);
	if (tsgResult==true)
	{

		selUtil.getAction().moveToElement(select_Are_You_Gold_User).perform();
		System.out.println("This Org Is not TSG enabled : " + select_Are_You_Gold_User.getText());
		Assert.assertTrue(select_Are_You_Gold_User.getText().contains(expectedNonTSGTileHeader));
	}
	else
	{
		selUtil.getAction().moveToElement(selectManageHatchSyncConnectionLink).perform();
		System.out.println("This Org is TSG enabled");
	}
}


public void seeGetHatchSyncTodayLink(String expectedGetHatchSyncTodayLink)
{
	boolean tsgResult = sel.isElementExists(20, selectGetHatchSyncTodayLink);
	if (tsgResult==true)
	{

		System.out.println("This Org Is not TSG enabled : " + select_Are_You_Gold_User.getText());
		Assert.assertEquals(selectGetHatchSyncTodayLink.getText(), expectedGetHatchSyncTodayLink);
	}
	else
	{
		selUtil.getAction().moveToElement(selectManageHatchSyncConnectionLink).perform();
		System.out.println("This Org is TSG enabled");
	}
}

public void clickGetHatchSyncTodayLink()
{
	boolean tsgResult = selUtil.isElementExists(20, selectGetHatchSyncTodayLink);
	if (tsgResult==true)
	{
		selUtil.getAction().moveToElement(selectGetHatchSyncTodayLink).click().perform();
		System.out.println("This Org Is not TSG enabled : ");

		selUtil.hardWait(7);
		Set<String> tsginfo= driver.getWindowHandles();
        Iterator<String> navigatedwin = tsginfo.iterator();
        String parent =navigatedwin.next();
        String child = navigatedwin.next();
        selUtil.getDriver().switchTo().window(child);

		System.out.println(selUtil.getDriver().getTitle());
		System.out.println("This Org Is not TSG enabled : " + selUtil.getDriver().getTitle());
		Assert.assertTrue(true, selUtil.getDriver().getTitle());
		selUtil.getDriver().close();

		selUtil.getDriver().switchTo().window(parent);
	}
	else
	{
		selUtil.getAction().moveToElement(selectManageHatchSyncConnectionLink).perform();
		System.out.println("This Org is TSG enabled");
	}
}
//
}
