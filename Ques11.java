package sel1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ques11 {
	@Test
	public void verifyregistrationpage()
	{
		String currentDir = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe"); 	
		WebDriver driver=new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		
	 	driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	 	driver.manage().window().maximize();
	 	
	 	driver.manage().timeouts().implicitlyWait(40, TimeUnit. SECONDS);			
			//Register new email
	 	
		String email = RandomStringFactory.usingUUID()+"@gmail.com"; 
		driver.findElement(By.id("email_create")).sendKeys(email);
		driver.findElement(By.id("SubmitCreate")).click();
			
		boolean MrSelected = driver.findElement(By.id("id_gender1")).isSelected();
		boolean MrsSelected = driver.findElement(By.id("id_gender2")).isSelected();
			
		System.out.println("the salutation Mr is selected: "+MrSelected);
		System.out.println("the salutation Mrs is selected: "+MrsSelected);
			
			
		String pageHeading = driver.findElement(By.className("page-heading")).getText();
		Assert.assertEquals(pageHeading, "CREATE AN ACCOUNT");
			
			
		String tittleOFPage = driver.getTitle();
		Assert.assertEquals(tittleOFPage, "Login - My Store");
			
		driver.close();
	 		

}
}
