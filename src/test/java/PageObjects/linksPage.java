package PageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class linksPage {
	WebDriver driver;
	
	public linksPage(WebDriver driver, WebDriverWait wait){
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}
	
	private By alllinks = By.xpath("//div/ul/li");
	
	public List<WebElement> getlinkcount() {
		List <WebElement> links = driver.findElements(alllinks);
		return links;
	}
	
	public String checkalinkisavailable(String lname) {
		Iterator <WebElement>it = getlinkcount().iterator();		
		while(it.hasNext()) {
			System.out.println("Link name : " + it.next().getText().equalsIgnoreCase(lname));			
			}
		return lname;
				
	}

}
