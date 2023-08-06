package OOP;

public class TestBook {

	public static void main(String[] args) {
		
		Auther Twen = new Auther("Lucky Twen", "AlwaysLucky@gmail.com");
		System.out.println(Twen);
		
		System.out.println();
		
		Book HellBook = new Book("Hell Book", "Twen", 199, 3);
		System.out.println(HellBook);
		
		System.out.println();
		HellBook.setPrice(3000);
		System.out.println(HellBook);
		System.out.println(Twen);

		System.out.println("Name of auther is: " + HellBook.getAuther());





		
		
		
	}

}
