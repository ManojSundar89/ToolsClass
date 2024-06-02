package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_check {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		
		WebElement a = driver.findElement(By.id("Click"));
		
		a.click();
		
		String text = a.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		WebElement b = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		
		driver.switchTo().frame(b);
		
		WebElement c = driver.findElement(By.id("frame2"));
		
		driver.switchTo().frame(c);
		
		WebElement d = driver.findElement(By.id("Click"));
		d.click();
		
		String text2 = d.getText();
		System.out.println(text2);
	
	}
}
