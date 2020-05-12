package seleniumframe;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tshirttestpage {
	TShirtPage tp;
	public Tshirttestpage() {
		tp= new TShirtPage();
	}
	@Test
	public void verify() {
		System.out.println(tp.getTshirt().isDisplayed());
		tp.getTshirt().click();
		Assert.assertTrue(tp.getShortSleeve().isDisplayed(), "fail");
	}
}