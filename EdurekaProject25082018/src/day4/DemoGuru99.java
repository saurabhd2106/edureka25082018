package day4;

public class DemoGuru99 {

	public static void main(String[] args) {
		Guru99Project guru = new Guru99Project();
		
		guru.invokeBrowser();
		
		guru.printTitleOfThePage();
		
		guru.login("mngr151688", "navyveg");
		
		guru.printTitleOfThePage();
		
		guru.addCustomer();
		
		String customerId = guru.getCustomerId();
		
		System.out.println("Customer Id : " + customerId);
		
		guru.addAccount(customerId);
	}
	
	

}
