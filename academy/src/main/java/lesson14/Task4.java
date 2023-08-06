package lesson14;

// Создать анонимный класс расширяющий интерфейс Printable. Вызвать его метод print().

public class Task4 {
	public static void main(String[] args) {
		Printable t = new Printable() {

			public void print() {
				System.out.println("Print smth");

			}
		};
		t.print();
	}

}
