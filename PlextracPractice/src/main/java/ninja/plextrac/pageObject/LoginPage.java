package ninja.plextrac.pageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ninja.plextrac.testBase.TestBase;

public class LoginPage extends TestBase {

	WebDriver rdriver; // Created object of WebDriver.

	public LoginPage(WebDriver rdriver) {
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//img[@alt='App logo']")
	WebElement appLogo;

	@FindBy(xpath = "//input[@placeholder='Enter email']")
	WebElement emailBox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbtn;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordBox;

	public void validateLogo() {
		appLogo.isDisplayed();
	}

	public void enterEmail() throws Exception {
		emailBox.sendKeys("pratik.b.dhake+automation@intimetec.com");
		Thread.sleep(3000);
	}

	public void clickLogin() throws Exception {
		loginbtn.click(); Thread.sleep(5000);
	}

	public void enterPassword() {
		passwordBox.sendKeys("Password#422");
	}
	public void verifyUrl() throws IOException {
//		String ExpectedUrl = "https://stable-rc.qa.plextrac.ninja/dashboard/new";
		String ActualUrl = driver.getCurrentUrl();
//		Assert.assertEquals(ActualUrl, ExpectedUrl);
//		System.out.println(ActualUrl);
		
		if (ActualUrl.equals("https://stable-rc.qa.plextrac.ninja/dashboard")) {
			logger.info("VerifyLogin - Passed");
			Assert.assertTrue(true);
		}
		else
		{	logger.info("VerifyLogin - Failed");
			captureScreenshot(driver, "VerifyLogin");
			Assert.assertTrue(false);
		}
	}

		
	}
