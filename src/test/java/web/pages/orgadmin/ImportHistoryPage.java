package web.pages.orgadmin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import util.Selenium;

public class ImportHistoryPage
{
	private WebDriver driver;
	private Selenium  selUtil;

	@FindBy(how=How.XPATH,using="//h1[@class='title']")
	private WebElement pagetitle;

	@FindBy(how=How.XPATH,using="//select[@id='importTypeSelected']")
	private WebElement import_filter;

	@FindBy(how=How.XPATH,using="//th[contains(text(),'Import Type')]")
	private WebElement importheader;

	@FindBy(how=How.XPATH,using="//th[contains(text(),'File Name')]")
	private WebElement filenameheader;

	@FindBy(how=How.XPATH,using="//th[contains(text(),'Status')]")
	private WebElement statusheader;

	@FindBy(how=How.XPATH,using="//th[contains(text(),'Started')]")
	private WebElement startedheader;

	@FindBy(how=How.XPATH,using="//tr[@class='importstatusitem selected']")
	private WebElement importlist;

	@FindBy(how=How.XPATH,using="//div[@data-target='#vidPopup']/span/i")
	private WebElement videothumbnail;

	@FindBy(how=How.XPATH,using="//th[contains(text(),'Row')]")
	private WebElement rowheader;

	@FindBy(how=How.XPATH,using="//th[contains(text(),'Column')]")
	private WebElement columnheader;

	@FindBy(how=How.XPATH,using="//th[contains(text(),'Issue')]")
	private WebElement issueheader;

	@FindBy(how=How.XPATH,using="//label[@for='childplusfileinput']")
	private WebElement childplusbtn;

	@FindBy(how = How.XPATH, using = "//body")
    private WebElement clickOnBlankSapace;

	@FindBy(how=How.XPATH,using="//h4[contains(text(),'Roster Data Management')]")
	private WebElement rosterdatamng;

	@FindBy(how=How.XPATH,using="//input[@id='chkbx_restrict_teachers_to_add_edit_class']//following::span[1]")
	private WebElement toggle1;

	@FindBy(how=How.XPATH,using="//input[@id='chkbx_restrict_teachers_to_add_edit_class']//following::span[2]")
	private WebElement toggle2;

	@FindBy(how=How.XPATH,using="//input[@id='chkbx_generate_custom_img']//following::span[1]")
	private WebElement toggle3;

	@FindBy(how=How.XPATH,using="//input[@id='chkbx_allow_auto_approve_child_photo']//following::span[1]")
	private WebElement toggle4;

	@FindBy(how=How.XPATH,using="//input[@id='chkbx_send_request_photo_to_parent']//following::span[1]")
	private WebElement toggle5;

	@FindBy(how=How.ID,using="save_org_setting")
	private WebElement savesetingbtn;

	@FindBy(how=How.ID,using="(//button[@class='close p-0'])[1]")
	private WebElement hatchsyncpopupIfopens;
	
	@FindBy(how=How.XPATH,using="//div[@class='col-12 p-0 mt-4']/h4")
	private WebElement childphotomng;

	@FindBy(how=How.XPATH,using="//p[@class='m-0']")
	private List <WebElement> accordians;

	@FindBy(how=How.XPATH,using="//div[@class='hatchsync-org-block ']//strong")
	private List <WebElement>hatchcards;

	@FindBy(how=How.XPATH,using="//a[@class='addorg-btn-img d-flex']")
	private WebElement addcard;

	@FindBy(how=How.XPATH,using="//i[@class='greentext fs-18']")
	private WebElement savemsg;

	@FindBy(how=How.XPATH,using="//a[@class='btn_blue_text m-0']")
	private WebElement canclebtn;

	@FindBy(how=How.XPATH,using="//div[@class='modal-header p-0']/h3")
	private WebElement hatchsyncpopup;

	@FindBy(how=How.XPATH,using="//input[@id='userName']")
	private WebElement enterusername;

	@FindBy(how=How.XPATH,using="//input[@id='userPassword']")
	private WebElement enterpass;

	@FindBy(how=How.XPATH,using="//input[@id='sendnow_radio']")
	private WebElement sendnowradio;

	@FindBy(how=How.XPATH,using="//input[@id='agree-tnc']")
	private WebElement checkbox;

	@FindBy(how=How.ID,using="saveTsgOrg")
	private WebElement clickonsave;

	@FindBy(how=How.ID,using="errorTextForExistingConnection")
	private WebElement errormsg;

	@FindBy(how=How.ID,using="cancelAddOrg")
	private WebElement hatchcanclebtn;

	@FindBy(how=How.XPATH,using="//th[@id='org-gold-report_c0']/a")
	private WebElement schheader;

	@FindBy(how=How.XPATH,using="//th[@id='org-gold-report_c1']/a")
	private WebElement teacherheader;

	@FindBy(how=How.XPATH,using="//th[@id='org-gold-report_c2']/a")
	private WebElement classheader;

	@FindBy(how=How.XPATH,using="//th[@id='org-gold-report_c3']/a")
	private WebElement childheader;

	@FindBy(how=How.XPATH,using="//th[@id='org-gold-report_c4']/a")
	private WebElement percentchildheader;

	@FindBy(how=How.XPATH,using="//th[@id='org-gold-report_c5']")
	private WebElement documentsentheader;

	@FindBy(how=How.XPATH,using="//td[@class='hatch-sync-sch']/a")
	private WebElement schoolnamelink;

	@FindBy(how=How.XPATH,using="//div[@id='activateautherrormessage']/p")
	private WebElement somethingwentwrong;

	public ImportHistoryPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(this.driver);
	}
	public void verifyPageName(String pagename)
	{
		selUtil.hardWait(2);
		String actualpgname= pagetitle.getText();
		Assert.assertEquals(actualpgname, pagename);
		System.out.println("Page name found as"+actualpgname);
	}
	public void selectImportType(String impfilter)
	{
		Select selectimportfilter=new Select(import_filter);
		selectimportfilter.selectByVisibleText(impfilter);
	}
	public void verifyImportTypeHeader()
	{
		Assert.assertTrue(importheader.isDisplayed(), "Import Header name is not displayed on page");
	}
	public void verifyFileNameHeader()
	{
		Assert.assertTrue(filenameheader.isDisplayed(), "File Name header is not displayed on page");
	}
	public void verifyStatusHeader()
	{
		Assert.assertTrue(statusheader.isDisplayed(), "Status Header is not displayed on page");
	}
	public void verifyStartedHeader()
	{
		Assert.assertTrue(startedheader.isDisplayed(), "Started header is not displayed on page");
	}
	public void seeimporthisotrylist()
	{

		if(selUtil.isElementExists(importlist))
		{
			Assert.assertTrue(importlist.isDisplayed());
			System.out.println("Import list is displayed on page");

		}

	else
	{
		System.out.println("Import List is not displayed on page");

	}
}

	public void verifyRowHeader()
	{
        selUtil.hardWait(5);
		if(selUtil.isElementExists(rowheader))
		{
			Assert.assertTrue(rowheader.isDisplayed());
			System.out.println("Row header is displayed on page");
		}
		else
		{
			System.out.println("Row Header is not displayed on page");
		}


	}
	public void verifyColumnHeader()
	{
		selUtil.hardWait(5);
		if(selUtil.isElementExists(columnheader))
		{
			Assert.assertTrue(columnheader.isDisplayed());
			System.out.println("columnheader is displayed on page");
		}
		else
		{
			System.out.println("columnheader is not displayed on page");
		}
	}
	public void verifyIssueHeader()
	{
        selUtil.hardWait(5);
		if(selUtil.isElementExists(issueheader))
		{
			Assert.assertTrue(issueheader.isDisplayed());
			System.out.println("issueheader is displayed on page");
		}
		else
		{
			System.out.println("Issueheader is not displayed on page");
		}
	}
	public void verifyVideoThumbnail()
	{
		Assert.assertTrue(videothumbnail.isDisplayed(), "Video thumbnail is displayed on page");
	}
	public void buttonisClickable()
	{
		selUtil.waitUntilElementIsPresentOnPage(10, childplusbtn);
		Assert.assertTrue(childplusbtn.isEnabled());
	}
	public void verifyChildPlusPage(String page_title)
	{
		selUtil.hardWait(2);
		String actualname= pagetitle.getText();
		Assert.assertEquals(actualname, page_title);
		System.out.println("Page name displayed as"+page_title);
	}
	public void verifyOrganizationPageName(String pagename)
	{
		String actualpagename=pagetitle.getText();
		Assert.assertEquals(actualpagename, pagename);
		System.out.println("Page name is found as"+actualpagename);

	}
	public void verifyRosterDataManSection(String section)
	{
		String actualsectionname=rosterdatamng.getText();
		Assert.assertEquals(actualsectionname, section);
		System.out.println("Section name found as"+actualsectionname);
	}
	public void clickOnFirstToggle()
	{
		toggle1.click();
		selUtil.waitUntilElementIsPresentOnPage(10, toggle1);
		toggle1.click();
	}
	public void clickOnSecToggle()
	{
		toggle2.click();
		selUtil.waitUntilElementIsPresentOnPage(10, toggle2);
		toggle2.click();
	}
	public void clickOnThirdToggle()
	{
		toggle3.click();
		selUtil.waitUntilElementIsPresentOnPage(10, toggle3);
		toggle3.click();
	}
	public void clickOnFourthToggle()
	{
		toggle4.click();
		selUtil.waitUntilElementIsPresentOnPage(10, toggle4);
		toggle4.click();
	}
	public void clickOnFifthToggle()
	{
		toggle5.click();
		selUtil.waitUntilElementIsPresentOnPage(10, toggle5);
		toggle5.click();
	}
	public void verifyChildPhotoHeader()
	{
		Assert.assertTrue(childphotomng.isDisplayed(), "Child Photo Managment header is not displayed on page");
	}
	public void seeSaveSettingBtn()
	{
		boolean ssaving_btn=savesetingbtn.isEnabled();
		selUtil.waitUntilElementIsPresentOnPage(10, savesetingbtn);
		System.out.println("Button is Clickable");
	}
	public void closepopupIfAnyopens()
	{
	hatchsyncpopupIfopens.click();	
	}
	public void seeFourAccordians()
	{
		for(WebElement accordian_list: accordians)
		{
			String accordianname= accordian_list.getText();
			System.out.println("Import history list is displayed as"+accordianname);

		}
	}
	public void verifyImportCsvPage(String pagename)
	{
		String actualpagename=pagetitle.getText();
		Assert.assertEquals(actualpagename, pagename);
		System.out.println("Page name found as"+actualpagename);
	}
	public void clickOnSaveSeetingBtn()
	{
		selUtil.waitUntilElementIsPresentOnPage(20, savesetingbtn);
		selUtil.executeJavaScript("arguments[0].click();", savesetingbtn);

	}
	public void verifySaveMessage(String msg)
	{
        selUtil.hardWait(2);
		String actualmsg= savemsg.getText();
		Assert.assertEquals(actualmsg, msg);
		System.out.println("Message displayed as"+actualmsg);
	}
	public void clickOnCancleBtn()
	{
		selUtil.hardWait(2);
		canclebtn.click();
	}
	public void verifyHatchSynchTitle(String pagename)
	{
		selUtil.hardWait(3);
		String actualtitlename=pagetitle.getText();
		Assert.assertEquals(actualtitlename, pagename);
		System.out.println("Page name found as"+actualtitlename);
	}
	public void seeHatchSyncCards()
	{
		for(WebElement card_list: hatchcards)
		{
			String cardname= card_list.getText();
			System.out.println("Hatch Card list is displayed as"+cardname);

		}
	}
	public void clickOnAddCards()
	{
		addcard.click();
	}
	public void verifyHatchSyncPopup(String popup)
	{
		String popupname= hatchsyncpopup.getText();
		Assert.assertTrue(popupname.contains(popup));
		System.out.println("Pop up name is"+popupname);
	}
	public void enterhatchusername(String hatchusername)
	{
		enterusername.sendKeys(hatchusername);
	}
	public void enterhatchpassword(String hatchpassword)
	{
		enterpass.sendKeys(hatchpassword);
	}
	public void clickonCheckBox()
	{
		selUtil.executeJavaScript("arguments[0].click();", checkbox);
	}
	public void clickOnRadioBtn()
	{
		sendnowradio.click();
	}
	public void clickOnSaveBtn()
	{
		clickonsave.click();
	}
	public void verifymsg(String msg1, String msg2)
	{
		boolean card= selUtil.isElementExists(35,errormsg);
		if(card)
		{
			String actualmsg=errormsg.getText();
			boolean msgequal= actualmsg.equalsIgnoreCase(msg1);
			if(msgequal==true)
			{
				Assert.assertEquals(actualmsg,msg1);
			}
			else
			{
				Assert.assertEquals(actualmsg,msg2);
			}
			
			System.out.println("Message displayed as"+actualmsg);
		}
		else
		{
			String actualmsg= somethingwentwrong.getText();
			Assert.assertEquals("Something went wrong when we tried to activate your service.",actualmsg);
		}

	}
	public void clickOnCancleButton()
	{
		hatchcanclebtn.click();
	}
	public void verifySchoolNameHeader()
	{
		Assert.assertTrue(schheader.isDisplayed(),"School name header is not displayed on page");
	}
	public void verifyTeacherHeader()
	{
		Assert.assertTrue(teacherheader.isDisplayed(),"Number of teachers header is not displayed on page");
	}
	public void verifyClassesHeader()
	{
		Assert.assertTrue(classheader.isDisplayed(),"Number of classes header is not displayed on page");
	}
	public void verifyChildrenHeader()
	{
		Assert.assertTrue(childheader.isDisplayed(), "Number of Classes header is not displayed on page");
	}
	public void verifyPercentageOfChildrenMatch()
	{
		Assert.assertTrue(percentchildheader.isDisplayed(), "Percentage of Children header is not displayed on page");
	}
	public void verifyDocumentsentHeader()
	{
		Assert.assertTrue(documentsentheader.isDisplayed(), "documnet sent header is not displayed on page");
	}
	public void clickOnSchoolName()
	{
		schoolnamelink.click();
	}
	public void verifyTeachingGoldReportPage(String reportpgname)
	{
		selUtil.waitUntilElementIsPresentOnPage(10, pagetitle);
		String actualpagename= pagetitle.getText();
		Assert.assertTrue(actualpagename.contains(reportpgname));
		System.out.println("Page name is found as"+actualpagename);
	}

	}

