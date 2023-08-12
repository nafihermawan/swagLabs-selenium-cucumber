package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

//import io.cucumber.java.After;

public class Hooks {
	public static WebDriver driver;
	
	@Before
	public static void openBrowser() {
		System.out.println("Called openBrowser");
		System.setProperty("webdriver.chrome.driver", "/Users/nafihermawan/Web Driver/chromedriver");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize();
		
	}
	
	@After
	public static void close() {
		driver.close();
	}

}
