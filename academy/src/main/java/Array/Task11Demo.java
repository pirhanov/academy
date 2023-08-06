package Array;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import Remember.Operators.SoArrayTask11;

public class Task11Demo {
	public static void main(String[] args) {
		new Task11Demo().task();
	}

	private void task() {
		int[] array = createAndFillRandomArray();
		showArray(array);
		int leftSumm = modulesSum(array, 0, array.length / 2);
		int rightSumm = modulesSum(array, array.length / 2, array.length);
		if (leftSumm == rightSumm) {
			System.out.println("Суммы модулей обеих половин равны!");
		} else {
			System.out.printf("Сумма модулей левой половины %sьше правой.", leftSumm < rightSumm ? "мен" : "бол");
		}
	}

	private int[] createAndFillRandomArray() {
		int len = userInput();
		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			result[i] = ThreadLocalRandom.current().nextInt(-5, 5);
		}
		return result;
	}

	private int userInput() {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		while (result <= 0 || result % 2 != 0) {
			System.out.print("Input number: ");
			result = scan.nextInt();
		}
		return result;
	}

	private void showArray(int[] array) {
		for (int elem : array) {
			System.out.print(elem + "\t");
		}
		System.out.println();
	}

	private int modulesSum(int[] array, int from, int to) {
		int summ = 0;
		for (int i = from; i < to; i++) {
			summ += array[i] < 0 ? -array[i] : array[i];
		}
		return summ;
	}
}
