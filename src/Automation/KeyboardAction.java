package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
	public static void main(String[] args) {
		WebDriver driver = Browser1.openBrowser("https://demoqa.com/text-box");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='userName']"));
		firstName.sendKeys("Shubham");
		
		Actions action = new Actions (driver);
		
		action.sendKeys(Keys.TAB);
		action.sendKeys("XYZ@gmail.com");
		action.sendKeys(Keys.TAB);
		action.sendKeys("velocity");
		action.build().perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.sendKeys(Keys.TAB);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		
		
		
		
		
	}

}
