package Remember.Operators;

import java.util.Scanner;

//Создайте число. Определите, является ли число 
//четным или не четным, вывести текстовое сообщение.
public class LetsTask4 {
	public static void main(String[] args) {

		int number;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");

		while (!scan.hasNextInt()) {
			System.out.println("It's not integer! Please reEnter the number: ");
			scan.next();
		}
		number = scan.nextInt();
		if (number % 2 == 0) {
			System.out.println("It's even number!");
		} else {
			System.out.println("It's uneven number!");
		}

	}

}
