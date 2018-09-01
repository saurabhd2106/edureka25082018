package day3;

public class DemoEmployee {

	public static void main(String[] args) {
	
		Employee sapna = new Employee();
		
		sapna.salary = 90000;
		sapna.bonus = 8000;
		
		int sapnaSalary = sapna.calculateSalary4(10000, 5000);
		
		System.out.println("Salary of Sapna : "+ sapnaSalary);
		
		System.out.println("------------------------------------");
		
		Employee sagar = new Employee();
		
		sagar.calculateSalary();
		
		Employee banu = new Employee(40000,5000);
		banu.calculateSalary();
	}

}
