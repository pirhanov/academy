package Array;

public class Task1 {
	
	public static void main (String [] args) {
		int i = 0;
		int j = 2;
		int [] n = new int [10];
		while (i<10) {
			n[i] = j;
			j+=2;
			i++;
		}
			for (i = 0; i < n.length; i++) {
				System.out.print(" " + n[i]);
			}
			for (i = 0; i < n.length; i++) {
				System.out.println(n[i]);
			}
			}
	}
	
