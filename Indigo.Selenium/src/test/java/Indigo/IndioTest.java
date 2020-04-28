package Indigo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import Configurations.ConfigurationsTest;

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
	   
	   
   }
}
