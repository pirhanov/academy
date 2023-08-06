package String;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского 
//алфавита, а среди них – количество слов с равным числом гласных и согласных букв. 
//
public class Task5 {
	public static void main(String[] args) {
		int n;

		while (true) {
			System.out.println("Enter the nuber of strings: ");
			Scanner sc = new Scanner(System.in);
			try {
				n = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("You need enter NUMBER(NUMBERS)!");
			}
		}

		String[] string = new String[n];
		Scanner sc2 = new Scanner(System.in);
		for (int i = 0; i < string.length + 1; i++) {
			System.out.println("Enter the number of Strings: " + (i + 1));
			string[i] = sc2.nextLine();
			if (Pattern.matches("[a-zA-Z]+", string[i])) {
				// Do something
				System.out.println("Yes, string contains letters only");
			} else {
				System.out.println("Nope, Other characters detected");
			}
		}

	}

}
