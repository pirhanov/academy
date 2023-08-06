package Remember.Operators;

import java.util.Scanner;

//Составьте программу, которая вычисляет сумму квадратов чисел от 1 до введенного вами целого числа N.
public class NeedCycleTask14 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter number plz: ");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Try again: ");
			sc.next();
		}
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			sum = sum + i * i;

		}
		System.out.println(sum);
	}

}
