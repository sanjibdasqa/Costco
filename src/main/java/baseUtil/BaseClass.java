package baseUtil;


import java.net.URL;
import java.time.Duration;
import static utils.IconstantSanjib.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;
import utils.ConfigurationSanjib;

public class BaseClass {
	
	public WebDriver driver;
	public Homepage homepage;
	ConfigurationSanjib configSanjib;
	public Select select;
	@BeforeMethod
	public void setup() {
		
		System.setProperty("Webdriver.gecko.driver","C:\\Users\\16788\\eclipse-workspace\\com.costco\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		//System.setProperty("Webdriver.edge.driver", "./driver/msedgedriver.exe");
		//driver = new EdgeDriver();
		//System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
		//driver = new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		//WebDriverManager.chromedriver().driverVersion("107.0.5304.62").setup();
		//driver = new ChromeDriver();
		//WebDriverManager.edgedriver().setup();
		//driver = new EdgeDriver();
		//WebDriverManager.firefoxdriver().setup();
		 //driver = new FirefoxDriver();
		
		configSanjib = new ConfigurationSanjib();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.costco.com/");
		driver.get(configSanjib.getProperty((URL)));
	    long pageLoadTime=Long.parseLong(configSanjib.getProperty((PAGELOAD_WAIT)));
	    long implicitlywait=Long.parseLong(configSanjib.getProperty((IMPLICITLY_WAIT)));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlywait));
		homepage = new Homepage(driver);
	}
		
		@AfterMethod
		public void tearUp() {
			driver.quit();
		}
		
		
		
			
	

}
