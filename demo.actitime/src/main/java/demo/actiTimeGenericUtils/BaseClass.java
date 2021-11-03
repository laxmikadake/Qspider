package demo.actiTimeGenericUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import demo.actiTimePOM.HomePage;
import demo.actiTimePOM.LoginPage;

public class BaseClass {
	PropertyUtils putils=new PropertyUtils();
	WebDriver driver;
   @BeforeSuite
	public void configBS() {
	   //data base connection
		
	}
	@BeforeTest
	public void configBT() {
		//parallel testing codes
	}
	@BeforeClass
	public void configBC() {
			//open the browser
		String browserName=putils.getPropertyData("./src/test/resources/actiTimeCommonData.properties.txt", "browser");
		String url = putils.getPropertyData("./src/test/resources/actiTimeCommonData.properties.txt", "url");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver= new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
			driver= new FirefoxDriver();
		}else {
			throw new SessionNotCreatedException("browser is not supported");
	        }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	@BeforeMethod
	public void configBM() {
	LoginPage loginpage=new LoginPage(driver);
	String username = putils.getPropertyData("./src/test/resources/actiTimeCommonData.properties.txt", "username");
	String password = putils.getPropertyData("./src/test/resources/actiTimeCommonData.properties.txt", "password");
	loginpage.login(username, password);
	}
	@AfterMethod
	public void configAM() {
		HomePage homepage=new HomePage(driver);
		homepage.logout();
	}
	@AfterClass
	public  void configAC() {
		//close the browser
		driver.quit();
		
	}
	@AfterTest
	public void configAT() {
		//close all parallel connection 
		
	}
	@AfterSuite
	public void configAS() {
		//close data base connection
	
	}

}
