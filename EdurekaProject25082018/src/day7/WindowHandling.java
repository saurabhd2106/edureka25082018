package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");

		driver.switchTo().frame("iframeResult");

		// To come back from a frame
		// driver.switchTo().defaultContent();

		String parentWindow;

		parentWindow = driver.getWindowHandle();

		System.out.println(parentWindow);

		driver.findElement(By.tagName("button")).click();

		String childWindow;

		childWindow = driver.getWindowHandles().toArray()[1].toString();

		System.out.println(childWindow);

		driver.switchTo().window(childWindow);

		System.out.println("Title of child window : " + driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindow);

		System.out.println("Title of parent window : " + driver.getTitle());

		driver.quit();

	}

}
