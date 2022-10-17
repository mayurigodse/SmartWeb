package cms.Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cms.Actionclass.ActionsClass;
import cms.Baseclass.BaseClass;

public class ShipViaSearchCriteria extends BaseClass {
	
	
	@FindBy(id="txtSCSearchSS")
	WebElement SearchFor;
	
	@FindBy(id="txtSCSearchSS")
	WebElement btnSearchOk_PS;
	
	@FindBy(id="ShipviasSearchResultFormOk")
	WebElement okSearchResult;
	
	
	public ShipViaSearchCriteria()  //constructor for initialising 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void searchshipvia() throws Throwable {
		String s="upsva_cs_g";
		 
		ActionsClass.Implicitwait();
		ActionsClass.type(SearchFor, s );
		Thread.sleep(10000);
		ActionsClass.click(driver, btnSearchOk_PS);
		Thread.sleep(3000);
		ActionsClass.click(driver, okSearchResult);
		
	}

	
	
}
