// Написать программу, 
// по заданным значениям чисел a и b находит a в степени b. 
//В запросе укажите допустимые значения этих переменных
//( Например если а - дробное, то b не может быть отрицательным).
package lesson4;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Put number a:");
		float a = scan.nextFloat();
		System.out.println("Put number b:");
		float b = scan.nextFloat();
		if ((a >= 0) && (b >= 0)) {
			System.out.println(Math.pow(a, b));

		}

		else if ((a < 0) || (b < 0)) {
			System.out.println("It can negative number!");
		}

	}

}
