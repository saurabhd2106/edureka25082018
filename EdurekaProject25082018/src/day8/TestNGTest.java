package day8;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGTest {
	
	@BeforeSuite
	public void beforeASuite(){
		System.out.println("First method to executed...");
	}
	
	@AfterSuite
	public void afterASuite(){
		System.out.println("Last method to executed...");
	}
	
	@BeforeClass
	public void firstMethodInAClass(){
		System.out.println("First method in a class");
	}
	
	@AfterClass
	public void lastMethodInAClass(){
		System.out.println("Last method in a class");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforeAMethod(){
		System.out.println("Executes before a method..");
	}
	
	@AfterMethod(alwaysRun=true)
	public void afterAMethod(){
		System.out.println("Executes after a method..");
	}
	
	@Test(priority=-1)
	public void testcase1(){
		System.out.println("Test case 1...");
	}
	
	@Test(priority=0, groups={"Sanity"})
	public void testcase3(){
		System.out.println("Test case 3...");
	}
	
	
	@Test(priority=1, groups={"Sanity"})
	public void testcase4(){
		System.out.println("Test case 4...");
	}
	
	@Test(priority=2, enabled=false)
	public void testcase2(){
		System.out.println("Test case 2...");
	}
  
	@Test
	public void testcase6(){
		System.out.println("Test case 2...");
	}
  
}
