package Remember.Operators;

/*Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
 * Вывести массив на экран. 
Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент. 
При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки. 
Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку,
 а можно отсортировать по убыванию каждую строку). 
Вывести преобразованный массив на экран. */

public class SoArrayTask17 {

	public static void main(String[] args) {
		int[][] a = new int[6][7];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Index is: " + i);
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 10);
				System.out.print(a[i][j] + " ");

				int max = 0, index = 0;

				if (j == 0)
					max = a[i][j];
				else {
					if (max < a[i][j]) {
						max = a[i][j];
						index = j;
					}
				}
				if (j == a.length - 1) {
					int c = a[i][0];
					a[i][0] = a[i][index];
					a[i][index] = c;
				}
			}
			System.out.println(" ");
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print("After reconstraction N: " + i + " ");
			for (int h = 0; h < a[i].length; h++) {
				System.out.print(a[i][h] + " ");
			}
			System.out.println(" ");
		}
	}
}