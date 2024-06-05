package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement fistname_textbox = driver.findElement(By.id("firstName"));
		fistname_textbox.sendKeys("Pratik");
		
		WebElement lastname_textbox = driver.findElement(By.id("lastName"));
		lastname_textbox.sendKeys("Dhake");
		
		WebElement Email_textbox = driver.findElement(By.id("userEmail"));
		Email_textbox.sendKeys("pratik.blr2000@gmial.com");
		
//		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[1]/input")).click();
		
		
		WebElement Mobile_Number= driver.findElement(By.id("userNumber"));
		Mobile_Number.sendKeys("9763816364");
		
//		WebElement DOB = driver.findElement(By.id("dateOfBirthInput"));
//		Thread.sleep(3000);
//		DOB.clear();
//		DOB.sendKeys("04 Feb 1998");
		
//		WebElement SUB_textbox= driver.findElement(By.xpath(null));
		
		
		
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		Thread.sleep(1000);	
//		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
//		Thread.sleep(1000);	
//		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
//		Thread.sleep(1000);	
	}

}
