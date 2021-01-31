package Framework;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshot {

	public static void screenshot(WebDriver driver ,String scriptname) {
		
		
	EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		
	           File srcfile  = efw.getScreenshotAs(OutputType.FILE);
		
	      File destfile  = new File("C:\\Users\\vish\\eclipse-workspace\\framework\\screenshots"+ scriptname+".png");  
	           
	         try {
	        	 
	        FileUtils.copyFile(srcfile, destfile);	 
				
			} catch (Exception e) {
				
			
				e.printStackTrace();
			
			}
		
		
	
	      
	      
	}
	
	
	
	
	
}
