package Remember.Operators;

import java.util.Scanner;

//Составьте программу, составьте программу, которая вычисляет произведение чисел от 1 до n. Значение n
//вводится с клавиатуры.

public class NeedCycleTask3 {

	public static void main(String[] args) {
		int sum = 1;
		System.out.println("Give me num: ");
		Scanner scan = new Scanner(System.in);
		while (!scan.hasNextInt()) {
			System.out.println("Its not number, please try eagain: ");
			scan.next();
		}
		int number = scan.nextInt();

		for (int i = 1; i < number; i++) {
			sum *= i;
		}
		System.out.println(sum);

	}
}
