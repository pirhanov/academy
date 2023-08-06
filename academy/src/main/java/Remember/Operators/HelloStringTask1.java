package Remember.Operators;

import java.util.Scanner;

/*Ввести n строк с консоли, найти самую короткую и самую длинную строки. 
Вывести найденные строки и их длину.*/

public class HelloStringTask1 {

	public static void main(String[] args) {
		System.out.println("Enter the number of strig: ");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int n = Integer.parseInt(sc.nextLine());
			int m = 0;
			int x = 0;
			String[] s = new String[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Put the string: ");
				s[i] = sc.nextLine();
				if (s[i].length() <= s[m].length())
					m = i;
				if (s[i].length() >= s[x].length())
					x = i;
			}
			sc.close();
			System.out.printf("Min (%d): \"%s\"%n", s[m].length(), s[m]);
			System.out.printf("Max (%d): \"%s\"%n", s[x].length(), s[x]);

		}
	}
}