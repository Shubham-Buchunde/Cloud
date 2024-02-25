package Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main (String [] args){
		WebDriver driver = Browser1.openBrowser("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement product = driver.findElement(By.xpath("//select[@id='first']"));
		
		Select s = new Select(product);
		
	//	s.selectByIndex(1);
	//	s.selectByValue("Yahoo");
		s.selectByVisibleText("Google");
		
		
	}

}
