package automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
	
		//WebDriver driver = WebDriverManager.firefoxdriver().create();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");

	}

}
