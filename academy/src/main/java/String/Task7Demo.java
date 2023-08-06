package String;

import java.util.InputMismatchException;
import java.util.Scanner;

//Ввести n слов с консоли. Найти слово, состоящее только из различных символов. 
//Если таких слов несколько, найти первое из них.

public class Task7Demo {
	public static void main (String [] args) {
		int n;
		String text;
		int cunter =0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the number of words: ");
			
			
			try {
				n = scan.nextInt();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("You not enter a nuber! Try again!");
			}
		}
		String [] str = new String [n];
		
	}

}
