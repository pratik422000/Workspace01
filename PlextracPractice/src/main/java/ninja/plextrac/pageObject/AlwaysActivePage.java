package ninja.plextrac.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlwaysActivePage {

	WebDriver driver; // Created object of WebDriver.

	public AlwaysActivePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@data-testid='sidebar-menuitem-clients']")
	WebElement ClientMenu;
	
	@FindBy(xpath = "//a[@data-testid='sidebar-menuitem-reports']")
	WebElement ReportsMenu;
	
	
	public void Client_menu() throws Exception {
		ClientMenu.click(); Thread.sleep(2000);
	}
	
	public void Reports_menu() throws Exception {
		ReportsMenu.click(); Thread.sleep(2000);
	}
	
	
	
}
	
//	//-----------Object repository-----------------------------
//	
//		private By Dashboard_menu = By.xpath("a[@data-testid='sidebar-menuitem-dashboard']");
//		private By Client_menu = By.xpath("//a[@data-testid='sidebar-menuitem-clients']");
//		private By Assessments_menu = By.xpath("");
//		private By Reports_menu = By.xpath("//a[@data-testid='sidebar-menuitem-reports']");		
//		private By Priorities_menu = By.xpath("//a[@data-testid='sidebar-menuitem-priorities']");
//		private By ContentLibrary_menu = By.xpath("//span[contains(text(),'Content Library')]");
//		private By NarrativeDB_menu = By.xpath("//a[@data-testid='sidebar-menuitem-narratives']");
//		private By WritesDB_menu = By.xpath("//a[@data-testid='sidebar-menuitem-writeups']");
//		private By Analytics_menu = By.xpath("//a[@data-testid='sidebar-menuitem-analytics']");
//		private By Runbooks_menu = By.xpath("//a[@data-testid='sidebar-menuitem-runbooks-v2']");
//		//--------------Actions methods-----------------------------
//		
//		public void Dashboard_menu(String string)	{
//			driver.findElement(Dashboard_menu).click();}
//		public void Client_menu(){
//			driver.findElement(Client_menu).click();}
//		public void Assessments_menu(String string)	{
//			driver.findElement(Assessments_menu).click();}
//		public void Reports_menu(String string)	{
//			driver.findElement(Reports_menu).click();}
//		public void Priorities_menu(String string)	{
//			driver.findElement(Priorities_menu).click();}
//		public void ContentLibrary_menu(String string)	{
//			driver.findElement(ContentLibrary_menu).click();}
//		public void NarrativeDB_menu(String string)	{
//			driver.findElement(NarrativeDB_menu).click();}
//		public void WritesDB_menu(String string)	{
//			driver.findElement(WritesDB_menu).click();}
//		public void Analytics_menu(String string)	{
//			driver.findElement(Analytics_menu).click();}
//		public void Runbooks_menu(String string)	{
//			driver.findElement(Runbooks_menu).click();}
//	}

