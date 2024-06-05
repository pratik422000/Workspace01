package popupHandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();  // removed the login pop-up by clicking on X icon
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone"+Keys.ENTER); // Parent window
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();	// child window
		
		//-------------------------------------Windows handling-----------------------------------------------------
		
		Set<String> window_01 = driver.getWindowHandles();
		
		ArrayList<String> window_02 = new ArrayList<>(window_01);	
		
		driver.switchTo().window(window_02.get(1)); // Switching to child window
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(window_02.get(0)); // Switching back to parent window
		System.out.println(driver.getTitle());
		
		
		
//		String Text = driver.findElement(By.xpath("//h4[test()='Selenium WebDriver']")).getText();

	}

}
