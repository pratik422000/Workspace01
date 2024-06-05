package automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowerLaunchFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://drive.google.com/drive/folders/1CbAKXhkFiQ_DKyqhJ-HZFNDoTGR03QWq");
		Thread.sleep(3000);
		driver.navigate().to("https://drive.google.com/drive/folders/1YTHCBm4ma0Qj62_HY89z_ZTbsFoG0OUm");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.close();
		//driver.close(); // To close tabs
		//driver.quit(); // TO close the browser
		
	}

}
