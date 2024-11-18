package Marathon_3_Leaftaps;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNG_Basics.TC_1_ExcelIntergration;

public class CreateLead extends BaseClass{
	
	@DataProvider
	public String[][] sendData() throws IOException{
		String[][] data = new String[2][4];
		data[0][0] = "Testleaf";
		data[0][1] = "Dilip";
		data[0][2] = "Kumar";
		data[0][3] = "99";
		
		data[1][0] = "Testleaf";
		data[1][1] = "Saravanan";
		data[1][2] = "kk";
		data[1][3] = "98";
		
		return data;
	}
	

	@Test(dataProvider = "sendData")
	public void TC_CreateLead(String cName, String name, String lName, String pH) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(name);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pH);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		driver.close();


	}

}
