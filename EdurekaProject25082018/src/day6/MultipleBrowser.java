package day6;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {

	WebDriver driver;

	void invokeBrowser(String browserType) {

		if (browserType.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");

			driver = new FirefoxDriver();

		}

		if (browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver/chromedriver.exe");

			driver = new ChromeDriver();
		}

		if (browserType.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/MicrosoftWebDriver.exe");

			driver = new EdgeDriver();
		}
		Dimension dim = new Dimension(600, 600);
		driver.manage().window().setSize(dim);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://qatechhub.com");

	}

	String getPageTitle() {
		return driver.getTitle();
	}

	void navigateCommands() {
		driver.navigate().to("http://www.facebook.com");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

	}

	public void searchState() {

		String tripType = "oneWay";
		String destination = "to";
		String city = "Delhi";

		String cityXpath = String.format(
				"//div[@id='%s']/form//div[@class='city-dropdown-list city-name-%s']//a[contains(text(),'%s')]",
				tripType, destination, city);
	}

	void closeBrowser() {
		// driver.close();

		driver.quit();
	}

}
