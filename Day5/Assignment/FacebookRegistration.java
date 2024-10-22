package Day5.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Prabhu");
		driver.findElement(By.name("lastname")).sendKeys("Ajith");
		
		WebElement Date = driver.findElement(By.id("day"));
		Select sel1 = new Select(Date);
		sel1.selectByIndex(22);
		
		WebElement Month = driver.findElement(By.id("month"));
		Select sel2 = new Select(Month);
		sel2.selectByValue("5");
		
		WebElement Year = driver.findElement(By.id("year"));
		Select sel3 = new Select(Year);
		sel3.selectByVisibleText("2019");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("7785261149");
		driver.findElement(By.id("password_step_input")).sendKeys("Rajisasi@1234");
		
		driver.quit();
	}

}
