package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Baseclass {
	
	WebDriver driver;
	Properties prop;
	@Test
	public void BaseCall() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\CucumberGit\\src\\test\\java\\resources\\data.properties");
		prop=new Properties();
		prop.load(fis);
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\CucumberGit\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\eclipse-workspace\\CucumberGit\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		driver.get(url);
		
		
	}
		
		
		
	}
	

