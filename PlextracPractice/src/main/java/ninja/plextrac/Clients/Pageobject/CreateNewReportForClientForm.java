package ninja.plextrac.Clients.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ninja.plextrac.testBase.TestBase;

public class CreateNewReportForClientForm extends TestBase{

	WebDriver ldriver;
	public CreateNewReportForClientForm(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "//input[@id='name']") WebElement reportNameTxtBox;
	@FindBy(xpath = "//div[@class='ant-select TagsSelectstyles__ThemeTagsSelect-sc-1mddhed-0 giRIDe ant-select-multiple ant-select-show-search']//div[@class='ant-select-selection-overflow']") WebElement selectTagBOx;
	@FindBy(xpath = "//div[@class='ReportCreatestyles__AddField-zstno4-3 iQGSvJ']//button[@type='button']") WebElement addCustomFieldBtn;
	@FindBy(xpath = "//input[@id='custom_field_0_label']") WebElement labelTxtBox;
	@FindBy(xpath = "//input[@id='custom_field_0_value']") WebElement valueTxtBox;
	@FindBy(xpath = "//button[@class='ant-btn ThemeButton-ak48sv-0 cIukBU variant-submit']") WebElement submitBtn;
	@FindBy(xpath= "//div[@class='ant-notification-notice-description']") WebElement successToast;
	public void create_Report_Form() {
		reportNameTxtBox.sendKeys("Automation Report");
//		selectTagBOx.sendKeys("Automation");
		addCustomFieldBtn.click();
		labelTxtBox.sendKeys("QA");
		valueTxtBox.sendKeys("This is report level short code testing");
		submitBtn.click();
	}
	public void verify_success_toast_message () {
		String Actual_Toast_Message = successToast.getText();
		String Expected_Toast_Message = "Report has been created successfully.";
		Assert.assertEquals(Actual_Toast_Message, Expected_Toast_Message);
	}
	
	
	
	
	
}
