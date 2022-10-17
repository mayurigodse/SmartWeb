package cms.Testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cms.Actionclass.ActionsClass;
import cms.Baseclass.BaseClass;
import cms.Pageobjects.IndexPage;
import cms.Pageobjects.LoginPage;
import cms.Pageobjects.ProcessShipmentPage;

public class SinglePackageShipmentTest extends BaseClass {
	IndexPage indexpage;
	
	@BeforeClass
	public void setup() {
		launchapp();
	}
	
	@AfterClass
	public void teardown() {
		//driver.close();
	}
	
	@Test(priority=1)
	public void logintest() throws Throwable {
		
		indexpage=new IndexPage();
		indexpage.LoginMenu();
		
		LoginPage loginpage=new LoginPage();
	    ActionsClass.Implicitwait();
		
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
	@Test(priority=2)
	public void singlepackship() throws Throwable {
		indexpage=new IndexPage();
		indexpage.ProcessShip();
		
		Thread.sleep(3000);
		ProcessShipmentPage processship=new ProcessShipmentPage();
		processship.singleProcessShip();
		
	}
	

}
