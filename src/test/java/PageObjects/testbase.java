package PageObjects;

import java.nio.charset.Charset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.AssertionFailedError;

public class testbase {
	
	public void main(String arg ()) {
		printchars();			
	}
	}
	
	public void setup() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("beauty");
		//Assert.assertTrue(null, false);.assertEquals(null, null, null);
		//Assert.
		
	}
	
	public void printchars() {
		
	String value = "Keerti";		
	int l =	value.length();
	int count =0;
	for(int i=0;i<l;i++) {
		
	char b = value.charAt(i) ;
	char d = value.charAt(i+1);
	if(b == d)
	if(value.charAt(i) == value.charAt(i+1))
	{
		count = count +1;
		System.out.println("write repeated char" + value.charAt(i));
	}
	//char[] chararr = value.toCharArray().;

		}
	}
		
		
	}
