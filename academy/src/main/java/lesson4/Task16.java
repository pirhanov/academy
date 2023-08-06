//16. В бригаде, работающей на уборке сена, имеется N сенокосилок
//Первая сенокосилка работала m часов, а каждая следующая на 10 минут больше,
//чем предыдущая.Сколько часов проработала вся бригада?

package lesson4;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Put number mower: ");
		int N = scan.nextInt();
		System.out.println("How long they work (in hour): ");
		float m = scan.nextFloat();
		
			if (N > 1) {

				System.out.println("The total amount of work time is: " + ((N * (m + 0.166666666666666666666))));
			} else if (N == 1) {
				System.out.println("The total amount of work time is: " + (m * 1));

			}


	}

}
