package web.pages.parent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.Selenium;
public class Parentloginpage
{
	private WebDriver driver;
	private Selenium selUtil;



	@FindBy(how = How.ID,using = "LoginForm_username")
	private WebElement emailID;

	@FindBy(how = How.ID,using = "LoginForm_password")
	private WebElement enterpassword;

	@FindBy(how = How.ID,using = "setPassBtn")
	private WebElement letsgo;


	public Parentloginpage(WebDriver driver)
	{
		this.driver = driver;
        PageFactory.initElements(driver, this);
        selUtil = new Selenium(driver);
	}

	public void envurl(String url)
	{

		selUtil.getDriver().get(url);
	}

	public void enterEmailID(String username)
	{
		emailID.sendKeys(username);
	}

	public void enterPassword(String password)
	{
		enterpassword.sendKeys(password);
	}

	public void clickOnLetsGo()
	{
		letsgo.click();
	}


}

