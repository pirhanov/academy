package Remember.Operators;
//??? идет повтор на экран!

/*Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. 
Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.*/

public class SoArrayTask8 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = new int[12];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 31 - 16);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				if (max < array[i])

					max = array[i];
				int index = i;

				System.out.print(" Max " + max + " and index is: " + index);
			}
			
		}
	}

}
