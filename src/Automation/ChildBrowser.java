package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser {
	public static void main (String [] args ) {
		
		WebDriver driver = Browser1.openBrowser("");
		
		WebElement practise = driver.findElement(By.xpath(""));
		practise.click();
		
		Set <String> handles = driver.getWindowHandles(); 
		Iterator <String > i = handles.iterator();
		
		while(i.hasNext())
		{
			String handle = i.next();
			driver.switchTo().window(handle);
			String currentTitle = driver.getTitle();
			
			if(currentTitle.equals(""))
			{
				WebElement radio = driver.findElement(By.xpath(""));
			}
			else
			{
				driver.close();
			}
			
		}
	}

}
