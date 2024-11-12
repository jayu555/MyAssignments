package Day13.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
	
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(price);
		
		String customerCount = driver.findElement(By.xpath("//div[@data-cy='reviews-block']//span[2]//span")).getText();
		System.out.println(customerCount);
		
		driver.findElement(By.xpath("//div[@data-cy='title-recipe']//span")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		//Convert to Set to list
		List<String> childWindow = new ArrayList<String>(windowHandles);
		//Change driver focus to child
		driver.switchTo().window(childWindow.get(1));
		
		WebElement addToCartEle = driver.findElement(By.id("add-to-cart-button"));
		Actions scrollDown = new Actions(driver);
		scrollDown.scrollToElement(addToCartEle).perform();
		addToCartEle.click();
		
		driver.findElement(By.xpath("//form[@id='attach-view-cart-button-form']//span//input")).click();
		
		WebElement subTotalEle = driver.findElement(By.xpath("//span[@class='currencyINR']"));
		String subTotalText = subTotalEle.getText();
		String actSub = "63,798.00";
		if(subTotalText.equals(actSub)) {
			System.out.println("The sub totals are same");
		}
		else {
			System.out.println("The totals are not same");
		}
		
		driver.close();
		driver.quit();
		
		
		
	}

}
