package lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
// С клавиатуры вводятся n чисел. 
//Составьте программу, которая определяет кол-во отрицательных,
//кол-во положительных и кол-во нулей среди введеных чисел.
//Значение n вводится с клавиатуры.

public class Task4 {
	public static void main(String[] args) throws Exception {
		// напишите тут ваш код
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		int c = Integer.parseInt(reader.readLine());
		if (a > 0 && b > 0 && c > 0) {
			System.out.println("количество отрицательных чисел: 0");
			System.out.println("количество положительных чисел: 3");
		} else if ((a > 0 && b > 0) || (a > 0 && c > 0) || b > 0 && c > 0) {
			System.out.println("количество отрицательных чисел: 1");
			System.out.println("количество положительных чисел: 2");
		} else if (a > 0 || b > 0 || c > 0) {
			System.out.println("количество отрицательных чисел: 2");
			System.out.println("количество положительных чисел: 1");
		} else
			System.out.println("количество положительных чисел: 0");

	}
}
