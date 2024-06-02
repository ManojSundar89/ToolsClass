package com.class1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Control {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,1500)", "");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,-500)", "");
		
		Thread.sleep(2500);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		
		
	}
}
