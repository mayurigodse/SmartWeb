package cms.Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cms.Actionclass.ActionsClass;
import cms.Baseclass.BaseClass;

public class ProcessShipmentPage extends BaseClass {
	
	@FindBy(xpath="//span[@onclick=\"btnSearch_PS()\"]")
	WebElement ShipViaSearch;
	
	@FindBy(xpath="//button[@onclick=\"AddressesClick()\"]")
	WebElement CustomerSelect;
	
	@FindBy(id="txtManual")
	WebElement ManualWeight;
	
	@FindBy(id="txtLength")
	WebElement DimentionLength;
	
	@FindBy(id="txtWidth")
	WebElement DimentionWidth;
	
	@FindBy(id="txtHeights")
	WebElement DimentionHeight;
	
	@FindBy(id="btnShipClick")
	WebElement bShipButton;
	
	@FindBy(id="txtParcelCount")
	WebElement ParcelCount;
	
	@FindBy(id="txtSimilarCount")
	WebElement similerParcelcount;
	
	/*
	
	@FindBy(id="")
	WebElement ;
	
	@FindBy(id="")
	WebElement ;
	
	@FindBy(id="")
	WebElement ;
	
	@FindBy(id="")
	WebElement ;
	
	*/
	

	public ProcessShipmentPage()  //constructor for initialising 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void singleProcessShip() throws Throwable {
		
		ActionsClass.Implicitwait();
				
		Thread.sleep(15000);	
		ActionsClass.click(driver, ShipViaSearch);
		ShipViaSearchCriteria shipviasercri=new ShipViaSearchCriteria();
		shipviasercri.searchshipvia();
		
		Thread.sleep(3000);
		ActionsClass.click(driver, CustomerSelect);
		CustomerSearch customerser=new CustomerSearch();
		customerser.SelectCustomer();
		
		
		ActionsClass.type(ManualWeight, "1");
		ActionsClass.type(DimentionLength, "1");
		ActionsClass.type(DimentionHeight, "1");
		ActionsClass.type(DimentionWidth, "1");
		 
		
		
		ActionsClass.click(driver, bShipButton);
		
	}
	
	public void multipackageShipment() throws Throwable {
		
		ActionsClass.Implicitwait();
		
		Thread.sleep(3000);	
		ActionsClass.click(driver, ShipViaSearch);
		
	
		ShipViaSearchCriteria shipviasercri=new ShipViaSearchCriteria();
		shipviasercri.searchshipvia();
		
		ActionsClass.click(driver, CustomerSelect);
		CustomerSearch customerser=new CustomerSearch();
		customerser.SelectCustomer();
		
		ActionsClass.type(ParcelCount, "4");
		ActionsClass.type(similerParcelcount, "4");
		ActionsClass.type(ManualWeight, "1");
		ActionsClass.type(DimentionLength, "1");
		ActionsClass.type(DimentionHeight, "1");
		ActionsClass.type(DimentionWidth, "1");
		 
		
		
		ActionsClass.click(driver, bShipButton);
		
	}
	
	public void internationalShipment() {
		
	}
	
	
	
	
	
	
	


}
