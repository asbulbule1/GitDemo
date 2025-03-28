package web.runners;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import javax.activation.FileDataSource;
import javax.mail.MessagingException;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import web.stepdefs.BaseClass;

@CucumberOptions(
        features = {"src/test/resources/web/features/Teacher/"},
        glue = {"web/stepdefs"},
        tags = "",
        plugin = {	"html:test-output/cucumber-reports/cucumber-html-report.html",
        			"json:test-output/json-reports/cucumber.json",
        			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        			"pretty"}
)
public class TeacherTestRunner extends AbstractTestNGCucumberTests
{
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios()
    {
        return super.scenarios();
    }

    @BeforeSuite
    public void init() throws ParseException, AWTException
    {
    	BaseClass baseClassObj = new BaseClass();

    	baseClassObj.initiateBrowser();
    	baseClassObj.setPageObjects();
    }

    @AfterSuite
    public void sendReportEmail() throws MessagingException, IOException
    {
    	String report_filepath = "test-output//SparkReport//HatchAutomationExecutionReport.html";

//    	//clean report file
//    	Path path = Paths.get(report_filepath);
//    	Charset charset = StandardCharsets.UTF_8;
//
//    	String content = new String(Files.readAllBytes(path), charset);
//    	content = content.replaceAll("<span>web.stepdefs.Hooks.afterStep(io.cucumber.java.Scenario)</span>", "");
//    	Files.write(path, content.getBytes(charset));

    	// prepare file for emailing
    	File reportFile = new File(report_filepath);

    	FileUtils.writeStringToFile(reportFile, FileUtils.readFileToString(reportFile).replace("<span>web.stepdefs.Hooks.afterStep(io.cucumber.java.Scenario)</span>", ""));

    	FileDataSource fds = new FileDataSource(reportFile);

    	//new Util().sendReportEmail(fds, "Hatch Automation Execution Report.html", "girish.bauskar@infogen-labs.com");
    }
}