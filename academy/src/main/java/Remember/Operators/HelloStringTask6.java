package Remember.Operators;

import java.util.Scanner;

public class HelloStringTask6 {
	public static void main(String[] args) {
		int count = 0;
		int countWord = 0;
		System.out.println("Put number of words: ");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int n = Integer.parseInt(sc.nextLine());
			System.out.println("Put the text (without nex line): ");
			String text = sc.nextLine();
			for (String word : text.split(" ", n)) {
				for (int i = 1; i < word.length(); i++) {
					if ((word.toCharArray()[i] > word.toCharArray()[i - 1])) {
						count++;
					}
				}
				System.out.println("Count: " + count + " word: " + word);
				if ((word.length() - 1 == count) && (word.length() > 1) && (countWord == 0)) {
					System.out.println(word);
					countWord++;
				}

			}
			if (countWord == 0) {
				System.out.println("NOT FOUND!");
			}
		}
		sc.close();
	}

}
