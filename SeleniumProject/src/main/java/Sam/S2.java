package Sam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class S2 {

	private static WebDriver driver=null;
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlreport=new ExtentHtmlReporter("extent.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlreport);
		ExtentTest test1=extent.createTest("Google Search Test");
		test1.log(Status.INFO, "Starting test case");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.google.co.in/");
	test1.pass("Entering in tesxt box");
		 
		 driver.findElement(By.name("q")).sendKeys("Selenium");
		 driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		 test1.pass("Pressed Enter key");
		 driver.close();
		 test1.info("Test Completed");
		 extent.flush();
		 

	}

}
