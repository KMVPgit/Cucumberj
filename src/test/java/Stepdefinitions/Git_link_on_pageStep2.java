package Stepdefinitions;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import PageObjects.homePage;
import PageObjects.loginPage;
import PageObjects.pageBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Git_link_on_pageStep2 {
		
	// loginPage lp ;
	 homePage hp ;
	 //= new loginPage(pageBase.setUp());
	
	/*@Given("Open app {string}")
	public void Open_app(String title1) throws Exception {
		try {
	/*System.setProperty("webdriver.chrome.driver", "D:/chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/login");
		String title=null;
		title = lp.appopen();
		System.out.println("Page title is " + title);	
		Assert.assertEquals("Page title is not as expected", title1, title);
	    	}
		catch(Exception e) {
			System.out.println("Page title is not display");
		}
		}	*/
	
	/*@When("Login app with us {string},{string}")
	public void Login_app_with_us(String string, String string2) throws Exception {	
		try {
	String hpage =	lp.loginapp(string, string2);
	Assert.assertEquals("HomePage title is not as expected", "Welcome to the Secure Area. When you are done click logout below.", hpage);
			}
		catch(Exception e) {
	System.out.println("Login fail");	
		}}*/
	
	@Then("Git link on page")
    public void Git_link_on_pageStep(){
		try {
		String gitlink = hp.gitlink();
		Assert.assertEquals("gitlink not there", "Fork me on GitHub", gitlink);
		}
		catch(Exception e) {
			System.out.println("gitlink not there catch");	
				}}
	}