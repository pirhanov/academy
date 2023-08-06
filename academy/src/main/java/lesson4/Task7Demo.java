package lesson4;

import java.util.Scanner;

public class Task7Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int reverse = 0;

		for (; number != 0;) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
			System.out.print(remainder);
			scan.close();

		}

	}
}
