package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {
	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.xpath("//*[@id=\"content\"]/div/div/h2");
	By navbar=By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul");
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement getLogin() 
	{
		return driver.findElement(signin);
	}
	
	public WebElement getTitle() 
	{
		return driver.findElement(title);
	}
	
	public WebElement getNavBar() 
	{
		return driver.findElement(navbar);
	}

}
