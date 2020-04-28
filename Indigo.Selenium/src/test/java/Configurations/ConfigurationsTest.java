package Configurations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationsTest {
	Properties pro;

	public ConfigurationsTest() {
		try {
			File src = new File("C:\\Program Files\\Selenium\\Spring tool suite\\Code\\Indigo.Selenium\\src\\main\\resources\\Configurations\\Configuration.properties\\");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("Exception is " + e.getMessage());
			e.printStackTrace();

		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public String path()

	{
		String Path = pro.getProperty("FirefoxDriver");
		return Path;

	}

	public String URL() {
		String url = pro.getProperty("URL");
		return url;

	}

}
