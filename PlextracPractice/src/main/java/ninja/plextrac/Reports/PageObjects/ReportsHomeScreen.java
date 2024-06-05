package ninja.plextrac.Reports.PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ninja.plextrac.testBase.TestBase;

public class ReportsHomeScreen extends TestBase{
	
	 WebDriver ldriver; // Created object of WebDriver.
	   
	public ReportsHomeScreen(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//_________________________Reports Home Screen___________________________
	
	@FindBy(xpath = "//button[@class='ant-btn ThemeButton-ak48sv-0 actionButton__AddReportButton-kj1vor-10 cIukBU iMfAI variant-new has-icon']")
	WebElement createReportBtn;
	
	@FindBy (xpath= "//button[@class='ant-btn ant-btn-circle ant-btn-icon-only TableConfigButtonstyles__ConfigButton-sc-1qkw1fw-0 kLYLjx']//span[@role='img']//*[name()='svg']")
	WebElement columnCustomizer;
	
	@FindBy(xpath = "//input[@placeholder='Search Reports']")
	WebElement reportSearchBox;
	
	@FindBy (xpath ="//input[@id='rc_select_95']")
	WebElement statusesFilter;
	
	@FindBy(xpath = "//input[@id='rc_select_96']")
	WebElement UserRoleFilter;
	
	@FindBy(xpath = "//input[@id='rc_select_97']")
	WebElement allUsersList;
	
	@FindBy(xpath= "//button[@class='ant-btn ant-btn-primary DropdownButton__ReversedContentButton-sc-140v555-0 bDWbww ant-dropdown-trigger']") WebElement actionsBtn;
	
	@FindBy(xpath= "//li[@id='report-bulk-action-menuitem-delete']") WebElement actionsDeleteBtn;
	
	@FindBy(xpath= "//button[@class='ant-btn ThemeButton-ak48sv-0 cIukBU variant-delete']") WebElement confirmationDeleteBtn;
	
	@FindBy(xpath= "//div[@class='ant-notification-notice-description']") WebElement bulkDeleteSuccessToast;
	
	
	@FindBy(xpath= "//div[@class='ant-table-selection']//input[@type='checkbox']") WebElement selectallCheckbox;
	
	@FindBy(xpath = "//tr[@class='ant-table-row ant-table-row-level-0']")
	WebElement firstReportRow;
	
	public void create_Report_Btn () {
		createReportBtn.click();
	}
	
	public void column_CustomizerOption() {
		columnCustomizer.click();
	}
	
	public void report_Search_Box() throws Exception {
		reportSearchBox.sendKeys("Automation Report");Thread.sleep(4000);}
	
	public void statuses_Filter_Dropdown() {
		statusesFilter.click();
	}
	
	public void userrole_Filter_Dropdown() {
		UserRoleFilter.click();
	}
	
	public void allUsers_Filter_Dropdown() {
		allUsersList.click();
	}
	
	public void actions_Btn() {
		actionsBtn.click();
	}
	public void actions_Delete_Btn() throws Exception {
		actionsDeleteBtn.click();Thread.sleep(2000);
		confirmationDeleteBtn.click();
	}
	
	public void verify_Success_Toast_Message() {
		String Actaul_Toast_Message = bulkDeleteSuccessToast.getText();
		String Expected_Toast_Message = "Successfully deleted reports!";
		Assert.assertEquals(Actaul_Toast_Message, Expected_Toast_Message);
	}
	
	public void selectAll_checkbox() {
		selectallCheckbox.click();
	}
	
	public void clickOn_First_report_row() {
		firstReportRow.click();
	}
	
	//_________________________Create New Report Form___________________________
	
	@FindBy (xpath = "//input[@id='client']")
	WebElement selectClientdropdown;
	
	public void select_client_Dropdown() throws Exception {
		selectClientdropdown.click();Thread.sleep(2000);
	}
	
	@FindBy (css = ".rc-virtual-list-holder-inner")
	WebElement selectClient;
	
	@FindBy (xpath = "//div[@class='rc-virtual-list']")
	WebElement frame;
	
	public void select_client() throws Exception {
		
	System.out.println(selectClient.getSize());
		
		
		
		
		
		
		
		
		
		//
		
		
		
		
		
		
		
//		driver.switchTo().frame(frame);
//		Actions actions = new Actions(driver);
//		actions.scrollToElement(selectClient).perform();
//		Thread.sleep(5000);
		

	}
	
}

//     <class name="ninja.plextrac.testCases.TC_Create_Client"/>
//<class name="ninja.plextrac.testCases.TC_DeleteClient"></class>


