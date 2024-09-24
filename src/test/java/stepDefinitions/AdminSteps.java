package stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.AdminPage;


public class AdminSteps extends Base {
	
	@Before
	public void setup() {
		
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
	@Given("User Lanch Chrome Browser")
	public void user_lanch_chrome_browser() {
		
		admin=new AdminPage(driver);
	}

	@When("User open url {string}")
	public void user_open_url(String url) {
	    driver.get(url);
	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {
	    System.out.println("Enter Username and Password");
	    admin.setEmail(email);
	    admin.setPassword(password);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
	   admin.ClickOnLogin();
	}

	@Then("User verify page title should be {string}")
	public void user_verify_page_title_should_be(String title) {
	    
		Assert.assertEquals("Dashboard / nopCommerce administration", title);
	
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}


}
