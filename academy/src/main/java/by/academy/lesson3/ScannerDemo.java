package by.academy.lesson3;

import java.util.Scanner;

import by.academy.lesson2.Man;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();

		System.out.println("Enter hairColor");
		String hairColor = sc.next();

		System.out.println("Enter passporNumber");
		String passportNumber = sc.next();

		System.out.println("Enter age");
		int age = sc.nextInt();

		System.out.println("Enter weight");
		double weight = sc.nextDouble();

		System.out.println("Enter height");
		double height = sc.nextDouble();

		Man man = new Man(name, hairColor, passportNumber, age, weight, height);
		System.out.println(man);
		sc.close();
	}

}
