package Automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main (String [] args) throws IOException {
		
		WebDriver driver = Browser1.openBrowser("https://vctcpune.com/");
		
		TakesScreenshot sc = ((TakesScreenshot)driver);
		
		File source = sc.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("F:\\software\\vctc.png");
		
		FileHandler.copy(source, destination);
		
		driver.close();
	}

}
