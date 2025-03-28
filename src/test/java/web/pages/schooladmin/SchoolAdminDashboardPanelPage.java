package web.pages.schooladmin;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import util.Selenium;

public class SchoolAdminDashboardPanelPage
{
	private WebDriver driver;
	private Selenium sel;

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Ignite by Hatch')]")
	private WebElement ignitebyhatchpanel;

	@FindBy(how=How.XPATH,using="//div[@class='white-bg-thumb text-center dashboard-kready-tile']//h1")
	private WebElement avgdemonstartedskillpanel;

	@FindBy(how=How.XPATH,using="//a[@href='/insightreports/schoolprogress/']//span[contains(text(),'View Detailed Report')]")
	private WebElement clickavgskillpanel;

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Professional Development')]")
	private WebElement professionaldevpanel;

	@FindBy(how=How.XPATH,using="//div[@class='white-bg-thumb text-center support-needed']//*[contains(text(),'Support Needed')]/parent::*")
	private WebElement supportneededpanel;

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Average Play Time')]")
	private WebElement avgplaytimepanel;

	@FindBy(how=How.XPATH,using="//h1[@class='mt-0 bluetext' and contains(text(),'Teaching Strategies')]")
	private WebElement teachinggoldpanel;

	@FindBy(how=How.XPATH,using="//a[@href='/insightreports']")
	private WebElement hatchinsights;

	@FindBy(how=How.XPATH,using="//h1[@class='title']")
	private WebElement pagetitle;

	@FindBy(how=How.XPATH,using="//h1[@class='page_heading']")
	private WebElement hatchpgtitle;

	@FindBy(how=How.XPATH,using="//div//span[contains(text(),'View Weekly Status Report')]")
	private WebElement reportlink;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Are You')]")
	private WebElement select_Are_You_Gold_User;

	@FindBy(how=How.XPATH,using="//a[@class='navbar-brand insight_logo']")
	private WebElement hatchlogo;

	@FindBy(how=How.XPATH,using="//span[@class='logout']/a")
	private WebElement logoutbtn;

	@FindBy(how = How.XPATH, using="//a/img[@alt='Account']")
	private WebElement accountIcon;

	@FindBy(how = How.XPATH, using = "//body")
	private WebElement clickOnBlankSapace;

	@FindBy(how=How.XPATH,using="//span[@class='fs-18']")
	private WebElement currentversion;

	@FindBy(how=How.LINK_TEXT,using="HatchEarlyLearning.com")
	private WebElement hatchlearninglink;

	@FindBy(how=How.XPATH,using="//*[@id='insightreports-page']/body/footer/p/span[3]/a")
	private WebElement termsofuselink;

	@FindBy(how=How.XPATH,using="//*[@id='insightreports-page']/body/footer/p/span[4]/a[1]")
	private WebElement privacypolicylink;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Welcome to Hatch!')]")
	private WebElement welcomehatch;

	@FindBy(how=How.XPATH,using="//*[@id='hs_cos_wrapper_dnd_area-module-2_']/h1/span[1]")
	private WebElement hatchlearningpolicies;

	@FindBy(how=How.XPATH,using="//a[@class='ghosthover backbtn']")
	private WebElement backbtn;

	String commonacctxpath= "//div[@class='single-menu-block']//a[contains(text(),'Accountmenu')]";

	public SchoolAdminDashboardPanelPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		sel = new Selenium(driver);

	}

    public void verifyHatchUtlizationPanel(String panel1)
    {
    	String actualpanelname=ignitebyhatchpanel.getText();
    	Assert.assertTrue(actualpanelname.contains(panel1));
    	System.out.println("Panel name is displayed as"+actualpanelname);
    }
    public void clickOnHatchUtilizationPanel()
    {
    	sel.waitUntilElementIsPresentOnPage(20, ignitebyhatchpanel);
    	ignitebyhatchpanel.click();
    }
    public void verifySchoolSetupPage(String pagename)
    {
    	sel.waitUntilElementIsPresentOnPage(20, pagetitle);
    	String actualpgname= pagetitle.getText();
    	Assert.assertEquals(actualpgname, pagename);
    	System.out.println("Page name is displayed as"+actualpgname);
    }
    public void verifyAvgDemoSkillProgressPanel(String panel2)
    {
    	sel.hardWait(5);
    	String actualname=avgdemonstartedskillpanel.getText();
    	Assert.assertTrue(actualname.contains(panel2));
    	System.out.println("Actual panel name displayed as"+actualname);
    }
    public void clickOnAvgDemoSkillProgressPanel()
    {
    	sel.waitUntilElementIsPresentOnPage(20, clickavgskillpanel);
    	clickavgskillpanel.click();
    }
    public void verifySchoolProgressPage(String schpage)
    {
    	sel.waitUntilElementIsPresentOnPage(20, pagetitle);
    	String actualpagename= pagetitle.getText();
    	Assert.assertEquals(actualpagename, schpage);
    	System.out.println("Page name displayed as"+actualpagename);
    }
    public void verifyProfessionalPanel(String panel3)
    {
    	String actualpanelname=professionaldevpanel.getText();
    	Assert.assertEquals(actualpanelname, panel3);
    	System.out.println("Panel name is displayed as"+actualpanelname);
    }
    public void clickOnProfessionalPanel()
    {


    	sel.waitUntilElementIsPresentOnPage(20, professionaldevpanel);
    	professionaldevpanel.click();
    }
    public void verifyHatchKnowledgePage(String hatchpage)
    {
    	sel.waitUntilElementIsPresentOnPage(20, accountIcon);
    	String actualpagename= hatchpgtitle.getText();
    	Assert.assertEquals(actualpagename, hatchpage);
    	System.out.println("Page name is displayed as"+actualpagename);
    }
    public void clickOnHatchInsightsPage()
    {
    	hatchinsights.click();
    }
    public void verifySupportPanel(String panel4)
    {
    	String panelname=supportneededpanel.getText();
    	Assert.assertTrue(panelname.contains(panel4));
    	System.out.println("Panel name is" +panelname);
    }
    public void clickOnSupportPanel()
    {
    	boolean clickresult= sel.isElementExists(20, reportlink);
    	if(clickresult)
    	{
    		Assert.assertTrue(reportlink.isDisplayed(),"Report link is present on page");
    		reportlink.click();

    	}
    	else
    	{
    		System.out.println("Support needed panel is not clickable");
    	}
    }
    public void verifyAvgPlayTimepanel(String panel5)
    {
    	String actualpanelname= avgplaytimepanel.getText();
    	Assert.assertTrue(actualpanelname.contains(panel5));
    	System.out.println("Panel name is displayed as"+actualpanelname);
    }
    public void clickOnAvgPlayTimePanel()
    {
    	avgplaytimepanel.click();
    }
    public void verifySchoolPlayTimepage(String schplaytimepage)
    {
    	sel.waitUntilElementIsPresentOnPage(10, pagetitle);
    	String actualpagename= pagetitle.getText();
    	Assert.assertEquals(actualpagename, schplaytimepage);
    	System.out.println("Page name is displayed as"+actualpagename);
    }
//    public void verifyHatchGoldPanel(String panel6)
//    {
//    	String actualpanelname= teachinggoldpanel.getText();
//        Assert.assertTrue(actualpanelname.contains(panel6));
//    	System.out.println("Panel name is "+actualpanelname);
//    }
    public void verifyTsgNonTsgPanel(String expectedTSGTitle, String expectedNonTSGTitle)
    {

    	boolean tsgResult = sel.isElementExists(20, select_Are_You_Gold_User);
    	if (tsgResult)
    	{

    		System.out.println("This Org Is not TSG enabled : " + select_Are_You_Gold_User.getText());
    		Assert.assertTrue(select_Are_You_Gold_User.getText().contains(expectedNonTSGTitle));
    	}
    	else
    	{
    		String actualpanelname= teachinggoldpanel.getText();
            Assert.assertTrue(actualpanelname.contains(expectedTSGTitle));
        	System.out.println("Panel name is "+actualpanelname);
    	}
    }
    public void clickOnHatchGoldPanel()
    {
    	boolean tsgResult = sel.isElementExists(20, select_Are_You_Gold_User);
    	if (tsgResult)
    	{

    		System.out.println("This Org Is not TSG enabled : " + select_Are_You_Gold_User.getText());
//    		Assert.assertTrue(select_Are_You_Gold_User.getText().contains(expectedNonTSGTitle));
    	}
    	else
    	{
    		sel.waitUntilElementIsPresentOnPage(10, teachinggoldpanel);
        	teachinggoldpanel.click();
    	}

    }
    public void verifyHatchpage(String goldpanelpage)
    {
    	boolean tsgResult = sel.isElementExists(20, select_Are_You_Gold_User);
    	if (tsgResult)
    	{

    		System.out.println("This Org Is not TSG enabled : " + select_Are_You_Gold_User.getText());
//    		Assert.assertTrue(select_Are_You_Gold_User.getText().contains(expectedNonTSGTitle));
    	}
    	else
    	{
    		sel.waitUntilElementIsPresentOnPage(10, pagetitle);
        	String actualpagename= pagetitle.getText();
        	System.out.println("Abhishek " + actualpagename);
            Assert.assertTrue(actualpagename.contains(goldpanelpage));
        	System.out.println("Page name is"+actualpagename);
    	}


    }
    public void verifyHatchLogo()
    {
    	sel.waitUntilElementIsPresentOnPage(10, hatchlogo);
    	Assert.assertTrue(hatchlogo.isDisplayed(),"Hatch logo is not displayed on page");
    }
    public void clickOnHatchLogo()
    {
    	hatchlogo.click();
    }
    public void verifyAccountMenu(DataTable datatable)
    {
        List<String> acctmenulist= datatable.asList();

		for(String expected_menuame:acctmenulist)
		{

			 System.out.println(expected_menuame);
			 seeAccountsubsection(expected_menuame);
		     clickOnBlankSapace.click();
	}
}
    private void seeAccountsubsection(String colName)
    {
    	String accountmenu = commonacctxpath.replace("Accountmenu", colName);
		WebElement accountSubsection = driver.findElement(By.xpath(accountmenu));

		if(accountSubsection.isDisplayed())
		{
			System.out.println( colName + " : "  + accountSubsection.getText());

	    }
	}
    public void clickOnLogout()
    {
    	sel.waitUntilElementIsPresentOnPage(20, logoutbtn);
    	Assert.assertTrue(logoutbtn.isDisplayed());
    }
    public void verifyCuurentVersion()
    {
    	Assert.assertTrue(currentversion.isDisplayed(), "Current version is not displayed on page");
        System.out.println(currentversion.getText());
    }
    public void verifyHatchLearningLink()
    {
    	Assert.assertTrue(hatchlearninglink.isDisplayed(),"Hatch learning link is not displayed on page");
    	String actuallink= hatchlearninglink.getText();
    	System.out.println("Link name is diaplayed as"+actuallink);
    }
    public void verifyTermsOfUseLink()
    {
    	Assert.assertTrue(termsofuselink.isDisplayed(),"Terms of use link is not displayed on page");
    	String actuallinkname=termsofuselink.getText();
    	System.out.println("Link name is"+actuallinkname);
    }
    public void verifyPrivacyPolicyLink()
    {
    	Assert.assertTrue(privacypolicylink.isDisplayed(),"Privacy policy link is not displayed on page");
    	String actualnamelink= privacypolicylink.getText();
    	System.out.println("Actual link name is"+actualnamelink);
    }
    public void clickOnHatchLearning()
    {
    	sel.waitUntilElementIsPresentOnPage(20, hatchlearninglink);
    	hatchlearninglink.click();
    }

    public void verifyWelcomeHatchPage(String pagename)
    {
    	String mainwindow= driver.getWindowHandle();
    	Set<String> s = driver.getWindowHandles();
    	for (String ChildWindow : s) {
            if (!mainwindow.equalsIgnoreCase(ChildWindow))
                {
                driver.switchTo().window(ChildWindow);
                sel.getAction().moveToElement(welcomehatch).perform();
                System.out.println("Heading of child window is " + welcomehatch.getText());
                driver.close();
                System.out.println("Child window closed");
                driver.switchTo().window(mainwindow);
                }

    	}
    }

    public void verifyTermsOfUsePage(String termsofservices)
    {
    	String actualname= pagetitle.getText();
        Assert.assertTrue(actualname.contains(termsofservices));
    	System.out.println("Actual page name is"+actualname);
    	backbtn.click();
    }
    public void verifyPrivacyPolicy(String pgname)
    {
    	String actualpagename= privacypolicylink.getText();
    	Assert.assertEquals(actualpagename, pgname);
    	System.out.println("Page name is displayed as"+actualpagename);
    	sel.waitUntilElementIsPresentOnPage(10, privacypolicylink);
    	driver.navigate().back();
    }
}





