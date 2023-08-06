package Array;

import java.util.Scanner;

public class Task13 {
	public static void main (String[] ars) {
		System.out.println("Put number more than 3: ");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			do {
				int n = sc.nextInt();
				if (n <= 3 ) { 
					System.out.println("Try again! ");
				
				
				while (n >3);
				
				int [] array = new int [n];
				for (int i = 0; i < array.length; i++) {
					array[i] = (int)(Math.random()*n);
				System.out.print(array[i] + " ");
				}
				System.out.print("");
				for(int j = 0; j < n; j++) 
				   {if (array[j]%2<1)
				       {System.out.print(array[j] + " ");}}
				}

			}
