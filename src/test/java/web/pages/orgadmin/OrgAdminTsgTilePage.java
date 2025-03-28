package web.pages.orgadmin;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.Selenium;
import util.Util;

public class OrgAdminTsgTilePage
{
	private WebDriver driver;
	private Selenium  selUtil;
	private Util util;

	@FindBy(how=How.XPATH,using="//select[@id='yw0']/option")
	private List <WebElement> pagination;

	@FindBy(how=How.XPATH,using="//td[@class='pl-3']/a")
	private List <WebElement> numberofchild;

	@FindBy(how=How.XPATH,using="//li[@class='last']/a")
	private WebElement lastbtn;

	@FindBy(how=How.XPATH,using="//td[@class='redtext']")
	private List <WebElement> redtext;

	@FindBy(how=How.XPATH,using="//td[@class='yellowtext']")
	private WebElement yellowtext;

	@FindBy(how=How.XPATH,using="//td[@class='greentext']")
	private WebElement greentext;

	@FindBy(how=How.XPATH,using="//table[@class='items fullwidth alternating common-table-layout hatch-sync-tsg-table table-striped']/thead/tr/th[5]")
	private WebElement percentagecol;

	@FindBy(how=How.XPATH,using="//tbody//tr//img")
	private List<WebElement> hatchstatus;

	@FindBy(how=How.XPATH,using="//select[@id='pageSize']")
	private WebElement selectperpage;



	public OrgAdminTsgTilePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(this.driver);
		util=new Util();

	}
	public void countNumberOfpages()
	{


		int paginationcount= pagination.size();
		System.out.println("Page count is"+paginationcount);


		int childcountoffirstpage=numberofchild.size();
		System.out.println("Child count of first page is"+childcountoffirstpage);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", lastbtn);
		lastbtn.click();


		int childcountoflastpage=numberofchild.size();
		System.out.println("Child count of last page is"+childcountoflastpage);


		int totalchildcount=childcountoffirstpage+(paginationcount-1)*20;
		System.out.println("Total Children count from all pages is" +totalchildcount);
	}

	public void countTotalNumberOfChildrenMatched()
	{
		int paginationcount= pagination.size();
		System.out.println("Page count is"+paginationcount);

		List<String>percentage=new ArrayList<>();
		for(WebElement red:redtext)
		{
			String actualperecentage= red.getText();
			System.out.println("Red count is"+actualperecentage);
		}
	}
	public void verifyHatchSyncStatus()
	{
		int paginationofresult= pagination.size();
		System.out.println("Page count is displayed as"+paginationofresult);
		List<String>status=new ArrayList<>();
		for(WebElement hatch_status:hatchstatus)
		{
			String actualstatus=hatch_status.getText();
			System.out.println("Status is displayed as" +actualstatus);
		}

	}
	public void selectResultPerPage(String result)
	{
		Select select=new Select(selectperpage);
		select.selectByValue(result);
	}
}







