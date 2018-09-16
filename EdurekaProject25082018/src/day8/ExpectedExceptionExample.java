package day8;

import org.testng.annotations.Test;

public class ExpectedExceptionExample {

	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void tc1() {
		int[] arr = new int[5];

		arr[0] = 78;

		arr[1] = 56;

		arr[2] = 79;

		arr[3] = 67;

		arr[4] = 8;

		for (int i = 0; i <= 5; i++) {
			System.out.println(arr[i]);
		}

	}

}
