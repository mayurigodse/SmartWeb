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
public class AddCarrierPage extends BaseClass {
	
	@FindBy(id="CAF_txtCode")
	WebElement  Codetxt;
	
	@FindBy(id="CAF_cmbOrgs")
	WebElement  SelectOrg;
	
	@FindBy(id="CAF_txtDescription")
	WebElement  AddDiscription;
	
	@FindBy(id="CAF_txtAccount")
	WebElement  AddAccount;
	
	@FindBy(id="CAF_cmbOriginTypes")
	WebElement SelectOriginType ;
	
	@FindBy(xpath="//button[@onclick=\"CAF_OkClick()\"]")
	WebElement  OkCarraddbutton;
	
	@FindBy(id="CAF_txtShipperCode")
	WebElement AddShippercode ;
	
	/*
	@FindBy(id="")
	WebElement  ;
	
	@FindBy(id="")
	WebElement  ;
	
	@FindBy(id="")
	WebElement  ;
	
	@FindBy(id="")
	WebElement  ;
	
	
	*/
	
	public AddCarrierPage()  //constructor for initialising 
	{
		PageFactory.initElements(driver, this);
	}

	public void addcarrier() throws Throwable {
		
		ActionsClass.Implicitwait();
		ActionsClass.type(Codetxt, "upsva123_g");
		Thread.sleep(3000);
		ActionsClass.selectByValue(SelectOrg, "31");
		ActionsClass.type(AddDiscription, "upsva123");
		ActionsClass.type(AddAccount, "123456");
		ActionsClass.type(AddShippercode, "CMSVA");
		Thread.sleep(3000);
		ActionsClass.selectByValue(SelectOriginType, "UPS_US");
		ActionsClass.click(driver, OkCarraddbutton);
		
		
		
		
	}


}
