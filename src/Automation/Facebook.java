package Automation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {
	public static void main (String [] args ) throws EncryptedDocumentException, IOException {
		
		WebDriver driver = Browser1.openBrowser("https://www.facebook.com/");
		
		String emailId = Parametrization1.getData("Sheet1", 0, 0);
		String password = Parametrization1.getData("Sheet1", 1, 0);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(emailId);
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys(password);
	}

}
