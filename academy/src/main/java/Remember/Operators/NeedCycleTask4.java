package Remember.Operators;

import java.util.Scanner;

//c клавиатуры вводятся n чисел. 
//Составьте программу, которая определяет кол-во отрицательных,
//кол-во положительных и кол-во нулей среди введеных чисел.
//Значение n вводится с клавиатуры.
public class NeedCycleTask4 {

	public static void main(String[] args) {
		int plus = 0;
		int minus = 0;
		int nul = 0;
		System.out.println("Sooo give me number: ");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Sure? It was numer?! Repeat please: ");
			sc.next();
		}
		int n = sc.nextInt();

		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Put: ");
			array[i] = sc.nextInt();

			if (array[i] > 0) {
				plus++;
			}
			if (array[i] < 0) {
				minus++;
			}
			if (array[i] == 0) {
				nul++;
			}

		}
		System.out.println("p: " + plus + "; " + "minus: " + minus + "; " + "nuul: " + nul);
	}

}
