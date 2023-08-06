package StringAgain;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) 
средней, а также длину*/
public class T3 {

	public static void main(String[] args) {
		int n = 0;

		while (true) {
			System.out.println("Put n str: ");
			try {
				Scanner sc = new Scanner(System.in);
				n = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("It's not number! Try: ");
			}
		}
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Put String: ");
			Scanner sc2 = new Scanner(System.in);
			arr[i] = sc2.nextLine();
		}
		float aver = 0f;
		for (String item : arr) {
			aver += item.length();
		}
		aver /= arr.length;
		System.out.println("Averageis: " + aver);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() < aver) {
				System.out.println(arr[i] + "; and length: " + arr[i].length());
			}
		}
	}

}
