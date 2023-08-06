package Remember.Operators;

/*Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, 
выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, 
для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).*/

public class SoArrayTask5 {

	public static void main(String[] args) {
		double sum1 = 0; //aver
		double sum2 = 0;

		int array1[] = new int[5];
		int array2[] = new int[5];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 6);
			System.out.print(array1[i] + " ");
			sum1 += (double) array1[i] / array1.length;

		}
		System.out.println(" ");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int) (Math.random() * 5) + 0;
			System.out.print(array2[i] + " ");
			sum2 += (double) array2[i] / array2.length;

		}
		System.out.println(" ");
		System.out.println(sum1);
		System.out.println(sum2);

		if (sum1 > sum2) {
			System.out.println("Average array1 is bigger! ");
		}
		if (sum1 < sum2) {
			System.out.println("Average array2 is bigger! ");
		}
		if (sum1 == sum2) {
			System.out.println("Average array1 and array2 equal! ");
		}
	}

}
