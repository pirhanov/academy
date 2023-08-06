package OOPTasks;

public class Nokia extends Phone {

	String color;
	boolean isModern;

	public Nokia(int number, String model, int price, double weight, int quantity, String color, boolean isModern) {
		super(number, model, price, weight, quantity);
		this.color = color;
		this.isModern = isModern;
	}

	public double discount() {
		return 0.5;
	}

}
