package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/drag.xhtml");

		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		
		WebElement destin = driver.findElement(By.xpath("//div[@id='form:drop_content']"));
		
		
		
		Thread.sleep(1500);
		
		a.dragAndDrop(source, destin).build().perform();
	}
}
