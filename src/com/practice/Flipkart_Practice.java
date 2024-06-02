package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Practice {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.xpath("//span[text()= 'Grocery']"));
		
		Actions b = new Actions(driver);
		
		b.moveToElement(a).build().perform();
		
		Thread.sleep(2000);
		WebElement c = driver.findElement(By.xpath("//span[text()= 'Mobiles']"));
		
		b.moveToElement(c).build().perform();
		
		Thread.sleep(2000);
		WebElement d = driver.findElement(By.xpath("//span[text()= 'Fashion']"));
		
		b.moveToElement(d).build().perform();
		
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//span[text()= 'Electronics']"));
		
		b.moveToElement(e).build().perform();
		
		
		Robot rbt = new Robot();
		
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2500);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2500);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2500);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		

		Thread.sleep(2500);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2500);
		rbt.keyPress(KeyEvent.VK_RIGHT);
		rbt.keyRelease(KeyEvent.VK_RIGHT);
		
		Thread.sleep(2500);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2500);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);

		Thread.sleep(2500);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);

		rbt.keyPress(KeyEvent.VK_KP_UP);
		rbt.keyRelease(KeyEvent.VK_KP_UP);
		
		Thread.sleep(2500);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,1000)", "");
		
	}
}

