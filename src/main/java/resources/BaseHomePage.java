package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class BaseHomePage {
	
	public WebDriver driver;
	
	public Properties prop;
	@Test
	public WebDriver invokebrowser() throws IOException {
		
		 prop = new Properties();
			FileInputStream fs = new FileInputStream("/Users/punampalo/eclipse-workspace/E2EAmazon_Project/src/main/java/resources/data.properties");
			prop.load(fs);
			String browserName = prop.getProperty("browser");
			
			
			if(browserName.equals("chrome") ) {
				
				System.setProperty("webdriver.chrome.driver", "/Users/punampalo/Documents/Drivers/chromedriver");
				driver = new ChromeDriver();
			}
			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
	}
	
	public void takeScreenShot(String testcaseaName,WebDriver driver) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		System.out.println("user.dir");
		String destfile = System.getProperty("user.dir")+"/Reports/"+testcaseaName+".png";
		Files.copy(source,new File(destfile));
		
		}

}
