package sel1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ttn {
	@Test
	public void Demo_google()
	{
		    String currentDir = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", currentDir +"\\Drivers\\chromedriver.exe"); 	
			WebDriver driver=new ChromeDriver(); 
	 	    driver.get("http://www.google.com");
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(80, TimeUnit. SECONDS);
	 		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("To The New");
	 		driver.findElement(By.name("btnK")).click();  

}
}

