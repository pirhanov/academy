package StringAgain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. 
Если таких слов несколько, найти первое из них*/
public class T4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String text = sc.nextLine();
		String[] words = text.split(" ", n);
		String min = words[0];

		int size = new HashSet<String>(Arrays.asList(words[0].split(""))).size();
		for (int i = 1; i < words.length; i++) {
			Set<String> set = new HashSet<String>(Arrays.asList(words[i].split("")));
			if (set.size() < size) {
				System.out.println("Word - " + words[i] + "index: " + i);

				size = set.size();
			}
		}
		System.out.println(min);

	}

}
