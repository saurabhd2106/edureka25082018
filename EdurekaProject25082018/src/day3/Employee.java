package day3;

public class Employee {

	int salary;
	int bonus;

	int totalSalary;

	public Employee() {

		System.out.println("I am a constructor");

		salary = 8000;

		bonus = 2000;
	}

	public Employee(int salary, int bonus) {
		this.salary = salary;
		this.bonus = bonus;

	}

	void calculateSalary() {

		totalSalary = salary + bonus;
		System.out.println("Total salary is : " + totalSalary);
	}

	int calculateSalary2() {

		totalSalary = salary + bonus;

		return totalSalary;
	}

	int calculateSalary3(int sal, int bon) {

		totalSalary = sal + bon;

		return totalSalary;
	}

	int calculateSalary4(int salary, int bonus) {

		totalSalary = this.salary + this.bonus;

		return totalSalary;
	}
}
