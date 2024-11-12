package Day12.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://finance.yahoo.com/");
		Thread.sleep(2000);
		WebElement newsTab = driver.findElement(By.xpath("//span[text()='More']"));
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(newsTab).perform();
		
		driver.findElement(By.xpath("//a[@aria-label='Finance: Crypto']")).click();
		
		driver.findElement(By.xpath("//table[@data-testid='table-container']"));
		
		List<WebElement> rowTotal = driver.findElements(By.xpath("//table[@data-testid='table-container']/tbody/tr"));
		int rowSize = rowTotal.size();
		System.out.println(rowSize);
		
		List<WebElement> colTotal = driver.findElements(By.xpath("//table[@data-testid='table-container']//th"));
		int colSize = colTotal.size();
		System.out.println(colSize);
		
		List<WebElement> nameCol = driver.findElements(By.xpath("//table[@data-testid='table-container']/tbody/tr/td[2]"));
		for(WebElement i : nameCol) {
			System.out.println(i.getText());
		}
		

	}

}
