package day2;

import java.util.Scanner;

public class LeapYearExample {

	public static void main(String[] args) {

		// If a year is a centuary year -- year must be divisible by 400

		// If a year is a non centuary year -- year must be divisible by 4 only
		int year;
		System.out.println("Enter the value of year");
		Scanner sc = new Scanner(System.in);
		
		year = sc.nextInt();

		if ((year % 100 == 0 && year % 400==0) || (year %100 !=0 && year%4==0)) {
				System.out.println("Leap year");
		}  else {
			System.out.println("Not a leap year");
		}
		
		sc.close();
	}

}
