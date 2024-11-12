package Day_10_11.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[contains (text(), 'Merge')]")).click();
		
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> childWindow = new ArrayList<String>(windowHandle);
		driver.switchTo().window(childWindow.get(1));
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		
		driver.switchTo().window(childWindow.get(0));
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandle1 = driver.getWindowHandles();
		List<String> childWindow2 = new ArrayList<String>(windowHandle1);
		driver.switchTo().window(childWindow2.get(1));
		driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
		
		driver.switchTo().window(childWindow2.get(0));
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String title = driver.getTitle();
		System.out.println(title);
		String expTitle = "Merge Contacts | opentaps CRM";
		if(expTitle.equals(title)) {
			System.out.println("Verified");
		}
		
		
		

	}

}
