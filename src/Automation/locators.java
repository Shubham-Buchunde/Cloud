package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators {
	public static void main (String [] args ) {
		
		WebDriver driver = Browser1.openBrowser("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Shubham");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("12345");
		
//		WebElement button = driver.findElement(By.tagName("button"));
//		button.click();
		
//		WebElement forgot = driver.findElement(By.className("_6ltj"));
//		forgot.click();		
		
//		WebElement signUp = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
//        signUp.click(); 
        
//        WebElement create =  driver.findElement(By.linkText("Create a Page"));
//        create.click();
       
        WebElement creates =  driver.findElement(By.partialLinkText("Create a"));
        creates.click();
       
       
		
	}

}
