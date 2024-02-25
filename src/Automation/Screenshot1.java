package Automation;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	public static void takeScreenshot (WebDriver driver,String name) throws IOException  {
		String date = getDate();
		
		TakesScreenshot sc = ((TakesScreenshot)driver);
		
		File source = sc.getScreenshotAs(OutputType.FILE);
		
		File destination = new File ("F:\\software\\"+name+""+date+".png");
		
		FileHandler.copy(source, destination);
	}
	
	
	
	public static String getDate() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		
		LocalDateTime currentTime = LocalDateTime.now();
		
		String d = dtf.format(currentTime);
		
		return d;
	}

}
