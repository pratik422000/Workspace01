package ninja.plextrac.testCases;

import org.testng.annotations.Test;

import ninja.plextrac.Reports.PageObjects.ReportsHomeScreen;
import ninja.plextrac.pageObject.AlwaysActivePage;
import ninja.plextrac.testBase.TestBase;

public class TC_Delete_Reports extends TestBase {
	@Test
	public void bulk_reports_delete () throws Exception {
		
		AlwaysActivePage reportsBtn = new AlwaysActivePage(driver);
		reportsBtn.Reports_menu();
		ReportsHomeScreen deleteReports = new ReportsHomeScreen(driver);
		deleteReports.report_Search_Box();
		deleteReports.selectAll_checkbox();
		deleteReports.actions_Btn();
		logger.info("Clicked Actions Btn");
		deleteReports.actions_Delete_Btn();
		logger.info("Clicked Actions Delete Btn & Delete COnfirmation Btn");
		deleteReports.verify_Success_Toast_Message();
		logger.info("Verified report deleted");
	}

}
