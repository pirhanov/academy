package Array;

import java.util.Random;

// Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, 
//выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, 
//для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

public class Task5 {

	public static void main(String[] args) {
		double sumA1 = 0;
		double sumA2 = 0;
		int [] array1 = new int[5];
		for (int i = 0; i < array1.length; i++) {
			Random rnd = new Random();
			array1 [i] = (int)(Math.random()*6);
			System.out.print(array1[i] + " ");
			sumA1 += (double)array1[i]/array1.length;
			
					}
		System.out.println(" ");
		int [] array2 = new int[5];
		for (int i = 0; i < array2.length; i++) {
			Random rnd = new Random();
			array2 [i] = (int)(Math.random()*6);
			System.out.print(array2[i] + " ");
			sumA2 += (double)array1[i]/array2.length;
			
			
	}
		System.out.println(" ");
		
		if(sumA1==sumA2)System.out.println("Array A1 equal A2");
        else {if(sumA1>sumA2)
            System.out.println("Array A1 larger than A2 ");
            else System.out.println("Array A2 larger than A1 ");
        }
		

}
}
