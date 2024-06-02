package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_setup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.navigate().to("https://twitter.com/i/flow/login");
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Thread.sleep(2500);
		driver.close();
	}
}
