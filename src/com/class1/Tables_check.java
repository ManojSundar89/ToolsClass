package com.class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables_check {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/table");
		
		List<WebElement> r1 = driver.findElements(By.xpath("//table[@id='simpletable']/thead/tr/th"));
		
		for (WebElement r11 : r1) {
			
			System.out.println(r11.getText());
			
		}
	
		List<WebElement> r2 = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td"));
		
		for (WebElement r22 : r2) {
			
			System.out.println(r22.getText());
		}
		
		WebElement r3 = driver.findElement(By.xpath("(//table[@id='simpletable']/tbody/tr/td)[11]"));
		
		System.out.println(r3.getText());
		
	}
}
