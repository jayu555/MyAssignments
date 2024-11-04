package Day6.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import Inheritance.Chrome;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.findElement(By.xpath("(//*[@class='col-12']//div)[3]")).click(); // Grandparent to grandchild
		driver.findElement(By.xpath("//*[@id='j_idt87:j_idt91']/div[2]")).click();
		String PopMessage = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println(PopMessage);
		String str = "Checked";
		if(PopMessage.equals(str)) {
			System.out.println("The message validation successful");
		}
		else{
			System.out.println("The message validation successful");
		}
		
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]")).click();
		String State1=driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
		String ExpState1 = "State = 1";
		if(State1.equals(ExpState1)) {
			System.out.println("State 1 is selected");
		}
		else{
			System.out.println("Not Selected");
		}
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String TogglePopMessage = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		String ToggleText = "Checked";
		if(TogglePopMessage.equals(ToggleText)) {
			System.out.println("The Checked message is displayed");
		}
		else {
			System.out.println("The message is not worked");
		}
		
		WebElement CheckBox = driver.findElement(By.xpath("//*[@disabled='disabled']"));
		if(CheckBox.isEnabled()==true) {
			System.out.println("The button is Enabled");
		}
		else {
			System.out.println("The button is disabled");
		}
		
		driver.findElement(By.xpath("//*[@data-label='Cities']")).click();
		//driver.findElement(By.xpath("(//label[text()='Miami']/parent::div)")).click();
		//driver.findElement(By.xpath("//*[@data-item-value='London']")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		//driver.findElement(By.xpath("//a[contains(@class,'close')]")).click();
		driver.close();
		
		
		
		
	}
				
}


