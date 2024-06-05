package ninja.plextrac.Clients.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninja.plextrac.testBase.TestBase;

public class SpecificClientHomeScreen extends TestBase {

	WebDriver ldriver;
	public SpecificClientHomeScreen(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	//---------------Header OPtions-----------------------
	
	@FindBy(xpath = "//button[@class='ant-btn ThemeButton-ak48sv-0 cIukBU variant-new has-icon']") WebElement createReportBtn;
	@FindBy(xpath = "//span[normalize-space()='Import report']") WebElement importReportBtn;
	@FindBy(xpath= "//div[@id='rc-tabs-14-tab-Reports']") WebElement clientReportsTab;
	@FindBy(xpath= "//div[@id='rc-tabs-14-tab-Findings']") WebElement clientFindingsTab;
	@FindBy(xpath= "//div[@id='rc-tabs-14-tab-Assets']") WebElement clientAssetsTab;
	@FindBy(xpath= "//div[@id='rc-tabs-14-tab-Details']") WebElement clientDetailsTab;
	@FindBy(xpath= "//div[@id='rc-tabs-14-tab-Statistics']") WebElement clientDStatisticsTab;
	
	public void click_create_report_btn(){
		createReportBtn.click();
	}	
	public void click_import_report_btn(){
		importReportBtn.click();
	}	
	
	
	
}
