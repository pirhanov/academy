package lesson4;

import java.util.Scanner;

// Составьте программу,  которая вычисляет
//произведение чисел от 1 до n. Значение nвводится с клавиатуры

public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type number n: ");
		int n = scan.nextInt();
		scan.close();
		for (int i = 1; i <= n; i++) {
			System.out.println(n * i);
		}

	}

}
