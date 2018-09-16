package day7;

public class Guru99Project {
	
	
	public void invokeBrowser(){
		System.out.println("Invoke Browser");
	}
	
	public void login() throws Exception, IndexOutOfBoundsException{
		
		int[] arr = new int[5];

		arr[0] = 78;

		arr[1] = 56;

		arr[2] = 79;

		arr[3] = 67;

		arr[4] = 8;
		for (int i = 0; i <= 5; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	public void addCustomer(){
		
		System.out.println("Add cutomer..");
		
	}
	
	public void logout(){
		System.out.println("Logout");
	}
	

}
