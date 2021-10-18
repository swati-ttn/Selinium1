package sel1;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

	public class Ques12 

	{
		@Test
		public void RegisterUser()
		{
			String currentDir = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", currentDir +"\\Drivers\\chromedriver.exe"); 	
			WebDriver driver=new ChromeDriver();
			 
			driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
			
			String email = RandomStringFactory.usingUUID()+"@gmail.com"; 
			driver.findElement(By.id("email_create")).sendKeys(email);
			driver.findElement(By.id("SubmitCreate")).click();
			
			 WebDriverWait wait = new WebDriverWait(driver, 15);      	
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Your personal information']")));
			 
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
			 driver.findElement(By.name("customer_firstname")).sendKeys("FirstName");
			 
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
			 driver.findElement(By.name("customer_lastname")).sendKeys("LastName");
			 
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
			 driver.findElement(By.name("email")).clear();
			 driver.findElement(By.name("email")).sendKeys("abc123@gmail.com");
			 
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
			 //driver.close();
			 
		}	
	}

