package variables;

import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Chrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pratik.b.dhake\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriverDecorator driver=new WebDriverDecorator();

	}

}
