package cms.Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cms.Actionclass.ActionsClass;
import cms.Baseclass.BaseClass;

public class CustomerSearch extends BaseClass {
	
	@FindBy(id="txtSCSearch")
	WebElement  SearchFor;
	
	@FindBy(xpath="//button[@onclick=\"onCustomerSearchOkClick()\"]")
	WebElement OkButton ;
	
	@FindBy(id="addressformOk")
	WebElement AddressOk ;
	
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
	*/
	
	
	
	
	
	public CustomerSearch()  //constructor for initialising 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SelectCustomer() throws Throwable {
		ActionsClass.type(SearchFor, "cms");
		ActionsClass.click(driver, OkButton);
		ActionsClass.click(driver, AddressOk);
	}
	
	
}
