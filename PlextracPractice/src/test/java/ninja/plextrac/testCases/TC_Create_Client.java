package ninja.plextrac.testCases;

import org.testng.annotations.Test;

import ninja.plextrac.Clients.Pageobject.ClientsHomeScreen;
import ninja.plextrac.Clients.Pageobject.CreateClientForm;
import ninja.plextrac.pageObject.AlwaysActivePage;
import ninja.plextrac.testBase.TestBase;

public class TC_Create_Client extends TestBase {
	@Test(enabled=true)
	public void create_New_Client() throws Exception {
		
		AlwaysActivePage clientsBtn = new AlwaysActivePage(driver);
		clientsBtn.Client_menu();
		logger.info("Clicked on Clients menu");
		
		ClientsHomeScreen newClient = new ClientsHomeScreen(driver);
		newClient.click_new_client_Btn();
		logger.info("Clicked on Create New Client Btn");
		
		CreateClientForm newClientForm = new CreateClientForm(driver);
		newClientForm.Create_New_Client_Form("Client_Form");
		newClientForm.verify_success_toast_message("success_toast");
		logger.info("Verified Client Creation Success Toast message");
	}

}
