package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;
			
			@RunWith(Cucumber.class)
		//	@RunWith(JUnit4.class)
			@CucumberOptions(
					//dryRun=true,
					features = {"C:/Users/Venkatesh/eclipse-workspace/Cucumbertestfm/src/test/resources/Features/"},
					glue = {"Stepdefinitions" ,"AppHooks"},							
					plugin = {"pretty", "html:target/cucumber/report.html",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
							
							//html:D:\\Java_WS\\cucumber\\target\\cucumber-reports"},			
					monochrome = true
			)
	public class TestRunnerTest {
	}