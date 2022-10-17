package cms.Actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cms.Baseclass.BaseClass;

public class ActionsClass extends BaseClass {

	public static void click(WebDriver Idriver, WebElement locatorName) throws Throwable
	{
		Actions act = new Actions(Idriver);
		act.click(locatorName).build().perform();
	
	}
	
	public static void movetoElement(WebDriver Idriver, WebElement locatorName) throws Throwable
	{
		
		Actions act = new Actions(Idriver);
		act.moveToElement(locatorName).build().perform();
	
	}
	
	public static boolean type(WebElement ele, String text) throws Throwable
	{
		
		boolean flag=false;
		 try {
			 flag=ele.isDisplayed();
			 ele.clear();
			 ele.sendKeys(text);
			 flag=true;
		 }catch(Exception e) {
			 System.out.println("Location Not found");
			 flag=false;	 
		 }finally {
			 if(flag=true)
			 {
				 System.out.println("successfully entered the value");
			 }
			 else {
				 System.out.println("Unable to enter the value");
			 }
		 }
		
		return flag;
		
	}
	
	public static boolean selectByIndex(WebElement element, int index) throws Throwable
	{
		
		boolean flag=false;
		try {
			Select s= new Select(element);
			s.selectByIndex(index);
			flag=true;
		}catch(Exception e) {
			flag=false;
		}finally {
			if(flag=true) {
				System.out.println("Option selected by index");
			}else {
				System.out.println("option not selected by index");
			}
		}
		return flag;
	}
	
	public static boolean selectByValue(WebElement element, String value) throws Throwable
	{
		boolean flag=false;
		try {
			Select s= new Select(element);
			s.selectByValue(value);
			flag=true;
		}catch(Exception e) {
			flag=false;
		}finally {
			if(flag=true) {
				System.out.println("Option selected by value");
			}else {
				System.out.println("option not selected by value");
			}
		}
		return flag;
	}
	
	public static boolean selectByVisibleText(WebElement element, String text) throws Throwable
	{
		boolean flag=false;
		try {
			Select s= new Select(element);
			s.selectByVisibleText(text);
			flag=true;
		}catch(Exception e) {
			flag=false;
		}finally {
			if(flag=true) {
				System.out.println("Option selected by text");
			}else {
				System.out.println("option not selected by text");
			}
		}
		return flag;
	}
	
	public static void scrollByVisibilityofElement(WebDriver driver, WebElement element)throws Throwable
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].SrollintoView();", element);
		
	}

	public static boolean JSClick(WebDriver driver, WebElement ele)
	{
		boolean flag=false;
		try {
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("argument[0].click", ele);
			
			flag=true;
		}catch(Exception e) {
			throw e;
			
		}finally {
			if(flag) {
				System.out.println("click action is performed");
			}else {
				System.out.println("cannot perform click action");			}
		}
		return flag;
	}

	@SuppressWarnings("deprecation")
	public static void Implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
}

