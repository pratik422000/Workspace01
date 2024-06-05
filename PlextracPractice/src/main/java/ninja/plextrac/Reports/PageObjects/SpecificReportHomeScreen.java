package ninja.plextrac.Reports.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninja.plextrac.testBase.TestBase;

public class SpecificReportHomeScreen extends TestBase {


		WebDriver ldriver;
		public SpecificReportHomeScreen(WebDriver rdriver) {
			ldriver = rdriver;
			PageFactory.initElements(rdriver,this);
		}
		
		@FindBy(xpath ="//span[normalize-space()='Export']") WebElement exxportBtn;
		
		@FindBy(xpath ="//div[contains(@id,'-tab-Findings')]") WebElement findingsTab;
		
		@FindBy(xpath ="//div[@id='rc-tabs-16-tab-Details']") WebElement detailsTab;
		
		@FindBy(xpath ="//div[@id='rc-tabs-16-tab-Assets']") WebElement assetsTab;
		
		@FindBy(xpath ="//div[@id='rc-tabs-16-tab-Narrative']") WebElement narrativeTab;
		
		@FindBy(xpath ="//div[@id='rc-tabs-16-tab-Readout']") WebElement readoutTab;
		
		@FindBy(xpath ="//div[@id='rc-tabs-16-tab-Artifacts']") WebElement artifactsTab;
		
		@FindBy(xpath ="//div[@id='rc-tabs-16-tab-Attack Path']") WebElement attackPathTab;
		
		public void click_findingsTab(){
			findingsTab.click();
		}	
		
		public void click_detailsTab(){
			detailsTab.click();
		}
		
		public void click_assetsTab(){
			assetsTab.click();
		}
		
		public void click_narrativeTab(){
			narrativeTab.click();
		}
		
		public void click_readoutTab(){
			readoutTab.click();
		}
		
		public void click_artifactsTab(){
			artifactsTab.click();
		}
		
		public void click_attackpathTab(){
			attackPathTab.click();
		}
}