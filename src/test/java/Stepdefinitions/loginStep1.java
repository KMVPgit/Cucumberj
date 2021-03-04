package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.loginPage;
import PageObjects.pageBase;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.AssertionFailedError;
import org.junit.Assert;

public class loginStep1 {	
		private static final WebDriverWait WebDriverwait = null;
		public WebDriver driver;
		pageBase pb;
	//	loginPage lp;
		private loginPage lp = new loginPage(pageBase.getDriver(), WebDriverwait);			
		
		/*@Given("app url")
		public void app_url() throws Exception {
			System.out.println("Given test");
			}*/
		
		@Given("app open {string}")
		public void app_open(String title1) throws Exception {
			try {
			String title=null;
			title = lp.appopen();
			System.out.println("Page title is " + title);	}
		/*	Assert.assertEquals("Page title is as expected", title1, title);
		    	}*/
			catch(Exception e) {
				System.out.println("Page title is not display");
			}
			}

	/*	@Then("click on text field")
		public void click_on_text_field() throws Exception {
		//	lp.click_on_text_field();
			System.out.println("test step2");
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
		}
		*/
		
		@Then("login app {string},{string}")
		public void login_app(String string, String string2) throws Exception {	
			try {
		String hpage =	lp.loginapp(string, string2);
		Assert.assertEquals("HomePage title is not as expected", "Welcome to the Secure Area. When you are done click logout below.", hpage);
				}
			catch(Exception e) {
		System.out.println("Login fail");	
			}
		}
			
		@Then("Closeapp")
		public void Closeapp() throws Exception{
			try {
				pb.teardownquit();}
				catch(Exception e) {
					System.out.println(e.getStackTrace() + "browser close exception");	
						}
			}
			
}
