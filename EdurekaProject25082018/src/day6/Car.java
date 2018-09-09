package day6;

public class Car extends Machine {

	int rpm;
	int engineSize;

	public Car() {
		
		super(9000);
		
		System.out.println("Constructor from Car class");

	}

	public void run() {
		System.out.println("Run method from Car class");
		
		super.start();
	}

	public void start() {
		System.out.println("Start method of car classs");

		engineSize = 9000;

		restart();
	}
}
