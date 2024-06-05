package ninja.plextrac.testCases;

import org.testng.annotations.Test;

import ninja.plextrac.Clients.Pageobject.ClientsHomeScreen;
import ninja.plextrac.Clients.Pageobject.CreateNewReportForClientForm;
import ninja.plextrac.Clients.Pageobject.SpecificClientHomeScreen;
import ninja.plextrac.Reports.PageObjects.ReportsHomeScreen;
import ninja.plextrac.pageObject.AlwaysActivePage;
import ninja.plextrac.testBase.TestBase;

public class TC_Create_Report extends TestBase {
	
	@Test(enabled=false)
	public void create_new_report() throws Exception {
		
		AlwaysActivePage ReportsBtn = new AlwaysActivePage(driver);
		ReportsBtn.Reports_menu();
		
		ReportsHomeScreen createReport = new ReportsHomeScreen(driver);
		createReport.create_Report_Btn();
		logger.info("Clicked on Reports");
		createReport.select_client_Dropdown();
		logger.info("Clicked on client dropdown");
		createReport.select_client();
	}
	
	@Test(enabled=true)
	public void create_report_within_client() throws Exception {
		AlwaysActivePage clientsBtn = new AlwaysActivePage(driver);
		clientsBtn.Client_menu();
		ClientsHomeScreen clickOnClient = new ClientsHomeScreen(driver);
		clickOnClient.client_search();
		clickOnClient.click_on_row();
		SpecificClientHomeScreen createReportBtn = new SpecificClientHomeScreen(driver);
		createReportBtn.click_create_report_btn();
		CreateNewReportForClientForm createNewReportForm = new CreateNewReportForClientForm(driver);
		createNewReportForm.create_Report_Form();
		createNewReportForm.verify_success_toast_message();
	}

}
