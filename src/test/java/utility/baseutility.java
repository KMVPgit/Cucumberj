package utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class baseutility {
	
	
	static WebDriver driver;
	entertext entertext;
	
	 //Timeout =  30;
	public static WebElement waitforelement(By value) throws Exception{
		 TimeUnit SECONDS = null;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, SECONDS).withTimeout(30, SECONDS).pollingEvery(5, SECONDS)
				.ignoring(NoSuchElementException.class);
		 			   
			 WebElement elm =  wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(value);
			     }	
			     		});
			return elm;
}
	//Uses Fluent Wait for an element to be present.
	
/*	private WebElement getElement(By value) {
		waitforelement().until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) 
			{
		 return driver.findElement(value);
		}
		}}*/
	 public static void alt() {
		 driver.switchTo().alert().sendKeys(null);
	 }
}