package sel1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {
@Test
	public void Demo_firefox()
	{
	        String currentDir = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver",currentDir + "\\Drivers\\geckodriver.exe"); 
			WebDriver driver = new FirefoxDriver();     		
	 	    driver.get("http://www.google.com");
	 	    driver.manage().timeouts().implicitlyWait(80, TimeUnit. SECONDS);
	 		driver.manage().window().maximize();
	 		driver.findElement(By.name("btnK")).click();  
	 		
	}
}

