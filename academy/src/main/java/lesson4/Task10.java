package lesson4;

//Даны натуральные числа от 1 до 50. 
//Найти сумму тех из них, которые делятся на 5 или на 7
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 50; i++) {
			if ((i % 5 == 0) || (i % 7 == 0)) {
				System.out.println(i);
			}
		}

	}

}
