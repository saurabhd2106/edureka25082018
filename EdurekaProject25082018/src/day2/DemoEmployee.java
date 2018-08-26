package day2;

public class DemoEmployee {

	public static void main(String[] args) {
		
		//Declaring an object
		Employee saurabh;
		
		// Instantiating and Initializing the object
		saurabh = new Employee();
		
		saurabh.salary = 90000;
		
		saurabh.bonus = 30000;
		
		saurabh.calculateSalary();
		
		System.out.println("------------------------------------");
		
		Employee sapna = new Employee();
		
		sapna.salary= 454564;
		sapna.bonus = 42000;
		
		int totalSalary = sapna.calculateSalary2();
		
		System.out.println("Total Salary : "+ totalSalary);

	}

}
