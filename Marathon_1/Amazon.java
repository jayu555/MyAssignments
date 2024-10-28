package Marathon_1;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=7561555375560650818&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9184008&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		
		WebElement Suggestion = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Suggestion.sendKeys("Bags for Boys");
		Suggestion.sendKeys(Keys.DOWN);
		Suggestion.sendKeys(Keys.ENTER);
		
		WebElement ResultText = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		String Text1 = ResultText.getText();
		System.out.println("Total Number of Resukt is : "+Text1);
		
		driver.findElement(By.xpath("//span[text()='Skybags']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//span[text()='Safari']/preceding-sibling::div")).click();
		
		driver.findElement(By.xpath("//span[@data-csa-c-func-deps='aui-da-a-dropdown-button']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Newest')]")).click();
		String firstResultingName = driver.findElement(By.xpath("(//h2[contains(@class,'clamp')])[2]")).getText();
		System.out.println(firstResultingName);
		
		
		
		
		
		
	}

}
