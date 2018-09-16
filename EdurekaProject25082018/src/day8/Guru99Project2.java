package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Guru99Project2 {

	WebDriver driver;

	@Parameters("browserType")
	@BeforeClass
	public void invokeBrowser(String browserType) throws Exception {

		if (browserType.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");

			driver = new FirefoxDriver();

		}

		else if (browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver/chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (browserType.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/MicrosoftWebDriver.exe");

			driver = new EdgeDriver();
		} else{
		
		throw new Exception("Invalid Browser type");
		
		}
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
