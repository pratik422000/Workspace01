package ninja.plextrac.Findings.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewFindingPage {
	WebDriver ldriver;
	public CreateNewFindingPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	//--------------------Finding Details-----------------------
	
	@FindBy(xpath= "//input[@placeholder='Finding Title...']") WebElement findingTitleField;
	@FindBy(xpath= "//span[normalize-space()='Critical']") WebElement criticalSeverity;
	@FindBy(xpath= "//span[normalize-space()='High']") WebElement highSeverity;
	@FindBy(xpath= "//span[normalize-space()='Medium']") WebElement mediumSeverity;
	@FindBy(xpath= "//span[normalize-space()='Low']") WebElement lowSeverity;
	@FindBy(xpath= "//span[normalize-space()='Informational']") WebElement informationalSeverity;
	@FindBy(xpath= "//span[@class='ant-select-arrow']") WebElement scoreTypeDropdown;
	@FindBy(xpath= "//div[contains(text(),'CVSS v3.1')]") WebElement cvssv31;
	@FindBy(xpath= "//div[contains(text(),'CVSS v3.0')]") WebElement cvssv30;
	@FindBy(xpath= "//div[contains(text(),'CVSS v2.0')]") WebElement cvssv20;
	@FindBy(xpath= "//div[contains(text(),'General')]") WebElement general;
	@FindBy(xpath= "//input[@id='vector']") WebElement vectorField;
	@FindBy(xpath= "//span[normalize-space()='Calculate Score']") WebElement calculateScoreBtn;
	@FindBy(xpath= "(//div[@aria-label='Rich Text Editor, main'])[1]") WebElement descriptionTxtBox;
	@FindBy(xpath= "//button[@class='ant-btn ThemeButton-ak48sv-0 cIukBU variant-save']") WebElement saveBtn;
	
	
	public void create_finding_with_requiredFields () throws Exception {
		
		findingTitleField.sendKeys("Automation Finding");
		criticalSeverity.click();Thread.sleep(2000);
		descriptionTxtBox.click();
		descriptionTxtBox.sendKeys("This is manually created finding by automation");
		saveBtn.click();
	}



}
//