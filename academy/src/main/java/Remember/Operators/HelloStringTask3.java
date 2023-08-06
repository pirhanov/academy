package Remember.Operators;

import java.util.Scanner;

/*Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) 
средней, а также длину*/

public class HelloStringTask3 {

	public static void main(String[] args) {
		int average = 0;
		int z = 1;
		System.out.println("Put number of stings: ");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int n = Integer.parseInt(sc.nextLine());
			String[] p = new String[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Put the string N" + z++);
				p[i] = sc.nextLine();
				average += p[i].length();
			}
			sc.close();
			average = average / n;
			System.out.println("Aberage: " + average);
			for (int i = 0; i < n; i++) {
				if (p[i].length() < average)
					System.out.println("(" + p[i].length() + ")" + p[i] + " :Min");
				if (p[i].length() > average)
					System.out.println("max: " + p[i].length() + " " + p[i]);
			}
		}

	}
}