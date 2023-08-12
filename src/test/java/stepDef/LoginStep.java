package stepDef;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObj.InventoryPage;
import pageObj.LoginPage;

@SuppressWarnings("deprecation")
public class LoginStep {
	WebDriver driver;
	
	public LoginStep(WebDriver driver){
		super();
		this.driver = Hooks.driver;
	}
	
	public LoginStep() {
		super();
		this.driver = Hooks.driver;
	}
	
	@Given("I go to Login Page")
	public void openBrowser() {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.fieldIsDisplayed());
	}
	
	@When("I set credential")
	public void setCredential() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickLogin();
		
	}
	
	@Then("Failed login")
	public void verify() {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.msgIsDisplayed());
		
	}
	
	@When("I input {string} as username, {string} as password")
	public void setValidCredential(String username, String password) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLogin();
		
	}
	
	@Then("Login Success")
	public void loginSucces() {
		InventoryPage invPage = new InventoryPage(driver);
		String acttual = invPage.getPageLabel();
		Assert.assertEquals("Products", acttual);
	}
	
	@When("I empty username, and fill {string} as password")
	public void i_empty_username_and_fill_password(String password) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setPassword(password);
		loginPage.clickLogin();
	}
	
	@When("I input {string} as username, and empty password")
	public void i_input_username_and_empty_password(String username) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername(username);
		loginPage.clickLogin();
	}
	
	@When("I input invalid {string} as username, invalid {string} as password")
	public void i_input_invalid_username_and_password(String username, String password) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername(username);
		loginPage.setPassword(password);
	}
}
