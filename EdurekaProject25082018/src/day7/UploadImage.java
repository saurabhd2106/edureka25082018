package day7;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadImage {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://images.google.com");

		driver.findElement(By.id("qbi")).click();
		driver.findElement(By.linkText("Upload an image")).click();
		driver.findElement(By.id("qbfile")).click();

		Runtime.getRuntime().exec(
				"C:/Users/Saurabh Dhingra/git-qatechhub/Edureka25082018/EdurekaProject25082018/scripts/UploadImage.exe");

		//driver.quit();

	}
	

}
