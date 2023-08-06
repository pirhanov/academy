package OOPTasks;

public class Honor extends Phone {
	String conectected;
	boolean isChine;

	public Honor(int number, String model, int price, double weight, int quantity, String conectected,
			boolean isChine) {
		super(number, model, price, weight, quantity);
		this.conectected = conectected;
		this.isChine = isChine;
	}

	public double discount() {
		return 0.25;
	}

}
