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
import util.Util;
import web.pages.CommonPage;

@SuppressWarnings("unused")
public class TeacherSkillSupportPage {

	private Selenium sel;
	@FindBy(how=How.XPATH,using="//h1[@class='title']")
	private WebElement pagetitle;

	public TeacherSkillSupportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		sel = new Selenium(driver);
		selUtil = new Selenium(driver);
	}

	private WebDriver driver;
	private Selenium selUtil;
	private Util util;
	private CommonPage common;

	@FindBy(how = How.XPATH, using = "//select[@id='school_list']")
	private WebElement schdrp;

	@FindBy(how = How.XPATH, using = "//div[@id='ms-list-2']")
	private WebElement clsdrp;

	String selectclassCheckBoxXpath = "//li[contains(data-search-term,'')]/label[@title='$ClassName$']/span";

//	String selectclassCheckBoxXpath="//li[@data-search-term='$ClassName$']//span";

	public void select_school_dropdown(String chilschdropdown) {
		selUtil.waitUntilElementIsPresentOnPage(5, schdrp);
		Select select_child_schooldropdown = new Select(schdrp);
		select_child_schooldropdown.selectByVisibleText(chilschdropdown);
	}

	public void select_class_dropdown(String chilclsdropdown) {
		selUtil.waitUntilElementIsPresentOnPage(5, clsdrp);
		Select select_child_schooldropdown = new Select(schdrp);
		select_child_schooldropdown.selectByVisibleText(chilclsdropdown);
	}

	public void select_class_dropdown(DataTable expectedclassName) {
		selUtil.hardWait(3);
		clsdrp.click();
		List<String> classFromDropDownlist = expectedclassName.asList();
		selUtil.hardWait(2);
		for (String clas : classFromDropDownlist) {

			String selectclassNameXpath = selectclassCheckBoxXpath.replace("$ClassName$", clas);

			WebElement selectclassNameMenuwe = driver.findElement(By.xpath(selectclassNameXpath));

			selUtil.waitUntilElementIsPresentOnPage(10, selectclassNameMenuwe);
			selUtil.getAction().moveToElement(selectclassNameMenuwe).click().perform();
			Assert.assertTrue(selectclassNameMenuwe.isDisplayed());
		}

	}

	@FindBy(how = How.XPATH, using = "//div[@id='smallgroupactivities']")
	private WebElement tiles;
	// div[@id='smallgroupactivities']

	@FindBy(how = How.XPATH, using = "(//div[@class='smallgroupchild']) [1]")
	private WebElement childtile;
	// div[@class='smallgroupchild']) [1]

	@FindBy(how = How.XPATH, using = "//h1[@class='title']")
	private WebElement curriculartitle;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Browse the Full Experience Library')]")
	private WebElement browseTheFullButton;


	public void clickonBrowsethefullexpButton()
	{
		browseTheFullButton.click();
	}



	public void getchildname() {

		boolean isTiles = selUtil.isElementExists(tiles);

		if (isTiles) {
			System.out.println("Tile is present and name of the child is " + childtile.getText());
		} else {
			System.out.println("Tiles are not present on the page");
		}

	}

	public void seeCurricularTitle(String recommendecurricular)
	{
		sel.hardWait(5);
		String actualtitle = curriculartitle.getText();
		Assert.assertEquals(actualtitle, recommendecurricular);
		System.out.println("Title name displayed is" + actualtitle);

	}
	public void verifySupportNeededTitle(String Support_Title)
	{
		selUtil.waitUntilElementIsPresentOnPage(60, pagetitle);
		String actualpgname= pagetitle.getText();
		Assert.assertEquals(actualpgname, Support_Title);
		System.out.println("Page name is displayed as"+actualpgname);
	}

}
