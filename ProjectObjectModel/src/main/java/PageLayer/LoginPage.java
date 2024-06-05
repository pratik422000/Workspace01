package PageLayer;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	public LoginPage (WebDriver driver) {
	driver = driver;	
	}
	
	//-----------Object repository-----------------------------
	
	private By username_textbox = By.xpath("//input[@name='username']");
	private By submit_btn = By.xpath("//button[@variant='submit']");
	private By password_textbox = By.xpath("//input[@name='password']");
	private By submitagain_btn = By.xpath("//button[@variant='submit']");
	
	//--------------Actions methods-----------------------------
	
	public void enterusername(String string) {
		driver.findElement(username_textbox).sendKeys("pratik.b.dhake@intimetec.com"); }
	public void hitsubmit(String string)	{
		driver.findElement(submit_btn).click();}
	public void enterpassword (String string) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicit Wait
		driver.findElement(password_textbox).sendKeys("Password#422");}
	public void hitsubmitagain (String string) throws InterruptedException {
		driver.findElement(submitagain_btn).click();Thread.sleep(5000);
		String title= driver.getTitle();
		assertEquals(title, "PlexTrac");	
		
	}
	

}
