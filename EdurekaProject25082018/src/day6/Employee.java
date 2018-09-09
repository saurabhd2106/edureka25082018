package day6;

public class Employee {
	
	private int salary;


	private int bonus;
	private int totalSalary;
	
	public void setSalary(int salary){
		if(salary > 0){
			this.salary = salary;
		} else {
			System.err.println("Invalid salary");
		}
	}
	
	public int getTotalSalary() {
		return totalSalary;
	}

	public void setBonus(int bonus) {
		if(bonus > 0){
			this.bonus = bonus;
		} else {
			System.err.println("Invalid bonus");
		}
	}


	void calculateSalary() {

		totalSalary = salary + bonus;
		
	}

}
