package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. 
//Если таких слов несколько, найти первое из них
public class Tasl4 {
	public static void main(String[] args) {
		int n; // количество строк
		String[] words;
		String text;
		Scanner scan = new Scanner(System.in);
		if (scan.hasNextInt()) {
			n = Integer.parseInt(scan.nextLine());
			text = scan.nextLine();
			words = text.split(" ", n);

			String wordMinCharVar = words[0];
			int sizeMinCharVar = new HashSet<String>(Arrays.asList(words[0].split(""))).size();

			// другой вариант реализации
//	            for (int i = 1; i < words.length; i++) {
//	                Set<String> set = new HashSet<String> (Arrays.asList (words[i].split ("")));
//	                if (set.size () < sizeMinCharVar) {
//	                    //System.out.println("Слово - " + word[i]);
//	                    indexMinCharVar = i;
//	                    sizeMinCharVar = set.size ();
//	                }
//	            }

			for (String word : words) { // [i]
				Set<String> set = new HashSet<String>(Arrays.asList(word.split("")));
				if (set.size() < sizeMinCharVar) {
					// System.out.println("Слово - " + word[i]);
					wordMinCharVar = word;
					sizeMinCharVar = set.size();
				}
			}
			System.out.println(wordMinCharVar);
		}
	}
}