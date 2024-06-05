package PageLayer;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dev.failsafe.internal.util.Assert;



public class ClientPage {

	WebDriver driver;
	public ClientPage (WebDriver d) {
	this.driver =d;	
	}
	String Expected_Toast_Message1= "Client successfully deleted!";
	
//---------------------------Object repository--------------------------------
		private By Create_Client_btn = By.xpath("//span[@class=\"anticon anticon-plus\"]");
//---------------------------Actions methods----------------------------------
		public void Header(String string) throws Exception {
			driver.findElement(Create_Client_btn).click();Thread.sleep(3000);
		}
		
//---------------------------Object repository-------------------------------		
		private By ClientSearch_ByTag = By.xpath("//div[@class='ant-select-selection-overflow']");
		private By SelectTag = By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='01']"); 
		private By SelectTag1 = By.xpath("//div[contains(@title,'1.48')]");
		private By Closebtn = By.xpath("//span[@class='ant-select-selection-item-remove']//span[@aria-label='close']");
		private By Closebtn1 = By.xpath("//span[@class='ant-select-selection-item-remove']//span[@aria-label='close']");
//---------------------------Actions methods---------------------------------
		public void SearchByTag(String string) throws Exception {
			driver.findElement(ClientSearch_ByTag).click();
			driver.findElement(SelectTag).click();Thread.sleep(2000);
			driver.findElement(SelectTag1).click();Thread.sleep(2000);
			driver.findElement(Closebtn).click();Thread.sleep(2000);
			driver.findElement(Closebtn1).click();Thread.sleep(2000);
		}			
//---------------------------Object repository-------------------------------
		private By Client_Searchicon = By.xpath("//button[@class='ant-btn ant-btn-circle ant-btn-sm ant-btn-icon-only KeywordInput__SuffixButton-g31cjd-1 hpEvME']");
		private By Client_Search= By.xpath("//input[@data-cy='client-list-filter']");

//---------------------------Actions methods---------------------------------	
		
		public void SearchClient(String string) throws Exception {
			driver.findElement(Client_Searchicon).click();
			driver.findElement(Client_Search).sendKeys("Automation Client"); Thread.sleep(3000);
		}	
//----------------------------------- Client row > Action options----------------------------------
		
		//--Object repository - Actions> Ellipsis
	
		private By Ellipsis = By.xpath("//tbody/tr[1]/td[6]/div[1]/button[3]/span[1]");
		
		public void Client_Ellipsis(String string) throws Exception {
			driver.findElement(Ellipsis).click();Thread.sleep(2000);
		}
		
		//--Object repository - Ellipsis> Delete Client	
		private By Delete_Client = By.xpath("//span[normalize-space()='Delete Client']");
		private By Delete_Confirmation = By.xpath("//span[normalize-space()='Delete']");
		private By Success_Toast = By.xpath("//div[@class='ant-notification-notice-description']");
		//--Actions methods
		public void DeleteClient(String string) throws Exception {
			driver.findElement(Delete_Client).click(); Thread.sleep(2000);
			driver.findElement(Delete_Confirmation).click(); Thread.sleep(2000); // Need to add waits
			String Actual_Toast_Message1 = driver.findElement(Success_Toast).getText(); 
			System.out.println("Delete Client Success Message:- " + Actual_Toast_Message1);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-circle ant-btn-sm ant-btn-icon-only KeywordInput__SuffixButton-g31cjd-1 hpEvME']")).click();
		}
		//--Object repository - Ellipsis> View Assets
		private By ViewAssets = By.xpath("//span[normalize-space()='View Assets']");
		
		//--Actions methods
		public void ViewAssets(String string) {
			driver.findElement(ViewAssets).click();
		}
		
		//--Object repository - Actions > Reports
				private By Reports = By.xpath("//tbody/tr[1]/td[6]/div[1]/button[2]/span[1]']");
		//--Actions methods
				public void Actions_Reports (String string) {
					driver.findElement(Reports).click();
				}
	
	
	
	
}
