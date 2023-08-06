package Remember.Operators;

/*Два двузначных числа, записанных одно за другим , образуют четырёхзначное число,
которое делится на их произведение. Найти эти числа.*/

public class NeedCycleTask19 {

	public static void main(String[] args) {
		int a;
		int b;
		for (a = 10; a > 100; a++) {
			for (b = 10; b > 100; b++) {
				if (((((a * 100) + b) % (a * b)) == 0) || (((((b * 100) + a) % (a * b)) == 0))) {
					
				}
				
			}
			System.out.println("Aliluya it is :" + a + " and " + b);
		}

	}

}
