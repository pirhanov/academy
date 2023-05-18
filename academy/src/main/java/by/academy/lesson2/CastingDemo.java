package by.academy.lesson2;

public class CastingDemo {
	public static void main(String[] argd) {
		int i = 111;
		byte  b = 10;
		b = (byte)i;
		System.out.println(b);
		double d=19.9;
		int i2 = 20;
		System.out.println(Math.round(d+i2));
		System.out.println(sum(5, 5.5));
	}
public static int sum(int i, double d) {
	return (int) (i+d);
}
}

