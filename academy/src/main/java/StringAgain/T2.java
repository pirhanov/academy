package StringAgain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) 
значений их длины.*/
public class T2 {

	public static void main(String[] args) {
		int s = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Put number str: ");
		if (sc.hasNextInt()) {
			int n = Integer.parseInt(sc.nextLine());
			List<String> str = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				System.out.println("Put str: " + s++);
				str.add(sc.nextLine());
			}
			sc.close();
			StringLengthListSort sort = new StringLengthListSort();
			Collections.sort(str, sort);
			for (int i = 0; i < n; i++) {
				System.out.println("(" + str.get(i).length() + ")" + str.get(i));
			}

		}

	}
}

class StringLengthListSort implements Comparator<String> {

	public int compare(String o1, String o2) {
		if (o1.length() == o2.length())
			return (o1.compareTo(o2));
		else {
			return (o1.length() - o2.length());
		}
	}

}
