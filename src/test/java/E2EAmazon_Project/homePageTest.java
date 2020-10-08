package E2EAmazon_Project;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObject.HomePage;
import resources.BaseHomePage;

public class homePageTest extends BaseHomePage {
	
	public WebDriver driver;
	ExtentReports extrepo;
	
	
	@BeforeTest
	public void getURL() throws IOException {
		driver = invokebrowser();
		driver.get(prop.getProperty("url"));
		
		
		String path = System.getProperty("user.dir")+"/index.html";
		
		ExtentSparkReporter reporters = new ExtentSparkReporter(path);
		reporters.config().setReportName("webautomationres");	
		reporters.config().setDocumentTitle("Test Res");
		
	    extrepo = new ExtentReports();
		extrepo.attachReporter(reporters);
		extrepo.setSystemInfo("Tester", "Punam");
		
		
	}
	
	@Test
	public void addProducttoacart() throws IOException, InterruptedException {
		
		extrepo.createTest("addProducttoacart");
		HomePage hp = new HomePage(driver);
		hp.getpopup().click();
		hp.bestSeller().click();
		Thread.sleep(2000);
		hp.selectBook().click();
		Thread.sleep(2000);
		hp.searchTextbox().sendKeys("Think like a monk");
		Thread.sleep(2000);
		hp.selectEnter().click();
		Thread.sleep(2000);
		hp.selectedBook().click();
		Thread.sleep(2000);
		hp.addtoCart().click();
		
	}
	
	@AfterTest
	public void closebrowser() {
		driver.quit();
		extrepo.flush();
	}

}
