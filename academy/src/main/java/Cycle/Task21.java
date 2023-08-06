package Cycle;

//=>??
import java.util.Scanner;

//Дано натуральное n. вычислить 1/(2 в квадрате) + 1/(4 в квадрате)+ ... + 1/(2n в квадрате) ( в квадрате только n)
//1,2,3,4,5...n
//2,4,6,8,10...2n
public class Task21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();

		int sum = 0;
		for (int i = 1; i < s; i++) {
			sum = i + (s * 2);
			System.out.println(sum);
		}

	}
}