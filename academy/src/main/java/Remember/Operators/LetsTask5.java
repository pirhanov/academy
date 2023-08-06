package Remember.Operators;

import java.util.Scanner;

//Ввести с консоли 2 числа, найти большее, меньшее, 
//среднее арифметическое.

public class LetsTask5 {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number one: ");
		while (!scan.hasNextInt()) {
			System.out.println("You not enter the number. Please enter number: ");
			scan.next();
		}

		int number1 = scan.nextInt();
		System.out.println("Enter the number two: ");
		int number2 = scan.nextInt();
		System.out.println("Average of number of two numbers is: " + (number1 + number2) / 2);

	}

}
