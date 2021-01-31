package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testfile extends Basefile {

 @Test
 
	
 public void login() {
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lucky\\eclipse-workspace\\J_intregration\\exe.files\\chromedriver.exe");
	 driver = new ChromeDriver();
	 Reporter.log("chrome has launched"+ true);

		/*
		 * driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 * driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 * driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		 */ 
 }
		 @Test
		 
			
		 public void login1() {

				/*
				 * driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
				 * driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("mnager");
				 * driver.findElement(By.xpath("//a[@id='loginButton']")).click();
				 */
}
}