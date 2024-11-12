package Day_10_11.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//Frame Handling
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String Actstr = driver.findElement(By.id("demo")).getText();
		System.out.println(Actstr);
		String Expstr = "Hello Harry Potter! How are you today?";
		if(Expstr.equals(Expstr)) {
			System.out.println("Verified");
		}
		
		

	}

}
