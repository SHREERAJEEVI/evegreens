package seleniumframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPage extends BasePage{
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dresses;
	
	@FindBy(xpath = "//span[@class='category-name']")
	private WebElement dresstitle;
	
	@FindBy(xpath = "//label[@for='layered_id_attribute_group_1']")
	private WebElement small;
	
	@FindBy(xpath ="//label[@for='layered_id_attribute_group_2']")
	private WebElement medium;
	
	@FindBy(xpath = "//label[@for='layered_id_attribute_group_3']")
	private WebElement large;
		
	public DressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getdresses() {
		return Dresses;
	}
	
	public WebElement getdresstitle() {
		return dresstitle;
	}
	
	public WebElement getsmall() {
		return small;
	}
	
	public WebElement getmedium() {
		return medium;
	}
	
	public WebElement getlarge() {
		return large;
	}
	
	

}
