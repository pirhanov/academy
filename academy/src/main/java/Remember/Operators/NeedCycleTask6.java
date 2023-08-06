package Remember.Operators;

import java.util.Scanner;

// В сберкассу на трёхпроцентный вклад положили S рублей.Какой станет сумма вклада через N лет.
public class NeedCycleTask6 {
	public static void main(String... args) {
		int c = 0;
		System.out.print("Enter the how much u will put money: ");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("U not enter the numbers, pls rty again: ");
			sc.next();
		}
		int s = sc.nextInt();
		System.out.println("Enter how long u put money (in year) : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(s * i + ((0.03 * s) * i));
		}

	}

}
