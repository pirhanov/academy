package Remember.Operators;
// ? второй част с макс модул значением?

/*Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]. 
Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов. 
Если таких строк несколько, то вывести индекс первой встретившейся из них.*/

public class SoArrayTask16 {

	public static void main(String[] args) {
		int b = 0;
		int[][] a = new int[7][4];
		int[] a1 = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Stroka  " + i + " ");
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 11 - 6);
				System.out.print(a[i][j] + " ");
				if (j == 0)
					a1[i] = a[i][j];
				else
					a1[i] *= a[i][j];
				if (j == a[i].length - 1)
					System.out.println(" ");
			}

		}
		int max = 0, max_i = 0;
		for (int i = 0; i < a1.length; i++) {
			if (Math.abs(a1[i]) > max) {
				max = a1[i];
				max_i = i;

			}

		}
		System.out.println("Max (" + max + ") index - " + max_i);

	}
}