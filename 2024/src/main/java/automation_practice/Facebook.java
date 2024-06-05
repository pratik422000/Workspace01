package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		
		//first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Isha");
		
		//surname
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pawar");
		Thread.sleep(3000);		
		//email id
		driver.findElement(By.xpath("//input[contains(@id,'u_0_g')]")).sendKeys("Test@gmail.com");
		Thread.sleep(3000);
		//Re-enter email
		driver.findElement(By.xpath("//input[contains(@id,'u_0_j_')]")).sendKeys("Test@gmail.com");
		Thread.sleep(3000);
		
		//new password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Isha@1234");
		
		//date Drop down
		WebElement date_dp = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(date_dp);
		s.selectByIndex(25);
		
		//month Drop down
		WebElement month_dp = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(month_dp);
		s1.selectByVisibleText("Nov");
		
		//year Drop down
		WebElement year_dp = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select(year_dp);
		s2.selectByValue("1995");
		
		//Gender
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		//Sign Up
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
				
		
		
	}

}
	
	

