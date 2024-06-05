package TestScenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageLayer.ClientPage;
import PageLayer.Client_Creatoin_Form;
import PageLayer.LeftPane;
import PageLayer.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Clietnt_Reports {
	private WebDriver driver;
	
//	public static void main(String[]args) throws Exception {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://stable-rc.qa.plextrac.ninja/login");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d =new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://stable-rc.qa.plextrac.ninja/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
		

	@Test(priority=1)
	public void LoginOperation() throws Exception {
	LoginPage login = new LoginPage(driver);
	login.enterusername("username");
	login.hitsubmit("1st_submit");
	login.enterpassword("password");
	login.hitsubmitagain("2nd_submit");
	
	LeftPane click_client = new LeftPane(driver);
	click_client.Client_menu("Client");
	
	ClientPage client = new ClientPage(driver);
	client.Header("New Client btn");
	
	Client_Creatoin_Form New_Client = new Client_Creatoin_Form(driver);
	New_Client.Verify_X("X icon");
	
	ClientPage client1 = new ClientPage(driver);
	client1.Header("New Client btn");
	
	Client_Creatoin_Form New_Client1 = new Client_Creatoin_Form(driver);
	New_Client1.Verify_Close_btn("Close btn");
	
	ClientPage client2 = new ClientPage(driver);
	client2.Header("New Client btn");
	
	Client_Creatoin_Form New_Client2 = new Client_Creatoin_Form(driver);
	New_Client2.Create_New_Client_Form("New Client Form");
	
	ClientPage client3 =new ClientPage(driver);
	client3.SearchByTag("Search");
	
	ClientPage client4 = new ClientPage(driver);
	client3.SearchClient("Search");
	
	}
	}
	
	
