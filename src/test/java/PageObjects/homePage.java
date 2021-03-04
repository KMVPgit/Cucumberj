package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByChained;

public class homePage {
	WebDriver driver;
	pageBase pb;
	
	public homePage(WebDriver driver){
	this.driver = driver;
	}
	
	private By gitlink = By.tagName("a");
	private WebElement gitlnk = driver.findElement(gitlink);
	private WebElement gl = gitlnk.findElement(new ByChained(By.tagName("img"),By.tagName("a"), By.tagName("alt")));
	private By txt = By.tagName("alt");
	//("Fork me on GitHub");
		
	public String gitlink() {
	//	pb.processing(gitlink);		
		String gittxt = gl.getText();
		return gittxt;
	}
	

}
