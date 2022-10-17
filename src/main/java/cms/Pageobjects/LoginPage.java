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
public class LoginPage extends BaseClass {

	@FindBy(id="txtLPUserLogin")
	 WebElement Username;
	
	@FindBy(id="txtLPPassword")
	 WebElement Password;
	
	@FindBy(xpath="//button[@onclick=\"LoginFormOkClick()\"]")
	WebElement LoginOKButton ;
	
	@FindBy(id="btnLoginCancel")
	WebElement LoginCancelButton ;
	
	
	public LoginPage()  //constructor for initialising 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username, String password ) throws Throwable {
		
		ActionsClass.Implicitwait();
		Thread.sleep(3000);
		ActionsClass.type(Username, username);
		ActionsClass.type(Password, password);
		Thread.sleep(3000);
		ActionsClass.click(driver, LoginOKButton);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
