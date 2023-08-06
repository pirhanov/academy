package lesson4;
//Найти произведение двузначных нечетных чисел кратных 13.

public class Task13 {

	public static void main(String[] args) {
		long s = 1;
		// TODO Auto-generated method stub
		for (long i = 10; i < 100; i++) {
			if (i % 13 == 0) {
				s = i * s;
				System.out.println(i + "*" + " will be: " + s);
			}
		}

	}

}
