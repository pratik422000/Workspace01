package PageLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Client_Creatoin_Form {

	private WebDriver driver;
	public Client_Creatoin_Form (WebDriver d) {
		driver=d;
	}
	String Expected_Toast_Message = "Client saved successfully!";
	String ExpectedUrl = "https://stable-rc.qa.plextrac.ninja/dashboard";
	//---------------------------Object repository----------------------------------
	
	private By X_icon = By.xpath("//button[@class='ant-modal-close']");	
	
	//---------------------------Actions Methods------------------------------------	
	
	public void Verify_X (String string) throws Exception {
		driver.findElement(X_icon).click();Thread.sleep(1000);   
	}	
	
	//---------------------------Object repository----------------------------------	
	
	private By Close_btn = By.xpath("//button[@variant='cancel']");
	
	//---------------------------Actions Methods------------------------------------
	
	public void Verify_Close_btn (String string) throws Exception {
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));										// Explicit Wait
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"anticon anticon-plus\"]"))); 
		driver.findElement(Close_btn).click();Thread.sleep(2000);	
	}
	
	//---------------------------Object repository----------------------------------
	
	private By Client_Name = By.xpath("//input[@placeholder='Client/Project Name']");
	private By Point_of_Contact = By.xpath("//input[@placeholder='Enter POC Name']");
	private By Point_of_Contact_Email = By.xpath("//input[@placeholder='Enter POC Email']");
	private By Description = By.xpath("//textarea[@placeholder='Enter details or description of project/Client.']");
	private By Click_Select_Tags = By.xpath("//div[@style='width: 100%;']");
	private By Select_Tag = By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='01']");
	private By Click_outside = By.xpath("//div[@class='ant-modal-body']");
	private By Add_Custom_Field= By.xpath("//button[@variant='update']");
	private By Label1 = By.xpath("//input[@placeholder='Label #1']");
	private By Value1 = By.xpath("//input[@placeholder='Value #1']");
	private By Submit_btn = By.xpath("//button[@variant='submit']");
	private By Success_Toast = By.xpath("//div[@class='ant-notification-notice-description']");

	//---------------------------Actions Methods------------------------------------
	public void Create_New_Client_Form (String string) throws Exception {
		driver.findElement(Client_Name).sendKeys("Automation Client");
		driver.findElement(Point_of_Contact).sendKeys("Automation test");
		driver.findElement(Point_of_Contact_Email).sendKeys("automationtest@pratik.com");
		driver.findElement(Description).sendKeys("Automation test Client");
		driver.findElement(Click_Select_Tags).click();Thread.sleep(2000);
		driver.findElement(Select_Tag).click();
		driver.findElement(Click_outside).click();
		driver.findElement(Add_Custom_Field).click();
		driver.findElement(Label1).sendKeys("Automation Client Label");
		driver.findElement(Value1).sendKeys("Automation Client Value");
		driver.findElement(Submit_btn).click(); Thread.sleep(3000);
		Thread.sleep(5000);
		String Actual_Toast_Message = driver.findElement(Success_Toast).getText();
		Assert.assertEquals(Actual_Toast_Message, Expected_Toast_Message);
		System.out.println("Create Client Success Message:- " + Actual_Toast_Message);
		
		String ActualUrl = driver.getCurrentUrl();
		Assert.assertEquals(ActualUrl, ExpectedUrl);
	}
}
	
	
	
	


	

