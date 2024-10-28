package Marathon_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ticket_Booking {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		WebElement ele = driver.findElement(By.xpath("//input[contains(@placeholder,'city')]"));
		ele.click();
		ele.sendKeys("Kochi");
		
		driver.findElement(By.xpath("//li[text()='Kochi']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Lulu')]")).click();
		driver.findElement(By.xpath("//span[text()='Wed']")).click();
		driver.findElement(By.xpath("//div[@data-pc-section='wrapper']//li[10]")).click();
		driver.findElement(By.xpath("//span[contains(text(), '06:55 PM')]")).click();
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='seat-flow-custom-scroll']//td[13]")).click();
		String SeatNumber = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		String ExpSeat = "A9";
		if(SeatNumber.equals(ExpSeat)) {
			System.out.println("The seat number verified");
		}
		else {
			System.out.println("The seat number is not verified");
			
		}
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		String GrandTotal = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
		System.out.println("The Grand Total is : "+GrandTotal);
		
		driver.findElement(By.xpath("(//div[@class='all-grand']//button)")).click();
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		String ExpTitle = "PVR Cinemas";
		if (Title.equals(ExpTitle)) {
			System.out.println("Title Matched");

		} else {
			System.out.println("Title not matched");
		}
		
		driver.close();

	}

}
