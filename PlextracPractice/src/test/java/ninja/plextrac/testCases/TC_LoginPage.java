package ninja.plextrac.testCases;
import org.testng.annotations.Test;
import ninja.plextrac.pageObject.LoginPage;
import ninja.plextrac.testBase.TestBase;

public class TC_LoginPage extends TestBase {

	@Test(priority=0)
	public void login() throws Exception {

		LoginPage login = new LoginPage(driver);
		login.enterEmail();
		logger.info("Entered Email");
		login.clickLogin();
		login.enterPassword();
		logger.info("Entered Password");
		login.clickLogin();
		logger.info("Clicked on login");
		login.verifyUrl();
		logger.info("url opened");

	}
	//	@Test(priority=1)
	//	public void Activepage() {
	//		AlwaysActivePage activepage = new AlwaysActivePage(driver);
	//		String pagename = activepage.getDashboard();
	//		Assert.assertEquals("Dashboard", pagename);
	//	}
}
