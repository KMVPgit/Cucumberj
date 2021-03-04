package utility;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import utility.baseutility;

public class entertext{
	
	//private static final TimeUnit SECONDS = null;
	static WebDriver driver ;
	
	

	public static void entertxt(By value, String val) throws Exception{		
		WebElement elm = baseutility.waitforelement(value);
		elm.sendKeys(val);
		System.out.println("Value entered in : " + elm.getText());			
	}

/*	private static Wait waitforelement(By value) throws Exception{

		 Wait wait = new FluentWait(driver)
				.withTimeout(null).pollingEvery(null)
				.ignoring(NoSuchElementException.class);
		 return wait;
				
			//	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			     //  .withTimeout(30, Timeout.seconds(0))
			      
			   
			/*   WebElement foo = wait..until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }*/
			   
		

	
	
}
