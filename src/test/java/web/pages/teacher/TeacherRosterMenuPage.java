package web.pages.teacher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.Selenium;

public class TeacherRosterMenuPage
{
	private WebDriver driver;
	private Selenium selUtil;

	@FindBy(how=How.XPATH,using="//select[@id='school_name']")
	private WebElement schooldrp;

	@FindBy(how=How.XPATH,using="//input[@id='class_name']")
	private WebElement classname;

	@FindBy(how=How.XPATH,using="//select[@id='curriculum_id']")
	private WebElement curricularname;

	@FindBy(how=How.ID,using="save_class")
	private WebElement createclassbtn;

	@FindBy(how=How.XPATH,using="//span[@class='success-text']")
	private WebElement succesmsg;

	@FindBy(how=How.XPATH,using="//a[@class='btn_blue_text']")
	private WebElement canclebtn;

	@FindBy(how=How.ID,using="//*[@id='add_class']/div[3]/ul/li[7]/label/img")
	private WebElement profilepic;

	public TeacherRosterMenuPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(driver);
	}
	public void selectSchoolDropdown(String schdrpname)
	{
		Select Selectschools = new Select(schooldrp);
		Selectschools.selectByVisibleText(schdrpname);
		System.out.println("Selected schools is "+schdrpname);
	}

	public void enterClassName(String clsname)
	{
		classname.sendKeys(clsname);
	}
	public void selectCurricularDropdown(String curdrp)
	{
		Select Selectcurricular=new Select(curricularname);
		Selectcurricular.selectByVisibleText(curdrp);
		System.out.println("Selected Curricular name is"+curdrp);
	}
	public void clickOnProfilePic()
	{
      profilepic.click();
	}
	public void clickOnCreateClassButon()
	{
		createclassbtn.click();
	}
	public void verifySuccessMsg()
	{
		String actualmsg= succesmsg.getText();
		System.out.println("Message is displayed as"+actualmsg);

	}
}
