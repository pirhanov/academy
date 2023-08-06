package Remember.Operators;

import java.util.Random;

/*Создайте массив из 15 случайных целых чисел из отрезка [0;9]. 
Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
и выведете это количество на экран на отдельной строке.*/

public class SoArrayTask3 {
	public static void main(String[] args) {
		int[] array = new int[15];
		Random rand = new Random();
		int a = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
			System.out.print(array[i] + " ");
			if (array[i] > 0 && array[i] % 2 == 0) {
			
				a++;
				System.out.println();
				System.out.println(" : " + array[i]);
			}

		}
		System.out.println();
		System.out.println("Here is even number: " + a);

	}

}
