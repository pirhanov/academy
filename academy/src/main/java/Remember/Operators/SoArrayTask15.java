package Remember.Operators;

/*Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. 
Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива
(его индекс не имеет значения).  */

public class SoArrayTask15 {

	public static void main(String[] args) {
		int[][] a = new int[5][8];
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 199 - 100);
				System.out.print(a[i][j] + " ");

			}
			System.out.println(" ");
		}

		int min = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > min)
					min = a[i][j];
			}

		}
		System.out.println(" ");
		System.out.println(" MAX: " + min);
	}

}
