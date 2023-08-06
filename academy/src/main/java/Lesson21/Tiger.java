package Lesson21;

public class Tiger extends Cat {

	public Tiger(int weight, int price, String name) {
		super(weight, price, name);

	}

	public static void main(String[] args) {
		Tiger t1 = new Tiger(150, 3000, "Hulk");
		System.out.println(t1);
	}

}
