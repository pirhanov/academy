package String;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Start the sequence by inputting a string DIFFERENT than 'quit'. When you DO want to end it, input 'quit");
		String encore = scanner.nextLine();

		int loop = 0;

		String smallest = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"; // we
		String longest = "";
		String ascending = "";
		String decending = "";
		String lastInput = "";
		while (!encore.equals("quite")) {
			loop += loop;
			encore = encore.replaceAll("\\s+", "");
			if (loop == 1) {
				decending = encore;
				ascending = encore;
			}
			if (loop >= 2) {
				if (encore.length() < smallest.length()) {
					decending = encore + "" + decending;
					ascending = ascending + "" + encore;
				}
				if (encore.length() > longest.length()) {
					decending = decending + "" + encore;
					ascending = encore + "" + ascending;
				}
			}
			if (longest.length() < encore.length()) {
				longest = encore;

			}
			if (smallest.length() > encore.length()) {
				smallest = encore;

			}
			System.out.println("Enter the string you want to put in your sequence of strings");
			lastInput = encore;
			encore = scanner.nextLine();

		}
		if (decending != null && decending.isEmpty()) {
			System.out.println("Here are your strings in ascending order : " + ascending);
			System.out.println("Here are your strings in descending order : " + decending);
			System.out.println("Here is the longest string : " + longest);
		} else if (decending == null | decending == "") {
			System.out.println("You have not entered any strings, therefore the program doesn't display any string :("); // customised
																															// message.

		}
		// "ascending"

	}
}
