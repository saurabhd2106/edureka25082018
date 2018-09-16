package day7;

public class ExceptionalHandling {

	public static void main(String[] args) {

		int[] arr = new int[5];

		arr[0] = 78;

		arr[1] = 56;

		arr[2] = 79;

		arr[3] = 67;

		arr[4] = 8;

		try {

			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}

			System.out.println("After for loop");

		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array Index out of bound");
			e.printStackTrace();
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("String Index out of bound");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("I always execute..");
		}
		System.out.println("I am after printing values of array");

	}

}
