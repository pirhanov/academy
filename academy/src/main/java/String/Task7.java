package String;

import java.util.Scanner;
import java.util.ArrayList;

//Ввести n слов с консоли. Найти слово, состоящее только из различных символов. 
//Если таких слов несколько, найти первое из них.

public class Task7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text;
		String[] arrayText;

		System.out.println("Enter the text: ");
		text = scan.nextLine();
		arrayText = text.split(" ");

		for (int i = 0; i < arrayText.length; i++) {
			arrayText[i] = arrayText[i].replaceAll("[“:”,\"'`;()?_-]", "");
			if (uniqueSymbolsChecker(arrayText[i])) {
				System.out.println("Word, contain differn chars: \n " + arrayText[i]);
				break;

			}
		}

	}

	private static boolean uniqueSymbolsChecker(String word) {
		boolean result = false;
		ArrayList<Character> list = new ArrayList<Character>();
		char[] chars = word.toCharArray();

		for (char c : chars) {
			if (list.contains(c)) {
				result = false;
				return result;
			} else {
				list.add(c);
				result = true;
			}
		}

		return result;
	}
}