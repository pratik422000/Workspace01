package ninja.plextrac.Clients.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninja.plextrac.testBase.TestBase;

public class ClientReportsPage extends TestBase {
	
	WebDriver ldriver;
	public ClientReportsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//button[@class='ant-btn ant-btn-circle ant-btn-icon-only TableConfigButtonstyles__ConfigButton-sc-1qkw1fw-0 kLYLjx']//span[@role='img']") WebElement columnCustomizer;
	@FindBy(xpath="//input[@placeholder='Search...']") WebElement searchBox; 
	
	@FindBy(xpath="//span[normalize-space()='All User Roles']") WebElement AllUserRoles; // All UserRoles filter option
	
	@FindBy(xpath="//div[contains(text(),'All User Roles')]") WebElement AllUserRolesfilteroption;
	@FindBy(xpath="//div[contains(text(),'Reviewers')]") WebElement reviewersfilteroption;
	@FindBy(xpath="//div[contains(text(),'Operators')]") WebElement operatorsfilteroption;
	
	@FindBy(xpath="//input[@id='rc_select_96']") WebElement allUsers;
	@FindBy(xpath="//div[@title=\"Pratik's Automation\"]") WebElement userSelection;
	
	@FindBy(xpath="//span[normalize-space()='All statuses']") WebElement allStatuses; // All Statuses filter option
	@FindBy(xpath="//div[contains(text(),'All Statuses')]") WebElement allStatusesfilteroption;
	@FindBy(xpath="//div[contains(text(),'No Status')]") WebElement noStatusfilteroption;
	@FindBy(xpath="//div[contains(text(),'Draft')]") WebElement draftfilteroption;
	@FindBy(xpath="//div[contains(text(),'Published')]") WebElement publishedfilteroption;
	
	@FindBy(xpath="//tr[@class='ant-table-row ant-table-row-level-0']") WebElement firstReportRow;
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-link ant-btn-icon-only LinkButton-kf1p7a-0 Statisticsstyles__EllipsisButton-sc-52k8g5-19 kDnrwO jaLMsQ ant-popover-open link ant-popover-open']") WebElement actionsEllipsis;
	@FindBy(xpath="//span[normalize-space()='Findings']") WebElement actionsFindingsBtn;
	@FindBy(xpath="//span[normalize-space()='Readout']") WebElement actionsReadoutBtn;

	public void click_Column_Customizer() {
		columnCustomizer.click();
	}
	public void searchBOX() {
		searchBox.sendKeys("Automation Report");
	}
	public void clickOn_First_ReportRow() {
		firstReportRow.click();
	}
}
