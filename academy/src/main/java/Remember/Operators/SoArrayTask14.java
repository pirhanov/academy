package Remember.Operators;

/*Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. 
Вывести массив на экран.   */
public class SoArrayTask14 {

	public static void main(String[] args) {
		int[][] d = new int[8][5];
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {

				d[i][j] = (int) (Math.random() * 89) + 9;
				System.out.print(d[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
