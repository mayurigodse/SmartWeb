/**
 * 
 */
package cms.Testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cms.Actionclass.ActionsClass;
import cms.Baseclass.BaseClass;
import cms.Pageobjects.AddCarrierPage;
import cms.Pageobjects.AddShipVia;
import cms.Pageobjects.CarrierAccountSearchCriteria;
import cms.Pageobjects.CarrierAccountsPage;
import cms.Pageobjects.IndexPage;
import cms.Pageobjects.LoginPage;
import cms.Pageobjects.ShipViasPage;

/**
 * @author mayurig
 *
 */
public class AddCarriersTest extends BaseClass{
	
IndexPage indexpage;
CarrierAccountsPage carrieraccount;
	
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
	public void addcarrier() throws Throwable {
		indexpage.Carriers();
		CarrierAccountSearchCriteria caraccser=new CarrierAccountSearchCriteria();
		caraccser.clickCarrier();
		
		carrieraccount= new CarrierAccountsPage();
		carrieraccount.AddNewCarrier();
		
		AddCarrierPage addcarrier= new AddCarrierPage();
		addcarrier.addcarrier();
		
		
	}
	
	@Test(priority=3)
	public void addShhipVias() throws Throwable {
		carrieraccount.clickshipvias();
		
		ShipViasPage clickaddship= new ShipViasPage();
		clickaddship.addshipvia();
		
		AddShipVia addship= new AddShipVia();
		addship.shipViaAdd();
		
	}

}
