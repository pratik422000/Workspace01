package automation_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotHandling {

	public static void main(String[] args) throws IOException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	ScreenshotHandling.takess(driver, "facebook02");
	
	// Take screenshot. //For every screenshot we need to write below  lines of code. To Avoid this we have used utility method.
	//TakesScreenshot ts = (TakesScreenshot)driver;
	//File src = ts. getScreenshotAs(OutputType.FILE);
	//File des = new File("D:\\Automation\\Selenium\\Snapshots\\faecbook1.png");
	//FileHandler.copy(src, des);

	}
	public static void takess(WebDriver driver , String fname) throws IOException  // This is utility method
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts. getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\Automation\\Selenium\\Snapshots\\" + fname +".png");
		FileHandler.copy(src, des);
	}
	
}
