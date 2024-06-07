package window_handling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		System.out.println("Parent_Window Title: "+driver.getTitle());	//Parent_Window
		driver.findElement(By.xpath("//li[@id='stayIcon']")).click();	// Clicking on flights.
		
		Set<String> handles= driver.getWindowHandles();	// WindowHandles returners the window id's at runtime, which is dynamic.
		Iterator it = handles.iterator();	// Iterating the window Ids.
		String parent_id = (String) it.next(); // Parent_Window.
		String child_id = (String) it.next();  // Hotels_Window	
		String sub_child_id = (String) it.next();	// Rail Drishti
		
		driver.switchTo().window(child_id);  // Hotels  // Switching to child_window.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		System.out.println("Child_Window Title: "+driver.getTitle());  //Hotels
//		driver.findElement(By.xpath("//a[@title=\"Flight\"]")).click();   // Clicking on flights.
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	

		driver.switchTo().window(parent_id);		// Switching back to the Parent_window.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		System.out.println("Parent_Window Title: "+driver.getTitle()); 		//
		driver.findElement(By.xpath("//label[text()='RAIL DRISHTI']")).click();	// Clicking on Rail Drishti.
		
		driver.switchTo().window(sub_child_id);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		System.out.println("Sub-Child_Window Title: "+driver.getTitle());  //Flights
		
	}

}
