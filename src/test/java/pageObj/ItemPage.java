package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ItemPage extends BaseClass {

	public ItemPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='inventory_details_name']")
	private WebElement detailName;
	
	public String getDetailName() {
		return detailName.getText();
	}

}
