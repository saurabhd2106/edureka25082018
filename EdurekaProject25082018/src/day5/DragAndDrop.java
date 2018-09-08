package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver/chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		System.out.println("Color before drag and drop : "+target.getCssValue("color"));
		Actions action = new Actions(driver);
		
		action.dragAndDrop(source, target).build().perform();
		
		System.out.println("Color after drag and drop : "+target.getCssValue("color"));
	}

}
