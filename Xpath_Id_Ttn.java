package sel1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Xpath_Id_Ttn {
	@Test
	public void Demo_ttn()
	{
	
				String currentDir = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe"); 	
				WebDriver driver=new ChromeDriver(); 
		 	   
		 		driver.manage().window().maximize();
		 		driver.manage().deleteAllCookies();
		 		driver.navigate().to("https://www.tothenew.com/");
		 		driver.manage().timeouts().implicitlyWait(80, TimeUnit. SECONDS);
		 		
				
				WebElement contactUsWebElement = driver.findElement(By.xpath("(//a[@id='h-contact-us'])[2]"));
			//	WebElement contactUsWebElement = driver.findElement(By.id("h-contact-us"));
				Actions actions = new Actions(driver);
				actions.moveToElement(contactUsWebElement);
				contactUsWebElement.sendKeys(Keys.ENTER);
				
			
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit. SECONDS);
				
				// Question : 5 to get title
		 		
		 		String title = driver.getTitle();
		 		System.out.print("Title of the page is " + title);
		 		if(title.equals("Contact Us")) {
		 			System.out.println("  Title of Page is Correct "+    title);
		 		}
		 		else {
		 			System.out.println("Title of Page is In-Correct"+     title);
		 		}
				
				
								
				//Question 6 : Get URL
				String urlName = driver.getCurrentUrl();
				System.out.println("URL of Page is "+urlName);
				
				
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
				driver.close();
				
				
			}


	 		
}

