package OOPTasks;

import java.util.Scanner;

public abstract class Phone {
	int number;
	String model;
	int price;
	double weight;
	int quantity;

	public Phone(int number, String model, int price, double weight, int quantity) {
		super();
		this.number = number;
		this.model = model;
		this.price = price;
		this.weight = weight;
		this.quantity = quantity;
	}

	public Phone(String model, int price, double weight) {
		super();
	}

	double calcPhoneprice() {
		return price * quantity * discount();

	}

	public abstract double discount();

	protected void reciveCall(String name) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Callig: " + name);
	}
	

}
