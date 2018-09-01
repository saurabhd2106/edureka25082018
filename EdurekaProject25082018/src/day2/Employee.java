package day2;

public class Employee {

	int salary;

	int bonus;
	int totalSalary;

	void calculateSalary() {

		totalSalary = salary + bonus;
		System.out.println("Total salary is : " + totalSalary);
	}
	
	int calculateSalary2() {

		totalSalary = salary + bonus;
		
		return totalSalary;
	}
	

}
