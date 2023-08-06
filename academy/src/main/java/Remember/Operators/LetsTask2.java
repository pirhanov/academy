package Remember.Operators;

//Изменить переменные и строку вывода в программе так, 
//чтобы она расчитывала и печатала следующее выражение:
//3*3+4*4=25
//
//class Task {
//
//	public static void main(String[] args) {
//		int i = 2;
//		int j = 3;
//		int k = i + j;
//		System.out.println(i + "+" + j + "=" + k);
//	}
//}

public class LetsTask2 {
	public static void main(String[] args) {
		int i = 2;
		int j = 3;
		int k = i + j;
		System.out
				.println(j + "*" + j + "+" + ((i + j) - 1) + "*" + ((i + j) - 1) + "=" + (i * i + ((j - 1) * (j - 1))));

	}

}
