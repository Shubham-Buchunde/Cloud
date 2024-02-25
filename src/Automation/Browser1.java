package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 {
	public static WebDriver openBrowser (String url) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\software\\Software\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
		
	}

}
