package Day15.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {
	
	public ChromeDriver driver;
	
	@Parameters({"url", "username", "password"})
	@BeforeClass
	public void preCondition(String ur, String userN, String passW) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(ur);
		
		driver.findElement(By.id("username")).sendKeys(userN);
		driver.findElement(By.id("password")).sendKeys(passW);
		driver.findElement(By.id("Login")).click();
		
	}

}
