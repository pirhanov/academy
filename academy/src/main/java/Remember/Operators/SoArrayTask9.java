package Remember.Operators;

// ???
/*Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел [].... 
Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива
с i-ым индексом к элементу из второго массива с i-ым индексом. 
Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.*/
public class SoArrayTask9 {
	public static void main(String[] args) {
		int Mas1[] = new int[10];
		int Mas2[] = new int[10];
		double Mas3[] = new double[10];
		int SC = 0;

		for (int i = 0, b = 1; b <= 4; i++) {
			if (b == 1) {
				Mas1[i] = (int) (Math.random() * 8) + 1;
				if (i == 0)
					System.out.print((b) + " Array: ");
				System.out.print(Mas1[i] + " ");
				if (i == Mas1.length - 1) {
					b++;
					i = 0;
					System.out.println(" ");
				}
			}
			if (b == 2) {
				Mas2[i] = (int) (Math.random() * 8) + 1;
				if (i == 0)
					System.out.print((b) + " Array is: ");
				System.out.print(Mas2[i] + " ");
				if (i == Mas2.length - 1) {
					b++;
					i = 0;
					System.out.println(" ");
				}
			}
			if (b == 3) {
				Mas3[i] = (double) Mas1[i] / Mas2[i];
				if (i == 0)
					System.out.print((b) + " Array: ");
				System.out.print(Mas3[i] + " ");
				if (i == Mas3.length - 1) {
					b++;
					i = 0;
					System.out.println(", ");
				}
			}

			if (b == 4) {
				if (Mas3[i] % (int) Mas3[i] == 0) {
					if (SC == 0)
						System.out.print("Array 3: ");
					SC++;
					System.out.print(Mas3[i] + ", ");
				}
				if (i == Mas3.length - 1) {
					if (SC == 0)
						System.out.println("In third array!");
					break;
				}
			}

		}

	}
}