package day2;

public class GreatestOutOfThreeNumbers {

	public static void main(String[] args) {

		int firstNum, secondNum, thirdNum;

		firstNum = 90;
		secondNum = 90;
		thirdNum = 26;

		if ((firstNum > secondNum) && (firstNum > thirdNum)) {
			System.out.println("First Number is greatest");
		} else if ((secondNum > firstNum) && (secondNum > thirdNum)) {
			System.out.println("Second Number is greatest");
		} else if ((thirdNum > firstNum) && (thirdNum > secondNum)) {
			System.out.println("Third Number is greatest");
		} else if ((firstNum == secondNum) && (firstNum > thirdNum)) {
			System.out.println("First and second are greater than third");
		} else if ((firstNum == thirdNum) && (firstNum > secondNum)) {
			System.out.println("First and Third are greater than second");
		} else if ((secondNum == thirdNum) && (secondNum > firstNum)) {
			System.out.println("Second and Third are greater than first");
		}

		else {
			System.out.println("All three are equal");
		}
	}

}
