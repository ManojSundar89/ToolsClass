package com.practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Insta_Practice {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/?hl=en");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//input[@aria-label= 'Phone number, username, or email']"));
		a.sendKeys("8807307082");
		
		WebElement b = driver.findElement(By.xpath("//input[@aria-label= 'Password']"));
		b.sendKeys("12354sdjhvbjs");
		
		WebElement c = driver.findElement(By.xpath("//div[text()= 'Log in']"));
		c.click();
		
		Thread.sleep(2500);
		WebElement d = driver.findElement(By.xpath("//div[contains(text(), 'Sorry, your password was')]"));
		String text = d.getText();
		System.out.println(text);
		
		Thread.sleep(1500);
		WebElement e = driver.findElement(By.xpath("//span[@class= '_ap3a _aaco _aacw _aad0 _aad7']"));
		e.click();
		
		Thread.sleep(5500);
		WebElement f = driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']"));
		f.sendKeys("1945238684");
				
		Thread.sleep(6000);
		WebElement g = driver.findElement(By.xpath("//input[@aria-label='Full Name']"));
		g.sendKeys("mnvvcdthk");
		
		Thread.sleep(3000);
		WebElement h = driver.findElement(By.xpath("//input[@aria-label='Username']"));
		h.sendKeys("xgnchcjgh17");
		
		Thread.sleep(3000);
		WebElement i = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		i.sendKeys("1596545sjh");
		
		Thread.sleep(3000);
		WebElement j = driver.findElement(By.xpath("//button[text()= 'Sign up']"));
		j.click();
		
		Thread.sleep(4000);
		WebElement k = driver.findElement(By.xpath("//select[@title= 'Month:']"));
		
		Select month = new Select(k);
		
		month.selectByIndex(11);;
		
		Thread.sleep(1000);
		WebElement l = driver.findElement(By.xpath("(//select[@class= '_aau- _ap32'])[2]"));
		
		Select date = new Select(l);
		
		date.selectByIndex(17);
		
		Thread.sleep(1000);
		WebElement m = driver.findElement(By.xpath("(//select[@class= '_aau- _ap32'])[3]"));
		
		Select year = new Select(m);
		
		year.selectByVisibleText("1989");
		
		Thread.sleep(4000);
		WebElement n = driver.findElement(By.xpath("//button[text()='Next']"));
		n.click();
		
		Thread.sleep(4000);
		WebElement o = driver.findElement(By.xpath("//input[@aria-describedby= 'confirmationCodeDescription']"));
		o.sendKeys("123456");
		
		Thread.sleep(3000);
		WebElement p = driver.findElement(By.xpath("//button[text()='Confirm']"));
		p.click();
		
		Thread.sleep(4000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destin = new File("C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Screenshot\\instaerror.png");
		FileHandler.copy(source, destin);
		
		
	}
}
