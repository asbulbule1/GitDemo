package web.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.Selenium;
import web.stepdefs.BaseClass;

@SuppressWarnings("unused")
public class LoginPage extends BaseClass {
	private WebDriver driver;
	private Robot robot;

	@FindBy(how = How.NAME, using = "email")
	private WebElement emailID;

	@FindBy(how = How.NAME, using = "password")
	private WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement submit;

	@FindBy(how = How.ID, using = "setPassBtn")
	private WebElement popupClose;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterEmailID(String email) throws InterruptedException, AWTException {
		selUtil.hardWait(2);
		emailID.sendKeys(email);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickOnLetsGo() throws AWTException {
		submit.click();
		settingZoomLevel();
	}
	
	public void zoomOutlevel() throws AWTException
	
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	public void settingZoomLevel() throws AWTException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
        long zoomLevel = (long) js.executeScript("return Math.round(window.devicePixelRatio * 100);");
        while (zoomLevel>100)
        {
        	zoomOutlevel();
        	zoomLevel = (long) js.executeScript("return Math.round(window.devicePixelRatio * 100);");
            System.out.println("Zoom Level: " + zoomLevel + "%");

        }
	}

}
