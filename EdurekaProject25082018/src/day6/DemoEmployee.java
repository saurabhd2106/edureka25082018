package day6;

public class DemoEmployee {

	public static void main(String[] args) {
		Employee sagar = new Employee();

		sagar.setSalary(90000);
		sagar.setBonus(5000);
		
		sagar.calculateSalary();

		System.out.println("Total salary : " + sagar.getTotalSalary());

	}

}
