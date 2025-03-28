package web.pages.orgadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import util.Selenium;

@SuppressWarnings("unused")
public class OrgAdminCarouselPage {

	private WebDriver driver;
	public static Selenium selUtil;

	// Carosel Products

	@FindBy(how = How.XPATH, using = "//button[@class='owl-next']")
	private WebElement casoselProductNextButton;

	@FindBy(how = How.XPATH, using = "//div[@class='owl-stage']")
	private WebElement casoselProductframe;

	String title= "//h2[contains(text(), '$title$')]";

	public OrgAdminCarouselPage(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(this.driver);
	}

	String commanCarouselXpath1 = "//div[@class='owl-item active']//h5[contains(text(),'$caroselproduct1$')]";
	String CommonCarouselLink = "//div[@class='owl-item active']//h5[contains(text(),'$caroselproduct1$')]//parent::div/parent::*";

	public void navigatedToGivenReportPage(String expectedReportPageTitle) {
		String reportPageTitle=title.replace("$title$", expectedReportPageTitle);
		WebElement reportPageTitleWE=driver.findElement(By.xpath(reportPageTitle));		
		selUtil.waitUntilElementIsPresentOnPage(60, reportPageTitleWE);
		System.out.println("I Naviagted to " + expectedReportPageTitle + " Report Page");
		Assert.assertEquals(reportPageTitleWE.getText(), expectedReportPageTitle);
	}

	public void waitTimeForPage(int expectedWaitTime) {
		selUtil.hardWait(expectedWaitTime);
	}

	public void seeCarouselProducts(DataTable dataTable) throws InterruptedException, AWTException {

		List<String> carousellist = dataTable.asList();
		int counter = 0;
		int page = 0;

		for (String expectedCarousel : carousellist) {
			String caroselXpath = commanCarouselXpath1.replace("$caroselproduct1$", expectedCarousel);
			WebElement caroselwe = driver.findElement(By.xpath(caroselXpath));
			counter++;
			selUtil.waitUntilElementIsPresentOnPage(60, caroselwe);
			if (casoselProductframe.isDisplayed()) {

				selUtil.getAction().moveToElement(caroselwe).perform();
				System.out.println(expectedCarousel + " : " + caroselwe.getText());
//				Assert.assertEquals(caroselwe.getText(),expectedCarousel);
				Assert.assertTrue(caroselwe.getText().contains(expectedCarousel));
			}
			if (counter == 3)

			{
				//selUtil.waitUntilElementIsPresentOnPage(60, casoselProductNextButton);
				page++;
				selUtil.hardWait(10);
				//casoselProductNextButton.click();
				selUtil.getAction().moveToElement(casoselProductNextButton).perform();
				casoselProductNextButton.click();
				System.out.println("user click on page : " + page);
				counter = 0;
			}
		}
	}

	public void clickOnCarouselProducts(DataTable expectedCarouselProduct) {
		List<String> carousellist = expectedCarouselProduct.asList();
		int counter = 0;
		int page = 0;

		for (String expectedCarousel : carousellist) {
			String caroselLinkXpath = CommonCarouselLink.replace("$caroselproduct1$", expectedCarousel);
			WebElement caroselLinkwe = driver.findElement(By.xpath(caroselLinkXpath));

			counter++;
			selUtil.waitUntilElementIsPresentOnPage(50, casoselProductframe);
			boolean isCarouselProductFramePresent = selUtil.isElementExists(casoselProductframe);
			if (isCarouselProductFramePresent) {
				selUtil.getAction().moveToElement(casoselProductframe).perform();
				String carouselLink = caroselLinkwe.getAttribute("href");
				selUtil.executeJavaScriptToWebElement("window.open('');");

				Set<String> reportpagewindow = driver.getWindowHandles();
				Iterator<String> navigatedwin = reportpagewindow.iterator();
				String parent = navigatedwin.next();
				String child = navigatedwin.next();
				selUtil.getDriver().switchTo().window(child);
				selUtil.getDriver().get(carouselLink);
				Assert.assertTrue(true, selUtil.getDriver().getTitle());
				System.out.println(selUtil.getDriver().getTitle());
				selUtil.getDriver().close();
				selUtil.getDriver().switchTo().window(parent);
			}
			if (counter == 3) {
				page++;
				//selUtil.waitUntilElementIsPresentOnPage(50, casoselProductNextButton);
				selUtil.getAction().moveToElement(casoselProductNextButton).perform();
				casoselProductNextButton.click();
				System.out.println("user click on page : " + page);
				counter = 0;
			}
		}
	}

	public void nevigattionToRespectiveReportPage(String expectedReportPage) {
		String reportPageTitle=title.replace("$title$", expectedReportPage);
		WebElement reportPageTitleWE=driver.findElement(By.xpath(reportPageTitle));
		
		
		selUtil.waitUntilElementIsPresentOnPage(60, reportPageTitleWE);
		System.out.println("I Naviagted to " + reportPageTitleWE + " Report Page");
		Assert.assertEquals(reportPageTitleWE.getText(), expectedReportPage);
	}
}
