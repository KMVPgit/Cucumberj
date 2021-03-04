package PageObjects;
import java.util.concurrent.TimeUnit;

import java.util.function.Function;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class pageBase {	
	//https://www.youtube.com/watch?v=NhiIAZRoc0g&list=PLFGoYjJG_fqpObjigKg4bunu6_Ki7Ppn-&index=15
				
		public static WebDriver driver;
		public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
		 loginPage loginPage;
		 public WebDriverWait wait;
		// WebDriverWait wait = new WebDriverWait(driver, 30);
	
		 
		/*public pageBase() {
			//setUp();
			// WebDriverWait wait = new WebDriverWait(driver, 30);
			// TODO Auto-generated constructor stub
		}*/

	//	@BeforeClass
		//@Before
		 public void setUp(){
			 System.setProperty("webdriver.chrome.driver", "D:\\browser\\chromedriver.exe");
			 ChromeOptions chromeOptions = new ChromeOptions();
		        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		        (tldriver).set(new ChromeDriver(chromeOptions));
			//  driver = new ChromeDriver();
		        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        getDriver().manage().deleteAllCookies();
		        getDriver().manage().window().maximize();
		    //  getDriver().get("https://the-internet.herokuapp.com/login");
			   loginPage = new loginPage (getDriver(), wait);
		   }
		 
		 public static synchronized WebDriver getDriver() {
			 return tldriver.get();
		 }
		/* Sample usage: 
			   // Waiting 30 seconds for an element to be present on the page, checking
			   // for its presence once every 5 seconds.
			   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, SECONDS)
			       .pollingEvery(5, SECONDS)
			       .ignoring(NoSuchElementException.class);*/
		/* public WebElement getElement(WebDriver driver, WebElement field) {

			   WebElement foo = wait..until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			   });
		 }*/

		
	/*	 public WebElement WW (String fieldname) {
			 WebElement foo = Wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }			 
		 }*/
		  /*  public Object appurl(){
		      return  driver.get("https://the-internet.herokuapp.com/login");
			    }*/
		    
		/* public loginPage initialize(){
			 System.setProperty("webdriver.chrome.driver", "D:/chromedriver/chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://www.bing.com/");
			 loginPage loginPage = new loginPage(driver);
			//return lp;
			return loginPage;
			}*/
		
		
			public void closebrowser() {
			 if(driver != null) {
				driver.quit();
			}
		 }
			public void processing(By fieldname){ 
			    WebDriverWait wait = new WebDriverWait(driver, 50);
			    wait.until(ExpectedConditions.visibilityOfElementLocated(fieldname));
			    System.out.println("Element visible");
			}
			
		/*	public static void processing(By fieldname){ 
			    WebDriverWait wait = new WebDriverWait(driver, 30);
			    wait.until(ExpectedConditions.visibilityOfElementLocated(fieldname));			    
			}
			*/
			    
          /*   public boolean waituntill() {
		    wait.until(new ExpectedCondition<Boolean>() {
		        public Boolean apply(WebDriver driver) {
		            return ((JavascriptExecutor) driver).executeScript(
		                "return document.readyState"
		            ).equals("complete");
		        }
		    
		    public Function<WebDriver, WebElement> presenceOfElementLocated(final By locator) {
	            // TODO Auto-generated method stub
	            return new Function<WebDriver, WebElement>() {
	                 @Override
	                 public WebElement apply(WebDriver driver) {
	                      return driver.findElement(locator);
	                 }
	            };
	      }*/
			
			
		 public void entertext(WebElement fieldname, String text) throws Exception{
			 try {
			 fieldname.sendKeys(text);	 		 
		 }
			 catch(Exception e) 
			 {
				 System.out.println("text entered in " + text);
			 }
		 } 
		
		 public void clickbtn(WebElement fieldname) {
				 try {
				 fieldname.click(); 		 
			 }
				 catch(Exception e) {System.out.println("Btn is clicked" + fieldname);
				 }	 
			 }
		 
		 public String gettitle() throws Exception {
			 String title = null;	
			 try {			
			title =	driver.getTitle();
			return title;
				 }
			 catch(Exception e) {
				 System.out.println("Page title is not displayed");
			 }
			return title;
			 }
		 
		 public void teardownquit() {
			 //if(driver = !null) {
				 driver.close();
		   driver.quit();
			 }
		 //}
		 

		 public void selectdropdown(WebElement dropdwn, int selecttype, int indx, String val) throws Exception {
			 
			 Select dropdown = new Select(dropdwn);
			//int selecttype;
			 switch(selecttype) {
			  case  1:	
				 dropdown.selectByIndex(indx);
			    break;
			  case  2:
				  dropdown.deselectByValue(val);
			    // code block
			    break;
			  case  3:
			  dropdown.deselectByVisibleText(val);
			  default:
			    // code block
			} 
			 
			 
		 }
			 
} 	
