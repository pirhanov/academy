package lesson4;

//Составьте программу, которая вычисляет сумму чисел
//от 1 до n. Значение n вводится с клавиатуры
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Type number n: ");
		int count = 0;

		int n = scan.nextInt();
		for (int i = 1; i < n + 1; i++) {
			count += i;
			System.out.println("Sum" + "=" + count);
		}
		
	}

}
