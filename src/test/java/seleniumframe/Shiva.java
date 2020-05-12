package seleniumframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Shiva {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser()579 {
	System.setProperty("webdriver.chrome.driver", "D:\\shree rajeevi documents\\proj\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	@Parameters({"Username","Password"})
	public void verifylogin(String Username, String Password) {
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
}
}