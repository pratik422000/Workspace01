package window_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
public class WindowHandling02 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		try {
            driver.get("https://www.irctc.co.in/nget/train-search");			// Opening the initial URL
            driver.manage().window().maximize();
            System.out.println("Parent_Window Title: " + driver.getTitle()); 	// Printing the title fo the Parent window.

            // Clicking on elements to open multiple windows 
            driver.findElement(By.xpath("//li[@id='stayIcon']")).click();
            driver.findElement(By.xpath("//label[text()='HOLIDAY PACKAGES']")).click();
            driver.findElement(By.xpath("//label[text()='RAIL DRISHTI']")).click();

            // Wait to ensure all windows are opened
            Thread.sleep(2000); 

            // Getting all window handles
            Set<String> windowHandles = driver.getWindowHandles();
            Iterator<String> it = windowHandles.iterator();

            // Printing the number of windows opened
            System.out.println("Number of windows opened: " + windowHandles.size());

            // Iterating` through all window handles
            while (it.hasNext()) {
                String windowHandle = it.next();
                driver.switchTo().window(windowHandle);
                System.out.println("Window Title: " + driver.getTitle());
                // Perform any additional actions in the window if needed
            }
            
            // Example: Switching back to the parent window (optional)
            driver.switchTo().window(driver.getWindowHandles().iterator().next());
            System.out.println("Switched back to Parent_Window Title: " + driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close all the windows and quit the driver
            driver.quit();
        }


	}

}
