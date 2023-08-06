package Shoping;

public class Gun extends Product {

	protected int size;

	public Gun(String name, Double price, Double quantity, Double discount) {
		super(name, price, quantity);

	}

	public double discount() {
		if ("yellow".equals("color")) {
			return 0.5;
		}
		return 0;
	}

}
