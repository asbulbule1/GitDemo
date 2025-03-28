package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Base64;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Selenium
{
	private WebDriver driver = null;

	public Selenium(WebDriver driver)
	{
		this.driver = driver;
	}

	public boolean isElementExists(int secondsToWait, WebElement we)
	{
		boolean isExist = false;

		try
		{
			waitUntilElementIsPresentOnPage(secondsToWait, we);
			isExist = we.isDisplayed();
		}
		catch(Exception e)
		{
			//e.printStackTrace();
		}

		return isExist;
	}

	public boolean isElementExists(WebElement we)
	{
		return isElementExists(10, we);
	}

	public WebElement getElementFromXpath(String xpathExpression)
	{
		return driver.findElement(By.xpath(xpathExpression));
	}

	@SuppressWarnings("resource")
	public String takeScreenShotAsBase64() throws IOException
	{
		//Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot)getDriver());

        //Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File DestFile = new File("test-output//SparkReport//screenshots//"+new SimpleDateFormat("dd-MMM-yyyy_HHmmss").format(new Date())+".png");

        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
        FileInputStream fileInputStreamReader = new FileInputStream(DestFile);
        byte[] bytes = new byte[(int)DestFile.length()];
        fileInputStreamReader.read(bytes);
        String encodedFile = Base64.getEncoder().encodeToString(bytes);

        return encodedFile;
	}

	/**
	 * The Cucumber 6 Adapter for ExtentReports report have inbuilt support to attach screenshot as Base64.
	 *
	 * <p>
	 * Along with entry in config file, report adapter expects to call attach method with byte[] as param.
	 *
	 * @return byte[]
	 * @throws IOException
	 */
	public byte[] takeScreenShotAsByte()
	{
		//Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot)getDriver());

		//Call getScreenshotAs method to create image and convert it to byte[]
        return scrShot.getScreenshotAs(OutputType.BYTES);
	}

	/**
	 * Actions gives us the user-facing API for emulating complex user gestures.
	 * We can use this class rather than using the Keyboard or Mouse directly.
	 *
	 * <p>Implements the builder pattern: Builds a CompositeAction containing all actions specified by themethod calls.
	 *
	 * @return Actions
	 */
	public Actions getAction()
	{
		Actions actions = new Actions(getDriver());
		return actions;
	}

	/**
	 * Use this method to execute your own JavaScript.
	 * <p>
	 * <b>It is advisable to use this method only in case if selenium interface
	 * functions fail to work apporpriately as expected by test script</b>.
	 *
	 * <p>
	 * This method indicates that a driver can execute JavaScript, providing access to the
	 * mechanism to do so. Because of cross domain policies browsers enforce your
	 * script execution may fail unexpectedlyand without adequate error messaging.
	 * This is particularly pertinent when creating your own
	 * XHR (XMLHttpRequest is an API available to web browser scripting languages such as JavaScript.)
	 * request or when trying to access another frames. Most times when troubleshooting failure
	 * it'sbest to view the browser's console after executing the WebDriver request.
	 *
	 * @param scriptToExecute
	 *
	 * @return void
	 */
	public void executeJavaScriptToWebElement(String scriptToExecute)
	{
		JavascriptExecutor jse = ((JavascriptExecutor) getDriver());
		jse.executeScript(scriptToExecute);
	}

	/**
	 * Use this method to execute your own JavaScript.
	 * <p>
	 * <b>It is advisable to use this method only in case if selenium interface
	 * functions fail to work apporpriately as expected by test script</b>.
	 *
	 * <p>
	 * This method indicates that a driver can execute JavaScript, providing access to the
	 * mechanism to do so. Because of cross domain policies browsers enforce your
	 * script execution may fail unexpectedlyand without adequate error messaging.
	 * This is particularly pertinent when creating your own
	 * XHR (XMLHttpRequest is an API available to web browser scripting languages such as JavaScript.)
	 * request or when trying to access another frames. Most times when troubleshooting failure
	 * it'sbest to view the browser's console after executing the WebDriver request.
	 *
	 * @param scriptToExecute
	 * @param webElement
	 *
	 * @return void
	 */
	public void executeJavaScript(String scriptToExecute, WebElement we)
	{
		JavascriptExecutor jse = ((JavascriptExecutor) getDriver());
		jse.executeScript(scriptToExecute, we);
	}

	/**
	 * This method waits until web element is refreshed from page until given seconds are expired or before.
	 * This method tries to avoid stale element exception by monitoring element refresh incident.
	 * <p><b>It is advisable to use this method only in case if test execution is failing due to stale element exception</b>.
	 *
	 * <p>This method uses fluentwait.
	 *
	 * @param seconds
	 * @param webelement
	 *
	 * @return void
	 */
	public void getNonStaleElement(int seconds, WebElement webelement)
	{
		Wait<WebDriver> wait = new FluentWait<>(driver)
			    .withTimeout(Duration.ofSeconds(seconds))
			    .pollingEvery(Duration.ofMillis(500))
			    .ignoring(NoSuchElementException.class)
			    .ignoring(StaleElementReferenceException.class);

		wait.until(ExpectedConditions.refreshed(ExpectedConditions.and(ExpectedConditions.visibilityOf(webelement), ExpectedConditions.elementToBeClickable(webelement))));
	}

	/**
	 * This method waits until web element is invisible from page until given seconds are expired or before.
	 * <p>
	 * This method uses fluentwait.
	 *
	 * @param seconds
	 * @param webelement
	 *
	 * @return void
	 */
	public void waitUntilElementToBeInvisible(int seconds, WebElement webelement)
	{
		Wait<WebDriver> wait = getFluentWait(seconds);
		wait.until(ExpectedConditions.invisibilityOf(webelement));

	}

	/**
	 * This method suspends the execution considering as time-wait for given seconds.
	 * Hence this method uses thread.sleep and use of this is method is not advised.
	 *
	 * @param seconds
	 *
	 * @return void
	 *
	 * @exception InterruptedException
	 */
	public void hardWait(int seconds)
	{
		try
		{
			Thread.sleep((seconds*1000));
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}

	/**
	 * This method waits until web element is visible on-page and waits until same element is clickable
	 * until given seconds are expired or before.
	 * <p>
	 * This method uses fluentwait.
	 *
	 * @param seconds
	 * @param webelement
	 *
	 * @return void
	 */
	public void waitUntilElementIsPresentOnPage(int seconds, WebElement webelement)
	{
		Wait<WebDriver> wait = getFluentWait(seconds);
		wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(webelement), ExpectedConditions.elementToBeClickable(webelement)));
	}

	/**
	 * This method returns 'FluentWait' instance.
	 * <p>
	 * This method is to be called when conditional or conditional evaluation based driver
	 * wait is required. Wait will happen for given seconds and polling after 500 milliseonds
	 * and ignoring 'NoSuchElementException' exception.
	 *
	 * @param seconds
	 *
	 * @return wait
	 */
	public Wait<WebDriver> getFluentWait(int seconds)
	{
		Wait<WebDriver> wait = new FluentWait<>(getDriver())
				.withTimeout(Duration.ofSeconds(seconds))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		return wait;
	}

	/**
	 * This method returns the WebDriver instance 'driver' as per set up done by
	 * <p>
	 * This method is to be used only after atleast once {@link Selenium.setupDriver} is called.
	 * Method returns null, if any issues in setup method or if browser binary doesnt exist etc.
	 *
	 * @return WebDriver
	 */
	public WebDriver getDriver()
	{
		if (driver == null)
			System.out.println("Driver not initialized, please check setup method! Returning null driver...");

		return driver;
	}
}
