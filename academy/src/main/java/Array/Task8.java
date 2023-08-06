package Array;
//Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. 
// Определите какой элемент является в этом массиве максимальным
// и сообщите индекс его последнего вхождения в массив.

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [12];
		int max = 0;
		int indx = 0;
		for (int i =0; i < array.length; i++) {
			array[i] = (int)Math.floor(Math.random()*31-16);
			System.out.println(array[i] + " ");
		}
		
		for (int i = 0; i < array.length; i ++) {
			if (array[i]>max) {
				max = array[i];
				indx = i;
				System.out.println("Max number is: " + max + " and index is: " + indx);
			}
		}

	}

}
