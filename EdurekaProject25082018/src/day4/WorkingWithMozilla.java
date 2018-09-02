package day4;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithMozilla {
	
	FirefoxDriver driver;
	
	void invokeBrowser(){
		
		System.setProperty("webdriver.gecko.driver", 
				"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		Dimension dim = new Dimension(600, 600);
		driver.manage().window().setSize(dim);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://qatechhub.com");
		
	}
	
	String getPageTitle(){
		return driver.getTitle();
	}
	
	void navigateCommands(){
		driver.navigate().to("http://www.facebook.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}
	
	void closeBrowser(){
		//driver.close();
		
		driver.quit();
	}

}
