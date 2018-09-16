package day8;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest2 {
	
	@BeforeClass
	public void firstMethodInAClass(){
		System.out.println("Class 2 : First method in a class");
	}
	
	@AfterClass
	public void lastMethodInAClass(){
		System.out.println("Class 2 : Last method in a class");
	}
	
	@BeforeMethod
	public void beforeAMethod(){
		System.out.println("Class 2 :Executes before a method..");
	}
	
	@AfterMethod
	public void afterAMethod(){
		System.out.println("Class 2 : Executes after a method..");
	}
	
	@Test(priority=-1)
	public void testcase1(){
		System.out.println("Class 2 : Class 2 : Testcase 1...");
	}
	
	@Test(priority=0)
	public void testcase3(){
		System.out.println("Class 2 : Class 2 : Testcase 3...");
	}
	
	
	@Test(priority=1)
	public void testcase4(){
		System.out.println("Class 2 : Testcase 4...");
	}
	
	@Test(priority=2, enabled=false)
	public void testcase2(){
		System.out.println("Class 2 : Testcase 2...");
	}
  
	@Test
	public void testcase6(){
		System.out.println("Class 2 : Testcase 2...");
	}
  
}
