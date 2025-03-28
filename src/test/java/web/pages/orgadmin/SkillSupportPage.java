package web.pages.orgadmin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import util.Selenium;

public class SkillSupportPage {
	private WebDriver driver;
	private Selenium selUtil;

	private String subdomain_xpath="//h3[@class='skillfamily' and text()='subdomainname']";

	private String domain_xpath="//h2[@class='skillfamily' and text()='domainname']";

	@FindBy(how=How.XPATH,using="//*[@id=\"navbarTogglerDemo02\"]/ul/li[4]/div/div/div/h3")
	private WebElement datadriven;

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Recommended Curricular Experiences')]")
	private WebElement recommendedexperience;
//
//	@FindBy(how=How.XPATH,using="(//a[text()='All Curricular Experiences'])[2]")
//	private WebElement allcurricularexp;

	@FindBy(how=How.LINK_TEXT,using="Support Needed")
	private WebElement supportneeded;

	@FindBy(how=How.XPATH,using="//h1[contains(text(),'All Curricular Experiences')]")
	private WebElement allcurricularexperince;

	@FindBy(how=How.LINK_TEXT,using="Curricular Experiences Library")
	private WebElement allcurricularmenu;

	@FindBy(how=How.XPATH,using="//*[@id='sg-social-div'][1]")
	private WebElement socialaccordian;

	@FindBy(how=How.XPATH,using="//h2[@class='skillfamily']")
	private List<WebElement> alldomain;

	@FindBy(how=How.XPATH,using="//*[@id='Social']/h3[1]")
	private WebElement selfsubdomain;

	@FindBy(how=How.XPATH,using="//*[@id='Social']/h3[2]")
	private WebElement communitysubdomain;

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Recommended for Your Class')]")
	private WebElement recommendedforclass;

	@FindBy(how=How.XPATH,using="//h1[contains(text(),'Curricular Experiences Recommendations')]")
	private WebElement curricularexpreco;

	@FindBy(how=How.XPATH,using="//*[@id='Science']/h3[1]")
	private WebElement lifesciencesubdomain;

	@FindBy(how=How.XPATH,using="//*[@id='Science']/h3[2]")
	private WebElement physicalsciencesubdomain;

	@FindBy(how=How.XPATH,using="//*[@id='Science']/h3[3]")
	private WebElement earthsciencesubdomain;

	@FindBy(how=How.XPATH,using="//*[@id='Science']/h3[4]")
	private WebElement simpletoolssubdomain;

	@FindBy(how=How.XPATH,using="//*[@id='sg-social-div'][2]")
	private WebElement lifeaccordian;

	@FindBy(how=How.XPATH,using="//h2[contains(text(),'Science & Technology')]")
	private WebElement sciencedomain;

	@FindBy(how=How.XPATH,using="//a[@class='ghosthover backbtn']")
	private WebElement backbtn;

	@FindBy(how=How.CLASS_NAME,using="welcome-title")
	private WebElement welcometitle;

	public SkillSupportPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		selUtil = new Selenium(this.driver);

	}
	public void seeDataDriven(String DataDrivenInstruction)
	{
		String actualDataname=datadriven.getText();
		Assert.assertEquals(actualDataname, DataDrivenInstruction);
		System.out.println("menu name displyed as" +actualDataname);
	}
	public void seeRecommendedExperiences(String RecommendedCurricularExperiences)
	{
		String actualRecommendedExpname= recommendedexperience.getText();
		Assert.assertEquals(actualRecommendedExpname, RecommendedCurricularExperiences);
		System.out.println("menu name displayed as" +actualRecommendedExpname);
	}
	public void seeSupportNeeded(String SupportNeeded)
	{
		String actualSupportname=supportneeded.getText();
		Assert.assertEquals(actualSupportname, SupportNeeded);
		System.out.println("menu name displayed as"+actualSupportname);
	}
	public void seeAllCurricular(String AllCurricularExperiences)
	{
		selUtil.waitUntilElementIsPresentOnPage(7, allcurricularmenu);
		String actualExpname= allcurricularmenu.getText();
		Assert.assertEquals(actualExpname, AllCurricularExperiences);
		System.out.println("menu name displayed as"+actualExpname);
	}
	public void seeAllCurricularExp(String AllCurricularExperiences)
	{
		String actualExpname= allcurricularexperince.getText();
		Assert.assertEquals(actualExpname, AllCurricularExperiences);
		System.out.println("Page name displayed as"+actualExpname);
	}
	public void seeDomain(String domain)
	{
        String level3_xpath= domain_xpath.replace("domainname", domain);

		WebElement we_level3=driver.findElement(By.xpath(level3_xpath));

//		selUtil.waitUntilElementIsPresentOnPage(5, we_level3);

		Assert.assertTrue(we_level3.isDisplayed());

	}
	public void verifyDomain(DataTable datatable)
	{
		List<String> domainlist= datatable.asList();

		for(String expected_domainname:domainlist)
		{

			 System.out.println(expected_domainname);
			 seeDomain(expected_domainname);

		}
	}
	public void clickOnSocialAccordian()
	{
		socialaccordian.click();
	}
	public void clickOnRecommended()
	{
		recommendedforclass.click();
	}
	public void seeCurricularExpRe(String CurricularExperiencesRecommendations)
	{
		selUtil.hardWait(5);
		String actualcurricularname=curricularexpreco.getText();
		Assert.assertEquals(actualcurricularname, CurricularExperiencesRecommendations);
		System.out.println("Page name displayed as"+actualcurricularname);

		backbtn.click();
	}

	public void clickOnDomain(String accordiandomain)
	{
		Actions act = new Actions(driver);
		String domain_xpath="//a[@id='sg-social-div']/h2[contains(text(),'domain')]";

	    String level1_xpath = domain_xpath.replace("domain",accordiandomain);
		WebElement we_level1 = driver.findElement(By.xpath(level1_xpath));
		selUtil.hardWait(2);
		act.moveToElement(we_level1).click().perform();

		selUtil.getNonStaleElement(7, we_level1);

//		selUtil.waitUntilElementIsPresentOnPage(10, we_level1);


	}

	private void seeSubdomain(String subdomain)
	{
		String level2_xpath= subdomain_xpath.replace("subdomainname", subdomain);

		WebElement we_level2=driver.findElement(By.xpath(level2_xpath));


		selUtil.waitUntilElementIsPresentOnPage(10, we_level2);

		Assert.assertTrue(we_level2.isDisplayed());
	}

	public void verifySubdomain(DataTable datatable)
	{
				List<String> subdomainlist= datatable.asList();


				for(String expected_subdomainname:subdomainlist)
				{

					System.out.println(expected_subdomainname);
					seeSubdomain(expected_subdomainname);

				}


	}
	public void seeHomePageTitle(String homepagetitle)
	{
		String actualtitle= welcometitle.getText();
		Assert.assertTrue(actualtitle.contains(homepagetitle));
		System.out.println("Title found as"+actualtitle);
	}
}


