package Academy;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import resources.base;

public class VerifyNavigationBar extends base{

	
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void basePageNavigation() throws IOException
	{
		LandingPage l=new LandingPage(driver);
		Assert.assertTrue(l.getNavBar().isDisplayed());
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver=null;
	}
}
