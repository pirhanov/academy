package Lesson7;

public class Phone {
	String number;
	String model;
	double weight;

	public Phone() {
		super();

	}

	public Phone(String number, String model, double weight) { // Конструктор
		this.number = number;

		this.model = model;

		this.weight = weight;

	}

	public void receiveCall(String name) {
		System.out.println("Calling " + name);

	}

	public String getNumber() {
		return number;
	}

	public Double getWeight() {
		return weight;
	}

}
