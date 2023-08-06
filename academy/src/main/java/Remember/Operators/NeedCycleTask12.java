package Remember.Operators;

//Найти произведение двузначных нечетных чисел кратных 13.
public class NeedCycleTask12 {
	public static void main(String... args) {
		long sum = 1;
		for (long i = 10; i < 99; i++) {
			if (i % 13 == 0) {
				sum *= i;
				System.out.println(sum);
			}

		}

	}

}
