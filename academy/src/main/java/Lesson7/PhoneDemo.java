package Lesson7;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone();
		Phone phone4 = new Phone();
		
		Phone phone5 = new Phone("41261", "Alan", 2.4);
		Phone phone6 = new Phone("49562", "Jack", 9.2);
		Phone phone7 = new Phone("5198462", "M&M", 7.8);
		Phone phone8 = new Phone("1+991", "SmB", 9.0);

		
		System.out.println(phone5.getNumber());
		System.out.println(phone6.getNumber());
		System.out.println(phone7.getNumber());
		System.out.println(phone8.getNumber());
		
		phone4.receiveCall("Nike");
		phone4.receiveCall("Jordan");
		phone4.receiveCall("Sick");

	}

}
