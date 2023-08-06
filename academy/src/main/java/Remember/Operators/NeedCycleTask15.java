package Remember.Operators;

import java.util.Scanner;

/*Написать программу, 
которая по заданным значениям чисел a и b находит a в степени b. 
В запросе укажите допустимые значения этих переменных
( Например если а - дробное, то b не может быть отрицательным).*/
public class NeedCycleTask15 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter number a: ");
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			System.out.println("Try again: ");
			sc.next();
		}
		int a = sc.nextInt();
		System.out.println("Enter number b: ");
		int b = sc.nextInt();
		System.out.println(Math.pow(a, b));

	}

}
