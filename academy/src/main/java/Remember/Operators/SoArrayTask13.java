package Remember.Operators;

import java.util.Random;

/* Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом, 
чтобы отрицательных и положительных элементов там было поровну и не было нулей. 
При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант, когда в
 массиве постоянно выпадает сначала 6 положительных, а потом 6 отрицательных чисел 
или же когда элементы постоянно чередуются через один и пр.). Вывести полученный массив на экран. */

public class SoArrayTask13 {

	public static void main(String[] args) {
		int[] m = new int[12];
		int posCnt = 0;
		Random rnd = new Random();
		for (int i = 0; i < m.length; i++) {
			m[i] = rnd.nextInt(10) + 1;
			if (posCnt == m.length / 2) {
				m[i] = -m[i];
			} else if ((m.length - i) > (m.length / 2 - posCnt)) {
				int sgn = rnd.nextInt(2);
				m[i] = m[i] * (int) Math.pow(-1, sgn);
				posCnt += -sgn + 1;
			}
			System.out.print(m[i] + "  ");
		}
	}
}