package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.links;
import PageObjects.loginPage;
import PageObjects.pageBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class linksonHomePage {
	
	public WebDriver driver;
	pageBase pb;
	
	private static final WebDriverWait WebDriverwait = null;
	
	private links l = new links(pageBase.getDriver(), WebDriverwait);	
	
	@Given("Page opens {string}")
	public String Page_opens(String title1) throws Exception {
		driver.get("https://the-internet.herokuapp.com");
		return driver.getTitle();
	}
	
	@Then("checkalinkisavailable {String}")
	public String checkalinkisavailable(String lname) throws Exception {
		String linkp = l.checkalinkisavailable(lname);
	
		System.out.println("link is : " + linkp);
		return lname;
		
	}
	

}
