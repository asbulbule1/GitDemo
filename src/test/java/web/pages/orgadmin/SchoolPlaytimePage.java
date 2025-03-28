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
import web.stepdefs.BaseClass;

public class SchoolPlaytimePage extends BaseClass {

	private WebDriver driver;
	private Selenium selUtil;


	// Scenario 9:Verify_Reports_SupportNeeded_Panel_IQA-83

		@FindBy(how = How.XPATH, using = "//a[@class='ghosthover backbtn']")
		private WebElement Back;

		@FindBy(how = How.XPATH, using = " //*[@id='school_playtime']/tr[1]/td[2]")
		private WebElement Timebar;

		@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Support Needed']")
		private WebElement supportpanel2;

		@FindBy(how = How.XPATH, using = "//*[@id='supportneeded_c1']")
		private WebElement score1;

		@FindBy(how = How.XPATH, using = "//*[@id=\"supportneeded_c2\"]")
		private WebElement score2;

		// Scenario 10: REPORTS_School_Play_Time_IQA-76

		@FindBy(how = How.XPATH, using = "//*[@id='school_playtime']/tr[1]/td[1]/a")
		private WebElement SchoolTable;

		@FindBy(how = How.XPATH, using = "//*[@id='index-page']/body/div[6]/div/div[2]/div[1]/div[1]")
		private WebElement thisweek;

		@FindBy(how = How.XPATH, using = "//*[@id='school_playtime']/tr/td[1]/a")
		private List<WebElement> SchoolName;

		@FindBy(how = How.XPATH, using = "//*[@id='school_playtime']/tr/td[3]/span/strong")
		private List<WebElement> thisweektime;

		@FindBy(how = How.XPATH, using = "//*[@id='playtime30']")
		private WebElement GreenT;

		@FindBy(how = How.XPATH, using = "//*[@id='playtime10_29']")
		private WebElement OrangeT;

		@FindBy(how = How.XPATH, using = "//*[@id='playtime10']")
		private WebElement RedT;

		// Scenario 11:

		@FindBy(how = How.XPATH, using = "//input[@value='2' and @class='progress_filter']")
		private WebElement lastweek;

		// Scenario 12:

		@FindBy(how = How.XPATH, using = "//input[@value='3' and @class='progress_filter']")
		private WebElement schoolyear;

		@FindBy(how = How.XPATH, using = "//input[@value='4' and @class='progress_filter']")
		private WebElement customdays;

		@FindBy(how = How.XPATH, using = "//*[@id='school_playtime']/tr/td[1]/a")
		private List<WebElement> SchoolName3;


		@FindBy(how = How.XPATH, using = "//*[@id='start_date']")
		private WebElement StartDate_picker;

		@FindBy(how = How.CLASS_NAME, using = "ui-datepicker-month")
		private WebElement Month_Picker;

		@FindBy(how = How.XPATH, using = "//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[7]/a")
		private WebElement StartDate;

		@FindBy(how = How.XPATH, using = "//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[2]/a")
		private WebElement EndDate;

		@FindBy(how = How.XPATH, using = "//*[@id='end_date']")
		private WebElement EndDate_picker;

		@FindBy(how = How.XPATH, using = "//*[@id='apply_date_filter']")
		private WebElement Ok_Checkmark;

		@FindBy(how = How.XPATH, using = "//*[@id='ui-datepicker-div']/div/a[1]/span")
		private WebElement previousarrow;

		// Scenario 14:

		@FindBy(how = How.XPATH, using = "//label[@for='ms-opt-38']")
		private WebElement schooldrop;

		@FindBy(how = How.XPATH, using = "//div[@id='ms-list-1']")
		private WebElement schoolbutton;


		@FindBy(how = How.XPATH, using = "//div[@id='ms-list-2']")
		private WebElement teacherbutton;

		@FindBy(how = How.XPATH, using = "//label[@for='ms-opt-605']")
		private WebElement teacherdrop;

		@FindBy(how = How.ID, using = "ms-list-3")
		private WebElement parentbutton;

		@FindBy(how = How.XPATH, using = "//label[@for='ms-opt-1007']")
		private WebElement parentdrop;

		@FindBy(how = How.XPATH, using = "//*[@id='ms-list-4']/button")
		private WebElement device_button;

		@FindBy(how = How.XPATH, using = "//li/label[@title='ACER']/span")
		private WebElement devicedrop;

		@FindBy(how = How.XPATH, using = "//label[@title='ACER']")
		private WebElement deviceNameTitle;


		@FindBy(how=How.XPATH,using="//a[@class='ghosthover backbtn']")
		private WebElement backbtn;

		@FindBy(how = How.XPATH, using = "//*[@id='view_all_children_c0']/a")
		private WebElement lastsync;

		@FindBy(how = How.XPATH, using = "//*[@id='view_all_children_c1']/a")
		private WebElement appversion;

		@FindBy(how = How.XPATH, using = "//*[@id='view_all_children_c2']/a")
		private WebElement schoolhomedevice;

		@FindBy(how = How.XPATH, using = "view_all_children_c3")
		private WebElement teacherparentname;

		@FindBy(how = How.XPATH, using = "//*[@id='view_all_children_c4']/a")
		private WebElement verifyschool;

		@FindBy(how = How.XPATH, using = "//*[@id='view_all_children_c5']/a")
		private WebElement devicetype;

		@FindBy(how = How.XPATH, using = "//*[@id='view_all_children_c6']/a")
		private WebElement idnumber;


		public SchoolPlaytimePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			new Selenium(driver);
			selUtil = new Selenium(this.driver);
		}

		// Scenario 9:Verify_Reports_SupportNeeded_Panel_IQA-83

		public void VerifySupportNeeded2(String Support_Title)
		{
			selUtil.waitUntilElementIsPresentOnPage(10, supportpanel2);
			String actualSupportTitle = supportpanel2.getText();
			Assert.assertTrue(actualSupportTitle.contains(Support_Title));
			System.out.println("Panel name displayed is" + actualSupportTitle);
		}

		public void Schoolslessthan80percent(String ScoreEighty) {
			String actualscore = score1.getText();
			Assert.assertEquals(actualscore, ScoreEighty);
			System.out.println("Panel name displayed is" + actualscore);
		}

		public void Schoolslessthan50percent(String Scorefifty) {
			String actualscore2 = score2.getText();
			Assert.assertEquals(actualscore2, Scorefifty);
			System.out.println("Panel name displayed is" + actualscore2);
			Back.click();
		}


		// Scenario 10:@REPORTS_School_Play_Time_this_weekIQA-76

		public void VerifyToogleButton() {
			selUtil.hardWait(2);
			thisweek.click();
			String Actualtogglebutton = thisweek.getText();
			System.out.println("Toogle button clicked" + Actualtogglebutton);
		}

		public void VerifyListofschoolswithplaytimebar() {
			selUtil.hardWait(2);
			for (WebElement row : SchoolName) {
				System.out.println("content >>  " + row.getText());
			}
			Assert.assertTrue(Timebar.isDisplayed());
			System.out.println("School list PlayTimeBar is present");
			// Back.click();
		}

		public void Displaytime() {
			selUtil.hardWait(2);
			for (WebElement row : thisweektime)
			{
				String playtime = row.getText();
				System.out.print("\n" + playtime);
			}

		}

		public void clickOnSchoolYearOfSchoolPlayTimePage()
		{
			selUtil.hardWait(2);
			schoolyear.click();
		}

		public void clickOnCustomOfSchoolPlayTimePage()
		{
			selUtil.hardWait(2);
			customdays.click();
		}



		public void verifytime(String Green, String Orange, String Red) {
			selUtil.hardWait(2);
			String actualGreenT = GreenT.getText();
			Assert.assertEquals(actualGreenT,Green);
			System.out.println("Color is displayed as " + actualGreenT);



			String actualOrangeT = OrangeT.getText();
			Assert.assertEquals(actualOrangeT,Orange);
			System.out.println("Color is displayed as " + actualOrangeT);



			String actualRedT = RedT.getText();
			Assert.assertEquals(actualRedT,Red);
			System.out.println("Color is displayed as " + actualRedT);
			Back.click();
			}

		// Scenario 11:@REPORTS_School_Play_Time_last_week_IQA-208

		public void VerifyToogleButton2() {
			selUtil.hardWait(2);
			lastweek.click();
			String Actualtogglebutton = lastweek.getText();
			System.out.println("Toogle button clicked" + Actualtogglebutton);
		}

		// Scenario 11: @REPORTS_School_Play_Time_last_week_IQA-211

		public void VerifyToogleButton3() throws InterruptedException
		{
			//selUtil.waitUntilElementIsPresentOnPage(5, schoolyear);
			//selUtil.hardWait(2);
			schoolyear.click();
			Thread.sleep(200);
			String Actualtogglebutton = schoolyear.getText();
			System.out.println("Toogle button clicked" + Actualtogglebutton);
		}

		// Scenario 11:Customdate

		public void VerifyToogleButton4() throws InterruptedException {

			selUtil.hardWait(2);
			customdays.click();
			//Thread.sleep(200);
			String Actualtogglebutton = customdays.getText();
			System.out.println("Toogle button clicked" + Actualtogglebutton);

		}

		public void setDate() {
			// Click on calendar icon
			StartDate_picker.click();

			// choose month from dropdown for start date
			Select s = new Select(Month_Picker);
			s.selectByVisibleText("Jan");

			// select Start day from calendar
			StartDate.click();
			System.out.println("Start Date is selected");

			// Click on calendar icon
			EndDate_picker.click();

			// choose month from dropdown for End date
			Select s1 = new Select(Month_Picker);
			s1.selectByVisibleText("Apr");

			// select End day from calendar
			EndDate.click();
			System.out.println("End Date is selected");

			// Click on Checkmark button
			selUtil.waitUntilElementIsPresentOnPage(10, Ok_Checkmark);
			Ok_Checkmark.click();

		}

		public void VerifyListofschoolswithplaytimebar4() throws InterruptedException {
			selUtil.hardWait(2);
			for (WebElement row : SchoolName3) {
				String Actualschool = row.getText();
				System.out.println("Displayed as " + Actualschool);
			}
			Thread.sleep(200);
			Assert.assertTrue(Timebar.isDisplayed());
			System.out.println("School list PlayTimeBar is present");
		}

		// @REPORTS_School_Play_Time_last_week_IQA-86

		public void schooldropdown(String Schooldropdown)
		{
			selUtil.hardWait(2);
			schoolbutton.click();
			selUtil.executeJavaScript("arguments[0].click();", schooldrop);
			String actualschooldropdown = schooldrop.getText();
			Assert.assertEquals(actualschooldropdown, Schooldropdown);
			System.out.println("School selected as " + actualschooldropdown);

		}

		public void teacherdropdown(String Teacherdropdown)
		{
			selUtil.hardWait(5);
			teacherbutton.click();
			selUtil.executeJavaScript("arguments[0].click();", teacherdrop);
			String actualteacherdropdown = teacherdrop.getText();
			System.out.println("Teacher selected as" + actualteacherdropdown);

		}

		public void parentdropdown(String Parentbutton)
		{
			selUtil.hardWait(3);
			parentbutton.click();
			selUtil.executeJavaScript("arguments[0].click();", parentdrop);
			String actualparentbutton = parentdrop.getText();
//			Assert.assertEquals(actualparentbutton, Parentbutton);
//			System.out.println("Parent selected as " + actualparentbutton);

		}

		public void devicedropdown(String deviceName) {
			selUtil.hardWait(2);
			device_button.click();

			selUtil.getAction().moveToElement(deviceNameTitle).click().perform();

			String actualdevicebutton = deviceNameTitle.getText();
			System.out.println("Device selected as Actual : " + actualdevicebutton+" And expected Name : "+deviceName);
			Assert.assertEquals(actualdevicebutton, deviceName);

		}

		public void lastsync(String LastSync) {
			String actuallastsync = lastsync.getText();
			Assert.assertEquals(actuallastsync, LastSync);
			System.out.println("Last Sync is displayed " + actuallastsync);
		}

		public void appversion(String AppVersion) {
			String actualappversion = appversion.getText();
			Assert.assertEquals(actualappversion, AppVersion);
			System.out.println("AppVersion is displayed " + actualappversion);
		}

		public void schoolhomedevice(String SchoolDevice) {
			String actualschoolhomedevice = schoolhomedevice.getText();
			Assert.assertEquals(actualschoolhomedevice, SchoolDevice);
			System.out.println("School/Home Device is displayed " + actualschoolhomedevice);
		}


		public void teacherparentname(String TeacherParentName) {
			selUtil.waitUntilElementIsPresentOnPage(7, teacherparentname);
			String actualteacherparentname = teacherparentname.getText();
			Assert.assertEquals(actualteacherparentname, TeacherParentName);
			System.out.println("AppVersion is displayed " + actualteacherparentname);
		}

		public void verifyschool(String School)
		{
			selUtil.hardWait(2);
			String actualSchool = verifyschool.getText();
			Assert.assertEquals(actualSchool, School);
			System.out.println("AppVersion is displayed " + actualSchool);
		}

		public void devicetype(String DeviceType)
		{
			String actualdevicetype = devicetype.getText();
			Assert.assertEquals(actualdevicetype, DeviceType);
			System.out.println("DeviceType is displayed " + actualdevicetype);
		}

		public void idnumber(String IDnumber)
		{
			String actualidnumber = idnumber.getText();
			Assert.assertEquals(actualidnumber, IDnumber);
			System.out.println("IDnumber is displayed " + actualidnumber);
		}

}
