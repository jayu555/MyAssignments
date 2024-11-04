package Day6.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Jayu Enterprises");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("JayeshKumar");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("VS");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Jayesh");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Software");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Automation testing using Selenium");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abcd@yahoo.com");
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Leaftaps");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String text = driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).getText();
		System.out.println(text);
				
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		

	}

}
