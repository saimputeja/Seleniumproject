package Sam;

import java.util.concurrent.TimeUnit;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
//		WebElement date=driver.findElement(By.id("ctl00_mainContent_view_date1"));
//		String dateval="30-04-2020";
//	}
//	
//	public static void selectdatebyjs(WebDriver driver,WebElement element,String date)
//	{
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].setAttribute('value','"+date+"')", element);
//		
	}

}
