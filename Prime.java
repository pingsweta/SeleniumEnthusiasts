package basic;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number, flag = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		number = s.nextInt();

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				flag = 1;
				break;
			}

		}

		if (flag == 1) {
			System.out.println("This number is not prime.");
		} else {

			System.out.println("This number is prime.");
		}
	}
}
