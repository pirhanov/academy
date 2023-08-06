package Remember.Operators;

import java.util.Scanner;

//Ввести через консоль название месяца -> вывести номер месяца (использовать switch/case)
public class LetsTask3 {
	public static void main(String[] args) {
		int month;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of month: ");
		while (!scan.hasNextInt()) {
			System.out.println("U need enter number try again: ");
			scan.next();

		}

		month = scan.nextInt();
		switch (month) {
		case 1:
			System.out.println("January!");
			break;
		case 2:
			System.out.println("February!");
			break;
		case 3:
			System.out.println("March!");
			break;
		case 4:
			System.out.println("April!");
			break;
		case 5:
			System.out.println("June!");
			break;
		case 6:
			System.out.println("Jule!");
			break;
		default:

			System.out.println("U enter wrong number, it can't be month!");

		}
	}

}
