package Remember.Operators;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HelloStringTask5 {

	public static void main(String[] args) {
		int n;
		while (true) {
			System.out.println("Put amount of strings: ");
			Scanner s = new Scanner(System.in);
			try {
				n = s.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Try bro agin: ");
			}
			s.close();
		}
		String[] str = new String[n];
		Scanner s1 = new Scanner(System.in);
		for (int i = 0; i < str.length; i++) {
			System.out.println("Put string N" + (i));
			str[i] = s1.nextLine();
			if (Pattern.matches("[a-zA-Z]+", str[i])) {
				System.out.println("String onle contains alph!");
			} else {
				System.out.println("There have other chars! ");
			}
		}
		s1.close();
	}
}
