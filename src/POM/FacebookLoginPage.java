package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	
	@FindBy (xpath = "//input[@id='email']") private WebElement email;
	@FindBy (xpath = "//input[@id='pass']") private WebElement password;
	@FindBy (xpath = "//button[@data-testid='royal_login_button']") private WebElement submit;
	@FindBy (xpath = "//a[text()='Forgotten password?']") private WebElement forgot;
	@FindBy (xpath = "//a[@data-testid='open-registration-form-button']") private WebElement signUp;
	@FindBy (xpath = "//a[text()='Create a Page']") private WebElement createPage;
	
	
	public FacebookLoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterEmailId(String mail) {
		email.sendKeys(mail);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnSubmit () {
		submit.click();
	}
	
	public void clickOnForgot() {
		forgot.click();
	}
	
	public void clickOnSignUp () {
		signUp.click();
	}
	
	public void clickOnCreatePage () {
		createPage.click();
	}

}
