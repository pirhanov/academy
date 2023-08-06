package Lesson21;

//Создать класс Cat. Создать класс Tiger, наследоваться от Cat.
//Добавить public, protected, private переменные в оба класса.
//Добавить public, protected, private методы в оба класса.
//
//Создать объект Class для Cat.
//Создать объект Class для Tiger.
public class Cat {
	int weight;
	protected int price;
	private String name;

	public Cat(int weight, int price, String name) {
		super();
		this.weight = weight;
		this.price = price;
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [weight=" + weight + ", price=" + price + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Cat cat1 = new Cat(16, 85, "Berserk");
		System.out.println(cat1);
	}

}
