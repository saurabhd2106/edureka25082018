package day3.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithEdge {
	
	EdgeDriver driver;
	
	void invokeBrowser(){
		
		System.setProperty("webdriver.edge.driver", 
				"C:/Users/Saurabh Dhingra/workspace/libs/MicrosoftWebDriver.exe");
		
		driver = new EdgeDriver();
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
