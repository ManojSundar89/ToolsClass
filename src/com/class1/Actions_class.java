package com.class1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Actions b = new Actions(driver);
				
		b.click(a).build().perform();																					//Click
		
		WebElement c = driver.findElement(By.xpath("(//span[@class= 'nav-a-content'])[2]"));  							//Move to Element	
		
		b.moveToElement(c).build().perform();
		
		Thread.sleep(4000);
		
		WebElement d = driver.findElement(By.xpath("(//span[@class= 'nav-a-content'])[3]"));
		
		b.moveToElement(d).build().perform();
		
		b.contextClick(d).build().perform();  																			//Right click
		
		Robot rbt = new Robot();
		
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement e = driver.findElement(By.id("twotabsearchtextbox"));
		
		b.click(e).build().perform();
		
		Thread.sleep(3000);
		
		rbt.keyPress(KeyEvent.VK_M);																					// Keyboard Operation
		rbt.keyRelease(KeyEvent.VK_M);
		rbt.keyPress(KeyEvent.VK_O);
		rbt.keyRelease(KeyEvent.VK_O);
		rbt.keyPress(KeyEvent.VK_B);
		rbt.keyRelease(KeyEvent.VK_B);
		rbt.keyPress(KeyEvent.VK_I);
		rbt.keyRelease(KeyEvent.VK_I);
		rbt.keyPress(KeyEvent.VK_L);
		rbt.keyRelease(KeyEvent.VK_L);
		rbt.keyPress(KeyEvent.VK_E);
		rbt.keyRelease(KeyEvent.VK_E);

		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	}
}
