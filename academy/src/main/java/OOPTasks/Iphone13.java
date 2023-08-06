package OOPTasks;

public class Iphone13 extends Phone {
	String producer;
	boolean isExpensive;

	public Iphone13(int number, String model, int price, double weight, int quantity, String producer,
			boolean isExpensive) {
		super(number, model, price, weight, quantity);
		this.producer = producer;
		this.isExpensive = isExpensive;
	}

	public double discount() {
		return 0.01;
	}

}
