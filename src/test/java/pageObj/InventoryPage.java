package pageObj;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class InventoryPage extends BaseClass{

	public InventoryPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='product_label']")
	private WebElement lblPage;
	
	@FindBy(xpath = "//a[@href='./cart.html']")
	private WebElement btnCart;
	
	@FindBy(className = "inventory_item_name")
	private List<WebElement> itemName;
	
	@FindBy(className = "btn_primary btn_inventory")
	private List<WebElement> btnInventory;
	
	@FindBy(className = "inventory_item_price")
	private List<WebElement> itemPrice;
	
	@FindBy(className = "inventory_item_desc")
	private List<WebElement> itemDesc;
	
	public void clickItemName(int index) {
		itemName.get(index).click();
	}
	public String getPageLabel() {
		return lblPage.getText();
	}
	
	public String getItemName(int index) {
		return itemPrice.get(index).getText();
	}

}
