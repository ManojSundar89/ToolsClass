package com.class1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_type {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
//		driver.get("https://leafground.com/waits.xhtml");															//Implicit Wait
//		
//		driver.manage().window().maximize();
//		
//		WebElement a = driver.findElement(By.xpath("//span[text()= 'Click']"));
//		a.click();
//		
//		driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
//		
//		WebElement b = driver.findElement(By.xpath("//span[text()= 'I am here']"));
//		String text = b.getText();
//		System.out.println(text);
		
		driver.get("https://letcode.in/waits");
		
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//button[text()= 'Simple Alert']"));
		a.click();
		
		WebDriverWait b = new WebDriverWait(driver, 10);
		b.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
	}
}
