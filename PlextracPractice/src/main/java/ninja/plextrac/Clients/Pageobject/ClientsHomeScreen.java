package ninja.plextrac.Clients.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ninja.plextrac.testBase.TestBase;

public class ClientsHomeScreen extends TestBase {

	WebDriver ldriver; // Created object of WebDriver.

	public ClientsHomeScreen(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath= "//button[@class='ant-btn ThemeButton-ak48sv-0 cIukBU variant-new has-icon']")
	WebElement createClientBtn;
	
	public void click_new_client_Btn() throws InterruptedException {
		createClientBtn.click();Thread.sleep(2000);
	}
	
	
//------------------Tag Filter------------------
	@FindBy(xpath= "//div[@class='ant-select-selection-overflow']")
	WebElement searchByTagFilter;
	
	@FindBy(xpath= "//div[@class='ant-select-item-option-content'][normalize-space()='01']")
	WebElement selectTag ;
	
	@FindBy(xpath= "//span[@class='ant-select-selection-item-remove']//span[@aria-label='close']\"")
	WebElement xBtn ;
//------------------Search Filter------------------	
	@FindBy(xpath= "//button[@class='ant-btn ant-btn-circle ant-btn-sm ant-btn-icon-only KeywordInput__SuffixButton-g31cjd-1 hpEvME']")
	WebElement searchClientIcon;
	
	@FindBy(xpath= "//input[@data-cy='client-list-filter']")
	WebElement clientSearch ;
	
	public void client_search() throws Exception {
		searchClientIcon.click();
		clientSearch.sendKeys("Automation Client"); Thread.sleep(3000);
	}
	
//------------------Actions Ellipsis------------------	
	@FindBy(xpath= "//tbody/tr[1]/td[6]/div[1]/button[3]/span[1]")
	WebElement ellipsis ;
	
	@FindBy(xpath= "//span[normalize-space()='Delete Client']")
	WebElement deleteClientOption ;
	@FindBy(xpath= "//button[@class='ant-btn ant-btn-primary ant-btn-dangerous']")
	WebElement deleteConfirmation ;
	
	@FindBy(xpath= "//div[@class='ant-notification-notice-description']")
	WebElement successtoastmessage ;
	
	@FindBy(xpath= "//span[normalize-space()='View Assets']")
	WebElement viewAssetsOption ;
	
	@FindBy(xpath= "//tbody/tr[1]/td[6]/div[1]/button[2]/span[1]']")
	WebElement reportsOption ;
	
	
	public void click_On_Ellipsis() {
		ellipsis.click();
	}
	
	public void click_On_Delete_Client() {
		deleteClientOption.click();
		deleteConfirmation.click();
	}
	
	public void Verify_Success_Toast_message() {
		String Actual_Toast_Message = successtoastmessage.getText();
		String Expected_Toast_Message = "Client successfully deleted!";
		Assert.assertEquals(Actual_Toast_Message, Expected_Toast_Message);
		
	}
	
	//------------------1st row------------------	
	
	@FindBy(xpath ="//tbody/tr[1]")
	WebElement firstRow;
	
	public void click_on_row() {
		firstRow.click();
	}

	
	
	
	
	
}
