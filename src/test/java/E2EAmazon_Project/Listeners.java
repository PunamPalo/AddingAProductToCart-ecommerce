package E2EAmazon_Project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import resources.BaseHomePage;

public class Listeners extends BaseHomePage implements ITestNGListener {
	
	public void onTestFailure(ITestResult result) throws IOException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		String testname = result.getMethod().getMethodName();
		WebDriver driver = null;
		
		driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstanceName());
		
		takeScreenShot(testname,driver);
	}


}
