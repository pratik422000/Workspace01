package ninja.plextrac.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	public static Properties prop;
	String path = "D:\\Automation\\SecondWorkspace\\PlextracPractice\\Configuration\\Config.properties";
	
	public ReadConfig () {
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public String getUrl() {
		
		String value = prop.getProperty("url");
		
		if (value!=null) return value;
		else 
			throw new RuntimeException("url not specified in configue file");
	}
	
	public String getBrowser() {
		
		String value = prop.getProperty("browser");
		if (value!=null) return value;
		else 
			throw new RuntimeException("browser not specified in configue file");
	}
	
}
