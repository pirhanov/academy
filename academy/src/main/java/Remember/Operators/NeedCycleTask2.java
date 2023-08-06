package Remember.Operators;

import java.util.Scanner;

//Составьте программу, которая вычисляет сумму чисел от 1 до n. 
//Значение n вводится с клавиатуры.

public class NeedCycleTask2 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		while (!scan.hasNextInt()) {
			System.out.println("You not enter the number: ");
			scan.next();
		}
		int number = scan.nextInt();
		for (int i = 0; i < number; i++) {
			sum += i;

		}
		System.out.println(sum);

	}
}
