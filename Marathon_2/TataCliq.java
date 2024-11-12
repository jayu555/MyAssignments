package Marathon_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Basics.ChromeDetails;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.tatacliq.com/");
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		//driver.findElement(By.id("wzrk-cancel")).click();
		//Mousehover Brand
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions mouseHoverBrand = new Actions(driver);
		mouseHoverBrand.moveToElement(brands).perform();
		
		//MouseHover Watches & Accessories
		WebElement wA = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		Actions mouseHoverWA = new Actions(driver);
		mouseHoverWA.moveToElement(wA).perform();
		
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
		//New Arrival select
		WebElement sortBy = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select sel1 = new Select(sortBy);
		sel1.selectByValue("isProductNew");
		
		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilCheckbox']/following-sibling::div)")).click();
		
		Thread.sleep(2000);
		//Print all prices listed
		List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		List<String> priceList = new ArrayList<String>();
		for(WebElement i : allPrices) {
			String text1 = i.getText();
			priceList.add(text1);
		}
		System.out.println("Prices of All Watches : ");
		System.out.println(priceList);
		
		WebElement firstPrice = driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		String firstPriceText = firstPrice.getText();
		System.out.println("Price of first watch is : "+firstPriceText);
		
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//Click on first result watch and handle the window
		driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> childWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(childWindow.get(1));
		System.out.println("Title of current page : "+driver.getTitle());
		
		//Add to bag and print the count
		Actions action2 = new Actions(driver);
		action2.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		driver.findElement(By.xpath("(//span[@data-test='button'])[3]")).click();
		WebElement cartCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']"));
		String countNumber = cartCount.getText();
		System.out.println(countNumber);
		
		//Get the Bag Total price
		WebElement bagTotal = driver.findElement(By.xpath("(//div[contains (text(), 'Total')]/following-sibling::div)"));
		String bagTotalPrice = bagTotal.getText();
		System.out.println("Bag total is : "+bagTotalPrice);
		
		//Compare the prices
		if(bagTotalPrice.equals(bagTotalPrice)) {
			System.out.println("Prices are same");
		}
		else {
			System.out.println("Prices are not same");
		}
		
		String total = driver.findElement(By.xpath("(//div[contains(@class,'DesktopCheckout__priceHeader')]/following-sibling::div)")).getText();
		System.out.println(total);
		
	}

}
