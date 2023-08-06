package Array;

import java.util.Random;
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		int number;
		int right = 0;
		int left = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter even Integer: ");

		if (sc.hasNextInt()) {

			do {
				number = sc.nextInt();
				if ((number % 2 != 0) || (number < 1))
					System.out.println("You enter wrong even Integer!");
			} while (number % 2 != 0 || number < 1);
			{
				System.out.println("Thanks!");
			}

			Random rnd = new Random();
			int[] array = new int[number];
			for (int i = 0; i < array.length; i++) {
				array[i] = rnd.nextInt((11) - 5);
				System.out.println(array[i] + " ");
				if (i < array.length / 2) {
					left += Math.abs(array[i]);
				} else {
					right += Math.abs(array[i - 1]);
				}
			}
			System.out.println();
			if (left > right)
				System.out.println("Sum abc left side array is bigger!");
			if (left < right)
				System.out.println("Sum abc right side array is bigger");
			if (left == right)
				System.out.println("Sum abc left and right sides array is equal!");
		} else
			System.out.println("You enter number is wrong!!");
	}

}
