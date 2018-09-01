package day3.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {

	ChromeDriver driver;
	
	void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/Saurabh Dhingra/workspace/libs/chromeDriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		Dimension dim = new Dimension(600, 600);
		
		driver.manage().window().setSize(dim);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/v4");
		
	}
	
	public void printTitleOfThePage(){
		System.out.println(driver.getTitle());
	}
	
	public void login(String userEmailId, String password){
		
		WebElement userId = driver.findElement(By.name("uid"));
		
		userId.sendKeys(userEmailId);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
		
	}
	
}
