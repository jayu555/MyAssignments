package Day5.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		WebElement AccName = driver.findElement(By.id("accountName"));
		AccName.sendKeys("JayuJK");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select sel1 = new Select(Industry);
		sel1.selectByIndex(3);
		
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select sel2 = new Select(Ownership);
		sel2.selectByVisibleText("S-Corporation");
		
		WebElement Source = driver.findElement(By.id("dataSourceId"));
		Select sel3 = new Select(Source);
		sel3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement Mc = driver.findElement(By.id("marketingCampaignId"));
		Select sel4 = new Select(Mc);
		sel4.selectByIndex(6);
		
		WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel5 = new Select(State);
		sel5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		if(driver.getPageSource().contains("JayuJK")) {
			System.out.println("The Account name is correctly displayed");
		}
		else {
			System.out.println("The Account name is not displayed");
		}
		
		driver.quit();
		
	}

}
