package day8;

import org.testng.annotations.Test;

public class TimeoutException {

	@Test(timeOut = 3000)
	public void tc() throws InterruptedException {
		int[] arr = new int[5];

		arr[0] = 78;

		arr[1] = 56;

		arr[2] = 79;

		arr[3] = 67;

		arr[4] = 8;

		Thread.sleep(10000);

		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}

	}

}
