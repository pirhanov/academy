package Remember.Operators;

// Найти сумму чисел от 100 до 200 кратных 17.
public class NeedCycleTask13 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 100; i < 200; i++) {
			if (i % 17 == 0) {
				sum += i;

			}

		}
		System.out.println(sum);

	}

}
