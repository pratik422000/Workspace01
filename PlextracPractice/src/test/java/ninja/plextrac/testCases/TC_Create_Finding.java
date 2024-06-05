package ninja.plextrac.testCases;

import org.testng.annotations.Test;

import ninja.plextrac.Findings.PageObjects.CreateNewFindingPage;
import ninja.plextrac.Reports.PageObjects.ReportFindingsPage;
import ninja.plextrac.Reports.PageObjects.ReportsHomeScreen;
import ninja.plextrac.Reports.PageObjects.SpecificReportHomeScreen;
import ninja.plextrac.pageObject.AlwaysActivePage;
import ninja.plextrac.testBase.TestBase;

public class TC_Create_Finding extends TestBase {
	
	@Test(enabled=true)
	public void create_Finding () throws Exception {
		AlwaysActivePage ReportsBtn = new AlwaysActivePage(driver);
		ReportsBtn.Reports_menu();
		
		ReportsHomeScreen getReport = new ReportsHomeScreen(driver);
		getReport.report_Search_Box();
		getReport.clickOn_First_report_row();
		
		SpecificReportHomeScreen findingsTab = new SpecificReportHomeScreen(driver);
		findingsTab.click_findingsTab();
		
		ReportFindingsPage addFinding = new ReportFindingsPage(driver);
		addFinding.addFinding();
		
		CreateNewFindingPage newFindingpage = new CreateNewFindingPage(driver);
		newFindingpage.create_finding_with_requiredFields();
		
		
	}

}
