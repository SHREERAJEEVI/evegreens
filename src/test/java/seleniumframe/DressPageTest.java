package seleniumframe;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DressPageTest {
	DressPage dp;
	public DressPageTest() {
		dp= new DressPage();
	}
	@Test
	public void verify() {
		System.out.println(dp.getdresses().isDisplayed());
		dp.getdresses().click();
		Assert.assertTrue(dp.getdresstitle().isDisplayed(), "fail");
		Assert.assertTrue(dp.getlarge().isDisplayed(), "fail");
		Assert.assertTrue(dp.getsmall().isDisplayed(), "fail");
		Assert.assertTrue(dp.getmedium().isDisplayed(), "fail");
	}

}
