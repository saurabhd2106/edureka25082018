package day6;

public class DemoMachine {

	public static void main(String[] args) {
		Machine mac = new Machine(966);

		mac.start();

		System.out.println("----------------------------------------");
		Car alto = new Car();

		alto.run();

		alto.start();
		System.out.println("----------------------------------------");

		Machine bmw = new Car();

		bmw.start();
		
		
	}

}
