package Marathon_2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;


public class ServiceNow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		Shadow sh=new Shadow(driver);
		
		//1. Launch ServiceNow application
		driver.get("https://dev186929.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        //2. Login with valid credentials username as admin and password
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		sh.setImplicitWait(20);
		
		//3. Click----->All in the SERVICE NOW Page  &  click the  Service catalog in filter navigator.
		sh.findElementByXPath("//div[text()='All']").click();
		sh.findElementByXPath("//span[text()='Service Catalog']").click();
		
		//4. Click on  mobiles
		WebElement sss = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(sss);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
		//5.Select Apple iphone13pro
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		
		//6. Choose yes option in lost or broken iPhone, enter the mobile number
        driver.findElement(By.xpath("//input[@class='cat_item_option radio']/following-sibling::label")).click();
		driver.findElement(By.xpath("(//div[@class='col-xs-6  form-field input_controls sc-form-field '])[2]/input[2]")).sendKeys("1234567890");
		
		//7. Select Unlimited from the dropdown in Monthly data allowance
		WebElement el1 = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select sel=new Select(el1);
		sel.selectByValue("unlimited");
		
		//8. Update color field to SierraBlue and storage field to 512GB
		driver.findElement(By.xpath("//input[@value='sierra_blue']/following-sibling::label")).click();
		driver.findElement(By.xpath("//input[@value='512']/following-sibling::label")).click();
		
		//9. Click on Order now option

		driver.findElement(By.xpath("//button[contains(text(),'Order')]")).click();
		
        //10. Verify order is placed and copy the request number

		String successMsg = driver.findElement(By.xpath("(//div[@class='notification notification-success']/span)[2]")).getText();
		System.out.println(successMsg);
		if(successMsg.contains("submitted")) {
			System.out.println("Request is submitted successfully");
		}else {
			System.out.println("Request is not submitted");
		}
		String requestID = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println(requestID);
		
		//11.Take a Snapshot of order placed page
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/phonerequest.png");
		FileUtils.copyFile(src, dest);
		driver.close();
		
		
	}

}
