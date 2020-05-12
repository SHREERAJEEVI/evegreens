package seleniumframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {
	@FindBy(xpath = "(//*[@title='Women'])[1]")
	private WebElement Women;
	
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dresses;
	
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[3]/a")
	private WebElement TShirts;
	
	@FindBy(xpath = "//span[@class='category-name']")
	private WebElement Womentitle;
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getwomen() {
		return Women;
	}
	
	public WebElement getdresses() {
		return Dresses;
	}
	
	public WebElement getTshirt() {
		return TShirts;
	}
	
	public WebElement getWomentitle() {
		return Womentitle;
	}
			
}
