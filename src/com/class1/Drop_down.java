package com.class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		Thread.sleep(3500);
		
		driver.manage().window().maximize();
		
		
		WebElement fruits = driver.findElement(By.id("fruits"));			//Single Drop-down method
		
		Select single = new Select(fruits);
		
		single.selectByIndex(3);		

		WebElement element = single.getFirstSelectedOption();
		
		System.out.println(element.getText());

		
		List<WebElement> sin_opt = single.getOptions();
		for (WebElement options : sin_opt) {
			
			System.out.println(options.getText());	
		
		}	
		
		boolean multiple2 = single.isMultiple();
		System.out.println(multiple2);
		
		WebElement multiple = driver.findElement(By.id("superheros"));			//Multiple Drop-down method
		
		Select sprhero = new Select(multiple);
		
		sprhero.selectByVisibleText("Iron Man");
		sprhero.selectByVisibleText("Thor");
		sprhero.selectByVisibleText("Captain America");
		
		boolean b = sprhero.isMultiple();
		System.out.println(b);
		
		List<WebElement> chosen = sprhero.getAllSelectedOptions();
		
		for (WebElement prev : chosen) {
			
			System.out.println(prev.getText());
		}
		
		sprhero.deselectAll();
				
			
		}
		
	}
