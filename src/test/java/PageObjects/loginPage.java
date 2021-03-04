package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {
	//private loginPage lp = new loginPage(pageBase.setUp());			
	
		//private WebDriver driver;
		//pageBase pb;
		public pageBase pb;
	//	
		protected WebDriver driver;
		// private static WebDriverWait wait;
	/*	private By textb =  By.id("sb_form_q");
		private By image = By.linkText("Images");*/
		private By uname = By.id("username");
		private By pwd = By.id("password");
		private By loginbtn = By.tagName("i");
	//	private WebDriver driver;
				//.className("fa fa-2x fa-sign-in");
		
		
	public loginPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		
	//	WebDriverWait wait = new WebDriverWait(driver, 30);
		//	PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}
		
	public  String appopen() throws Exception{
		driver.get("https://the-internet.herokuapp.com/login");
			return driver.getTitle();
			}
		
	/*public void click_on_text_field() throws Exception{
		try {
		System.out.println("test Case2");
	}
	catch(Exception e) {System.out.println("Exception in loginpage search text");
	}
		
	}*/
	
	/*public static void processing(By fieldname){ 
	  //  WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(fieldname));			    
	}*/
	
	public  String loginapp(String username1, String password1) throws Exception{		
		// pb.processing(uname);
		 driver.findElement(By.id("username")).sendKeys(username1);
		 driver.findElement(By.id("password")).sendKeys(password1);
	
	//	pb.processing(loginbtn);
		driver.findElement(loginbtn).click();
		String titlehomepage = null;
	  return  titlehomepage = driver.findElement(By.className("subheader")).getText()	;	
	}
	
	/*public String text_image() {
		return driver.findElement(image).getText();
	}*/
	
	/*public List<WebElement> getlinksonpage() {
	return	driver.findElements(By.tagName("a"));
		
	}*/
	
		
	}
