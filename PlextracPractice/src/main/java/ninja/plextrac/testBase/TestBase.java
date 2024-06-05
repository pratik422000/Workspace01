package ninja.plextrac.testBase;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;
import ninja.plextrac.pageObject.LoginPage;
import ninja.plextrac.utilities.ReadConfig;

public class TestBase {

	ReadConfig readConfig =new ReadConfig();

	protected String url = readConfig.getUrl();
	String browser = readConfig.getBrowser();

	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void launchApp() {

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver();
//			break;
//
//		case "firefox":
//			WebDriverManager.chromedriver().setup();	
//			driver = new FirefoxDriver();
//
//		case "msedge":
//			WebDriverManager.chromedriver().setup();	
//			driver = new EdgeDriver();
//
//		default:
//			driver=null;
//			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);	
		logger =LogManager.getLogger("PlextracPractice");

	}
	
	@BeforeClass
	public void login() throws Exception {

		LoginPage login = new LoginPage(driver);
		login.enterEmail();
		logger.info("Entered Email");
		login.clickLogin();
		login.enterPassword();
		logger.info("Entered Password");
		login.clickLogin();
		logger.info("Clicked on login");
		login.verifyUrl();
		logger.info("url opened");
	}
	
	@AfterClass
	public void teartDown() {
		driver.close();
		driver.quit();
	}
	
//	@AfterSuite
//	public void teartDown1() {
//		driver.close();
//		driver.quit();
//	}

	public void captureScreenshot (WebDriver driver , String testName) throws IOException
	{
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		//call getScreenshotAs method to create image file.
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new  File (System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");
		// Copy image file to destination
		FileUtils.copyFile(src, dest);

	}


}
