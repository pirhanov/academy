package Lesson8.ClassWork;

public class PersonDemo {

	public static void main(String[] args) {

		Person a = new Person();
		Person b = new Person("Iron", 99);

		a.move();
		b.move();

		a.talk();
		b.talk();

	}

}
