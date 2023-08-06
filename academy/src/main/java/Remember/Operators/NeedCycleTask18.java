package Remember.Operators;

import java.util.Scanner;

/*Задано натуральное число N. 
Найти количество натуральных чисел, 
не превосходящих N и не делящихся ни на одно из чисел 2,3,5.
*/
public class NeedCycleTask18 {

	public static void main(String[] args) {
		System.out.println("Enter number of stud: ");
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			System.out.println("Try again: ");
			sc.next();
		}
		int a = sc.nextInt();
		sc.close();
		for (int i = 0; i <= a; i++) {
			if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0)) {

				System.out.println(i);
			}
		}

	}

}
