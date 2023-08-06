package StringAgain;

import java.util.Scanner;

/*Ввести n строк с консоли, найти самую короткую и самую длинную строки. 
Вывести найденные строки и их длину*/

public class T1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Put number of string: ");
		if (sc.hasNextInt()) {
			int min = 0, max = 0;
			int n = Integer.parseInt(sc.nextLine());
			String s[] = new String[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Put string in new line " + (i + 1) + ": ");
				s[i] = sc.nextLine();
				if (s[i].length() <= s[min].length())
					min = i;
				if (s[i].length() >= s[max].length())
					max = i;
			}

			System.out.println("Min is: " + s[min] +  "; and length is: " + s[min].length());
			System.out.println("Max is: " + s[max]+  "; and length is: " + s[max].length());
		}

	}

}
