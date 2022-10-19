/**
 * 
 */
package cms.Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cms.Actionclass.ActionsClass;
import cms.Baseclass.BaseClass;

/**
 * @author mayurig
 *
 */
public class CarrierAccountsPage extends BaseClass {

	@FindBy(id="CAAddbutton")
	WebElement  CarrierAddButton;
	
	@FindBy(id="CAEditbutton")
	WebElement  EditCarrierButton;
	
	@FindBy(id="CADeletebutton")
	WebElement  CarrierDelete;
	
	@FindBy(id="CAShipViaButton")
	WebElement  ShipviaButton;
	
	/*
	@FindBy(id="")
	WebElement  ;
	
	*/
	
	
	public CarrierAccountsPage()  //constructor for initialising 
	{
		PageFactory.initElements(driver, this);
	}

	
	public void AddNewCarrier() throws Throwable {
		ActionsClass.Implicitwait();
		Thread.sleep(3000);
		ActionsClass.click(driver, CarrierAddButton);
		
	}
	
	public void clickshipvias() throws Throwable {
		Thread.sleep(3000);
		ActionsClass.Implicitwait();
		
		ActionsClass.click(driver, ShipviaButton);
	}
}
