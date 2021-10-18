package sel1;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	@Test
	public void Demo()
	{
		    String currentDir = System.getProperty("user.dir");
		 	System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe"); 	
			WebDriver driver=new ChromeDriver(); 
	 	    driver.get("https://www.google.com/");
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(80, TimeUnit. SECONDS);
	 		String title = driver.getTitle();
	 		System.out.print(title);

}
}

