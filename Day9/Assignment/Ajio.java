package Day9.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Inheritance.Chrome;

public class Ajio {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.ajio.com/ ");
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		String text = driver.findElement(By.xpath("//strong[contains (text(), '1,187')]")).getText();
		System.out.println(text);
		
		String[] sentence = text.split(" ");
		String number = sentence[0];
		String numberWithoutComa = number.replace(",", "");
		int actNum = Integer.parseInt(numberWithoutComa);
		System.out.println(actNum);
		
		List<String> listBrand = new ArrayList<String>();
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
		for(WebElement i : brand) {
			String brandName = i.getText();
			listBrand.add(brandName);
		}
		System.out.println(listBrand);
		
		List<String> listBagName = new ArrayList<String>();
		List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for(WebElement j : bagName) {
			String bagNameText = j.getText();
			listBagName.add(bagNameText);
		}
		System.out.println(listBagName);
		
		
 		

	}

}
