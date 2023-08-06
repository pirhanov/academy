package Remember.Operators;

import java.util.Scanner;

/* 
Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран. 
Создать второй массив только из чётных элементов первого массива, 
если они там есть, и вывести его на экран*/
public class SoArrayTask12 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter number heigh than three: ");
		Scanner scan = new Scanner(System.in);
		if (scan.hasNextInt()) {
			do {
				n = scan.nextInt();
				if (n <= 3)
					System.out.println("try agin bro: ");
			} while (n <= 3);
			scan.close();
			int[] array1 = new int[n];
			for (int i = 0; i < n; i++) {
				array1[i] = (int) (Math.random() * n);
				System.out.print(array1[i] + " ");
			}
			System.out.println(" ");
			for (int j = 0; j < array1.length; j++) {
				if (array1[j] % 2 == 0) {
					System.out.print(array1[j] + " ");
				}

			}
		}

	}

}
