package Remember.Operators;

import java.util.Scanner;

//???
/*Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского 
алфавита, а среди них – количество слов с равным числом гласных и согласных букв.*/
public class HelloStringTask9 {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Put number of string: ");
		while (!sc.hasNext()) {
			System.out.println("Try again: ");
			sc.next();
		}
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		String[] latWords = new String[n];
		for (int i = 0; i < n; i++) {
			if (arr[i].matches("[a-z]")) {
				;
			}
		}
	}
}
