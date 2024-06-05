package ninja.plextrac.Clients.Pageobject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateClientForm {

	WebDriver ldriver; // Created object of WebDriver.

	//-----------------Verify Client Creation----------------------
	public CreateClientForm(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath= "//input[@placeholder='Client/Project Name']")
	WebElement ClientNameTxtBox;
	
	@FindBy(xpath= "//input[@placeholder='Enter POC Name']")
	WebElement PointOfContact ;
	
	@FindBy(xpath= "//input[@placeholder='Enter POC Email']")
	WebElement PointOfContactEmail;
	
	@FindBy(xpath= "//textarea[@placeholder='Enter details or description of project/Client.']")
	WebElement DescriptionTxtBox;
	
	@FindBy(xpath= "//div[@style='width: 100%;']")
	WebElement ClickSelectTags;
	
	@FindBy(xpath= "//div[@class='ant-select-item-option-content'][normalize-space()='01']")
	WebElement SelectTag;
	
	@FindBy(xpath= "//div[@class='ant-modal-body']")
	WebElement EmptyArea;
	
	@FindBy(xpath= "//button[@variant='update']")
	WebElement AddCustomField;
	
	@FindBy(xpath= "//input[@placeholder='Label #1']")
	WebElement Label1;
	
	@FindBy(xpath= "//input[@placeholder='Value #1']")
	WebElement Value1;
	
	@FindBy(xpath= "//button[@variant='submit']")
	WebElement SubmitBtn;
	
	@FindBy(xpath= "//div[@class='ant-notification-notice-description']")
	WebElement SuccessToast;

	public void Create_New_Client_Form (String string) throws Exception {
		ClientNameTxtBox.sendKeys("Automation Client");
		PointOfContact.sendKeys("Automation test");
		PointOfContactEmail.sendKeys("automationtest@pratik.com");
		DescriptionTxtBox.sendKeys("Automation test Client");
		ClickSelectTags.click();Thread.sleep(2000);
		SelectTag.click();
		EmptyArea.click();
		AddCustomField.click();
		Label1.sendKeys("Automation Client Label");
		Value1.sendKeys("Automation Client Value");
		SubmitBtn.click();Thread.sleep(3000);
	}
	//-----------------Success Toast Message----------------------
	public void verify_success_toast_message (String string)  {	
		String Actual_Toast_Message = SuccessToast.getText();
		String Expected_Toast_Message = "Client saved successfully!";
		Assert.assertEquals(Actual_Toast_Message, Expected_Toast_Message);
	}
	
	//-----------------Verify "X" icon----------------------	
	@FindBy(xpath ="//button[@class='ant-modal-close']")
	WebElement X_icon;
	
	public void Verify_X_icon (String string) throws Exception {
		X_icon.click();Thread.sleep(1000);
	}
	//-----------------Verify Close button----------------------
	@FindBy(xpath ="//button[@variant='cancel']")
	WebElement Close_btn;
	
	public void Verify_Close_btn (String string) throws Exception {
		Close_btn.click();
	}
	}
	
