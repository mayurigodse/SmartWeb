package cms.Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
public static Properties prop;
public static WebDriver driver;

@BeforeSuite
public void beforesuit() {
	
	DOMConfigurator.configure("log4j.xml");	
}
	
	@BeforeTest
	public void loadConfig()
	{
		try {
			prop =new Properties();
			System.out.println("Super Constructor Invoked");
			FileInputStream ip=new FileInputStream(
					System.getProperty("user.dir")+ "\\Configuration\\Config.properties");
			prop.load(ip);
					System.out.println("driver: "+driver);
				
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void launchapp()
	{
		
		WebDriverManager.firefoxdriver().setup();
		String Browsername= prop.getProperty("browser");
		
		if(Browsername.contains("Firefox")) {
			driver=new FirefoxDriver();
		}else if(Browsername.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(Browsername.contains("EdgeDriver")) {
			driver= new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	

	
}
