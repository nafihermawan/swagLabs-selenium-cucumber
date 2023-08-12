package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id =  "user-name")
	private WebElement txtUsername;

	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(id = "login-button")
	private WebElement btnSubmitLogin;

	@FindBy(xpath = "//h3[.='Epic sadface: Username is required']")
	private WebElement errMsg;

	@FindBy(xpath = "//form[@class='oxd-form']/div[2]//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement passErrMsg;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement invalidCredentialsMsg;
	
	public void setCredential() {
		txtUsername.sendKeys("standard_user");
		txtPassword.sendKeys("secret_sauce");
		btnSubmitLogin.click();
	}
	
	public void clickLogin() {
		btnSubmitLogin.click();
	}
	
	public boolean msgIsDisplayed() {
		return errMsg.isDisplayed();
	}

	public boolean fieldIsDisplayed() {
		return txtUsername.isDisplayed();
	}
	
	public void setUsername(String username) {
		txtUsername.sendKeys(username);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
}
