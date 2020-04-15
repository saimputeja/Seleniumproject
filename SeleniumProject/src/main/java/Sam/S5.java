//package Sam;
//
//import java.io.IOException;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//
//public class S5 {
//ExtentHtmlReporter htmlReporter;
//ExtentReports extent;
//WebDriver driver;
//	@BeforeSuite
//	public void setup()
//	{
//		htmlReporter = new ExtentHtmlReporter("extent1.html");
//	    
//        // create ExtentReports and attach reporter(s)
//        extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
//    		 driver=new ChromeDriver();
//    		
//	}
//	@Test
//	public void test1() throws IOException
//	{
//		driver.get("https://www.google.co.in/");
//		
//		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
//		test.log(Status.INFO, "This step shows usage of log(status, details)");
//
//        // info(details)
//        test.info("This step shows usage of info(details)");
//        
//        // log with snapshot
//        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
//        
//        // test with snapshot
//        test.addScreenCaptureFromPath("screenshot.png");
//	}
//	@AfterSuite
//	public void teardown()
//	{
//		extent.flush();
//	}
//
//
//
//}
