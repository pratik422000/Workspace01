package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignment {
	
	public static void main(String []args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@value='Refresh']")).click();
	
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Alex");
	
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("World");
	
	driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("37.305347, -120.481406");
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("alexworld@yopmail.com");
	
	driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("1234567890");
	
	driver.findElement(By.xpath("//input[@value='Male']")).click();
	
	driver.findElement(By.xpath("//input[@value='Movies']")).click();
		
	driver.findElement(By.xpath("//div[@id='msdd']")).click();
	
	driver.findElement(By.xpath("//li//a[text()=\"Arabic\"]")).click();
	
	driver.findElement(By.xpath("//section[@id='section']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//select[@id='Skills']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//option[@value='Adobe InDesign']")).click();
	
//	driver.findElement(By.xpath("//span[@id='countries']")).click(); //values not present at the drop-down.
	
	driver.findElement(By.xpath("//span[@role='combobox']")).click();
	
	driver.findElement(By.xpath("//li[text()='India']")).click();
	 
	driver.findElement(By.xpath("//select[@placeholder='Year']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[text()='1998']")).click();

	driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//option[text()='February']")).click();
	
	driver.findElement(By.xpath("//select[@placeholder='Day']")).click();
	Thread.sleep(2000);		
	driver.findElement(By.xpath("//option[text()='4']")).click();
		
	driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Password@1234");
		
	driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Password@1234");	
		
	driver.findElement(By.xpath("//button[@id='submitbtn']")).click();	
		
		
		
		
		
	}

}
