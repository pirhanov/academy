package Cycle;

//дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
public class Task22 {
	public static void main(String[] args) {
		for (int i = 4; i <= 5; i++) {
			for (int j = 0; j < 6; j = j + 2) {
				System.out.println(i + ", " + j);
			}
		}

	}

}
