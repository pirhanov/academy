package Array;
//Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. 

//Напоминаем, что первый и второй члены последовательности равны единицам,
//а каждый следующий — сумме двух предыдущих.

public class Task7 {
	public static void main(String[] args) {
		int[] array = new int[20];

		for (int i = 0; i < array.length; i++) {

			if (i < 2) {
				array[i] = 1;
			} else {
				array[i] = array[i - 2] + array[i - 1];
			}
			System.out.print(array[i] + " ");
		}

	}
}
