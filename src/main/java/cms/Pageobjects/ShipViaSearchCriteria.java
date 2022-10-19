package cms.Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cms.Actionclass.ActionsClass;
import cms.Baseclass.BaseClass;

public class ShipViaSearchCriteria extends BaseClass {
	
	
	@FindBy(id="txtSCSearchSS")
	WebElement SearchFor;
	
	@FindBy(id="btnSearchOk_PS")
	WebElement searchok;
	
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
		Thread.sleep(3000);
		ActionsClass.click(driver, searchok);
		Thread.sleep(5000);
		ActionsClass.click(driver, okSearchResult);
		
	}

	
	
}
