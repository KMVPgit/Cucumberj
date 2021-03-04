package AppHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import PageObjects.pageBase;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class appHooks {	
		
		private pageBase PB;
		private WebDriver driver;
		
	@Before(order=1)
		public void setup() {
			PB = new pageBase();
			PB.setUp();
		}
			
	@After(order = 0)
	public void teardown(Scenario scenario) {
		if(scenario.isFailed()) {
			String screenshotname = scenario.getName().replaceAll("", "_");
			byte[] sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcepath, "image/png", screenshotname);	
			}
	}
	
	 @After(order = 0)
	 public void teardownquit() {
		
		 System.out.println("Close browser");
			pageBase.getDriver().close();	
			}
 }
		

