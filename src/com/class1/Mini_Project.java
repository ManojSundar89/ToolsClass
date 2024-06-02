package com.class1;

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

public class Mini_Project {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
//		WebElement a = driver.findElement(By.xpath("//a[text()= 'New User Register Here']"));
//		a.click();
//		
//		Thread.sleep(4000);
//		WebElement b = driver.findElement(By.name("username"));
//		b.sendKeys("ManojSundar89");
//		
//		Thread.sleep(1000);
//		WebElement c = driver.findElement(By.name("password"));
//		c.sendKeys("Gowry@1962");
//		
//		Thread.sleep(1000);
//		WebElement d = driver.findElement(By.name("re_password"));
//		d.sendKeys("Gowry@1962");
//		
//		Thread.sleep(1000);
//		WebElement e = driver.findElement(By.name("full_name"));
//		e.sendKeys("Manoj");
//		
//		Thread.sleep(1000);
//		WebElement f = driver.findElement(By.name("email_add"));
//		f.sendKeys("manoj.axe89@gmail.com");
//		
//		Thread.sleep(30000);
//		WebElement g = driver.findElement(By.name("tnc_box"));
//		g.click();
//		
//		Thread.sleep(1000);
//		WebElement h = driver.findElement(By.id("Submit"));
//		h.click();
		
		WebElement a = driver.findElement(By.id("username"));
		a.sendKeys("ManojSundar89");
		
		Thread.sleep(1000);
		WebElement b = driver.findElement(By.id("password"));
		b.sendKeys("Gowry@1962");
		
		Thread.sleep(1500);
		WebElement c = driver.findElement(By.id("login"));
		c.click();
		
		Thread.sleep(3000);
		
		WebElement d = driver.findElement(By.id("location"));
		
		Select loc = new Select(d);
		
		loc.selectByVisibleText("Paris");
		
		Thread.sleep(1500);
		
		WebElement e = driver.findElement(By.id("hotels"));
		
		Select hot = new Select(e);
		
		hot.selectByVisibleText("Hotel Hervey");
		
		Thread.sleep(1500);
		
		WebElement f = driver.findElement(By.id("room_type"));
		
		Select room = new Select(f);
		
		room.selectByVisibleText("Deluxe");
		
		Thread.sleep(1500);
		
		WebElement g = driver.findElement(By.id("room_nos"));
		
		Select no = new Select(g);
		
		no.selectByValue("9");
		
		Thread.sleep(1500);
		
		WebElement h = driver.findElement(By.name("datepick_in"));
		
		h.clear();
		
		Thread.sleep(1000);
		
		h.sendKeys("15/04/2024");
		
		Thread.sleep(1000);
		
		WebElement i = driver.findElement(By.name("datepick_out"));
		
		i.clear();
		
		Thread.sleep(1000);
		
		i.sendKeys("24/04/2024");
		
		Thread.sleep(1000);
		
		WebElement j = driver.findElement(By.id("adult_room"));
		
		Select adno = new Select(j);
		
		adno.selectByValue("4");
		
		Thread.sleep(1000);
		
		WebElement k = driver.findElement(By.id("child_room"));
		
		Select chld = new Select(k);
		
		chld.selectByValue("2");
		
		Thread.sleep(1000);
		
		WebElement l = driver.findElement(By.id("Submit"));
		
		l.click();
		
		Thread.sleep(2000);
		
		WebElement m = driver.findElement(By.id("radiobutton_0"));
		
		m.click();
		
		Thread.sleep(1000);
		
		WebElement n = driver.findElement(By.id("continue"));
		
		n.click();
		
		Thread.sleep(3000);
		
		WebElement o = driver.findElement(By.id("first_name"));
		
		o.sendKeys("Manoj");
		
		Thread.sleep(1000);
		
		WebElement p = driver.findElement(By.id("last_name"));
		
		p.sendKeys("S");
		
		WebElement q = driver.findElement(By.id("address"));
		
		q.sendKeys("Thiruvallur");
		
		Thread.sleep(1000);
		
		WebElement r = driver.findElement(By.id("cc_num"));
		
		r.sendKeys("1234567890123456");
		
		Thread.sleep(1000);
		
		WebElement s = driver.findElement(By.id("cc_type"));
		
		Select type = new Select(s);
		
		type.selectByVisibleText("VISA");
		
		Thread.sleep(1000);
		
		WebElement t = driver.findElement(By.id("cc_exp_month"));
		
		Select month = new Select(t);
		
		month.selectByVisibleText("December");
		
		Thread.sleep(1000);
		
		WebElement u = driver.findElement(By.id("cc_exp_year"));
		
		Select year = new Select(u);
		
		year.selectByVisibleText("2029");
		
		Thread.sleep(1000);
		
		WebElement v = driver.findElement(By.id("cc_cvv"));
		
		v.sendKeys("123");
		
		Thread.sleep(1000);
		
		WebElement w = driver.findElement(By.id("book_now"));
		
		w.click();
		
		Thread.sleep(7000);
		
		WebElement x = driver.findElement(By.id("logout"));
		
		x.click();
		
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Screenshot\\Mini_Project.png");
		FileHandler.copy(source, target);
		
	}
	
}
