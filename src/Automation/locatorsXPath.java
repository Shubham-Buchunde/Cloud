package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locatorsXPath {
	public static void main (String [] args ) {
		WebDriver driver = Browser1.openBrowser("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("Shubham");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("12345");
		
//		WebElement logIn = driver.findElement(By.xpath("//button[contains(@data-testid,'royal_login')]"));
//		logIn.click();
		
//		WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//		forgot.click();
		
		WebElement signUp = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		signUp.click();
		
		
	}

}
