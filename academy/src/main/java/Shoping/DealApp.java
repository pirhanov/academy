package Shoping;

//
public class DealApp {

	public static void main(String[] args) {

		User s = new User("Iron Man", 40, 30000);
		User b = new User("Ilon Mask", 45, 50000);

		Product[] products = new Product[10];
		products[0] = new Chocalate("Ak47", 200.8, 4.1, 14.8);
		products[1] = new Gun("M416", 840.4, 2.1, 0.05);

		Deal deal = new Deal("LA", s, b, products);
		System.out.println("Full deal cost: " + deal.calPrice());
	}

}
