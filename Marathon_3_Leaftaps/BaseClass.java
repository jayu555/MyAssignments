package Marathon_3_Leaftaps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
		
	public ChromeDriver driver;
	
		@Parameters({"url", "username", "password"})
		@BeforeMethod
		public void preCondition(String ur, String userN, String passW) {
			driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(ur);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(userN);
			driver.findElement(By.id("password")).sendKeys(passW);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
		}
		
		@AfterMethod
		public void postCondition() {
			driver.close();
		}

	}


