package com.class1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_shot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		
		TakesScreenshot img1 = (TakesScreenshot)driver;
		
		File source = img1.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Screenshot\\Flipkart.png");
		
		FileHandler.copy(source, destination);
	}

}
