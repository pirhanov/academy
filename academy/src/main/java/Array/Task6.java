package Array;
// Задача 6.
// Создайте массив из 4 случайных целых чисел из отрезка [10;99], 
// выведите его на экран в строку. Определить и вывести на экран сообщение о том,
// является ли массив строго возрастающей последовательностью.

public class Task6 {
	public static void main (String [] args) {
		
		int [] array = new int[4];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*90+10);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < array.length; i++) {
			
			if(i>0) {
				
				if (array[i-1] >= array[i]) {
					
					System.out.println("We haven't progrecc" + " ");
					break;
					
				}
			}
			if (i == array.length-1) {
				System.out.println("We have progrecc");
			}
			
		}
		
	}

}
