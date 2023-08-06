package lesson4;

//Напечатать те из двузначных чисел которые делятся на 4,
//но не делятся на 6
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10; i < 1000; i++) {
			if ((i % 4 == 0) && (i % 6 != 0)) {
				System.out.println(i);
			}
		}

	}

}
