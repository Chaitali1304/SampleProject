package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	WebDriver ldriver;
	public AdminPage(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='Email']")
	 WebElement email;//email
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;//Password
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement loginBtn;//Login

	
	
	public void setEmail(String Email) {
		email.clear();
		email.sendKeys(Email);
	}
	
	public void setPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void ClickOnLogin() {
		loginBtn.click();
	}

	
}
