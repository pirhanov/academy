package lesson3;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Yep:");
		String name = sc.nextLine();
		System.out.println("Turbo" + name);
		sc.close();
		System.out.println();

	}
}
