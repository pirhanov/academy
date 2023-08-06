package Remember.Operators;

/*Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. 
Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран. 
Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.*/

public class SoArrayTask10 {

	public static void main(String[] args) {
		int[] a1 = new int[11];
		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < a1.length; i++) {
			a1[i] = (int) (Math.random() * 4 - 1);
			System.out.print(a1[i] + " ");

			if (a1[i] < 0)
				a++;
			if (a1[i] == 0)
				b++;
			if (a1[i] == 1)
				c++;

			
		}
		if (a> b && a >c) {
			System.out.println("Winner is -1!");
		}
		if (b> a && b >c) {
			System.out.println("Winner is 0!");
		}
		if (c> b && c >a) {
			System.out.println("Winner is 1!");
		}
	}

}
