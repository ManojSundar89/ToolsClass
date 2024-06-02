package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_search {

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//textarea[@class= 'gLFyf']"));
		
		search.sendKeys("cognizant");
		
		Robot rbt = new Robot();
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2500);
		
		WebElement ceo = driver.findElement(By.xpath("//span[@class='LrzXr kno-fv wHYlTd z8gr9e']/parent::span/preceding-sibling::span/a[text()='CEO']"));
		
		ceo.click();
	}
}
