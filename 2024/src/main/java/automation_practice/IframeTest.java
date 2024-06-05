package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Automation/Selenium/Pune.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='1234']")).sendKeys("Pratik");	
		
		driver.switchTo().frame("lwighn");	// Switching to iframe By name.
		driver.findElement(By.xpath("//input[@name='kjfb']")).sendKeys("01Pratik");
		
		driver.switchTo().defaultContent(); // OR driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='2345']")).sendKeys("Dhake");
		
		driver.switchTo().frame(0); // Switching to iframe by index.
		driver.findElement(By.xpath("//input[@id='2345']")).sendKeys("01Dhake");
 		
		driver.switchTo().parentFrame(); // OR driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='3456']")).sendKeys("pratikautomationtest@gmail.com");
		
		WebElement xyz = driver.findElement(By.xpath("//iframe[@name='lwighn']")); // Switching to iframe by webelement.
		driver.switchTo().frame(xyz);
		driver.findElement(By.xpath("//input[@id='3456']")).sendKeys("pratikautomationtest@gmail.com");

}
}