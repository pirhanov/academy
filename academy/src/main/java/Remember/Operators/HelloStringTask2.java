package Remember.Operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) 
//значений их длины

public class HelloStringTask2 {

	public static void main(String[] args) {
		int s = 1;
		System.out.println("Put number of strings: ");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int n = Integer.parseInt(sc.nextLine());
			List<String> x = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				System.out.println("put the string N" + s++ + ": ");
				x.add(sc.nextLine());
			}
			sc.close();
			StringLengthListSort sort = new StringLengthListSort();
			Collections.sort(x, sort);
			for (int i = 0; i < n; i++) {
				System.out.println("(" + x.get(i).length() + ") " + " \"" + x.get(i) + "\"");
			}
		}
	}
}

class StringLengthListSort implements Comparator<String> {

	public int compare(String s1, String s2) {

		if (s1.length() == s2.length())
			return (s1.compareTo(s2));
		else
			return (s1.length() - s2.length());
	}
}