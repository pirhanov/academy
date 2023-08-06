package Remember.Operators;

/*Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку. 
Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.*/

public class SoArrayTask4 {

	public static void main(String[] args) {
		int[] array = new int[8];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10) + 1;
			System.out.print(" " + array[i] + " ");
			System.out.println();

		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0)
				array[i] = 0;
			System.out.print(" " + array[i]);
		}

	}

}
