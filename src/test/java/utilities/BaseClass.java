package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
	public static WebDriver driver;
	
	public BaseClass(WebDriver driver) {
		BaseClass.driver  = driver;
	}
	
	public void click(WebElement webElement) {
		webElement.click();
	}
	
	public void input(WebElement webElement) {
		webElement.clear();
		webElement.sendKeys();
	}

}
