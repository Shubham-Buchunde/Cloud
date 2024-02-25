package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main (String [] args) {
		WebDriver driver = Browser1.openBrowser("https://demo.guru99.com/");
		
		WebElement rClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions (driver);
		
		action.contextClick(rClick);
		action.perform();
		
		WebElement dClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(dClick);
		action.perform();
		
		
		
	}

}
