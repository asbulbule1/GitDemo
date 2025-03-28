package web.pages.schooladmin;

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

import io.cucumber.datatable.DataTable;
import util.Selenium;

@SuppressWarnings("unused")
public class SchoolAdminRosterMenuPages {
	private WebDriver driver;
	private Selenium sel;
	public static Selenium selUtil;


	String seeClassesonViewClassesPage = "//a/div[@type='/button' and not (contains(@class, 'ghosthoverblue editbtn'))]";

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Select a class name')]")
	private WebElement selectClassDropdown;

	@FindBy(how = How.XPATH, using = "//th[@id='view_all_classes_c4']")
	private WebElement editTitle;

	@FindBy(how = How.XPATH, using = "//select[@id='select_is_active']")
	private WebElement statusdropdown;

	@FindBy(how = How.XPATH, using = "//body")
	private WebElement clickOnBlankSapace;

	@FindBy(how = How.XPATH, using = "//*[@id='view_all_classes']/table/tbody/tr/td[4]")
	private List<WebElement> editcounts;

	@FindBy(how = How.ID, using = "carry_over_children")
	private WebElement addLastYearschildbutton;

	@FindBy(how = How.ID, using = "remove-parent")
	private WebElement removeparentbutton;

	@FindBy(how = How.ID, using = "parent_first_name0")
	private WebElement parentfirstnametextbox;

	@FindBy(how = How.XPATH, using = "//button[@id='saveAndAddAnother']")
	private WebElement saveaddanotherbutton;

	@FindBy(how = How.ID, using = "info_alert ")
	private WebElement alertmessage;

	public SchoolAdminRosterMenuPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		sel = new Selenium(driver);

	}

	public void clickOnSelectClassDrodownAndSelectClass(DataTable selectClassFromDropdown) {
		selectClassDropdown.click();
		String commanclassNameOnAddTeacherXpath1 = "//label[@title='$classlName$']//span";

		List<String> classlListexpected = selectClassFromDropdown.asList();
		for (String expectedClassName : classlListexpected) {
			String className = commanclassNameOnAddTeacherXpath1.replace("$classlName$", expectedClassName);
			WebElement selectSchoolFromList = driver.findElement(By.xpath(className));
			sel.getAction().moveToElement(selectSchoolFromList).click().perform();

		}
		clickOnBlankSapace.click();

	}

	public void seeListOfclassesUnderHeaderName() {
		List<WebElement> listOfclaasesOnViewClasses = driver.findElements(By.xpath(seeClassesonViewClassesPage));
		for (WebElement element : listOfclaasesOnViewClasses) {
			sel.getFluentWait(3);
			String classeslistOnViewClassesPage = element.getText();
			System.out.println(classeslistOnViewClassesPage);
			Assert.assertTrue(element.isDisplayed());
		}
	}

	public void availabilityofeditbutton(String EditTitle) {
		sel.hardWait(1);
		String actualtitle = editTitle.getText();
		Assert.assertEquals(actualtitle, EditTitle);
		System.out.println("Edit button column title is " + actualtitle);

		for (WebElement row : editcounts) {
			String Actualtitle = row.getText();
			System.out.println("Edit button is available - " + Actualtitle);
		}

	}

	public void verifyThelistofInactiveClasses(String status) {
		statusdropdown.click();
		Select select = new Select(statusdropdown);
		select.selectByVisibleText(status);
		sel.hardWait(7);
		System.out.println(status + " status is selected.");
	}

	public void clickOnAddLastYearsChildrenButton() {
		addLastYearschildbutton.click();
	}

	public void removeParent() {
		removeparentbutton.click();
		Assert.assertTrue(parentfirstnametextbox.getAttribute("value").isBlank());

	}

	public void saveandaddanother() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", saveaddanotherbutton);

	}

}
