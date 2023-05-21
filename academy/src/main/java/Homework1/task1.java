/*
 * Ввести с консоли сумму покупки в магазине и возраст покупателя, 
в зависимости от суммы вывести на экран ФИНАЛЬНУЮ ЦЕНУ с учетом скидки.

	Скидки:
	1) Сумма до 100 рублей -> 5%
	2) Сумма от 100 рублей включая до 200 рублей не включая -> 7%
	3) Сумма от 200 рублей включая до 300 рублей не включая -> 12%
	4) Сумма от 300 рублей включая до 400 рублей не включая -> 15%
	5) Сумма покупки больше 400 рублей включая -> 20%

В случае, если сумма покупки находится в 3 интервале (сумма от 200 рублей включая до 300 рублей не включая) 
и возраст покупателя больше, чем 18 лет -> добавить 4% к скидке (12 + 4), иначе -> отнять 3%. 

 */

package Homework1;

import java.util.Scanner; // ипортируем сканер

public class task1 {
	static public void main(String[] argv) { // вызываем метод "main".также вместо args we can use argv
		Scanner sc = new Scanner(System.in);

		double purchaseAmount = sc.nextDouble();
		int age = sc.nextInt();
		
		if (purchaseAmount < 100) {
			System.out.println(purchaseAmount - purchaseAmount * 0.05);
		}

		else if ((purchaseAmount >= 100) && (purchaseAmount < 200)) {
			System.out.println(purchaseAmount - purchaseAmount * 0.07);
		}

		else if ((purchaseAmount >= 200) && (purchaseAmount < 300) && (age > 18)) {
			System.out.println(purchaseAmount - purchaseAmount * 0.16);
		}

		else if ((purchaseAmount >= 200) && (purchaseAmount < 300) && (age < 18)) {
			System.out.println(purchaseAmount - purchaseAmount * 0.09);
		}

		else if ((purchaseAmount >= 300) && (purchaseAmount < 400)) {
			System.out.println(purchaseAmount - purchaseAmount * 0.15);

		}

		else if ((purchaseAmount >= 400)) {
			System.out.println(purchaseAmount - purchaseAmount * 0.20);

		}

	}

}
