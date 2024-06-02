package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Signup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		Thread.sleep(3500);
		
		WebElement fstnme = driver.findElement(By.name("firstname"));
		fstnme.sendKeys("Manoj");
		
		WebElement lstnme = driver.findElement(By.name("lastname"));
		lstnme.sendKeys("Sundar");
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		email.sendKeys("vjvxjaxv@gmail.com");
		
		WebElement newpwd = driver.findElement(By.name("reg_passwd__"));
		newpwd.sendKeys("123465449");
		
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gender.click();
	}
}
