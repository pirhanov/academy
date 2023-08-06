package Remember.Operators;

import java.util.Scanner;

//Ввести с клавиатуры 10 пар чисел. сравнить числа в каждой паре и напечатать большие из них.

public class NeedCycleTask7 {

	public static void main(String[] args) {
		int[] array = new int[4];
		for (int i = 0; i < array.length; i++) {
			Scanner sc = new Scanner(System.in);
			array[i] = sc.nextInt();
			if (array[i + 1] > array[i]) {
				System.out.println("Big boy: " + array[i + 1]);
			}

		}

	}

}
