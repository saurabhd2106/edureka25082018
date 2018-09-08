package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utils.WaitUtils;

public class FlipkartProject {

	ChromeDriver driver;

	void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();

		Dimension dim = new Dimension(600, 600);
		driver.manage().window().setSize(dim);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

	}
	
	public void mouseHover(){
		WebElement electronicsLink = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(electronicsLink).build().perform();
		
	//	WaitUtils.waitTillElementVisible(driver, By.linkText("Samsung"), 5);
		
		WaitUtils.fluentWait(driver, 5, 1, By.linkText("Samsung"));
		WebElement samsungLink = driver.findElement(By.linkText("Samsung"));
		
		String urlOfTheLink = samsungLink.getAttribute("href");
		
		System.out.println("Url of samsung link : "+ urlOfTheLink);
		
		action.moveToElement(samsungLink).click().build().perform();
	}
	
	

}
