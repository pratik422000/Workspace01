package ninja.plextrac.testCases;

import org.testng.annotations.Test;

import ninja.plextrac.Clients.Pageobject.ClientsHomeScreen;
import ninja.plextrac.pageObject.AlwaysActivePage;
import ninja.plextrac.testBase.TestBase;

public class TC_DeleteClient extends TestBase  {

	@Test(enabled=true)
	public void delete_Client() throws Exception {
		AlwaysActivePage clientsBtn = new AlwaysActivePage(driver);
		clientsBtn.Client_menu();
		ClientsHomeScreen ellipsis = new ClientsHomeScreen(driver);
		ellipsis.client_search();
		ellipsis.click_On_Ellipsis();
		ellipsis.click_On_Delete_Client();
		ellipsis.Verify_Success_Toast_message();
		logger.info("Client deleted successfully");
	
	}	
}
