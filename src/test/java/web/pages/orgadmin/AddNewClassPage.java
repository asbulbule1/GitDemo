package web.pages.orgadmin;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import util.Selenium;
import web.stepdefs.BaseClass;

public class AddNewClassPage extends BaseClass {

	private Selenium selUtil;
	public String finalClassName;
	@FindBy(how = How.XPATH, using = "//button[text()='Back']")
	private WebElement Back;

	// @REPORTS_View_and_edit_classes_IQA-103_sprint4

	@FindBy(how = How.XPATH, using = "(//button[text()='Edit Info'])[1]")
	private WebElement editinfobutton;

	@FindBy(how = How.XPATH, using = "//h2[text()='View All Classes']")
	private WebElement viewclasses;

	@FindBy(how = How.XPATH, using = "//h1[@class='title']")
	private WebElement editinfoheading;

	// @REPORTS_View_and_edit_classes_IQA-102_sprint4

	@FindBy(how = How.XPATH, using = "//*[@id='view_all_classes']/table/tbody/tr/td[1]/a/div")
	private List<WebElement> classes;

	@FindBy(how = How.XPATH, using = "//*[@id='view_all_classes']/table/tbody/tr/td[2]")
	private List<WebElement> teachers;

	@FindBy(how = How.XPATH, using = "//*[@id='view_all_classes']/table/tbody/tr/td[3]")
	private List<WebElement> childrencount;

	@FindBy(how = How.XPATH, using = "//*[@id='view_all_classes']/table/tbody/tr/td[4]")
	private List<WebElement> devicecount;

	@FindBy(how = How.XPATH, using = "//a[@class='sort-link' and contains(text(),'Children')]")
	private WebElement childrentitle;

	@FindBy(how = How.XPATH, using = "//*[@id='view_all_classes_c4']/a")
	private WebElement devicetitle;

	@FindBy(how = How.XPATH, using = "//*[@id='ms-list-1']/button")
	private WebElement schoolclick;

	@FindBy(how = How.XPATH, using = "")
	private WebElement schooldrop1;

//		String schoolNamecommon="//div[@class='ms-options']//label[contains(title,'$SchoolName$')]";
	String schoolNamecommon = "//div[@class='ms-options']//label[@title='$SchoolName$']";

	@FindBy(how = How.XPATH, using = "//span[text()='Active']")
	private WebElement statusclick;

	// @REPORTS_View_and_edit_classes_IQA-104_sprint4

	@FindBy(how = How.XPATH, using = "//*[@class='title' and contains(text(),'Create Your Class')]")
	private WebElement createclass;

	@FindBy(how = How.XPATH, using = "//p/label[contains(text(),'School')]")
	private WebElement schooldropdown;

	@FindBy(how = How.XPATH, using = "//p/label[contains(text(),'Name this class')]")
	private WebElement nameclass;

	@FindBy(how = How.XPATH, using = "//p/label[contains(text(),'Assign a Teacher to this class.')]")
	private WebElement teacherclass;

	@FindBy(how = How.XPATH, using = "//*[@id='add_class']/div[2]/label")
	private WebElement childrenclass;

	@FindBy(how = How.XPATH, using = "//p/label[contains(text(),'What curriculum does this class use?')]")
	private WebElement curriculumclass;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Choose a picture to represent this class.')]")
	private WebElement pictureclass;

	@FindBy(how = How.XPATH, using = "//h2")
	private WebElement createclasstitle;

	@FindBy(how = How.XPATH, using = "//button[@label='Create Class']")
	private WebElement createclassbutton;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')]")
	private WebElement cancelbutton;

	@FindBy(how = How.XPATH, using = "//p[contains (text(), 'Morning Class')]")
	private WebElement addedclass;

	// @REPORTS_Add_new_class_IQA-105_sprint4

	@FindBy(how = How.XPATH, using = "//h5[text()='This field is required']")
	private WebElement errorschool;

	@FindBy(how = How.XPATH, using = "//h5[text()='Class name cannot be blank']")
	private WebElement errorclass;

	@FindBy(how = How.ID, using = "class_size_err")
	private WebElement errorchildren;

	@FindBy(how = How.ID, using = "curriculum_err")
	private WebElement errorcurriculum;

	@FindBy(how = How.ID, using = "class_image_err")
	private WebElement errorpicture;

	// @REPORTS_Add_new_class_IQA-106_sprint4

	@FindBy(how = How.XPATH, using = "//label[normalize-space(.)='School']/ancestor::p/following-sibling::div[contains(@class, 'MuiOutlinedInput-root')]")
	private WebElement Addschool;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Name this class.')]/parent::p/following-sibling::div//input")
	private WebElement ClassName;

	@FindBy(how = How.XPATH, using = "//*[@id='teacher_names']")
	private WebElement AssignTeacher;

	@FindBy(how = How.XPATH, using = "//*[@id='class_size']")
	private WebElement ChildrenCount;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'What curriculum does')]/parent::p/following-sibling::div[contains(@class, 'MuiOutlinedInput-root')]")
	private WebElement Curriculum;

	String CurriculumOptions = "//li[contains (text(),'$Curriculum$') and @role='option']";

	// @FindBy(how = How.XPATH, using =
	// "//*[@id='add_class']/div[4]/ul/li[9]/label/img")
	private String ProfilePic = "(//img[contains (@class, 'MuiAvatar-img')])";

	@FindBy(how = How.XPATH, using = "//h2[@class='morning-text']")
	private WebElement addedschool;

	@FindBy(how = How.XPATH, using = "//*[@id='navbarreportsdropdown_dashboard']")
	private WebElement dashboardmenu;

	// @REPORTS_Add_new_class_IQA-107_sprint4

	@FindBy(how = How.XPATH, using = "//h2")
	private WebElement viewclasspage;

	// NEW insights
	String schoolOption = "//li[@title='$schoolName$']";

	public AddNewClassPage(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		new Selenium(driver);
		selUtil = new Selenium(BaseClass.driver);
	}

	// @REPORTS_View_and_edit_classes_IQA-103_sprint4

	public void Viewtitle(String viewTitle) {
		String actualviewttitle = viewclasses.getText();
		Assert.assertEquals(actualviewttitle, viewTitle);
		System.out.println("View all Classes is displayed " + actualviewttitle);
	}

	public void editinfopage(String EditInfo) {
		selUtil.waitUntilElementIsPresentOnPage(10, editinfobutton);
		editinfobutton.click();
		System.out.println("Edit Info is clicked ");

	}

	public void EditTitle(String EditTitle) {
		selUtil.waitUntilElementIsPresentOnPage(20, editinfoheading);
		String actualeditheading = editinfoheading.getText();
		Assert.assertTrue(actualeditheading.contains(EditTitle));
		System.out.println("EditTitle is clicked " + actualeditheading);
	}

	// @REPORTS_View_and_edit_classes_IQA-102_sprint4

	public void VerifyListofclassesandteachers() {

		selUtil.hardWait(5);
		for (WebElement row : classes) {
			String Actualclass = row.getText();
			System.out.println("Classes are " + Actualclass);
		}

		for (WebElement row : teachers) {
			String Actualteachers = row.getText();
			System.out.println("Teachers are " + Actualteachers);
		}

	}

	public void Verifychildrenscountanddevices(String ChildrenTitle, String DeviceTitle) {
		selUtil.hardWait(5);
		String actualchildren = childrentitle.getText();
		Assert.assertEquals(actualchildren, ChildrenTitle);
		System.out.println("Children title is " + actualchildren);

		for (WebElement row : childrencount) {
			String Actualchildren = row.getText();
			System.out.println("Children count is " + Actualchildren);
		}

		String actualdevice = devicetitle.getText();
		Assert.assertEquals(actualdevice, DeviceTitle);
		System.out.println("Device Title is" + actualdevice);

		for (WebElement row : devicecount) {
			String Actualdevice = row.getText();
			System.out.println("Device count is " + Actualdevice);
		}
	}

	public void VerifyfilterclassesnamewithSchool(String School) {
		selUtil.hardWait(5);
		schoolclick.click();

		String schoolName_xpath = schoolNamecommon.replace("$SchoolName$", School);
		WebElement schoolNameWE = driver.findElement(By.xpath(schoolName_xpath));

		String actualschoolbutton = schoolNameWE.getText();
		schoolNameWE.click();
		Assert.assertEquals(actualschoolbutton, School);
		System.out.println("School selected as " + actualschoolbutton);
	}

	public void VerifyStatusdropdown(String Status) {
		selUtil.waitUntilElementIsPresentOnPage(10, statusclick);
		statusclick.click();
		String StatusOption = "//ul[@role='listbox']/li[@title='$option$']";
		WebElement clsStatus = selUtil.getDriver().findElement(By.xpath(StatusOption.replace("$option$", Status)));
		if (clsStatus.isDisplayed() == true)
			clsStatus.click();
		System.out.println("Status selected");
		Back.click();
	}

	// @REPORTS_View_and_edit_classes_IQA-104_sprint4

	public void VerifyCreateYourClass(String CreateClass) {
		String actualclasstitle = createclass.getText();
		Assert.assertEquals(actualclasstitle, CreateClass);
		System.out.println("CreateClass title is displayed " + actualclasstitle);
	}

	public void VerifyBackbutton(String back) {
		String actualbackbutton = Back.getText();
		Assert.assertEquals(actualbackbutton, back);
		System.out.println("back is displayed " + actualbackbutton);
	}

	public void VerifySchooldropdown(String Schooldropdown) {
		String actualschooldropdown = schooldropdown.getText();
		Assert.assertEquals(actualschooldropdown, Schooldropdown);
		System.out.println("School selected as " + actualschooldropdown);
	}

	public void VerifyNamethisclass(String NameClass) {
		String actualclass = nameclass.getText();
		Assert.assertTrue(actualclass.contains(NameClass));
		System.out.println("NameClass is displayed  " + actualclass);
	}

	public void VerifyAssignTeachertoclass(String TeacherClass) {
		String actualteacherclass = teacherclass.getText();
		Assert.assertEquals(actualteacherclass, TeacherClass);
		System.out.println("TeacherClass is displayed " + actualteacherclass);
	}

	public void Verifychildreninclass(String ChildrenClass) {
		String actualchildclass = childrenclass.getText();
		Assert.assertEquals(actualchildclass, ChildrenClass);
		System.out.println("ChildrenClass is displayed " + actualchildclass);
	}

	public void Verifycurriculumclass(String CurriculumClass) {
		String actualCurriculumClass = curriculumclass.getText();
		Assert.assertEquals(actualCurriculumClass, CurriculumClass);
		System.out.println("CurriculumClass is displayed " + actualCurriculumClass);
	}

	public void VerifyChoosepicturetorepresentclass(String PictureClass) {
		String actualpictureClass = pictureclass.getText();
		Assert.assertEquals(actualpictureClass, PictureClass);
		System.out.println("PictureClass is displayed " + actualpictureClass);
	}

	public void VerifyCreateclassTitle(String CreateClass) {
		String actualCreateClass = createclasstitle.getText();
		Assert.assertEquals(actualCreateClass, CreateClass);
		System.out.println("CreateClass is displayed " + actualCreateClass);
	}

	public void VerifyCreateClassbutton(String CreateClass) {
		String actualCreateClass = createclassbutton.getText();
		Assert.assertEquals(actualCreateClass, CreateClass);
		System.out.println("CreateClass is displayed " + actualCreateClass);
	}

	public void VerifyCancelbutton(String Cancelbutton) {
		String actualCancelbutton = cancelbutton.getText();
		Assert.assertEquals(actualCancelbutton, Cancelbutton);
		System.out.println("Cancelbutton is displayed " + actualCancelbutton);
		cancelbutton.click();
	}

	// @REPORTS_Add_new_class_IQA-105_sprint4

	public void clickcreateclassbutton() {
		selUtil.hardWait(7);
		createclassbutton.click();
	}

	public void errorschool(String Errorschool) {
		selUtil.waitUntilElementIsPresentOnPage(5, errorschool);
		String actualerrorschool = errorschool.getText();
		Assert.assertEquals(actualerrorschool, Errorschool);
		System.out.println("Error message for school is displayed as " + actualerrorschool);
	}

	public void errorclass(String Errorclass) {
		String actualerrorclass = errorclass.getText();
		Assert.assertEquals(actualerrorclass, Errorclass);
		System.out.println("Error message for class is displayed as " + actualerrorclass);
	}

	public void errorchildren(String Errorchildren) {
		String actualerrorchildren = errorchildren.getText();
		Assert.assertEquals(actualerrorchildren, Errorchildren);
		System.out.println("Error message for children is displayed as " + actualerrorchildren);
	}

	public void errorcurriculum(String Errorcurriculum) {
		String actualerrorcurriculum = errorcurriculum.getText();
		Assert.assertEquals(actualerrorcurriculum, Errorcurriculum);
		System.out.println("Error message for curriculum is displayed as " + actualerrorcurriculum);
	}

	public void errorpicture(String Errorpicture) {
		String actualerrorpicture = errorpicture.getText();
		Assert.assertEquals(actualerrorpicture, Errorpicture);
		System.out.println("Error message for picture is displayed as " + actualerrorpicture);
		dashboardmenu.click();
	}

	// @REPORTS_Add_new_class_IQA-106_sprint4

	public void selectschoolfromdropdown(String Expected_SchoolName) {
		// Click on Add school drop-down list
		selUtil.waitUntilElementIsPresentOnPage(10, Addschool);
		Addschool.click();
		String schoolOptionXpath = schoolOption.replace("$schoolName$", Expected_SchoolName);
		WebElement schoolOptionWE = driver.findElement(By.xpath(schoolOptionXpath));
		selUtil.waitUntilElementIsPresentOnPage(10, schoolOptionWE);
		schoolOptionWE.click();

		// li[@title='$schoolName$']

		// choose SchoolName from dropdown
		// Select schoolName = new Select(Addschool);
		// schoolName.selectByVisibleText(Expected_SchoolName);

		System.out.println("School selected as " + Expected_SchoolName);
	}

	public void enterNamethisclass(String Expected_ClassName) throws InterruptedException {
		// Click on ClassName textbox
		ClassName.click();

		// Entering class name
		// ClassName.sendKeys(Expected_ClassName);
		// public void EnterEmailAddress1(String EAddress) {
		// Random randomGenerator = new Random();
		// double randomInt = randomGenerator.nextInt(1000);
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String randomPart = RandomStringUtils.random(4, characters);
		finalClassName = Expected_ClassName + "_" + randomPart;

		ClassName.click(); // Click first
		Thread.sleep(500); // Give it a moment
		ClassName.sendKeys(finalClassName);
		System.out.println("Final classname is " + finalClassName);
	}

	public void Assignteacherclassdropdown(String expected_Assignteacher) {
		// Click on Assign teachers drop-down list
		AssignTeacher.click();

		// choose Assign teachers from dropdown
		selUtil.hardWait(7);
		Select SelectTeacher = new Select(AssignTeacher);
		SelectTeacher.selectByVisibleText(expected_Assignteacher);
		System.out.println("Assigned teacher name is " + expected_Assignteacher);
	}

	public void countofchildrenclassdropdown(String expected_Childrencount) {
		// Click on Children count drop-down list
		ChildrenCount.click();

		// choose Children count from dropdown
		Select SelectCount = new Select(ChildrenCount);
		SelectCount.selectByVisibleText(expected_Childrencount);
		System.out.println("Selected Children count is " + expected_Childrencount);
	}

	public void curriculamclassdropdown(String expected_curriculum) {
		// Click on curriculum drop-down list
		selUtil.waitUntilElementIsPresentOnPage(10, Curriculum);
		Curriculum.click();
		String CurriculumOptionsXpath = CurriculumOptions.replace("$Curriculum$", expected_curriculum);
		WebElement CurriculumOptionsWE = driver.findElement(By.xpath(CurriculumOptionsXpath));
		selUtil.waitUntilElementIsPresentOnPage(10, CurriculumOptionsWE);
		CurriculumOptionsWE.click();

		// choose curriculum value from dropdown
		// Select Selectcurriculum = new Select(Curriculum);
		// Selectcurriculum.selectByVisibleText(expected_curriculum);

		System.out.println("Selected curriculum is " + expected_curriculum);
	}

	public void picture() {
		// ProfilePic.click();
		List<WebElement> images = driver.findElements(By.xpath(ProfilePic));

		if (!images.isEmpty()) {
			Random rand = new Random();
			int randomIndex = rand.nextInt(images.size());
			images.get(randomIndex).click();
			System.out.println("Clicked on image at index: " + randomIndex);
		} else {
			System.out.println("No matching elements found.");
		}
	}

	public void createclassbutton() {
		createclassbutton.click();
		System.out.println("Class is added successfully");

	}

	public void Verifyaddschooltitle(String Expected_ClassName) {
		String actualaddedschool = addedschool.getText();
		Assert.assertEquals(actualaddedschool, finalClassName);
		System.out.println("Class verified successfully " + finalClassName);
		// dashboardmenu.click();
	}

	// @REPORTS_Add_new_class_IQA-107_sprint4

	public void clickCancelbutton(String Cancelbutton) {
		selUtil.waitUntilElementIsPresentOnPage(20, cancelbutton);
		cancelbutton.click();
		System.out.println("Clicked on Cancel Button");
	}

	public void Verifyviewclasspage(String ViewClassPage) {
		selUtil.waitUntilElementIsPresentOnPage(20, viewclasspage);
		String actualviewclasspage = viewclasspage.getText();
		Assert.assertTrue(actualviewclasspage.contains(ViewClassPage));
		System.out.println("Verified All Classes page successfully " + actualviewclasspage);
		Back.click();
	}

	public void Verifyaddedclasstitle() {
		selUtil.waitUntilElementIsPresentOnPage(10, addedclass);
		String actualclassname = addedclass.getText();
		Assert.assertEquals(actualclassname, finalClassName);
		System.out.println("Class verified successfully " + finalClassName);
//			dashboardmenu.click();
	}

}
