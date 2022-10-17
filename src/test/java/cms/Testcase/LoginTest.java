/**
 * 
 */
package cms.Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.logging.Logs;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cms.Actionclass.ActionsClass;
import cms.Baseclass.BaseClass;
import cms.Pageobjects.IndexPage;
import cms.Pageobjects.LoginPage;
import cms.utility.Log;

/**
 * @author mayurig
 *
 */
public class LoginTest extends BaseClass {
	
	
	@BeforeMethod
	public void setup() {
		launchapp();
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void logintest() throws Throwable {
		
		IndexPage indexpage=new IndexPage();
		indexpage.LoginMenu();
		
		LoginPage loginpage=new LoginPage();
	    ActionsClass.Implicitwait();
		
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	

}
