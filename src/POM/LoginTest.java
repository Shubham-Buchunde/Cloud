package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.Browser1;
import Automation.Parametrization1;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		WebDriver driver = Browser1.openBrowser("https://www.facebook.com/");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	@Test
	public void loginWithValidCredentials() throws EncryptedDocumentException, IOException {
		
		String mail = Parametrization1.getData("Sheet1", 0, 0);
		String p  = Parametrization1.getData("Sheet1", 0, 1);
		FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailId(mail);
		facebookLoginPage.enterPassword(p);
		facebookLoginPage.clickOnSubmit();
		
	}
	
	@Test
	public void loginWithOnlyEmail () throws EncryptedDocumentException, IOException {
		
		FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
		String email = Parametrization1.getData("Sheet1", 0, 0);
		facebookLoginPage.enterEmailId(email);
		facebookLoginPage.clickOnSubmit();
	
	}
	
	
		
		
	}


