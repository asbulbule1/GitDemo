package web.stepdefs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Selenium;
import util.Util;
import web.pages.CommonPage;
import web.pages.LoginPage;
import web.pages.P1_P2_Issue.ImportStatusPage;
import web.pages.orgadmin.AddNewClassPage;
import web.pages.orgadmin.DashboardPanelPage;
import web.pages.orgadmin.FooterlinksPage;
import web.pages.orgadmin.ImportHistoryPage;
import web.pages.orgadmin.OrgAdminCarouselPage;
import web.pages.orgadmin.OrgAdminDashboardPage;
import web.pages.orgadmin.OrgAdminDashboardPanelPage;
import web.pages.orgadmin.OrgAdminReportPage;
import web.pages.orgadmin.OrgAdminResourcesPage;
import web.pages.orgadmin.OrgAdminRosterChildrenPage;
import web.pages.orgadmin.OrgAdminRosterPage;
import web.pages.orgadmin.OrgAdminTsgTilePage;
import web.pages.orgadmin.OrgadminAccountPage;
import web.pages.orgadmin.PanelPage;
import web.pages.orgadmin.RosterPage;
import web.pages.orgadmin.SchoolPlaytimePage;
import web.pages.orgadmin.SchoolProgressPage;
import web.pages.orgadmin.SkillSupportPage;
import web.pages.parent.ParentAccount;
import web.pages.parent.ParentDashboard;
import web.pages.schooladmin.SchoolAdminDashboardPanelPage;
import web.pages.schooladmin.SchoolAdminReportPage;
import web.pages.schooladmin.SchoolAdminResourcesPage;
import web.pages.schooladmin.SchoolAdminRosterMenuPages;
import web.pages.schooladmin.SchoolAdminRosterPage;
import web.pages.teacher.TeacherDashboardPage;
import web.pages.teacher.TeacherReportPage;
import web.pages.teacher.TeacherRosterMenuPage;
import web.pages.teacher.TeacherRosterPage;
import web.pages.teacher.TeacherSkillSupportPage;

public class BaseClass {
	public static WebDriver driver;

	public static Selenium selUtil;
	public static Util util;

	// common
	public static LoginPage loginPage;
	public static CommonPage commonPage;

	// org admin pages
	public static OrgAdminDashboardPage org_dashPage;
	public static OrgadminAccountPage org_accountPage;
	public static SkillSupportPage skillsupportpage;
	public static FooterlinksPage footerlinkspage;
	public static PanelPage panelpage;
	public static OrgAdminCarouselPage org_CaruselPage;
	public static OrgAdminDashboardPanelPage org_PanelPage;
	public static DashboardPanelPage dashboardpanelpage;
	public static OrgAdminReportPage org_ReportPage;
	public static SchoolProgressPage schoolprogresspage;
	public static SchoolPlaytimePage schoolplaytimepage;
	public static RosterPage rosterpage;
	public static OrgAdminRosterPage org_RosterPage;
	public static ImportHistoryPage importhistorypage;
	public static OrgAdminRosterChildrenPage org_Roster_ChildrnPage;
	public static AddNewClassPage addnewclassPage;
	public static ParentDashboard parent_dashpage;
	public static SchoolAdminDashboardPanelPage sch_dashpanelpage;
	public static TeacherDashboardPage teach_DashPage;
	public static OrgAdminResourcesPage orgAdmin_ResorcesPage;
	public static ParentAccount parent_Account;
	public static SchoolAdminReportPage sch_reportpage;
	public static SchoolAdminRosterPage sch_rosterpage;
	public static SchoolAdminResourcesPage sch_resourcespage;
	public static SchoolAdminRosterMenuPages sch_rostermenu;
	public static TeacherSkillSupportPage teach_skillsupport;
	public static TeacherRosterPage teach_rosterpage;
	public static TeacherRosterMenuPage teach_rostermenu;
	public static ImportStatusPage import_statuspage;
	public static OrgAdminTsgTilePage orgtsgtilemenu;
	public static TeacherReportPage teach_ReportPage;

	public void initiateBrowser() throws AWTException {
		String browser = Util.getExecutionProperty("browser");

		switch (browser) {
		case "chrome":
			//Kill any existing orphan web driver process
			try { Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T"); } catch (IOException e) { }

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();

//code to execute remotely 
options.addArguments("--remote-allow-origins=*");
options.addArguments("--disable-dev-shm-usage"); // Helps in Docker/Linux environments
options.addArguments("--no-sandbox");
options.addArguments("--remote-debugging-port=9222"); // Ensures it binds correctly
options.addArguments("--disable-gpu");
options.addArguments("--disable-extensions");
options.addArguments("--headless"); // Remove if you need to see the browser
options.addArguments("user-data-dir=" + System.getProperty("java.io.tmpdir")); // Avoid conflicts


			Map<String, Object> prefs = new HashMap<>();
			Map<String, Integer> connectSettings=new HashMap<String,Integer>(); // Added By Amit for Camera Access Handle
			Map<String, Object> profile=new HashMap<String,Object>();           // Added By Amit for Camera Access Handle   
			
			
			connectSettings.put("notification", 2); // Added By Amit for Notification to block access
			connectSettings.put("geolocation", 2); // Added By Amit for Location to block access
			connectSettings.put("media_stream", 1); // Added By Amit for Camera to block access
			
			profile.put("managed_default_content_settings",connectSettings); // Added By Amit for Camera, Notification and Location to block access
			prefs.put("profile", profile);									// Added By Amit for Camera, Notification and Location to block access
			
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);

			options.setExperimentalOption("prefs", prefs);
			options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

			driver = new ChromeDriver(options);
			break;
			
			
			
			
			//rough
		case "edge":
			// Kill any existing orphan web driver process
			try {
				Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
			} catch (IOException e) {
			}

			WebDriverManager.edgedriver().setup();
			EdgeOptions eoptions = new EdgeOptions();

			Map<String, Object> prefs1 = new HashMap<>();
			Map<String, Integer> connectSettings1 = new HashMap<>(); // Added By Amit for Camera Access Handle
			Map<String, Object> profile1 = new HashMap<>(); // Added By Amit for Camera Access Handle

			//connectSettings.put("notification", 2); // Added By Amit for Notification to block access
			//connectSettings.put("geolocation", 2); // Added By Amit for Location to block access
			//connectSettings.put("media_stream", 1); // Added By Amit for Camera to block access

			//profile1.put("managed_default_content_settings", connectSettings); // Added By Amit for Camera, Notification
																				// and Location to block access
			prefs1.put("profile", profile1); // Added By Amit for Camera, Notification and Location to block access

			prefs1.put("credentials_enable_service", false);
			prefs1.put("profile.password_manager_enabled", false);

			//eoptions.setExperimentalOption("prefs1", prefs1);
			//eoptions.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });

			driver = new EdgeDriver(eoptions);
			break;
			//rough

		case "chrome_headless":
			// Kill any existing orphan web driver process
			try {
				Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
			} catch (IOException e) {
			}
			WebDriverManager.chromedriver().setup();

			ChromeOptions chro_options = new ChromeOptions();
			chro_options.addArguments("--headless");
			chro_options.addArguments("window-size=1920,1080");
			driver = new ChromeDriver(chro_options);
			driver.manage().window().setSize(new Dimension(1920, 1080));
			break;
		}

		driver.manage().window().maximize();
//		Robot robot = new Robot();
//		for (int i = 0; i < 4; i++) {
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_SUBTRACT);
//		robot.keyRelease(KeyEvent.VK_SUBTRACT);
//		robot.keyRelease(KeyEvent.VK_CONTROL);

	
		

//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

//    public void initiateBrowser()
//	{
//		String browser = Util.getExecutionProperty("browser");
//
//		switch(browser)
//		{
//			case "chrome":
//							//Kill any existing orphan web driver process
//							try { Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T"); } catch (IOException e) { }
//
//							WebDriverManager.chromedriver().setup();
//							ChromeOptions options = new ChromeOptions();
//
////							WebDriver driver = new ChromeDriver();
//							System.setProperty("webdriver.chrome.driver", "D://Chrome WebDriver//chromedriver.exe");
//
//							Map<String, Object> prefs = new HashMap<>();
//							prefs.put("credentials_enable_service", false);
//							prefs.put("profile.password_manager_enabled", false);
//
//							options.setExperimentalOption("prefs", prefs);
//							options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//
//							driver = new ChromeDriver(options);
//							break;
//
//			case "chrome_headless":
//									//Kill any existing orphan web driver process
//									try { Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T"); } catch (IOException e) { }WebDriverManager.chromedriver().setup();
//
//									ChromeOptions chro_options = new ChromeOptions();
//									chro_options.addArguments("--headless");
//									chro_options.addArguments("window-size=1920,1080");
//									driver = new ChromeDriver(chro_options);
//									driver.manage().window().setSize(new Dimension(1920,1080));
//									break;
//		}
//
//		driver.manage().window().maximize();
//		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//	}

	public void setPageObjects() throws ParseException {
		selUtil = new Selenium(driver);
		util = new Util();

		commonPage = new CommonPage(driver);
		loginPage = new LoginPage(driver);

		// org admin pages
		org_dashPage = new OrgAdminDashboardPage(driver);
		org_accountPage = new OrgadminAccountPage(driver);
		skillsupportpage = new SkillSupportPage(driver);
		footerlinkspage = new FooterlinksPage(driver);
		panelpage = new PanelPage(driver);
		org_CaruselPage = new OrgAdminCarouselPage(driver);
		org_PanelPage = new OrgAdminDashboardPanelPage(driver);
		dashboardpanelpage = new DashboardPanelPage(driver);
		org_ReportPage = new OrgAdminReportPage(driver);
		orgAdmin_ResorcesPage = new OrgAdminResourcesPage(driver);
		addnewclassPage = new AddNewClassPage(driver);

		// school admin pages

		sch_dashpanelpage = new SchoolAdminDashboardPanelPage(driver);
		schoolprogresspage = new SchoolProgressPage(driver);
		schoolplaytimepage = new SchoolPlaytimePage(driver);
		rosterpage = new RosterPage(driver);
		org_RosterPage = new OrgAdminRosterPage(driver);
		importhistorypage = new ImportHistoryPage(driver);
		org_Roster_ChildrnPage = new OrgAdminRosterChildrenPage(driver);
		sch_rostermenu = new SchoolAdminRosterMenuPages(driver);
		orgtsgtilemenu = new OrgAdminTsgTilePage(driver);

		// teacher pages
		teach_DashPage = new TeacherDashboardPage(driver);
		teach_skillsupport = new TeacherSkillSupportPage(driver);
		teach_rosterpage = new TeacherRosterPage(driver);
		teach_rostermenu = new TeacherRosterMenuPage(driver);
		teach_ReportPage = new TeacherReportPage(driver);

//	    Parent Pages
		parent_dashpage = new ParentDashboard(driver);
		parent_Account = new ParentAccount(driver);

		sch_reportpage = new SchoolAdminReportPage(driver);
		sch_rosterpage = new SchoolAdminRosterPage(driver);
		sch_resourcespage = new SchoolAdminResourcesPage(driver);

//	    P1 P2 Issues
		import_statuspage = new ImportStatusPage(driver);

	}
}
