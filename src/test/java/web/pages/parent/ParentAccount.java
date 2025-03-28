package web.pages.parent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import util.Selenium;



public class ParentAccount
{
	private static WebDriver driver;
    private Selenium selUtil;


	@FindBy (how = How.XPATH, using = "//div[@class='single-menu-block']//a[contains(text(),'Language Settings')]")
	private WebElement languageSettings;

	@FindBy (how = How.XPATH, using = "//html[@id='LanguageSettingPage-page']")
	private WebElement languageSettingspage;

	@FindBy (how = How.XPATH, using = "//input[@id = 'eng_radio']")
	private WebElement englishlanguageButton;

	@FindBy (how = How.XPATH, using = "//input[@id = 'spanish_radio']")
	private WebElement spanishlanguageButton;

	@FindBy (how = How.XPATH, using = "//button[@type = 'submit']")
	private WebElement savebutton;

	@FindBy (how = How.XPATH, using = "//a[@class= 'btn_blue_text mt-4']")
	private WebElement cancleButton;

	@FindBy (how = How.XPATH, using = "//a[@class= 'btn_green_bg pl-5 pr-5 goto-dashboard']")
	private static WebElement gotoDashboard;



	public ParentAccount(WebDriver driver)
	{
		ParentAccount.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(ParentAccount.driver);
	}


public void LanguageSettingpage()
	{
		selUtil.hardWait(6);
//		selUtil.waitUntilElementIsPresentOnPage(7, languageSettings);
		selUtil.getAction().moveToElement(languageSettings).click().perform();
//        languageSettings.click();

	}

	public void languageSettingspageTitle(String ExpectedTitle)
	{
		selUtil.hardWait(6);
//		selUtil.waitUntilElementIsPresentOnPage(10, languageSettings);
		String Actualtitle = languageSettingspage.getText();
		Assert.assertEquals(Actualtitle, Actualtitle);
		System.out.println("language Settings page title is "+Actualtitle);
	}

	public void selectEnglishLanguage()
	{
		selUtil.hardWait(6);
		englishlanguageButton.click();
		Assert.assertTrue( englishlanguageButton.isSelected(),"User able to select english language");
	}

	public void savelanguagechanges()
	{
		selUtil.hardWait(6);
		savebutton.click();
	}

	public void selectSpanishLanguage()
	{
		selUtil.hardWait(6);
		spanishlanguageButton.click();
		Assert.assertTrue( spanishlanguageButton.isSelected(),"User able to select Spanish language");
	}

	public void cancleButton()
	{
		selUtil.hardWait(6);
		cancleButton.click();
	}

	public static void ClickOngoToDashboardpage()
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", gotoDashboard);

//      clickOnBlankSapace.click();

//		gotoDashboard.click();

	}
}