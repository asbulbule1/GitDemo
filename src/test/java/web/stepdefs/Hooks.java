package web.stepdefs;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.lang3.time.StopWatch;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass
{
	StopWatch stopWatch = new StopWatch();

	@BeforeStep
	public void beforetep(Scenario scenario)
	{
		stopWatch.reset();
		stopWatch.start();
	}

	@AfterStep
	public void afterStep(Scenario scenario)
	{
		stopWatch.stop();

		String timer_css = "";

		if(stopWatch.getTime(TimeUnit.SECONDS)<3) timer_css = "badge-info";
		else timer_css = "badge-danger";

		scenario.log("<span class='badge "+timer_css+"'>"+ DurationFormatUtils.formatDuration(stopWatch.getTime(), "HH:mm:ss:S")+"</span>");

		// add screenshot to the report if tesstep failed
		if(scenario.isFailed())
		{
			scenario.attach(selUtil.takeScreenShotAsByte(), "image/png", "");
		}
	}
}
