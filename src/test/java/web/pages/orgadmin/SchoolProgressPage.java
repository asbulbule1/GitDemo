package web.pages.orgadmin;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import util.Selenium;
import util.Util;
import web.pages.CommonPage;

public class SchoolProgressPage
{
	private WebDriver driver;
	private Selenium  selUtil;
	private Util util;
	private CommonPage common;

	@FindBy(how=How.XPATH,using="//*[@id='subdomain_id']")
	private WebElement subdomainnamedropdown;

	@FindBy(how=How.XPATH,using="//input[@type='radio' and @value='1']")
	private WebElement englishradiobutton;

	@FindBy(how=How.XPATH,using="//input[@type='radio' and @value='2']")
	private WebElement spanishradiobutton;

	@FindBy(how=How.XPATH,using="//input[@type='radio' and @value='all']")
	private WebElement allradiobutton;

	@FindBy(how=How.XPATH,using="//table[@class='table table-borderless child-progress-tbl k-rediness-progress school-progress']//a")
	private WebElement schoolnamelist;

	@FindBy(how=How.XPATH,using="//div[@class='school_ids']//button")
	private WebElement schooldropdownbtn;

	@FindBy(how=How.XPATH,using="//div[@class='custom-progress-bar']")
	private WebElement progressbar;

	@FindBy(how=How.XPATH,using="//td/a[@class='d-block']")
	private List<WebElement> schoolname;

	@FindBy(how=How.XPATH,using="//div[@class='ms-options']//li/label")
	private List<WebElement> allcheckboxes;

	@FindBy(how=How.NAME,using="School[school_id]")
	private WebElement classschooldropdown;

	@FindBy(how=How.NAME,using="School[subdomain_id]")
	private WebElement classsubdomaindropdown;

	@FindBy(how=How.XPATH,using="//td[@class='col-md-1 col-sm-12 p-1 align-self-center text-right progress-report']")
	private List<WebElement> classname;

	@FindBy(how=How.XPATH,using="//div[@class='custom-progress-bar']")
	private WebElement clsprogressbar;

	@FindBy(how=How.XPATH,using="//select[@id='schoolId']")
	private WebElement child_schooldropdown;

	@FindBy(how=How.XPATH,using="//select[@id='classroomId']")
	private WebElement child_classdropdown;

	@FindBy(how=How.XPATH,using="//select[@id='subdomainId']")
	private WebElement child_subdomaindropdown;

	@FindBy(how=How.XPATH,using="//a[@class='d-block test_class_overview_child_name word-break']")
	private List<WebElement> childnamelist;

	@FindBy(how=How.XPATH,using="//div[@class='custom-progress-bar']")
	private WebElement child_progressbar;

	@FindBy(how=How.XPATH,using="//h1[@class='title']")
	private WebElement title;

	@FindBy(how=How.XPATH,using="//div[@id='advance_filtering']")
	private WebElement filteroptionsaccordian;

	@FindBy(how=How.XPATH,using="//input[@type='radio' and @value='3600']")
	private WebElement hourdisplaytime;

	@FindBy(how=How.XPATH,using="//input[@type='radio' and @value='60']")
	private WebElement minutedisplaytime;

	@FindBy(how=How.XPATH,using="//input[@name='filter_time_metric' and @value='1']")
	private WebElement secondsdisplaytime;

	@FindBy(how=How.XPATH,using="//div[@id='ms-list-1']")
	private WebElement playlogschdropdown;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-2']")
	private WebElement playlogclassdropDown;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-3']")
	private WebElement playlogchilddropdown;

	@FindBy(how = How.XPATH, using = "//body")
	private WebElement clickOnBlankSapace;

	@FindBy(how=How.XPATH,using="//div[@id='ms-list-6']")
	private WebElement playlogagdropdown;

	@FindBy(how=How.XPATH,using="//div[@id='ms-list-7']")
	private WebElement playloggradedropdown;

	@FindBy(how=How.XPATH,using="//div[@id='ms-list-8']")
	private WebElement playloglangdropdown;

	@FindBy(how=How.XPATH,using="//div[@id='ms-list-9']")
	private WebElement playlogracedropdown;

	@FindBy(how=How.XPATH,using="//div[@id='ms-list-10']")
	private WebElement playlogethinictydropdown;

	@FindBy(how=How.XPATH,using="//div[@id='ms-list-4']")
	private WebElement playlogexperinecdropdown;

	@FindBy(how=How.XPATH,using="//div[@id='ms-list-5']")
	private WebElement playlogdomaindropdown;

	@FindBy(how=How.XPATH,using="//input[@name='hatchsync' and @value='1']")
	private WebElement hatchsyncnoneradiobtn;

	@FindBy(how=How.XPATH,using="//input[@name='hatchsync' and @value='2']")
	private WebElement hatchsynccountradiobtn;

	@FindBy(how=How.XPATH,using="//input[@name='hatchsync' and @value='3']")
	private WebElement hatchsyncdetailedradobtn;

	@FindBy(how=How.ID,using="downloadPlayLogCsv")
	private WebElement downloadbtn;

	@FindBy(how=How.XPATH,using="//input[@id='datepicker_start_date']")
	private WebElement startdate;

	@FindBy(how=How.XPATH,using="//input[@id='datepicker_end_date']")
	private WebElement enddate;

	@FindBy(how=How.ID,using="childplaytimeSchoolId")
	private WebElement childplayschdrp;

	@FindBy(how=How.ID,using="childplaytimeClassId")
	private WebElement childplayclassdrp;

	@FindBy(how=How.ID,using="childplaytimeSubdomainId")
	private WebElement childplaysubdrp;

	@FindBy(how=How.XPATH,using="//td[@class='report-childname pl-0']/a")
	private List<WebElement> child_namelist;

	@FindBy(how=How.XPATH,using="//td[@class='report-timebar  pr-0']")
	private WebElement child_list_progressbar;

	@FindBy(how=How.XPATH,using="//input[@name='child_progress_filter' and @value='2']")
	private WebElement childlasttimeradiobtn;

	@FindBy(how=How.XPATH,using="//input[@name='child_progress_filter' and @value='3']")
	private WebElement childschoolyearradiobtn;

	@FindBy(how=How.XPATH,using="//input[@name='child_progress_filter' and @value='4']")
	private WebElement childcustomradibtn;

	@FindBy(how=How.ID,using="playtime30")
	private WebElement greenplaytime;

	@FindBy(how=How.ID,using="playtime10_29")
	private WebElement orangeplaytime;

	@FindBy(how=How.XPATH,using="//*[@id='playtime10']")
	private WebElement redplaytime;

	@FindBy(how=How.XPATH,using="//span[@class='redtext']/strong")
	private List<WebElement> allplaytime;

	@FindBy(how=How.XPATH,using="//*[@id='playtime30']")
	private WebElement schoolyeargreen;

	@FindBy(how=How.XPATH,using="//*[@id='playtime10_29']")
	private WebElement schoolyearorange;

	@FindBy(how=How.XPATH,using="//*[@id='playtime10']")
	private WebElement schoolyearred;

	@FindBy(how=How.XPATH,using="//div[@class='org-setup-report-wrapper common-table-wrapper']//h5[@class='setup-count']")
	private WebElement childcount;

	@FindBy(how=How.XPATH,using="//span[@class='ready-to-play']")
	private WebElement readytoplaytext;

	@FindBy(how=How.XPATH,using="//p[contains(text(),'This report shows info about steps that are crucia')]")
	private WebElement pagetext;

	@FindBy(how=How.XPATH,using="//button[@class='btn btn_green_border btn-small mr-2']")
	private WebElement viewtechbtn;

	@FindBy(how=How.XPATH,using="//button[@class='btn btn_green_border']")
	private WebElement viewtrainingbtn;

	@FindBy(how=How.XPATH,using="//td[@class='school-setup-sch']/a")
	private List<WebElement> viewallschool;

	@FindBy(how=How.XPATH,using="//i[@class='fa fa-check']")
	private WebElement clickoncustombtn;

	@FindBy(how=How.ID,using="start_date")
	private WebElement startdatecustom;

	@FindBy(how=How.ID,using="end_date")
	private WebElement enddatecustom;

	@FindBy(how=How.XPATH,using="//small[normalize-space()='minutes']")
	private WebElement utilizationcountminutes;

	@FindBy(how=How.XPATH,using="//span[normalize-space()='0']")
	private WebElement utilizationcount;

	@FindBy(how=How.XPATH,using="//span[normalize-space()='average playtime per child last week']")
	private WebElement avg_text;

	@FindBy(how=How.XPATH,using="//p[contains(text(),'This report shows Ignite usage information for all')]")
	private WebElement setuptext;

	@FindBy(how=How.XPATH,using="//button[@class='btn btn_green_bg fw-600 pl-4 pr-4 pb-1 pt-1' and contains(text(),'Try Again')]")
	private WebElement tryagainbtn;

	@FindBy(how = How.XPATH, using = "//div/button[@id='saveTsgOrg' and text()='Done']")
    private WebElement clickOnDoneButton;

	String selectSchoolCheckBoxXpath="//label[@title='$SchoolName$' and contains(for,'ms-opt-')='']/span";
	String selectClassCheckBoxXpath="//input[@title='$ClassName$']/following-sibling::span";
	String selectChildCheckBoxXpath="//input[@title='$ChildName$']/following-sibling::span";
	String selectAgeCheckBoxXpath="//label[@title='$Age$' and contains(for,'ms-opt-')='']/span";
	String selectGradeCheckBoxXpath="//label[@title='$Grade$' and contains(for,'ms-opt-')='']/span";
	String selectLanguageCheckBoxXpath="//label[@title='$Lang$' and contains(for,'ms-opt-')='']/span";
	String selectRaceCheckBoxXpath="//label[@title='$Race$' and contains(for,'ms-opt-')='']/span";
	String selectEthinicityCheckBoxXpath="//input[@title='$Ethini$']/following-sibling::span";
	String selectExperienceCheckBoxXpath="//input[@title='$Exp$']/following-sibling::span";
	String selectDomainCheckBoxXpath="//label[@title='$Domain$' and contains(for,'ms-opt-')='']/span";
	String labelname_xpath="//label[@title='schoolname']";




	public SchoolProgressPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(this.driver);
		util=new Util();
		common=new CommonPage(this.driver);

	}
	public void selectSchooldropdown(String schooldropdown,String schoolname)
	{
		schooldropdownbtn.click();
		System.out.println(allcheckboxes.size());

		String schoolname_xpath=labelname_xpath.replace("schoolname", schoolname);

		WebElement we_level1 = driver.findElement(By.xpath(schoolname_xpath));

		if(we_level1.isDisplayed()) we_level1.click();

		String actualname=we_level1.getText();

		Assert.assertEquals(actualname, schoolname);
		System.out.println("School selected is" +actualname);
		clickOnBlankSapace.click();

	}

	public void selectSubdomaindropdown(String subdomaindropdown)
	{
		Select selectsubdomain=new Select(subdomainnamedropdown);
		selectsubdomain.selectByVisibleText(subdomaindropdown);

	}
	public void clickOnEnglishLanguageButton()
	{
		selUtil.hardWait(2);
		englishradiobutton.click();

	}
	public void clickOnSpanishLangaugeButton()
	{
		selUtil.hardWait(5);
		spanishradiobutton.click();
	}
	public void clickOnAllLanguageButton()
	{
		selUtil.hardWait(5);
		allradiobutton.click();
	}
	public void verifySchoolnameList(String schoollist)
	{
        selUtil.hardWait(2);
		for(WebElement schoolnamelist: schoolname)
		{
			String name= schoolnamelist.getText();
			System.out.println(name);

		}
		Assert.assertTrue(progressbar.isDisplayed());
	}
	public void verifyClassProgressTitle(String classprogress)
	{
		selUtil.hardWait(7);
		String actualtitlename=title.getText();
		Assert.assertEquals(actualtitlename, classprogress);
		System.out.println("Page title name found as" +actualtitlename);
	}
	public void selectClsSchooldropdown(String clsschooldropdown)
	{
		Select selectclsschooldropdown=new Select(classschooldropdown);
		selectclsschooldropdown.selectByVisibleText(clsschooldropdown);
	}
	public void selectClsSubdomaindropdown(String clssubdomaindropdown)
	{
		selUtil.waitUntilElementIsPresentOnPage(5, classsubdomaindropdown);
		Select selectclssubdomaindropdown=new Select(classsubdomaindropdown);
		selectclssubdomaindropdown.selectByVisibleText(clssubdomaindropdown);
	}
	public void verifyClassNameList(String classlist)
	{
		selUtil.hardWait(3);

		for(WebElement classname_list:classname)
		{
			String clsname= classname_list.getText();
			System.out.println(clsname);

		}

		Assert.assertTrue(clsprogressbar.isDisplayed(),"Class Progress Bar is not displayed");
	}
	public void verifyChildProgressTitle(String childprogress)
	{
		selUtil.waitUntilElementIsPresentOnPage(5, title);
		String actualtitlename=title.getText();
		Assert.assertEquals(actualtitlename, childprogress);
		System.out.println("Page title found as" +actualtitlename);
	}
	public void selectChildSchooldropdown(String childschooldropdown)
	{
		selUtil.waitUntilElementIsPresentOnPage(7, child_schooldropdown);
		Select selectchildschooldropdown=new Select(child_schooldropdown);
		selectchildschooldropdown.selectByVisibleText(childschooldropdown);
	}
	public void selectChildSubdomaindropdown(String childsubdomaindropdown)
	{
		Select selectchildsubdomaindropdown=new Select(child_subdomaindropdown);
		selectchildsubdomaindropdown.selectByVisibleText(childsubdomaindropdown);
	}
	public void selectClassdropdown(String classdropdown)
	{
		selUtil.waitUntilElementIsPresentOnPage(7, child_classdropdown);
		Select selectclassdropdown=new Select(child_classdropdown);
		selectclassdropdown.selectByVisibleText(classdropdown);
	}
	public void verifyChildname(String childlist)
	{
		selUtil.waitUntilElementToBeInvisible(60, driver.findElement(By.xpath("//div[@id='custom-loader-wrapper']")));

        selUtil.hardWait(2);
		for(WebElement child_namelist:childnamelist)
		{
			String childname= child_namelist.getText();
			System.out.println(childname);
		}

		Assert.assertTrue(child_progressbar.isDisplayed(),"Child Progress Bar is not displayed");

	}
	public void verifyPlayLogTitle(String playlog)
	{
		selUtil.waitUntilElementIsPresentOnPage(10, title);
		String actualpagename=title.getText();
		Assert.assertEquals(actualpagename, playlog);
		System.out.println("Page name found as"+actualpagename);
	}
	public void clickonAccordian()
	{
		selUtil.hardWait(5);
		filteroptionsaccordian.click();
	}
	public void clickOnDisplayTimeAs()
	{
		selUtil.hardWait(5);
		hourdisplaytime.click();
		selUtil.hardWait(3);
		minutedisplaytime.click();
		selUtil.hardWait(3);
		secondsdisplaytime.click();
	}
	public void selectPlaylogSchooldropdown(String schooldropdown,String schname)
	{
		selUtil.waitUntilElementIsPresentOnPage(10, playlogschdropdown);
		playlogschdropdown.click();
		String school_name_xpath=selectSchoolCheckBoxXpath.replace("$SchoolName$", schname);
		WebElement we_level1 = driver.findElement(By.xpath(school_name_xpath));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", we_level1);
		clickOnBlankSapace.click();

	}
	public void selctPlaylogClassdropdown(String clsdropdown,String clsname)
	{
		selUtil.waitUntilElementIsPresentOnPage(10, playlogclassdropDown);
		playlogclassdropDown.click();
		String class_name_xpath=selectClassCheckBoxXpath.replace("$ClassName$", clsname);
		WebElement we_level2 = driver.findElement(By.xpath(class_name_xpath));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", we_level2);
		clickOnBlankSapace.click();

	}
	public void selectPlaylogChilddropdown(String chidropdown,String chiname)
	{
		selUtil.waitUntilElementIsPresentOnPage(10, playlogchilddropdown);
		selUtil.getNonStaleElement(7, playlogchilddropdown);
		playlogchilddropdown.click();
		String child_name_xpath=selectChildCheckBoxXpath.replace("$ChildName$", chiname);
		WebElement we_level3 = driver.findElement(By.xpath(child_name_xpath));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", we_level3);
		clickOnBlankSapace.click();
	}
	public void selectPlaylogAgedropdown(String agdropdown,String agedropdown)
	{
		selUtil.hardWait(5);
		playlogagdropdown.click();
		String age_xpath=selectAgeCheckBoxXpath.replace("$Age$",agedropdown);
		WebElement we_level4 = driver.findElement(By.xpath(age_xpath));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", we_level4);
		clickOnBlankSapace.click();
	}
	public void selectPlaylogGradedropdown(String graddropdown,String gradedropdown)
	{
		selUtil.waitUntilElementIsPresentOnPage(10, playloggradedropdown);
		playloggradedropdown.click();
		String grade_xpath=selectGradeCheckBoxXpath.replace("$Grade$",gradedropdown);
		WebElement we_level5 = driver.findElement(By.xpath(grade_xpath));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", we_level5);
		clickOnBlankSapace.click();

	}
	public void selectPlaylogLanguagedropdown(String langdropdown,String langaugedropdown)
	{
		selUtil.waitUntilElementIsPresentOnPage(10, playloglangdropdown);
		playloglangdropdown.click();
		String lang_xpath=selectLanguageCheckBoxXpath.replace("$Lang$",langaugedropdown);
		WebElement we_level6 = driver.findElement(By.xpath(lang_xpath));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", we_level6);
		clickOnBlankSapace.click();

	}
	public void selectPlaylogRacedropdown(String racdropdown,String racedropdown)
	{
		selUtil.waitUntilElementIsPresentOnPage(10, playlogracedropdown);
		playlogracedropdown.click();
		String race_xpath=selectRaceCheckBoxXpath.replace("$Race$",racedropdown);
		WebElement we_level7 = driver.findElement(By.xpath(race_xpath));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", we_level7);
		clickOnBlankSapace.click();

	}
	public void selectPlaylogEthinicitydropdown(String ethdropdown,String ethinicitydropdown)
	{
        selUtil.hardWait(5);
		playlogethinictydropdown.click();
		String ehin_xpath=selectEthinicityCheckBoxXpath.replace("$Ethini$",ethinicitydropdown);
		WebElement we_level8 = driver.findElement(By.xpath(ehin_xpath));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", we_level8);
		clickOnBlankSapace.click();
	}
	public void selectPlaylogExperinectype(String exptype,String experinectype)
	{
		selUtil.hardWait(5);
		playlogexperinecdropdown.click();
		String exp_xpath=selectExperienceCheckBoxXpath.replace("$Exp$", experinectype);
		WebElement we_level9 = driver.findElement(By.xpath(exp_xpath));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", we_level9);
		clickOnBlankSapace.click();
	}
	public void selectPlaylogDomainnametype(String domname,String domaindropdown)
	{
		selUtil.hardWait(5);
		selUtil.getNonStaleElement(7, playlogdomaindropdown);
		playlogdomaindropdown.click();
		String domain_xpath=selectDomainCheckBoxXpath.replace("$Domain$", domaindropdown);
		WebElement we_level10 = driver.findElement(By.xpath(domain_xpath));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", we_level10);
		clickOnBlankSapace.click();
	}
	public void selectHatchsyncRadiobtn()
	{
		selUtil.hardWait(5);
		hatchsynccountradiobtn.click();
		hatchsyncdetailedradobtn.click();
		hatchsyncnoneradiobtn.click();
	}
	public void clickOnDownloadbtn()
	{
		selUtil.waitUntilElementIsPresentOnPage(10, downloadbtn);
		boolean download_btn=downloadbtn.isEnabled();
		System.out.println("The download button is present" +download_btn);
        downloadbtn.click();

        boolean setAfterDownloadReportButton = selUtil.isElementExists(clickOnDoneButton);

		if(setAfterDownloadReportButton)
		{
			selUtil.getAction().moveToElement(clickOnDoneButton).click().perform();
		}
		else
		{
			selUtil.getAction().moveToElement(tryagainbtn).click().perform();
		}

	}
	public void clickOnStartdate()
	{
		selUtil.getAction().moveToElement(startdate).click().perform();
//		startdate.click();
	}
	public void clickOnEnddate()
	{
		enddate.click();
	}
	public void verifyChildPlaytimePage(String childplaytime)
	{
		String actualpagename= title.getText();
		Assert.assertEquals(actualpagename, childplaytime);
		System.out.println("Page name found as"+actualpagename);
	}
	public void select_ChildSchooldropdown(String chilschdropdown)
	{
		selUtil.waitUntilElementIsPresentOnPage(5, childplayschdrp);
		Select select_child_schooldropdown=new Select(childplayschdrp);
		select_child_schooldropdown.selectByVisibleText(chilschdropdown);
	}
	public void select_ChildClassdropdown(String chiclassdropdown)
	{
		selUtil.waitUntilElementIsPresentOnPage(5, childplayclassdrp);
		Select select_child_classdropdown=new Select(childplayclassdrp);
		select_child_classdropdown.selectByVisibleText(chiclassdropdown);
	}
	public void select_ChildSubdomaindropdown(String chisubdomaindropdown)
	{
		selUtil.waitUntilElementIsPresentOnPage(5, childplaysubdrp);
		Select select_child_subdomaindropdown=new Select(childplaysubdrp);
		select_child_subdomaindropdown.selectByVisibleText(chisubdomaindropdown);
		selUtil.waitUntilElementIsPresentOnPage(7, childplaysubdrp);
	}
	public void verifyChildnameList(String playtime)
	{
		selUtil.hardWait(5);
		for(WebElement child_name_list:child_namelist)
		{

			String childname= child_name_list.getText();
			System.out.println("Child name displayed as"+childname);

		}

		Assert.assertTrue(child_list_progressbar.isDisplayed(),"Child Progress Bar is not displayed");

		for(WebElement play_time:allplaytime)
		{
			String all_playtime=play_time.getText();
			System.out.println("Playtime for all child is displayed as"+all_playtime);
		}
	}
	public void selectLastWeekRadioBtn()
	{

		childlasttimeradiobtn.click();
	}
	public void selectSchoolYearRadioBtn()
	{
		childschoolyearradiobtn.click();
	}
	public void selectCustomRadioBtn()
	{
		childcustomradibtn.click();
	}
	public void verifyPlaytimeColor(String greencolor, String orangcolor, String redcolor)
	{
		selUtil.hardWait(5);
		String actualtime=greenplaytime.getText();
		Assert.assertEquals(actualtime, greencolor);
		System.out.println("Time displayed as"+actualtime);

		String actualplaytime=orangeplaytime.getText();
		Assert.assertEquals(actualplaytime, orangcolor);
		System.out.println("Time displayed as"+actualplaytime);

		String actualdisplaytime= redplaytime.getText();
		Assert.assertEquals(actualdisplaytime,redcolor);
		System.out.println("Time displayed as"+actualdisplaytime);
	}

	public void verifyChildrenCount()
	{
     String actualchild_count=childcount.getText();
     Assert.assertTrue(childcount.isDisplayed());
     System.out.println("Child Count is displayed as"+actualchild_count);
	}
	public void verifyTextReadytoPlay(String text)
	{
	 String actualtext=readytoplaytext.getText();
	 Assert.assertEquals(actualtext, text);
	 System.out.println("Actual text displayed as"+actualtext);
	}
	public void verifyTextPage(String textpage)
	{
		String actualpagetext= pagetext.getText();
		System.out.println(actualpagetext);
	    Assert.assertTrue(pagetext.isDisplayed(),"Page text is not displayed");
	}
	public void seeViewAllChildrenButton()
	{
		boolean childbtn=viewtechbtn.isEnabled();
		System.out.println("The view teachers button is present" +childbtn);

	}
	public void seeViewTraningOptionsButton()
	{
		boolean trainingbtn= viewtrainingbtn.isEnabled();
		System.out.println("The button training options buton is present" +trainingbtn);
	}
	public void verifySchoolnames(String schoolnamelist)
	{
		for(WebElement school_namelist:viewallschool)
		{
			String schoolname= school_namelist.getText();
			System.out.println(schoolname);
		}
	}
	public void clickOnButton()
	{
		clickoncustombtn.click();
	}
	public void clickOnCustomStartdate()
	{
		startdatecustom.click();
		selUtil.waitUntilElementIsPresentOnPage(5, startdatecustom);
	}
	public void clickOnCustomEnddate()
	{
		enddatecustom.click();
		selUtil.waitUntilElementIsPresentOnPage(5, enddatecustom);
	}
   public void verifyAveragePlayTimeCount()
   {
	  selUtil.hardWait(2);
	  String count= utilizationcount.getText();
	  String actualutilizationcount=utilizationcountminutes.getText();

	  String actualcount=count.concat(" ").concat(actualutilizationcount);
	  Assert.assertTrue(utilizationcount.isDisplayed());
	  Assert.assertTrue(utilizationcountminutes.isDisplayed());
	  System.out.println("Play time count is displayed as"+actualcount);
   }
   public void verifyAvgText(String avgtext)
   {
	   String actualtext=avg_text.getText();
	   Assert.assertEquals(actualtext, avgtext);
	   System.out.println("Text for set up and utilization is displayed as"+actualtext);
   }
   public void verifyUtilizationText()
   {
	    String actualpagetext= setuptext.getText();
		System.out.println(actualpagetext);
	    Assert.assertTrue(setuptext.isDisplayed(),"Page text is not displayed");
   }
   public void schoolyeardate() throws ParseException
   {
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
	   String start_date="01/Aug/2023";

	   LocalDateTime expectedEndDate = LocalDateTime.now();
	   String endDate = dtf.format(expectedEndDate);

	   common.verifyColorProgress(start_date, endDate);

   }


}






