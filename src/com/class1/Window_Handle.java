package com.class1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/windows");
		
		driver.manage().window().maximize();
		
		String a = driver.getWindowHandle();
		System.out.println(a);
		
		WebElement b = driver.findElement(By.xpath("//button[text()= 'Open Home Page']"));
		b.click();
		
		Thread.sleep(2000);
		
		Set<String> c = driver.getWindowHandles();
		
		for (String g : c) {
			if (!g.equals(a)) {
				
				driver.switchTo().window(g);
				
				break;
			}
		}
		
		System.out.println(c);
		
		Thread.sleep(5000);
		
		String f = driver.getWindowHandle();
		System.out.println(f);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		WebElement d = driver.findElement(By.xpath("//a[text()= 'Edit']"));
		d.click();
		
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.id("fullName"));
		e.sendKeys("S.Manoj");
		
	}
}
