package Sam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S6 {
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
	
		
		WebElement date=driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		String datval="29-04-2020";
		selectdatebyJS(driver, date, datval);
		
		
		
		
		}
	
	public static void selectdatebyJS(WebDriver driver,WebElement element,String dateval)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);
		
		
	}

}
