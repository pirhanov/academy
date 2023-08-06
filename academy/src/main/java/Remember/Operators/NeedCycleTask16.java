package Remember.Operators;

import java.util.Scanner;

/*В бригаде, работающей на уборке сена, имеется N сенокосилок.
Первая сенокосилка работала m часов, а каждая следующая на 10 минут больше,
чем предыдущая.Сколько часов проработала вся бригада?*/

public class NeedCycleTask16 {
	public static void main(String... args) {
		double sum = 0;
		System.out.println("Enter nuber of senokosilka: ");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("U not enter number! Try again: ");
			sc.next();
		}
		int N = sc.nextInt();
		System.out.println("Enter hon long its work: ");
		int m = sc.nextInt();
		sc.close();
		for (int i = 1; i <= N; i++) {
			if ((i > 0) && (m > 0)) {
				sum =sum + m + ((i - 1) * 0.16666);
			}
			
		}
		System.out.println(sum);
	}
}
