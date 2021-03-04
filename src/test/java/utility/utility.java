package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.loginPage;
import PageObjects.pageBase;

public class utility {
	
	pageBase pb;
	static WebDriver driver;
	
	public static void processing(WebDriver driver,By fieldname){ 
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(fieldname));			    
	}

}
