package Remember.Operators;
//17. В ЭВМ вводятся по очереди данные о росте N учащихся класса.

import java.util.Scanner;

//Определить средний рост учащихся класса.

public class NeedCycleTask17 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter number of stud: ");
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			System.out.println("Try again: ");
			sc.next();
		}
		int a = sc.nextInt();

		int[] array = new int[a];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			sum = (sum + array[i]);
		}
		System.out.println(sum / a);
		sc.close();
	}
}
