package by.academy.homework1;

import java.util.Scanner;

public class task1 {
	static public void main(String[] argv) { // вызываем метод "main".также вместо args we can use argv
		Scanner sc = new Scanner(System.in);

		System.out.println("How much was the purchase: ");
		double purchaseAmount = sc.nextDouble();
		System.out.println("how old is the buyer?");
		int age = sc.nextInt();

		if (purchaseAmount < 100) {
			System.out.println(purchaseAmount - purchaseAmount * 0.05);
		}

		else if ((purchaseAmount >= 100) && (purchaseAmount < 200)) {
			System.out.println(purchaseAmount - purchaseAmount * 0.07);
		}

		else if ((purchaseAmount >= 200) && (purchaseAmount < 300) && (age > 18)) {
			System.out.println(purchaseAmount - purchaseAmount * 0.16); // если старше 18 лет 12%+4%=16%
		}

		else if ((purchaseAmount >= 200) && (purchaseAmount < 300) && (age < 18)) {
			System.out.println(purchaseAmount - purchaseAmount * 0.09); // если ниже 18 лет то 12%-4%=9%
		}

		else if ((purchaseAmount >= 300) && (purchaseAmount < 400)) {
			System.out.println(purchaseAmount - purchaseAmount * 0.15);

		}

		else if ((purchaseAmount >= 400)) {
			System.out.println(purchaseAmount - purchaseAmount * 0.20);

		}

	}

}
