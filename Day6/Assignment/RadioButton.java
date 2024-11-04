package Day6.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[text()='Edge']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@value='Chennai']/parent::div/parent::div")).click();
		
		boolean status = driver.findElement(By.xpath("//input[@value='Chennai']/parent::div/parent::div")).isSelected();
		System.out.println(status);
		boolean chrome = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']//input[@value='Option1']")).isSelected();
		System.out.println(chrome);
		boolean firefox = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']//input[@value='Option2']")).isSelected();
		System.out.println(firefox);
		boolean safari = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']//input[@value='Option3']")).isSelected();
		System.out.println(safari);
		boolean edge = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']//input[@value='Option4']")).isSelected();
		System.out.println(edge);
		driver.findElement(By.xpath("//label[contains(text(),'20')]")).click();

	}

}
