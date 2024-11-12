package Day15.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class StaticParameter_2 extends BaseClass {


	@Test
	public void salesForce() throws InterruptedException{
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	WebElement ele = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	Actions act=new Actions(driver);
	act.scrollToElement(ele).perform();
	ele.click();
	WebElement el = driver.findElement(By.xpath("(//div[contains(@class,'right')])[4]//a/lightning-icon"));
	JavascriptExecutor js = driver;
	js.executeScript("arguments[0].click();", el);
	WebElement el2 = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
	js.executeScript("arguments[0].click();", el2);
	driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
	driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("wrefwerf");
	js.executeScript("window.scrollBy(0,250)");
	WebElement el3 = driver.findElement(By.xpath("//span[text()='--None--']"));
	js.executeScript("arguments[0].click();", el3);
	driver.findElement(By.xpath("//span[text()='Active']")).click();
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	String errorMsg = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']")).getText();
	System.out.println(errorMsg);
	if (errorMsg.contains("Legal Entity Name")) {
		System.out.println("Error message for name displayed");
	} else {
		System.out.println("Error message for name not displayed");
	}
}
}
