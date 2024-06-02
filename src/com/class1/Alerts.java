package com.class1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		
//		WebElement cnfm = driver.findElement(By.id("confirm"));				// Confirm Alert
//		cnfm.click();
//		
//		Thread.sleep(2500);
//		Alert a = driver.switchTo().alert();						
//		a.accept();
		

		WebElement prompt = driver.findElement(By.id("prompt"));			// Prompt Alert
		prompt.click();
		
		Thread.sleep(2500);
		Alert pmpt = driver.switchTo().alert();
		pmpt.sendKeys("Manoj");
		pmpt.accept();
		
		WebElement s = driver.findElement(By.id("myName"));
		String text = s.getText();
		System.out.println(text);
		
	}
}
