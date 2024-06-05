package ninja.plextrac.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListener implements ITestListener {
	
	ExtentSparkReporter  htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void configureReport ()
	{
		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName = "MyStoreTestReport-" + timestamp + ".html";
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//" + reportName);
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add environment details
		reports.setSystemInfo("OS", "Windows 10");
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("User", "Pratik");
		
		//configuration to change look and feel
		htmlReporter.config().setDocumentTitle("Plextrac Automation Report");
		htmlReporter.config().setReportName("Plextrac Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("On start method invoked:"  + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Name of the test successfully executed:"  + result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the Passed TC is:"+ result.getName(), ExtentColor.GREEN));
		// This is mandatory to call flush method to ensure information is written to the started reporter.
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Name of the test method faild:" + result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed TC is:"+ result.getName(), ExtentColor.RED));

		String screenShotPath = System.getProperty("user.dir") + "\\ScreenShots\\" + result.getName() + ".png";
		
		File screenShotFile = new File(screenShotPath);
		
		if(screenShotFile.exists())
		{
			test.fail("Captured Screenshot is below:" + test.addScreenCaptureFromPath(screenShotPath));
			}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Name of the test method skipped:" + result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skipped TC is:"+ result.getName(), ExtentColor.YELLOW));
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		;
	}

	@Override
	public void onStart(ITestContext context) {
		configureReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush(); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
