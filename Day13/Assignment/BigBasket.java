package Day13.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
		WebElement foodgrians = driver.findElement(By.xpath("//a[contains (text(), 'Foodgrains')]"));
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(foodgrians).perform();
		
		Thread.sleep(3000);
		WebElement riceRice = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		Actions mouseHover2 = new Actions(driver);
		mouseHover2.moveToElement(riceRice).perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		
		Thread.sleep(3000);
		WebElement bbRoyal = driver.findElement(By.id("i-BBRoyal"));
		Actions scrollDown = new Actions(driver);
		scrollDown.scrollToElement(bbRoyal).perform();
		bbRoyal.click();
		
		Thread.sleep(3000);
		WebElement tamilPonni = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"));
		Actions scrollDown2 = new Actions(driver);
		scrollDown2.scrollToElement(tamilPonni).perform();
		tamilPonni.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> childWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(childWindow.get(1));
	}

}
