package day8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider="getData")
	public void printParameters(String userEmail, String password,int emplId){
		System.out.println("User Email : "+ userEmail);
		System.out.println("User Password : "+ password);
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data;
		
		data = new Object[3][3];
		
		data[0][0] = "Saurabh.d2106@gmail.com";
		data[0][1] = "Pro@1234";
		data[0][2] = 9069;
		
		data[1][0] = "gaurav.d2106@gmail.com";
		data[1][1] = "AA@1234";
		data[1][2] = 9569;
		
		data[2][0] = "mohit.d2106@gmail.com";
		data[2][1] = "ACS@1234";
		data[2][2] = 123;
		
		return data;
	}

}
