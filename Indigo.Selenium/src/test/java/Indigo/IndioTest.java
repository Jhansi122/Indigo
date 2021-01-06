package Indigo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import Configurations.ConfigurationsTest;

/**
 * @author JHANSI
 * 
 *
 */
public class IndioTest 
{
	WebDriver driver;
	
	@BeforeTest 
   public void browser()
   {
	   ConfigurationsTest confg = new ConfigurationsTest();
	   System.setProperty("webdriver.gecko.driver", confg.path());
	   driver = new FirefoxDriver();
	   driver.get(confg.URL());
	   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	   driver.quit();
	 
	   
	   
   }
}




