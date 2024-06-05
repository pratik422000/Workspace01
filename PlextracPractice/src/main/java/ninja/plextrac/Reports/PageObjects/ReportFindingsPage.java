package ninja.plextrac.Reports.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninja.plextrac.testBase.TestBase;

public class ReportFindingsPage extends TestBase{
	
	WebDriver ldriver;
	public ReportFindingsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath ="//span[normalize-space()='Add Findings']") WebElement addFindingsDropdown;
	@FindBy(xpath ="//li[@title='Create Finding']") WebElement createFindingDropdownOption;
	
	public void addFinding () throws Exception {
		addFindingsDropdown.click();
		createFindingDropdownOption.click();Thread.sleep(3000);
	}
	
	
	
	
	
	

}
