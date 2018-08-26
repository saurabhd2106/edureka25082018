package day2;

public class GreatestOutOfTwoNumbers {

	public static void main(String[] args) {

		int firstNum, secondNum;

		firstNum = 90;

		secondNum = 90;

		if (firstNum == secondNum) {
			System.out.println("Both are equal");
		} else if (firstNum > secondNum) {
			System.out.println("First Number is greatest");
		} else if (secondNum > firstNum) {
			System.out.println("Second Number is greatest");
		}

	}

}
