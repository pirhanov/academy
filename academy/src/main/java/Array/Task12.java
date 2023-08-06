package Array;

public class Task12 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int[] array = new int[12];
		do {
			for(int i = 0; i < array.length; i++) {
				array[i] = (int)(Math.random()*21-10);
				if (array[i] > 0) {
					a++;
				}
				if (array[i] <0 ) {
					b++;
				}
				if (array[i] == 0) {
					--i;
				}
				if ( i == array.length -1 & a != array.length/2 ) {
					a=0;
					b=0;
					
				}
			}
		}
		while  (a != array.length/2 & b != array.length / 2 );
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
