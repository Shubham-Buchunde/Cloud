package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationTest {
	
	public void loginWithValidCredentials() {
		WebDriver driver = Browser1.openBrowser("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("shubham");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("12345");
		
		WebElement button = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		button.click();
		
	}
	
	public void loginWithOnlyEmail() {
		WebDriver driver =Browser1.openBrowser("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("shubham");
		
		WebElement button = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		button.click();
		
	}
	
	public static void main (String [] args) {
		AutomationTest test = new AutomationTest();
		test.loginWithValidCredentials();
		test.loginWithOnlyEmail();
		
	}

}
