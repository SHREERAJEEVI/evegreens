package seleniumframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TShirtPage extends BasePage{
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[3]/a")
	private WebElement TShirts;
	
	@FindBy(xpath = "//label[@for='layered_id_feature_17']//a")
	private WebElement ShortSleeve;
	
	public TShirtPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTshirt() {
		return TShirts;
		}
	
	public WebElement getShortSleeve() {
		return ShortSleeve;
	}



}
