package Automation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main (String [] args ) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\Software\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	//	Screenshot1.takeScreenshot(driver, "fb");
	}
	
	}


