package web.pages.teacher;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import util.Selenium;

@SuppressWarnings("unused")
public class TeacherRosterPage

{
	private WebDriver driver;
	public static Selenium selUtil;

	@FindBy(how = How.XPATH, using="//h1[@class='title']")
	private WebElement ConferencesReportPageTitle;

	@FindBy(how =How.XPATH, using = "//span[@class='selected_options']")
	private WebElement clickOnClassDropDown;

	@FindBy(how = How.XPATH, using = "//body")
    private WebElement clickOnBlankSapace;

	String selectClassCheckBoxXpath="//input[@title='$ClassName$']/following-sibling::span";

	@FindBy(how = How.XPATH, using = "//a[@title=\"View\"]")
	private List<WebElement> childlName;

	@FindBy(how = How.XPATH, using = "//i[@class=\"fa fa-print\"]")
	private WebElement PrintReport;

	@FindBy (how = How.XPATH, using = "//h1[@class='title']")
	private WebElement pagetitle;

	@FindBy (how = How.XPATH, using = "//li[@class = \"subdomain\"]")
	private WebElement subdomainHeaderTitle;

	@FindBy (how = How.XPATH, using = "//li[@class = \"percentage\"]")
	private WebElement precentageHeaderTitle;
	
	@FindBy(how=How.XPATH,using="//h1[@class='title']")
	private WebElement childprofile;
	
	@FindBy(how=How.XPATH,using="//ul[@class='list-unstyled mb-0']//a")
	private WebElement basicinfo;
	
	@FindBy(how=How.XPATH,using="//div[@id='basic_info']/h4")
	private WebElement basictitle;
	
	@FindBy(how=How.XPATH,using="//ul[@class='list-unstyled mb-0']//li[2]/a")
	private WebElement educationaljourney;
	
	@FindBy(how=How.XPATH,using="//div[@id='educational_journey']/h4")
	private WebElement educationaltitle;
	
	@FindBy(how=How.XPATH,using="//a[normalize-space()='Family Members']")
	private WebElement familymember;
	
	@FindBy(how=How.XPATH,using="//div[@id='parents_guard']/h4")
	private WebElement familytitle;
	
	@FindBy(how=How.XPATH,using="//a[normalize-space()='GOLD Settings']")
	private WebElement goldsettings;
	
	@FindBy(how=How.XPATH,using="//div[@id='gold_setting']/h4")
	private WebElement goldtitle;
	


	public TeacherRosterPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		selUtil = new Selenium(this.driver);
	}

	public void ParentConferenceReport(String ExpectedConferencePageTitle)
	{
		String actualPageTile=ConferencesReportPageTitle.getText();
		Assert.assertEquals(actualPageTile, ExpectedConferencePageTitle);
	}

	public void selectClassFromDropdown(DataTable expectedClassName)
	{
        clickOnClassDropDown.click();

        selUtil.hardWait(3);

        List<String>classFromDropDownlist = expectedClassName.asList();
        selUtil.hardWait(2);
        for(String classes : classFromDropDownlist)
        {

        String selectClassNameXpath = selectClassCheckBoxXpath.replace("$ClassName$", classes);

        WebElement selectclassNameMenuwe = driver.findElement(By.xpath(selectClassNameXpath));

        selUtil.waitUntilElementIsPresentOnPage(10, selectclassNameMenuwe);
        selUtil.getAction().moveToElement(selectclassNameMenuwe).click().perform();
        Assert.assertTrue(selectclassNameMenuwe.isDisplayed());
//        selectDomainNameMenuwe.click();
        }
        clickOnBlankSapace.click();
	}

	public void VerifylistofChildrenwithprintreport()
	{
		 {
			selUtil.hardWait(2);
			for (WebElement row : childlName) {
				System.out.println("content >>  " + row.getText());
			}
			Assert.assertTrue(PrintReport.isDisplayed());
			System.out.println("Children list is getting display");
			selUtil.hardWait(2);
	}


	}

    public void VerifySupportNeededpageTitle(String supportneededpage)
		   {
			   String actualpagename= pagetitle.getText();
			   Assert.assertEquals(actualpagename, supportneededpage);
			   System.out.println("Page name is displayed as"+actualpagename);
		   }


    public void VerifysubDoaminHeader(String subdomainheader)
    {
    	String actualpagename= subdomainHeaderTitle.getText();
		   Assert.assertEquals(actualpagename, subdomainheader);
		   System.out.println("subdomain is displayed as"+actualpagename);
    }

    public void VerifyPrecentageHeader(String precentageHeader)
    {
       String actualpagename= precentageHeaderTitle.getText();
		   Assert.assertEquals(actualpagename, precentageHeader);
		   System.out.println("% correct title is displayed as"+actualpagename);
    }
    public void clickOnBasicInfo()
    {
    	basicinfo.click();
    }
    public void verifyBasicInfoTitle()
    {
    	Assert.assertTrue(basictitle.isDisplayed(), "Basic info section is not displayed on page");
    }
    public void clickOnEducationalJourny()
    {
    	educationaljourney.click();
    }
    public void verifyEducationalTitle()
    {
    	Assert.assertTrue(educationaltitle.isDisplayed(), "educational journey section is not displayed on page");
    }
    public void clickOnFamilymember()
    {
    	familymember.click();
    }
    public void verifyFamilyMambertitle()
    {
    	Assert.assertTrue(familytitle.isDisplayed(), "Family member section is not displayed on page");
    }
    public void clickOnGoldSetting()
    {
    	goldsettings.click();
    }
    public void verifyGoldSettingTitle()
    {
    	Assert.assertTrue(goldtitle.isDisplayed(), "gold seeting section is not displayed on page");
    }
    public void verifyChildProfile(String page)
    {
    	String actualname= childprofile.getText();
    	Assert.assertEquals(actualname, page);
    	System.out.println("Page name is displayed as"+actualname);
    }

}


