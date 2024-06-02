import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_setup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj_4a9\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.primevideo.com/offers/nonprimehomepage/ref=atv_hom_pri_c_9zZ8D2_hom");
		
		String currentUrl = driver.getCurrentUrl();
	}
}
