package cms.Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cms.Actionclass.ActionsClass;
import cms.Baseclass.BaseClass;

public class IndexPage extends BaseClass {
	
	@FindBy(id="menu_item_1")
	WebElement LocalConfig;
	
	@FindBy(id="menu_item_10")
	WebElement ChangeMyPassword;
	
	@FindBy(id="menu_item_11")
	WebElement StationConfiguration;
	
	@FindBy(id="menu_item_12")
	WebElement SessionInformation;
	
	@FindBy(id="menu_item_14")
	WebElement PrivateCustomers;
	
	@FindBy(id="menu_item_15")
	WebElement LoginLogout;
	
	@FindBy(id="menu_item_2")
	WebElement Transactions;
	
	@FindBy(id="menu_item_20")
	WebElement SelectOrganization;
	
	@FindBy(id="menu_item_21")
	WebElement ProcessShipment;
	
	@FindBy(id="menu_item_22")
	WebElement ProcessReturn;
	
	@FindBy(id="menu_item_23")
	WebElement ViewShipments;
	
	@FindBy(id="menu_item_24")
	WebElement ManifestExplorer;
	
	@FindBy(id="menu_item_25")
	WebElement ArchivedManifest;
	
	@FindBy(id="menu_item_26")
	WebElement BOLExplorer;
	
	@FindBy(id="menu_item_27")
	WebElement ArchivedBOL;
	
	@FindBy(id="menu_item_28")
	WebElement ExportConsolidation;
	
	@FindBy(id="menu_item_29")
	WebElement RFIDLabeling;
	
	@FindBy(id="menu_item_20A")
	WebElement AdvancedFramework;
	
	@FindBy(id="menu_item_3")
	WebElement ReportsDocs;
	
	@FindBy(id="menu_item_31")
	WebElement CustomerAddrBook;
	
	@FindBy(id="menu_item_32")
	WebElement SummeryReport;
	
	@FindBy(id="menu_item_33")
	WebElement DetailedReport;
	
	@FindBy(id="menu_item_34")
	WebElement ProductivityReport;
	
	@FindBy(id="menu_item_35")
	WebElement ExceptionReport;
	
	@FindBy(id="menu_item_36")
	WebElement MaintainanceReport;
	
	@FindBy(id="menu_item_37")
	WebElement CustomReport;
	
	@FindBy(id="menu_item_38")
	WebElement AdHocReport;
	
	@FindBy(id="menu_item_39")
	WebElement Documents;
	
	@FindBy(id="menu_item_399")
	WebElement Dashbord;
	
	@FindBy(id="menu_item_400")
	WebElement Audit;
	
	@FindBy(id="menu_item_4")
	WebElement Configuration;
	
	@FindBy(id="menu_item_40")
	WebElement Organizations;
	
	@FindBy(id="menu_item_41")
	WebElement Sites;
	
	@FindBy(id="menu_item_42")
	WebElement OrgsiteGroup;
	
	@FindBy(id="Users")
	WebElement Users;
	
	@FindBy(id="menu_item_44")
	WebElement Carriers;
	
	@FindBy(id="menu_item_49")
	WebElement Servers;
	
	@FindBy(id="menu_item_45")
	WebElement SupportTables;
	
	@FindBy(id="menu_item_440")
	WebElement  CarrierAccounts;
	
	/*
	@FindBy(id="")
	WebElement  ;
	
	@FindBy(id="")
	WebElement  ;
	
	@FindBy(id="")
	WebElement  ;
	
	@FindBy(id="")
	WebElement  ;
	
	@FindBy(id="")
	WebElement  ;
	
	@FindBy(id="")
	WebElement  ;
	*/
	

	
	
	
	public IndexPage()  //constructor for initialising 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginMenu() throws Throwable
	{
		ActionsClass.movetoElement(driver, LocalConfig);
		ActionsClass.click(driver,LoginLogout);
		
	}
	
	public void ProcessShip() throws Throwable  {
		
		ActionsClass.Implicitwait();
		ActionsClass.movetoElement(driver, Transactions);
		Thread.sleep(3000);
		ActionsClass.click(driver, ProcessShipment);
			
	}
	
public void Carriers() throws Throwable  {
		
		ActionsClass.Implicitwait();
		ActionsClass.movetoElement(driver, Configuration);
		Thread.sleep(3000);
		ActionsClass.click(driver, Carriers);
		ActionsClass.click(driver, CarrierAccounts);
			
	}
	
	
	
	

}
