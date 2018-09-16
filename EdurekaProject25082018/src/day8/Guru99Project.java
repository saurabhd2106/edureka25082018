package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Guru99Project {

	ChromeDriver driver;

	@BeforeClass
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/v4");
	}

	@Test(priority = 0)
	public void verifyTitleOfThePage() {
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Home Page");
	}

	@Parameters({"userid","password"})
	@Test(priority = 100)
	public void verifyLoginToGuru99WithCorrectCredentials(String userEmailId, String userPassword) {
		WebElement userId = driver.findElement(By.name("uid"));

		userId.sendKeys(userEmailId);

		driver.findElement(By.name("password")).sendKeys(userPassword);

		driver.findElement(By.name("btnLogin")).click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
