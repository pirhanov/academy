package Remember.Operators;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*Ввести n слов с консоли. Найти слово, состоящее только из различных символов. 
Если таких слов несколько, найти первое из них.*/

public class HelloStringTask7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			System.out.println("Put nuber: ");
			int n = Integer.parseInt(sc.nextLine());
			System.out.println("Put text: ");
			String text = sc.nextLine();
			LinkedHashSet<String> words = new LinkedHashSet<String>(n);
			boolean isThereWord = false;
			for (String word : (text.split(" ", n))) {
				int count = new HashSet<String>(Arrays.asList(word.split(""))).size() - 1;
			if(word.length()== count) {
				words.add(word);
				isThereWord=true;
			}
			}
		}
		sc.close();
	}

}
