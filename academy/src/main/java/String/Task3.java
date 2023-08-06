package String;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		int n = 0;

		while (true) {
			System.out.println("Enter of number strings (it need be number!): ");
			Scanner sc = new Scanner(System.in);

			try {
				n = sc.nextInt();
				break;
			}

			catch (InputMismatchException e) {
				System.out.println("You not enter a nuber! Try again!");
			}
		}
		String[] string = new String[n];
		Scanner sc2 = new Scanner(System.in);

		for (int i = 0; i < string.length; i++) {
			System.out.println("Enter the number of strings №: " + (i + 1));
			string[i] = sc2.nextLine();
		}
		float average = 0f;
		for (String item : string) {
			average += (float) item.length();

		}
		average /= string.length;
		System.out.println("Average String equal to: " + average);

		for (int i = 0; i < n; i++) {
			if (string[i].length() < average) {
				System.out.println("String is less than average string: ");
				System.out.println(string[i] + " length equal to = " + string[i].length());
			}
		}
	}
}
