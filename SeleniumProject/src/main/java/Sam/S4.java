package Sam;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class S4 {
private static WebDriver driver=null;
	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	    
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        driver.get("https://www.google.co.in/");
        String title=driver.getTitle();
        // info(details)
        test.info("This step shows usage of info(details)");
     
      Assert.assertEquals(title,"Google");
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
        // calling flush writes everything to the log file
        extent.flush();

	}

}
