package Framework;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Basefile {

   WebDriver driver;

     @BeforeClass

     @Parameters({"browser","baseurl"})
    
     
     public void setup(String browser,String baseurl)
    
     {
    		
      if (browser.equalsIgnoreCase("chrome")) {
    		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lucky\\eclipse-workspace\\J_intregration\\exe.files\\chromedriver.exe");
        	 driver = new ChromeDriver();
        	 Reporter.log("chrome has launched"+ true);
         	    
     		
 		}
     	
    	
     	else if (browser.equalsIgnoreCase("ie")) 
    	{
    		System.setProperty("webdriver.ie.driver","./exefiles/IEDriverServer.exe");
    		 driver = new InternetExplorerDriver();
    		 Reporter.log("firefox has launched"+ true);
    	
    	}
     
     
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get(baseurl);
     
     }
     

    @AfterMethod 
     
     public void teardown(ITestResult result) {
    	
    	String Scriptname = result.getMethod().getMethodName();
    	
    if (result.isSuccess())
  {
		
	Reporter.log(Scriptname+"script is pass"+true);
    
    
    } 
    
    else
  {

    Reporter.log(Scriptname+"script is failed"+true);    	
    	Screenshot.screenshot(driver, Scriptname);
    	Reporter.log("screenshot hasbeen taken"+true);	
    	
	}
    
    }
    @AfterClass
    
    public void close() {
    	
    	driver.close();
    	Reporter.log("browser closed");
    	
    }	
    
    		 
     }
     
     
     
   
    




     
     

     
     
     
     
     
     
     
     
     
     
     

