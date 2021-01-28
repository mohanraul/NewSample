package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.base;
import sun.rmi.runtime.Log;

public class HomePage extends base{

	
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver=initializeDriver();
	}
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String Username,String Password,String text) throws IOException
	{
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		//System.out.println(text);
		lp.getLogin().click();
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver=null;
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		
		//0th row
		data[0][0]="non-restrictedQA@gmail.com";
		data[0][1]="113131";
		data[0][2]="NON RESTRICTED";
		
		//1st row
		
		  data[1][0]="restrictedQA@gmail.com";
		  data[1][1]="988899";
		  data[1][2]="RESTRICTED";
		 
		return data;
		
	}

}
