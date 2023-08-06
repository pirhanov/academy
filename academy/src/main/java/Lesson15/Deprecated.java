package Lesson15;

public class Deprecated {
	@SuppressWarnings({ "unused", "removal" })
	public static void main(@Version(age = 0, info = "") String... args) {
		uCanDoIt();
		Integer i = new Integer(123);

	}

	public static void uCanDoIt() {
		System.out.println("Rectangle");
		
	}

}
