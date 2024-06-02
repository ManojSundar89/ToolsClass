package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Access {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement userID = driver.findElement(By.id("email"));
		userID.sendKeys("abc123456@gmail.com");
		
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("12349xgch");
		
		Thread.sleep(3500);
		
		WebElement fpwd = driver.findElement(By.xpath("//a[text()= 'Forgotten password?']"));
		fpwd.click();
		
	}
}

