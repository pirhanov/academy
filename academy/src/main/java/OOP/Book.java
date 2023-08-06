package OOP;

public class Book {
	
	private String name;
	private String Auther;
	private double price;
	private int qty;
	
	
	public Book() {
		super();
	}

	public Book (String name, String Auther, double price, int qty) {
		this.name = name;
		this.Auther = Auther;
		this.price = price;
		this.qty = qty;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getAuther() {
		return Auther;
	}

	protected void setAuther(String auther) {
		Auther = auther;
	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

	protected int getQty() {
		return qty;
	}

	protected void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", Auther=" + Auther + ", price=" + price + ", qty=" + qty + "]";
	}
	


}
