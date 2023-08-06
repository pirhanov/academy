package Remember.Operators;

/*Cоздайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, 
отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки). 
Перед созданием массива подумайте, какого он будет размера.
2 4 6 … 18 20
2
4
6*/

public class SoArrayTask1 {
	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		int[] c = new int[10];// массив
		while (a < 10) {
			c[a] = b;
			b += 2;
			a++;
		}
		for (a = 0; a < c.length; a++) {

			System.out.print(" " + c[a]);
		}
		for (a = 0; a < c.length; a++) {

			System.out.println(c[a]);
		}
	}

}
