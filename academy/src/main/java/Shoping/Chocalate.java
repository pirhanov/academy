package Shoping;

public class Chocalate extends Product {
	protected  Double contains;
	
	public Chocalate(String name, Double price, Double quantity, Double contains) {
		super(name, price, quantity);
		this.contains = contains;
	
	}

	@Override
	public double discount() {
		
		return 0.9;
	}

}
