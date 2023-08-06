package OOP;

public class TestAuther {

	public static void main(String[] args) {

		Auther a1 = new Auther("Mark Twen", "twencool@mail.com");
		System.out.println(a1);

		System.out.println();
		a1.setEmail("LawilasTwen@gmail.com");
		System.out.println(a1);
		System.out.println();
		System.out.println("Name of auther: " + a1.getName());
		System.out.println();

		System.out.println("email of the auther: " + a1.getEmail());

	}

}
