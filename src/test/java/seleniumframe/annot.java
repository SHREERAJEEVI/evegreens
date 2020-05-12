package seleniumframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class annot {
	WebDriver driver;
@BeforeMethod
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "D:\\shree rajeevi documents\\proj\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}
@DataProvider(name="login")
public Object [][] getData(){
	Object[][] data = new Object [3][2];
	
	data[0][0]="Admin";
	data[0][1]="admin123";
	
	data[1][0]="Hgyup";
	data[1][1]="admin";
	
	data[2][0]="Ragav";
	data[2][1]="raji";
	return data;
}
@Test(dataProvider="login")
@Parameters({"Username","Password"})
public void  verifylogin(String Username, String Password) {
	driver.findElement(By.id("txtUsername")).sendKeys(Username);
	driver.findElement(By.id("txtPassword")).sendKeys(Password);
	driver.findElement(By.id("btnLogin")).click();
	
}
}
