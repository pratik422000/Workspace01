package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Client_ReportTab {
		WebDriver driver;
		public Client_ReportTab (WebDriver driver) {
		this.driver =driver;	
		}
	
	
		private By Create_Repot_btn = By.xpath("//span[normalize-space()='Create Report']");
		private By Import_Repport_btn = By.xpath("//span[normalize-space()='Import report']");
		private By columnCustmIcon = By.xpath("//*[name()='path' and contains(@d,'M20.75 0.7')]");
		private By Searchbox = By.xpath("//input[@placeholder='Search...']");
			
		
		
		public void Create_report (String string) throws Exception {
			driver.findElement(Create_Repot_btn).click();Thread.sleep(3000);	
			}
		
		public void Import_report (String string) {
			driver.findElement(Import_Repport_btn).click();
		}	

		public void ReporsColumn_customizer (String string) {
			driver.findElement(columnCustmIcon).click();
		}	
		
		public void Searchbox (String string) {
			driver.findElement(Searchbox).click();
			driver.findElement(Searchbox).sendKeys("Automation Client");
			
		}






		


















}
