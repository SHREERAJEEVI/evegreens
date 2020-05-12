package seleniumframe;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
	HomePageObject hp;
	public HomePageTest() {
		hp= new HomePageObject();
	}
	@Test
	public void verify() {
		System.out.println(hp.getwomen().isDisplayed());
		hp.getwomen().click();
		Assert.assertTrue(hp.getWomentitle().isDisplayed(), "fail");
	}
}