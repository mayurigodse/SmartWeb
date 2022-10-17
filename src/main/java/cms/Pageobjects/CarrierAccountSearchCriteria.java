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
public class CarrierAccountSearchCriteria extends BaseClass {
	@FindBy(id="CASFtxtSearch")
	WebElement  SearchForCarr;
	
	@FindBy(xpath="//button[@onclick=\"CASFOkClick()\"]")
	WebElement  Okbuttoncarser;
	
	@FindBy(id="btnSearchCancel")
	WebElement  CancelSearchcar;
	
	/*
	@FindBy(id="")
	WebElement  ;
	*/
	
	public CarrierAccountSearchCriteria()  //constructor for initialising 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickCarrier() throws Throwable
	{ 
		ActionsClass.Implicitwait();
		Thread.sleep(3000);
		ActionsClass.click(driver, Okbuttoncarser);
		
	
	}

}
